public class CartTester {
    public static void main(String args[]){
        Cart c1 = new Cart();
        System.out.println("1------------");
        c1.info();
        System.out.println("2------------");
        Cart c2 = new Cart();
        System.out.println("3------------");
        c1.addItem("Coke", 12);
        c1.addItem("Biscuit", 50);
        System.out.println("4------------");
        c1.info();
        System.out.println("5------------");
        c1.addItem("Chocolate",15);
        System.out.println("6------------");
        c1.info();
        System.out.println("7------------");
        c1.addItem("Pen",5);
        System.out.println("8------------");
        c1.info();
        System.out.println("9------------");
        c2.addItem("Water",10);
        System.out.println("10------------");
        c2.info();
    }
}
