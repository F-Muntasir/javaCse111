public class StudentTester {
    public static void main (String args[]){
        Student std1 = new Student();
        std1.studentInfo();
        System.out.println("1-----------------");
        std1.name = "Bob";
        std1.id = 123;
        System.out.println(std1.addCourse("CSE110"));
        System.out.println("2-----------------");
        std1.studentInfo();
        System.out.println("3-----------------");
        Student std2 = new Student();
        std2.name = "Max";
        std2.id = 456;
        System.out.println(std2.addCourse("CSE250"));
        System.out.println(std2.addCourse("CSE370"));
        std2.studentInfo();
        System.out.println("4-----------------");
        System.out.println(std2.addCourse("PHY111"));
        System.out.println(std2.addCourse("MAT120"));
        System.out.println("5-----------------");
        std2.studentInfo();
        System.out.println("6-----------------");
        System.out.println(std2.addCourse("CSE470"));
        System.out.println("7-----------------");
        std2.studentInfo();


    }

}
