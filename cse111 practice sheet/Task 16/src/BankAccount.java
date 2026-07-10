public class BankAccount {
    public int no;
    public String Type="Not Set";
    public BankAccount(){}
    public BankAccount(int a,String s){
        no=a;
        Type=s;
        System.out.println("Bank account is created");
    }
    public void printDetails(){
        System.out.println("Account No: "+no);
        System.out.println("Type: "+Type);
    }
}
