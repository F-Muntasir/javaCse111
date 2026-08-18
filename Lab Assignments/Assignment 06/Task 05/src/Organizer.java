//Task 05


public class Organizer{
    public String name;
    public Event [] eventList = new Event [4];
    public int count;

    public Organizer(){
        System.out.println("Please provide the organizer's name");
    }

    public Organizer(String oN){
        name = oN;
    }

    public static Organizer createOrganizer(String on){
        // Organizer temp = new Organizer(on);
        return new Organizer(on);
    }

    public void organizeEvent(Event obj){
        eventList[count++] = obj;
        System.out.println(name+" Successfully organized "+obj.getName());
    }
    public void searchEventByDate(String d){
        // boolean found = false;
        int idx = -1;
        for(int i = 0; i<count; i++){
            if(eventList[i].date.equals(d)){
                idx = i;
                // found = true;
                break;
            }
        }
        if(idx == -1){
            System.out.println("No event");
        }
        else{
            System.out.println(eventList[idx].getName());
        }
    }
}