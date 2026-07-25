public class UberEatsUser {
    private String name;
    private String location;
    public UberEatsUser(String s,String l){
        name=s;
        location=l;
    }
    public UberEatsUser(String s){
        name=s;
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setLocation(String l){
        location=l;
    }
    public String getLocation(){
        return location;
    }
    public void updateLocation(String s){
        if(location==null){
            location=s;
            System.out.println("Update Successful!");
        }
        else {
            System.out.println("We already have your location.");
            System.out.println("Please place an order!");
        }
    }
}
