public class Employee {
    public String name;
    public int id;
    public static int total;
    public static Employee [] list= new Employee[4] ;
    public Employee (String n, int i){
        name=n;
        id=i;
        list[total]=this;
        total++;
    }
    public void details(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }
    public static void allEmployeeInfo() {
        System.out.println("Total Employee: "+total);
        System.out.println("Employee List:");
        for (int i = 0; i < total; i++) {
            list[i].details();
        }
    }

    public static Employee createEmployee(String s, int i){
        return new Employee(s,i);
    }
}
