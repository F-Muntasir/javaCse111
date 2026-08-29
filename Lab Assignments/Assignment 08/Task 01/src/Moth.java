public class Moth extends Caterpillar {
    public Moth(String s, int a){
        super(s,a);
    }

    public  void transform(){
        super.transform();
        System.out.println(" into Moth ");
    }

    public  void eat(int a){
        energy-=2.5;
        energy+=a*2.5;
        System.out.println("Moth lost energy due to nocturnal activity");
    }

    public void showDetails() {
        System.out.println("Food: " + food);
        System.out.println("Age: " + age);
        System.out.println("Energy: " + energy + " joules");
    }
}
