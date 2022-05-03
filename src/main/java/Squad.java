import java.util.ArrayList;

public class Squad {
    private int maxSize;
    private String name;
    private String cause;
    private static ArrayList<Squad> instance = new ArrayList<Squad>();
    private int id;

// Create a constructor
    public Squad(int maxSize, String name, String cause){
        this.maxSize = maxSize;
        this.name = name;
        this.cause = cause;
        instance.add(this);
        this.id = instance.size();

    }

    // Create get and set methods
    public int getMaxSize() {
        return maxSize;
    }
}
