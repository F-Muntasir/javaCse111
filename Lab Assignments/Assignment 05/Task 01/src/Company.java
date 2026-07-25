// Task 01

public class Company {
    public String name="ABC Company";
    public int cap=3;
    public int count;
    public Employee []emp=new Employee[3];

    public void addEmployee(Employee obj){
        if(count<cap){
            emp[count]=obj;
            System.out.println(obj.getname()+" has joined the company");
            count++;
        }
        else {
            System.out.println("No more vacancy");
        }
    }
    public void removeEmployee(Employee obj){
        for (int i=0;i<emp.length;i++){
            if(obj==emp[i]){
                emp[i]=null;
                System.out.println(obj.getname()+" has left the company");
                count--;
            }
        }
    }
    public void details(){
        System.out.println("Company Name: "+name);
        System.out.println("Total Employee: "+count);
        System.out.println("Fulltime Employees:");
        for(int i=0;i< emp.length;i++){
            if(emp[i]!=null && emp[i].gettype().equals("Fulltime")){
                System.out.println("Name: "+emp[i].getname()+", ID: "+emp[i].getid());
            }
        }
        System.out.println("Part-Time Employees:");
        for(int i=0;i< emp.length;i++){
            if(emp[i]!=null && emp[i].gettype().equals("Part-time")){
                System.out.println("Name: "+emp[i].getname()+", ID: "+emp[i].getid());
            }
        }
    }
}
