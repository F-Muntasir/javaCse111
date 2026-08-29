public class ElectricCar extends Vehicle {
    public String stutus;
    public String type;
    public String id="EV00";
    public static int idn;
    public int bet;
    public static ElectricCar [] car=new ElectricCar[3];
    public static int count;

    public ElectricCar(String s, int a, int b){
        super(s,a);
        bet=b;
        stutus="Available";
        type="Electric Vehicle";
        idn++;
        id=id+idn;
        vehicleId=id;
        car[count++]=this;
        System.out.println("Vehicle ID: "+vehicleId+" created ");
    }

    public static void markAsSoldEV(ElectricCar obj){
        obj.sold=true;
        obj.stutus="sold";
    }

    public void vehicleDetail(){
        super.vehicleDetail();
        System.out.println("Type:"+type);
        System.out.println("Battery Capacity: "+bet);
    }
}
