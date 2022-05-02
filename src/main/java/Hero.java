import java.util.ArrayList;

public class Hero {
    private int age;
    private String name;
    private ArrayList<String>powers =new ArrayList<String>();
    private ArrayList<String>weaknesses=new ArrayList<String>();

    public Hero (String name,int age,ArrayList<String>powers,ArrayList<String>weaknesses){
        this.age=age;
        this.name=name;
        this.powers=powers;
        this.weaknesses=weaknesses;
    }
}
