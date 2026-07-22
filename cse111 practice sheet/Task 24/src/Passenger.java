public class Passenger {
    public String name;
    public int age;

    public Passenger(String n, int a){
        name=n;
        age=a;
    }

    public void info(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
