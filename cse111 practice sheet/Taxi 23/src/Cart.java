public class Cart {
    public String[] item=new String[4];
    public int[] num= new int[4];
    public Cart[] carts=new Cart[3];
    public int count;
    public int cartcount;

    public void storeProduct(String s, int n){
        item[count]=s;
        num[count++]=n;
    }
    public void storeProduct(String s1, int n1, String s2, int n2){
        storeProduct(s1,n1);
        storeProduct(s2,n2);
    }

    public void transferItem(Cart obj, String s){
        for(int i=0;i<count;i++){
            if (s.equals(item[i])) {
                 for(int j=0;j<obj.item.length;j++) {
                    if (obj.item[j] == null) {
                        obj.item[j]=item[i];
                        obj.num[j]=num[i];
                        obj.count++;
                        item[i]=null;
                        num[i]=0;
                        count--;
                        System.out.println("Item transferred successfully.");
                        break;
                    }
                }
            }
        }
    }

    public void addCart(Cart c1, Cart c2, Cart c3){
        carts[cartcount++]=c1;
        carts[cartcount++]=c2;
        carts[cartcount++]=c3;
    }

    public void info(){
        System.out.println("Cart Items:");
        if(item[0]==null){
            System.out.println("Cart is empty.");
        }
        else {
            for (int i=0;i<count;i++){
                System.out.println(item[i]+" - "+num[i]);
            }
        }
    }

    public void allCartInfo(){
        for(int i=0;i<cartcount;i++){
            carts[i].info();
        }
    }
}
