public class Main {
    public static void main(String[] args) {


        final String pathToDirectory = "C:\\Users\\gagil\\IdeaProjects\\HalfLife3\\src\\saves\\";

//        Game game1 = new Game();
//        game1.start("NewProfile");
//
//        Saver saver = new Saver();
//        saver.save(game1, pathToDirectory);

        ;

        Loader loader = new Loader(pathToDirectory);
        Game game2 = loader.load("NewProfile");

        System.out.println(game2);
    }

}
