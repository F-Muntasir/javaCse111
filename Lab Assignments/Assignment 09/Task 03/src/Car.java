public class Car extends Vehicle {
    public String model;
    public int door;
    public boolean ai;

    public Car(String b, String m, int y, int d, int w, boolean ai){
        super(b,y);
        model=m;
        door=d;
        this.ai=ai;
        setWheels(w);
    }

    public String toString(){
        return "Car "+super.toString()+", Model: "+model+", Doors:"+door+", AI:"+ai;
    }

    public void startAutoPilot(){
        if(ai==true){
            System.out.println(super.getBrand()+":"+model+" AutoPilot Started");
        }
        else {
            System.out.println(super.getBrand()+":"+model+" has NO AutoPilot");
        }
    }
}
