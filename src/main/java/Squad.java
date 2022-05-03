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
    public String getName(){
        return name;
    }
    public String getCause() {
        return cause;
    }
    public static  ArrayList<Squad> getAll(){
        return instance;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public static Squad findById(int id) {
        return instance.get(id - 1);
    }
}
