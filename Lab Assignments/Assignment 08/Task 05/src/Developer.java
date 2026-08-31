public class Developer extends Employee{
    public String lang;
    public double fl;

    public Developer(String n, int s, int h, String l){
        double temp=s;
        super(n,temp,h);
        lang=l;
    }

    public void calculateSalary(){
        if(lang.equals("Java")){
            fl=getBaseSalary()+700;
        }
        else {
            fl=getBaseSalary();
        }
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Language: "+lang);
        System.out.println("Final Salary: $"+fl);
    }
}
