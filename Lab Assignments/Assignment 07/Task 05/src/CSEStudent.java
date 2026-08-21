// Task 05

import java.util.Arrays;

public class CSEStudent extends Student {
    public static int total;
    public static String[] list={"CSE110", "CSE111","CSE220", "CSE221"};
    public CSEStudent(String n, int i){
        super(n,i);
        total++;
    }

    public void addLabBasedCourse(String s){
        boolean found=false;
        for (int i=0;i< list.length;i++){
            if(s.equals(list[i])){
                found=true;
                courses+=list[i]+" ";
            }
        }
        if(!found){
            System.out.println("It is not a lab based course!");
        }
    }

    public static void details(){
        System.out.println("Total CSE Students: "+total);
        System.out.println("Available Lab Based Courses:");
        System.out.println("CSE110 CSE111 CSE220 CSE221");
    }
}
