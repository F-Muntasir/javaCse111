public class Course {
    public String coursename;
    public String coursecode;
    public int credit;

    public void updateDetails(String n, String m, int l){
        coursename=n;
        coursecode=m;
        credit=l;
    }
    public void displayCourse(){
        System.out.println("Course Name "+ coursename);
        System.out.println("Course Code"+ coursecode);
        System.out.println("Course Credit"+credit);
    }
}
