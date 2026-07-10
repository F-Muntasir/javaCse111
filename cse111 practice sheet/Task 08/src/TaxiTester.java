public class TaxiTester {
    public static void main(String args[]){
        Taxi t1 = new Taxi();
        t1.createTaxi(4);
        System.out.println("1------------");
        t1.info();
        System.out.println("2------------");
        t1.addPassenger("Walker", 200);
        t1.addPassenger("Matt", 200);
        System.out.println("3------------");
        t1.info();
        System.out.println("4------------");
        t1.addPassenger("Wilson",400);
        System.out.println("5------------");
        t1.info();
        System.out.println("5------------");
        t1.addPassenger("Henry",150);
        System.out.println("6------------");
        t1.info();
        System.out.println("7------------");
        t1.addPassenger("Marry", 200);
        System.out.println("8------------");
        t1.info();
        System.out.println("9------------");
        Taxi t2 = new Taxi();
        t2.createTaxi(3);
        System.out.println("10------------");
        t2.info();
    }
}
