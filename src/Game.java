import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.nio.file.Path;
import java.util.ArrayList;

public class Game implements Serializable {

    private String name;
    private Hero hero;
    ArrayList<Item> itemArrayList;

    public void start(String name)
    {
        this.name = name;
        hero = new Hero();
        itemArrayList  = initItems();
        initItems();
    }

    public ArrayList<Item> initItems()
    {
        itemArrayList = new ArrayList<>();

        itemArrayList.add(new Item(6, "Egg"));
        itemArrayList.add(new Item(5, "DynamiteStick"));
        itemArrayList.add(new Item(4, "Crossbow"));
        itemArrayList.add(new Item(3, "Rifle"));
        itemArrayList.add(new Item(2, "DesertEagle"));
        itemArrayList.add(new Item(1, "Crowbar"));

        return itemArrayList;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return "Игра: " + name;
    }
}
