// Task 01

public class Cow extends Animal {
    public String name;
    public String getName(){
        return name;
    }
    public Cow(){
        System.out.println("The cow says hello! ");
    }
    public void updateSound(String s){
        sound=s;
    }
}
