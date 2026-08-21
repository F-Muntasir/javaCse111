// Task 02

public class CheckingAccount extends Account {
    public static int count;
    public CheckingAccount(double a){
        super(a);
        count++;
    }
    public CheckingAccount(){
        this(0.0);
    }
}
