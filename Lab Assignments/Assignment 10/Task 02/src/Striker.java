public class Striker extends Football {
    int goals;
    int shot;
    double performance;
    public Striker(String n,int a,int s,int g, int sh){
        super(n,a,s);
        goals=g;
        shot=sh;
    }
    public void calculatePerformance(){
        double a=goals;
        double b=shot;
        performance=(double) (a/b);
        System.out.println("Performance: "+performance);
    }

    public void display(){
        super.display();
        System.out.println("Goals: "+goals);
        System.out.println("Shots on target: "+shot);
    }
}
