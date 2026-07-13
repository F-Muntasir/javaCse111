public class Cart {
    public int cnum;
    public double tprice;
    public double disc;
    public int maxitem=3;
    public double discout;
    public int citem;
    public String[] item= new String[3];
    public double [] price = new double[3];

    public void create_cart (int a ){
        cnum=a;
    }
    public void addItem(String s, double p){
        if(citem<maxitem){
            item[citem]=s;
            price[citem]=p;
            tprice+=price[citem];
            citem++;
            System.out.println("You have "+citem+" item(s) in your cart now.");
        }
        else {
            System.out.println("You already have 3 items on your cart");
        }
    }
    public void addItem(double p, String s){
        addItem(s,p);
    }
    public void giveDiscount(int a ){
        double b=a;
        double s=tprice/b;
        tprice=tprice-s;
        discout=a;
    }
    public void cartDetails (){
        System.out.println("Your cart(c"+cnum+") :");
        for(int i=0;i<citem;i++){
            System.out.print(item[i]+" - "+price[i]);
            System.out.println();
        }
        System.out.println("Discount Applied: "+discout+"% ");
        System.out.println("Total price: "+tprice);
    }
}
