public class Student {
    public String name;
    public String dept="CSE";
    public double cg;

    public void details(){
        System.out.println("Name: "+name);
        System.out.println("Depertment:"+dept);
        System.out.println("CGPA: "+cg);
    }

    public void updateInfo(String n){
        name=n;
    }

    public void updateInfo(String n, String s){
        name=n;
        dept=s;
    }

    public void updateInfo(String n, double d, String n2 ){
        cg=d;
        updateInfo(n,n2);
    }

    public void updateInfo(String n, String n2, double d){
        updateInfo(n,d,n2);
    }
}
