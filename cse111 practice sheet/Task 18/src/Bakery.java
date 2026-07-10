public class Bakery {
    public String name;
    public int cap;
    public String[] item;
    public int num[];
    public int total;
    public Bakery(String s){
        name=s;
        cap=7;
        item=new String[cap];
        num= new int[cap];
    }
    public Bakery(String s , int n){
        name=s;
        cap=n;
        item=new String[cap];
        num= new int[cap];
    }
    public void addItems(String s, int n){
        item[total]=s;
        num[total++]=n;
        System.out.println(n+" "+s+" are added");
    }
    public void sellItems(String s, int n){
        boolean found=false;
        for(int i=0;i<total;i++){
            if(item[i].equals(s)){
                found=true;
                if(num[i]>=n){
                    num[i]-=n;
                    System.out.println(n+" "+s+" are sold.");
                }
                else {
                    System.out.println("Sorry! "+n+" "+s+" are not available.");
                }
            }
        }
        if(found==false){
            System.out.println("Item not found.");
        }
    }
    public void details(){
        System.out.println("Bakery Name: "+name);
        System.out.println("Product Capacity: "+cap);
        System.out.println("Product Info:");
        for(int i=0;i<total;i ++){
            System.out.println(i+1+")"+item[i]+": "+num[i]+" pieces");
        }
    }
}
