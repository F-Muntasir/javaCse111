public class Bondhus extends SocialMedia{
    public String[] msg;
    public int count;
    public int sent;
    public Bondhus(String n, String e){
        super(n,e);
        msg=new String[5];
    }
    public void sendMessage(String s){
        if(count< msg.length){
            msg[count++]=s;
            sent++;
        }
        else {
            System.out.println("Sentbox is full.");
        }
    }
    public void showSentbox(){
        System.out.println(userName + "'s Sentbox");
        if(msg[0]==null){
            System.out.println("No sent messages. ");
        }
        else {
            for (int i = 0; i < count; i++) {
                System.out.println(msg[i]);
            }
        }
    }
    public String toString(){
        return super.toString()+"\nMessages Sent: "+sent;
    }
}
