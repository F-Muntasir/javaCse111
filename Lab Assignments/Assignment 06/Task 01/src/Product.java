//Task 01


public class Product {
    public String name;
    public int num;
    public static Product [] plist= new Product[3];
    public static int count;

    public Product(String n, int l){
        if(count<3) {
            name = n;
            num = l;
            plist[count++]=this;
            System.out.println("Stored: "+name);
        }
        else {
            System.out.println("Storage is full! Cannot add "+n);
        }
    }

    public static void buy(String n, int l){
        int a=-1;
        for(int i=0;i<count;i++){
            if(n.equals(plist[i].name)){
                a=i;
            }
        }
        if(a==-1){
            System.out.println("Product not found");
        }
        else {
            if(l<= plist[a].num){
                System.out.println("Product Sold");
                plist[a].num-=l;
            }
            else {
                System.out.println("Quantity low");
            }
        }
    }

    public static void displayProducts(){
        System.out.println("=== Stored Products ===");
        for(int i=0;i<count;i++){
            System.out.println(plist[i].name+" - Qty: "+plist[i].num);
        }
    }
}
