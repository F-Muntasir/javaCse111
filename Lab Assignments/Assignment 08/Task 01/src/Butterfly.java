public class Butterfly extends Caterpillar {
    public Butterfly (String s, int a){
        super(s,a);
    }

    public  void transform(){
        super.transform();
        System.out.println(" into Butterfly ");
    }

    public  void eat(int a){
        energy-=5;
        energy+=a*5;
        System.out.println("Butterfly lost energy while flying and absorbed nectar");
    }

    public void showDetails() {
        System.out.println("Food: " + food);
        System.out.println("Age: " + age);
        System.out.println("Energy: " + energy + " joules");
    }
}
