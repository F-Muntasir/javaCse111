public class Student {
        public String name;
        public int id;
        public static int studentCount;
        public Student(String s, int i){
            name=s;
            id=i;
            Student.studentCount++;
            System.out.println("A student is created!");
        }
        public void info(){
            System.out.println("Name: "+name);
            System.out.println("Id: "+id);
        }
    }
