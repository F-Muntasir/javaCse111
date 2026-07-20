//Task 04

public class Student {
    public int id;
    public String dept;
    public String name;
    public String email;
    public String password;
    public String lstutus;
    public String course []= new String[3];
    public int count;

    public Student(String n, int i, String d){
        name=n;
        id=i;
        dept=d;
        System.out.println("Student object is created ");
    }
}
