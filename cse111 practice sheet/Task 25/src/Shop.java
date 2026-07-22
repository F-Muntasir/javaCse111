public class Shop {
    public String sname;
    public int cap;
    public String[] item;
    public int []quan;
    public int count;

    public Shop(String s, int n){
        sname=s;
        cap=n;
        item=new String[cap];
        quan=new int[cap];
        System.out.println(sname +" shop created! ");
    }
    public Shop(int i){
        this("Mega",i);
    }
    public void addItem(String s, int p){
        if(count<cap){
            item[count]=s;
            quan[count++]=p;
        }
        else {
            System.out.println(s+", could not be added");
        }
    }
    public void addItem(Shop obj,String n){
        boolean found=false;
        for(int i=0;i<obj.count;i++){
            if(n.equals(obj.item[i])){
                item[count]=obj.item[i];
                quan[count++]=obj.quan[i];
                found=true;
            }
        }
        if (found == false) {
            System.out.println(n+", not found in "+obj.sname+"!");
        }
    }

    public void purchase(String n){
        boolean find=false;
        for(int i=0;i<count;i++){
            if(n.equals(item[i])){
                System.out.println("Purchase Complete!");
                find=true;
                break;
            }
        }
        if (!find){
            System.out.println(n+", is not available in this shop");
        }
    }

    public void info(){
        System.out.println("Shop Name: "+sname);
        System.out.println("Item Details:");
        if(item[0]!=null) {
            System.out.println(count + " / " + cap);
            for (int i = 0; i < count; i++) {
                System.out.println(item[i] + " - " + quan[i] + " tk");
            }
        }
        else {
            System.out.println("No items in shop");
        }
    }
}
