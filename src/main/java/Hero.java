import java.util.ArrayList;

public class Hero {
    private String name;
    private int age;
    private String powers;
    private String weaknesses;
    private int id;
    private static ArrayList<Hero> instances = new ArrayList<Hero>();

    public Hero (String name,int age,String powers,String weaknesses){
        this.name=name;
        this.age=age;
        this.powers=powers;
        this.weaknesses=weaknesses;
        instances.add(this);
        this.id = instances.size();
    }
    // create get methods

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getPowers() {
        return powers;
    }


    public String getWeaknesses() {
        return weaknesses;
    }

    public int getId() {
        return id;
    }

    public static ArrayList<Hero> getAll(){
        return instances;
    }
    public static void clear(){
        instances.clear();
    }


    public static Hero findById(int id){
        return  instances.get(id-1);
    }

}

