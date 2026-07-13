//Task 04

public class MoneyTracker {
    public String name;
    public double balance;
    public double income;
    public double expense;
    public MoneyTracker(){
        System.out.println("A new money tracker has been launched.");
    }
    public void createTracker(String s){
        name=s;
        balance=1.0;
    }

    public String info(){
        return "Name: "+name +"\n"+"Current Balance: "+ balance;
    }
    public void income(double n){
        income=n;
        balance+=n;
        System.out.println("Balance Updated!");
    }
    public void expense(double n){
        if(n<balance){
            balance-=n;
            expense=n;
            System.out.println("Balance Updated!");
        }
        else if(n==balance){
            balance-=n;
            expense=n;
            System.out.println("You're broke!");
        }
        else {
            System.out.println("Not enough balance. ");
        }
    }
    public void showHistory(){
        System.out.println("Last added: "+income);
        System.out.println("Last spent: "+expense);
    }
}
