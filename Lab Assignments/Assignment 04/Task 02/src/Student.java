//Task 02

public class Student {
    public int id;
    public double cg;
    public String[] crs;
    public int cap;
    public int count;

    public Student(int s){
        id=s;
        System.out.println("A student with ID "+id+" has been created.");
    }

    public Student(int i, double c){
        id=i;
        cg=c;
        System.out.println("A student with ID "+id+" and cgpa "+cg+" has been created.");
        if(cg>=3.00){
            cap=4;
            crs= new String[cap];
        }
        else{
            cap=3;
            crs=new String[cap];
        }
    }

    public void storeID(int n){
        id= n;
    }

    public void storeCG(double d){
        cg=d;
        if(cg>=3.00){
            cap=4;
            crs= new String[cap];
        }
        else{
            cap=3;
            crs=new String[cap];
        }
    }

    public void addCourse(String s){
        if(cg==0.0){
            System.out.println("Failed to add "+s);
            System.out.println("Set CG first");
        }
        else {
            if(count<cap) {
                crs[count++] = s;
            }
            else {
                System.out.println("Failed to add "+s);
                System.out.println("CG is low. Can't add more than "+cap+" courses.");
            }
        }
    }

    public void addCourse(String [] s){
        if(cg==0.0){
            System.out.println("Failed to add "+s[0]);
            System.out.println("Set CG first");
        }
        else {
            for(int i=0; i<crs.length;i++){
                crs[i]=s[i];
                count++;
            }
            for(int i=0; i<s.length;i++){
                if(i>=count){
                    System.out.println("Failed to add "+s[i]);
                    System.out.println("Maximum "+cap+" courses allowed.");
                }
            }
        }
    }

    public void showAdvisee(){
        System.out.println("Student ID: "+id+", CGPA: "+cg);
        if(crs[0]!=null) {
            System.out.println("Added courses are:");
            for (int i = 0; i < count; i++) {
                System.out.print(crs[i] + " ");
            }
            System.out.println();
        }
        else {
            System.out.println("No courses added.");
        }
    }

    public void removeAllCourse(){
        for(int i=0;i<count;i++){
            crs[i]=null;
            count=0;
        }
    }
}
