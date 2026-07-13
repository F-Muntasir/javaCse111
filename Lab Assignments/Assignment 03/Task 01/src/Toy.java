public class Toy {
    public String name;
    public int price;
    public Toy(){}
    public Toy(String s, int p){
        name=s;
        price=p;
        System.out.println("A new toy has been made!");
    }
    public void updatePrice(int p){
        price=p;
    }
    public void updateName(String n){
        System.out.println("Changing old name: "+ name);
        name=n;
        System.out.println("new name: "+n);
    }
    public void showPrice(){
        System.out.println("price: "+price+" Taka");
    }
}
