public class BakeryTester {
    public static void main (String args []){
        Bakery b1 = new Bakery();
        Bakery b2 = new Bakery();
        b1.setShop("Sweet Cravings");
        b2.setShop("Dreamy Delights", 7);
        b1.details();
        System.out.println("-----------------");
        b2.details();
        System.out.println("-----------------");
        b1.addItems("Cookies");
        b1.addItems("Donuts");
        b1.addItems("Muffins", 12);
        System.out.println("-----------------");
        b1.details();
        System.out.println("-----------------");
        b1.sellItems("Donuts",5);
        b1.sellItems("Cookies",7);
        System.out.println("-----------------");
        b1.sellItems("Cake",2);
        System.out.println("-----------------");
        b1.sellItems("Muffins",15);
        System.out.println("-----------------");
        b1.details();
    }
}
