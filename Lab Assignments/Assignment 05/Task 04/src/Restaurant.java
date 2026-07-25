// Task 04
public class Restaurant {
    public String name;
    public String location;
    public UberEatsUser [] user;
    public int count;
    public int cap;
    public Restaurant(String n, String l){
        name=n;
        location=l;
        cap=3;
        user= new UberEatsUser[3];
    }
    public void takeOrder(UberEatsUser obj){
        boolean find = false;
        for(int i=0;i<count;i++){
            if(user[i]==obj){
                find=true;
                break;
            }
        }
        if(find){
            System.out.println("You already have a pending order!");
        }
        else {
            if(count<cap) {
                if (obj.getLocation() != null) {
                    user[count] = obj;
                    System.out.println("Your order has been added!");
                    count++;
                } else {
                    System.out.println("Location : Unknown. Please update \n" +
                            "your location information!");
                }
            }
            else {
                System.out.println("We are really busy right now. \n" +
                        "Please order after some time. \n" +
                        "Thank you!");
            }
        }
    }
    public void completeOrders(){
        if(user[0]==null){
            System.out.println("No pending orders at the moment.");
        }
        else {
            System.out.println("Showing "+name+"'s orders: ");
            for(int i=0;i<count;i++){
                System.out.println("Order by "+user[i].getName()+" at "+user[i].getLocation()+" completed");
                user[i]=null;
            }
            count=0;
        }
    }
}
