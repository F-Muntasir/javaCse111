public class Cart {
    public int capacity=3;
     public int item;
     public int price;
     public String[] list= new String[3];

     public void addItem(String s , int n){
         if(item<capacity){
             price+=n;
             list[item++]=s;
             System.out.println(n+" is added to cart.");
         }
         else{
             System.out.println("Cart is full");
         }
     }
     public void info(){
         System.out.println("Cart capacity: "+capacity);
         System.out.println("Total Item: "+item);
         System.out.println("Total Price: "+price+" Taka");
         System.out.println("Item  List: ");

         for(int i=0;i<item;i++){
             System.out.print(list[i]+" ");
         }
         System.out.println();
     }
}
