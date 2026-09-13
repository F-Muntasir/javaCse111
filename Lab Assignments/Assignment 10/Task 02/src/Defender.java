public class Defender extends Football{
    int tackle;
    int inter;
    double performance;
    public Defender(String n,int a,int s,int g, int sh){
        super(n,a,s);
        tackle =g;
        inter=sh;
    }
    public void calculatePerformance(){
        double a=inter;
        double b=tackle;
        performance= a/b;
        System.out.println("Performance: "+performance);
    }

    public void display(){
        super.display();
        System.out.println("Goals: "+ tackle);
        System.out.println("Shots on target: "+inter);
    }
}
