public class Student {
    public String name;
    private int id;
    public double cg;

    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
    public Student(String n, int i, double c){
        name=n;
        setId(i);
        cg=c;
    }
}
