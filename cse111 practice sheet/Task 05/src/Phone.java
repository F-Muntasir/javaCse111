public class Phone {
    public String name = "Nokia";
    public String color = "Blue";
    public  int price = 14000;

    public void showDetails(){
        System.out.println("Brand Name: "+ name);
        System.out.println("Color "+ color);
        System.out.println("Price "+ price+" Taka");
    }
    public String increasePrice(int n){
        price+=n;
        return "The price is updated";
    }
    public void changeBrandName(String n){
        name = n;
        System.out.println("Brand name is change to "+n);
    }
}
