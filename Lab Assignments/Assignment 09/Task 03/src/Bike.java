public class Bike extends Vehicle{
    public String model;
    public boolean sc;

    public Bike(String b, String m, int y, int w, boolean sc){
        super(b,y);
        model=m;
        this.sc=sc;
        setWheels(w);
    }

    public String toString(){
        return "Bike "+super.toString()+", Model: "+model+", SideCar: "+sc;
    }

    public void doAWheelie(){
        if(sc==true){
            System.out.println("Wheelie Failed. "+super.getBrand()+":"+model+" has Sidecar");
        }
        else {
            System.out.println(super.getBrand()+":"+model+" is doing Wheelie!!");
        }
    }
}
