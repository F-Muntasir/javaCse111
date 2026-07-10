public class MobileTester {
    public static void main(String args[]){
        Mobile m1 = new Mobile();
        System.out.println("-----1-----");
        m1.brand = "Nokia";
        m1.simType = "Dual";
        System.out.println("-----2-----");
        m1.printDetails();
    }

}
