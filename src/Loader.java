import javax.tools.FileObject;
import java.io.*;

public class Loader implements Serializable {
    static final long serialVersionUID = 42L;

    private String pathToDirectory;

    public Loader(String pathToDirectory) {
        this.pathToDirectory = pathToDirectory;
    }

    public Game continueGame() {

        File[] files = new File(pathToDirectory).listFiles();
        File lastFile = null;
        long last = 0L;
        for (File file : files) {
            long temp = file.lastModified();
            if (temp > last) {
                last = temp;
                lastFile = file;
            }
        }

        return load(lastFile.getName());
    }

    public Game load(String nameGame) {
        Game game;

        try (
                FileInputStream fis = new FileInputStream(pathToDirectory + nameGame + ".game");
                ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            game = (Game) ois.readObject();
            return game;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
