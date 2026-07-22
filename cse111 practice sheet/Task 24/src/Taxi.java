public class Taxi {
    public String tnum;
    public String route;
    public Passenger[] plist=new Passenger[3];
    public int count;

    public Taxi(String t, String r){
        tnum=t;
        route=r;
    }

    public void addPassenger(Passenger obj){
            plist[count]=obj;
            count++;
    }
    public void showTaxi(){
        System.out.println("Taxi No: "+tnum);
        System.out.println("Route: "+route);
        System.out.println("Passenger List: ");
        for(int i=0;i<count;i++){
            System.out.println(plist[i].name+" "+plist[i].age);
        }
    }
}
