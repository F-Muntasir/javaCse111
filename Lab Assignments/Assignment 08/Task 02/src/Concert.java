public class Concert {
    public String venue;
    public String time;
    public String [] artists= new String[5];
    public int ticket;
    public static  int tt;
    public int count;

    public Concert(String s, String t){
        venue=s;
        time=t;
    }

    public void addArtist(String  s){
        artists[count++]=s;
    }

    public void buyTicket(String s, int i){
        int price=0;
        ticket+=i;
        tt+=i;
        if(s.equals("A")){
            price=500*i;
            System.out.println("Total price: "+price);
        }
        else if (s.equals("B")) {
            price=1000*i;
            System.out.println("Total price: "+price);
        }
        else if (s.equals("VIP")) {
            price=2000*i;
            System.out.println("Total price: "+price);
        }
    }
    public void buyTicket(String s){
        buyTicket(s,1);
    }
    public void buyTicket(){
        buyTicket("VIP",1);
    }

    public void showDetails(){
        System.out.println("Venue: "+venue);
        System.out.println("Showtime: "+time);
        System.out.println("Artists: ");
        for(int i=0;i<count;i++){
            System.out.println("-"+artists[i]);
        }
        System.out.println("Tickets sold in this concert: "+ticket);
    }

    public static void showTotalTicketsSold(){
        System.out.println("Total tickets sold (all venues): "+tt);
    }
}
