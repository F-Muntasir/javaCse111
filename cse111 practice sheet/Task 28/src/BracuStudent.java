public class BracuStudent {
    public String name;
    private String location;
    public boolean pass=false;

    public BracuStudent(String n, String l){
        name=n;
        location=l;
    }
    public void collectPass(){
        pass=true;
    }
    public void showDetails(){
        System.out.println("Student Name: "+name);
        System.out.println("Lives in "+location);
        System.out.println("Have Bus Pass? "+pass);
    }
    public String getlocation(){
        return location;
    }
    public void setLocation(String s){
        location=s;
    }
}
