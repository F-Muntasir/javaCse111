public class FootballTester {
    public static void main(String[] args) {
        Striker ronaldo = new Striker("Ronaldo", 39, 90, 901, 1000);
        Defender ramos = new Defender("Ramos", 38, 85, 1000, 100);

        System.out.println("1========");
        ronaldo.display();
        System.out.println("2========");
        ronaldo.calculatePerformance();
        System.out.println("3========");
        ramos.display();
        System.out.println("4========");
        ramos.calculatePerformance();
    }
}
class Football {
    public String name;
    public int age;
    public int stamina;

    public Football(String name, int age, int stamina) {
        this.name = name;
        this.age = age;
        this.stamina = stamina;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Stamina: " + stamina);
    }

    public void calculatePerformance() {
        System.out.println("Performance is not defined yet");
    }
}
