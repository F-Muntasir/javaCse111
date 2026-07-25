public class BracuBus {
    public String loc;
    public int cap;
    public int count;
    public BracuStudent[] std;

    public BracuBus(String l, int c){
        loc=l;
        cap=c;
        std=new BracuStudent[cap];
    }
    public BracuBus(String l){
        this(l,2);
    }
    public void board(){
        System.out.println("No passengers");
    }
    public void board(BracuStudent obj){
        if(count<cap) {
            if (obj.pass == true) {
                if (obj.getlocation().equals(loc)) {
                    std[count++] = obj;
                    System.out.println(obj.name + " boarded the bus.");
                }
                else {
                    System.out.println("You got on the wrong bus!");
                }
            }
            else {
                System.out.println("You don't have a bus pass!");
            }
        }
        else {
            System.out.println("Bus is full!");
        }
    }
    public void board(BracuStudent o1, BracuStudent o2){
        board(o1);
        board(o2);
    }
    public void showDetails(){
        System.out.println("Bus Route: "+loc);
        System.out.println("Passenger Count: "+count+" (Max: "+cap+")");
        System.out.println("Passengers on Board:");
        for(int i=0;i<count;i++){
            System.out.print(std[i].name+" ");
        }
        System.out.println();
    }
}
