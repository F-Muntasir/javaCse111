public class Taxi {
    public int total;
    public int capacity;
    public int fare;
    public String [] list;

    public void createTaxi(int n){
        capacity = n;
        list= new String[n];
        System.out.println("A taxi is created with a capacity of "+capacity);
    }

    public void addPassenger(String n, int f){
        if(total<capacity){
            fare+=f;
            list[total++]=n;
            System.out.println("Dear "+n+"! Welcome to Taxi");
        }
        else{
            System.out.println("Taxi is full");
        }
    }

    public void info(){
        System.out.println("Total Passenger: "+total);
        System.out.println("Maximum Capacity: "+capacity);
        System.out.println("Total Fare: "+fare+" Taka");
        System.out.println("Passenger List:");

        for(int i=0; i<total; i++){
            System.out.print(list[i]+" ");
        }
        System.out.println();
    }
}
