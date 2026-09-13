public class NikeBD {
    public String name;
    public static String[] item={"Jordan", "Cortez", "Kobe"};
    public int []qty={0, 0, 0};
    public int  count;
    public int sold;
    public static int branch;
    public static int tsold;
    public static int []tq={0, 0, 0};
    public static int tcount;
    public NikeBD(String n){
        name=n;
        branch+=1;
    }
    public void restockProducts(String n, int a){
        boolean found=false;
        int temp=0;
        for(int i =0;i< item.length;i++){
            if(n.equals(item[i])){
                found=true;
                temp=i;
            }
        }
        if(found){
            qty[temp]+=a;
            tq[temp]+=a;
        }
    }

    public void restockProducts(String []p,int[]q){
        boolean found=false;
        int temp=0;
        for(int i =0;i< item.length;i++){
            if(p[count].equals(item[count])){
                qty[count]+=q[count];
                tq[count]+=q[count++];
            }
        }
    }

    public void productSold(String s1,int a1,String s2, int a2){
            productSold(s1,a1);
            productSold(s2,a2);
    }
    public void productSold(String s,int a){
        boolean found=false;
        int temp=0;
        for(int i =0;i< item.length;i++){
            if(s.equals(item[i])){
                found=true;
                temp=i;
            }
        }
        if(found){
            qty[temp]-=a;
            tq[temp]-=a;
            sold+=a;
            tsold+=a;
        }
    }
    public void details(){
        System.out.println("Nike "+name+" outlet: ");
        System.out.print("Products Currently Stocked: ");
        for(int i=0;i< item.length;i++){
            System.out.print(item[i]+": "+qty[i]+", ");
        }
        System.out.println();
        System.out.println("Sold: "+sold);
    }
    public static void status(){
        System.out.println("Nike Bangladesh Status:");
        System.out.println("Branches Opened: "+branch);
        System.out.print("Currently Stocked: ");
        for(int i=0;i< item.length;i++){
            System.out.print(item[i]+": "+tq[i]+", ");
        }
        System.out.println();
        System.out.println("Sold: "+tsold);
    }
}
