public class Employee {
    private String name;
    private int id;
    private String type;

    public Employee(){
        System.out.println("A default employee has been created");
    };
    public Employee(String n, int i, String t){
        setname(n);
        setid(i);
        settype(t);
    }
    public void setname(String s){
        name=s;
    }
    public String getname(){
        return name;
    }
    public int getid(){
        return id;
    }
    public void setid(int s){
        id=s;
    }
    public String gettype(){
        return type;
    }
    public void settype(String s){
        type=s;
    }
}
