public class Department {
    public String name;
    public int count;
    public Student[] std= new Student[5];
    public int cap=5;

    public Department(String s){
        name=s;
    }

    public void addStudent(Student obj){
        boolean find = false;
        for(int i=0;i<count;i++){
            if(std[i].getId()==obj.getId()) {
                find = true;
                break;
            }
        }
        if(find){
            System.out.println("Student with the same ID already exists,");
            System.out.println("Please try with another ID");
        }
        else{
            std[count]=obj;
            System.out.println("Welcome to CSE department, "+std[count].name);
            count++;
        }
    }
    public void addStudent(Student obj1,Student obj2,Student obj3){
        addStudent(obj1);
        addStudent(obj2);
        addStudent(obj3);
    }
    public void findStudent(int k){
        boolean find =false;
        for(int i=0;i<count;i++) {
            if (std[i].getId() == k){
                System.out.println("Student info: ");
                System.out.println("Student Name: "+std[i].name);
                System.out.println("ID: "+std[i].getId());
                System.out.println("CGPA: "+std[i].cg);
                find=true;
                break;
            }
        }
        if(!find) {
            System.out.println("Student with this ID doesn't exist, Please give a valid ID");
        }
    }

    public void details(){
        System.out.println("Department Name: "+name);
        System.out.println("Number of student:"+count);
        System.out.println("Details of the students:");
        for(int i=0;i<count;i++){
            System.out.println("Student Name: "+std[i].name+", ID: "+std[i].getId()+", CGPA: "+std[i].cg);
        }
    }
}
