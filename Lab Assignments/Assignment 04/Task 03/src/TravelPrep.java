//Task 03

public class TravelPrep {
    public String t_name;
    public String p_name;
    public int cost;
    public int tcost;
    public int budget;
    public String [] place=new String[3];
    public int [] price=new int[3];
    int cap=3;
    int count;

    public TravelPrep(String n, int b){
        t_name=n;
        budget=b;
        System.out.println(n+" would cost at most "+b+" yen");
    }
    public TravelPrep(){
        this("Unknown Package", 1250);
    }

    public TravelPrep(String n1, String n2, int a){
        p_name=n2+ " "+ n1;
        cost=a;
        System.out.println(n2+ " "+ n1+" costs "+a+" yen ");
    }
    public TravelPrep(String n1, String n2){
        this(n2,n1,300);
    }

    public void add_to_itinerary(TravelPrep obj){
        tcost+=obj.cost;
        if(tcost<budget){
            place[count]= obj.p_name;
            price[count]= obj.cost;
            count++;
        }
        else {
            System.out.println("Budget going overboard ");
        }
    }
    public void add_to_itinerary(TravelPrep obj1, TravelPrep obj2){
        add_to_itinerary(obj1);
        add_to_itinerary(obj2);
    }

    public String updateCost(int a){
        cost+=a;
        return "Cost of "+p_name+" updated to "+cost;
    }

    public void show_itinerary(){
        System.out.println("Itinerary for "+t_name);
        for(int i=0;i<count;i++){
            System.out.println(i+1+". "+place[i]+" - "+price[i]+ " yen");
        }
        System.out.println("Total cost of "+count+" destinations: "+tcost+" yen");
    }
}
