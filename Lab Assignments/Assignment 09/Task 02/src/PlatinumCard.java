//Task 02

public class PlatinumCard extends CreditCard {
    public int point=100;
    public PlatinumCard(String cardHolder, String accountNo){
        super(cardHolder, accountNo,100);
    }

    public void spendCash(int a){
        System.out.println("Previous Reward Points: "+point);
        point=point+((a/100)*2);
        super.rewardPoints=point;
        System.out.println("Reward points after spending "+a+" taka: "+point);
    }
}
