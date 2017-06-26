package example.codeclan.com.trycatch;

/**
 * Created by user on 26/06/2017.
 */

public class Cat implements Pet{
    private String name;

    public Cat(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
