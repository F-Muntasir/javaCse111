public class Manager  extends Employee {
    public double bonus;
    public double fl;

    public Manager (String n, int s, int h, int b){
        double temp=s;
        super(n,temp,h);
        bonus=b;
    }

    public void requestIncrement(int a){
        if(getHoursWorked()>=80 && getHoursWorked()<=100){
            setBaseSalary(getBaseSalary()+(a/2));
            System.out.println("$"+(a/2)+" Increment approved.");
        }
        else if (getHoursWorked()>100) {
            setBaseSalary(getBaseSalary()+a);
            System.out.println("$"+a+" Increment approved.");
        }
        else {
            System.out.println("Increment denied.");
        }
    }

    public void calculateSalary(){
        if(getHoursWorked()>40){
            fl=getBaseSalary()+(getBaseSalary()*(bonus/100));
        }
        else {
            fl=getBaseSalary();
        }
    }
    public void displayInfo(){
        super.displayInfo();
        if(getHoursWorked()>40){
            System.out.println("Bonus: "+bonus+" $");
        }
        System.out.println("Final Salary: $"+fl);
    }
}
