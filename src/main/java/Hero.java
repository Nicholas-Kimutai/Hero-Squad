import java.util.ArrayList;

public class Hero {
    private String name;
    private int age;
    private int id;
    private ArrayList<String>powers =new ArrayList<String>();
    private ArrayList<String>weaknesses=new ArrayList<String>();
    private static ArrayList<Hero> instances = new ArrayList<Hero>();

    public Hero (String name,int age,ArrayList<String>powers,ArrayList<String>weaknesses){
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

}
