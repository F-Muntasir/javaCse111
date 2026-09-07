public class SignatureCard extends CreditCard{
    public int point=200;
    public SignatureCard(String cardHolder, String accountNo){
        super(cardHolder, accountNo,200);
    }

    public void spendCash(int a){
        System.out.println("Previous Reward Points: "+point);
        point=point+((a/100)*4);
        super.rewardPoints=point;
        System.out.println("Reward points after spending "+a+" taka: "+point);
    }
    public void cardDetails(){
        super.cardDetails();
        System.out.println("Possible Number of Companions for Lounge: 5");
    }
}
