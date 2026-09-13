public class Phoenix extends MagicalCreature {
    int birth;
    public Phoenix(String s, int a , int b){
        super(s,a);
        birth = b;
    }
    public void makeSound(){
        System.out.println(name+" sings an enchanting song.");
    }
    public void performMagic(){
        System.out.println(name+" is reborn with "+birth+" rebirth cycles.");

    }
    public void regenerate(){
        System.out.println(name+" regenerates its body in a burst of flames.");
    }
}
