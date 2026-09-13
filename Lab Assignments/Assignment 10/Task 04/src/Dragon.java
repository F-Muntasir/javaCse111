public class Dragon extends MagicalCreature {
    int power;
    public Dragon(String s, int a , int b){
        super(s,a);
        power= b;
    }
    public void makeSound(){
        System.out.println(name+" roars with a fiery breath!");
    }
    public void performMagic(){
        System.out.println(name+" breathes fire with power level: "+power);

    }
    public void fly(){
        System.out.println(name+" flies through the sky.");
    }
}
