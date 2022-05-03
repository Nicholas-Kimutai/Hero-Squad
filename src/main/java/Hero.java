import java.util.ArrayList;

public class Hero {
    private String name;
    private int age;
    private int id;
    private String powers;
    private String weaknesses;
    private static ArrayList<Hero> instances = new ArrayList<Hero>();

    public Hero (String name,int age,String powers,String weaknesses){
        this.name=name;
        this.age=age;
        this.powers=powers;
        this.weaknesses=weaknesses;
        instances.add(this);
        this.id = instances.size();
    }
    // create get and set methods

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getPowers() {
        return powers;
    }

    public void setPowers(String powers) {
        this.powers = powers;
    }

    public String getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(String weaknesses) {
        this.weaknesses = weaknesses;
    }

    public static ArrayList<Hero> getAll(){
        return instances;
    }
    public static void clearAllHeroes(){
        instances.clear();
    }

    public int getId() {
        return id;
    }
    public static Hero findById(int id){
        return  instances.get(id-1);
    }

    }

