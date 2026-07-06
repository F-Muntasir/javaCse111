//Task 03

public class Employee {
    public String name;
    public double salary= 30000.0;
    public String designation= "junior";

    public void newEmployee(String n){
        name  = n;
    }

    public void displayInfo(){
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Salary: "+salary+" Tk ");
        System.out.println("Employee Designation: "+designation);
    }

    public void calculateTax(){
        double tax;
        if(salary>50000.0){
            tax=salary*.3;
            System.out.println(name +" Tax Amount: "+ tax+ " Tk");
        }
        else if (salary>30000.0){
            tax=salary*.1;
            System.out.println(name +" Tax Amount: "+ tax+ " Tk");
        }
        else {
            System.out.println("No need to pay tax");
        }
    }

    public void promoteEmployee(String n){
        if(n=="senior"){
            designation= "senior";
            salary+=25000.0;
            System.out.println(name+" has been promoted to "+designation);
            System.out.printf("New Salary: %.2f Tk\n", salary);
        }
        else if (n=="lead"){
            designation= "lead";
            salary+=50000.0;
            System.out.println(name+" has been promoted to "+designation);
            System.out.printf("New Salary: %.2f Tk\n", salary);
        }
        else if (n=="manager"){
            designation= "manager";
            salary+=75000.0;
            System.out.println(name+" has been promoted to "+designation);
            System.out.printf("New Salary: %.2f Tk\n", salary);
        }
    }
}
