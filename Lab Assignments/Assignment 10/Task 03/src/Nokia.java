public class Nokia extends Mobile{
    double balance;
    public Nokia(String m,boolean s, String i, int b){
        super(m,i,s);
        balance=b;
    }
    public String toString(){
       return super.toString()+ "\n Balance: "+balance+" TK";
    }

    public String dialCall(String s){
        if(simCardStatus){
            if(balance>0.0){
                if(getCountryName(s.split("1")[0])!=null){
                    return "Dialing the number "+s+" to "+getCountryName(s.split("1")[0])+" region.";
                }
                else {
                    return "Dialing is not allowed in this region.";
                }
            }
            else {
                return "Insufficient balance! Please recharge.";
            }
        }
        else {
            return "No SIM card available! Please check the SIM card connectivity.";
        }
    }

    public void rechargeSIMCard(int a){
        balance+=a;
        System.out.println("Recharge successful! Current balance "+balance+" TK.");
    }
}
