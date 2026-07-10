public class Student {
    public String name="Default";
    public int id;
    public int limit=4;
    public int taken;
    public String [] list= new String[4];

    public void studentInfo(){
        System.out.println("Student Name: "+name);
        System.out.println("Student ID: "+id);
        System.out.println("Maximum Course Limit: "+limit);
        System.out.println("Courses Taken: "+taken);
        System.out.println("Courses: ");

        for(int i=0;i<taken;i++){
            System.out.print(list[i]+" ");
        }
        System.out.println();
    }

    public String addCourse(String s){
        if(taken < limit){
            list[taken++]=s;
            return s+" course is added";
        }
        else {
            return "The maximum course limit exceeded";
        }
    }
}
