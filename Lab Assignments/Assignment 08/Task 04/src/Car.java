public class Car extends Vehicle {
    public String stutus;
    public String type;
    public String id="CAR00";
    public static int idn;
    public int seat;
    public static Car [] car=new Car[3];
    public static int count;

    public Car(String s, int a, int b){
        super(s,a);
        seat=b;
        stutus="Available";
        type="Regular Car";
        idn++;
        id=id+idn;
        vehicleId=id;
        car[count++]=this;
        System.out.println("Vehicle ID: "+vehicleId+" created ");
    }

    public static void markAsSold(Car obj){
        obj.sold=true;
        obj.stutus="sold";
    }

    public void vehicleDetail(){
        super.vehicleDetail();
        System.out.println("Type:"+type);
        System.out.println("Seats: "+seat);
    }

    public static void showAllCars(){
        System.out.println("Total Car: "+idn);
        for(int i=0;i<count;i++){
            System.out.println(car[i].vehicleId+" : "+car[i].model+" - "+car[i].stutus);
        }
    }
    public static void showAllAvailableCars(){
        System.out.println("Total Car: "+idn);
        for(int i=0;i<count;i++){
            if(car[i].stutus.equals("Available")){
                System.out.println(car[i].vehicleId+" : "+car[i].model);
            }
        }
    }
}
