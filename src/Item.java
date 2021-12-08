import java.io.Serializable;

public class Item implements Serializable {
    int slot;
    String name;
    boolean hasHero;

    public Item(int slot, String name) {
        this.slot = slot;
        this.name = name;
        hasHero = false;
    }

    public void gotHero()
    {
        hasHero = true;
    }

    public void throwHero()
    {
        hasHero = false;
    }
}
