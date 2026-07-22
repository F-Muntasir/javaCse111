public class Taxi {
    public String num;
    public String route;

    public Taxi(String n, String r){
        num=n;
        route=r;
    }

    public void compareTaxi(Taxi obj){
        if(route.equals(obj.route)){
            System.out.println("Both routes are the same!");
        }
        else {
            System.out.println("Routes are not the same!");
        }
    }
}
