public class Teacher {
    public String name;
    public String initial;
    public Course[] c=new Course[3];
    public int count;

    public Teacher(String s, String n){
        name=s;
        initial=n;
        System.out.println("A new teacher has been created");
    }

    public void addCourse(Course obj){
        c[count]=obj;
        count++;
    }
    public void printDetail(){
        System.out.println("Name: "+name);
        System.out.println("Initial: "+initial);
        System.out.println("List of courses:");
        for(int i=0;i<count;i++){
            System.out.println(c[i].cname);
        }
    }
}
