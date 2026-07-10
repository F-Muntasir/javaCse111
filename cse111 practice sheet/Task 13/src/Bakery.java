public class Bakery {
    public String name;
    public int capacity=10;
    public String[] item;
    public int [] number;
    public int av;
    public void setShop(String n){
        name=n;
        capacity=10;
        item= new String[capacity];
        number= new int[capacity];
    }
    public void setShop(String n, int num){
        name=n;
        capacity=num;
        item= new String[num];
        number= new int[num];
    }
    public void addItems(String n){
        if(av<capacity){
            item[av]=n;
            number[av++]=20;
            System.out.println("20 "+n+" are added.");
        }
    }
    public void addItems(String n, int num){
        if(av<capacity){
            item[av]=n;
            number[av++]=num;
            System.out.println(num+" "+n+" are added.");
        }
    }
    public void sellItems(String n, int num) {
        boolean found= false;
            for (int i = 0; i < av; i++) {
                if (n.equals(item[i])) {
                    found = true;
                    if (number[i] >= num) {
                        number[i] -= num;
                        System.out.println(num+" "+n+" are sold.");
                    } else {
                        System.out.println("Sorry! " + num + " " + n + " are not available.");
                    }
                    break;
                }
            }
        if (found==false) {
            System.out.println("Item not found.");
        }
        }

    public void details(){
        System.out.println("Bakery Name: "+name);
        System.out.println("Product Capacity: "+capacity);
        System.out.println("Product Info:");
        for(int i=0;i<av;i++){
            System.out.println(i+1+")"+item[i]+" : "+ number[i]+" pieces");
        }
    }
}
