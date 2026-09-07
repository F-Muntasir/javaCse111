//Task 03

public class Garage {
    public Car [] cars ;
    public Bike [] bikes ;
    public int carcount;
    public int bikecount;
    public int carcap;
    public int bikecap;

    public Garage(int c, int b){
        cars=new Car[c];
        bikes=new Bike[b];
        carcap=c;
        bikecap=b;
        System.out.println("Welcome to the Garage!");
        System.out.println("Car Capacity: "+c);
        System.out.println("Bike Capacity: "+b);
    }

    public void addVehicle(Vehicle obj){
        if(obj instanceof Car){
                Car newcar=(Car) obj;
            if(carcount<2){
                cars[carcount++]=newcar;
                System.out.println("A "+newcar.getBrand()+" CAR has been added to the Garage");
            }
            else {
                System.out.println("Can't add more Cars! Capacity: "+carcap);
            }
        } else if (obj instanceof Bike) {
            Bike newbike=(Bike) obj;
            if(bikecount<3){
                bikes[bikecount++]=newbike;
                System.out.println("A "+newbike.getBrand()+" BIKE has been added to the Garage");
            }
            else {
                System.out.println("Can't add more bikes! Capacity: "+bikecap);
            }
        }
    }
}
