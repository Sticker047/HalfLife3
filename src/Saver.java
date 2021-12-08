import java.io.*;

public class Saver {
    static final long serialVersionUID = 42L;

    public void save(Game game, String pathToDirectory) {
        ObjectOutputStream out;


        try {
            File file = new File(pathToDirectory + game.getName() + ".game");
            if (!file.exists()) file.createNewFile(); //!
            out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(game);

            out.flush();
            out.close();
            System.out.println("Object written to file");
        } catch (FileNotFoundException ex) {
            System.out.println("Error with specified file");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Error with I/O processes");
            ex.printStackTrace();
        }
    }
}
