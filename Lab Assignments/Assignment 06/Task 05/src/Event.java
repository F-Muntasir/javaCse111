public class Event{
    private String name;
    public String date;
    public static int evCount;
    public static Event evList[] = new Event [5];

    public Event(String n, String d){
        name = n;
        date = d;
        Event.evList[Event.evCount++] = this;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public String details(){
        return "Name: "+name+"\nDate: "+date;
    }
    public static void allEventInfo(){
        System.out.println("Total Events: "+Event.evCount);
        System.out.println("Event Deatils: ");
        for(int i = 0; i<Event.evCount; i++){
            System.out.println("Event: "+(i+1));
            System.out.println(Event.evList[i].details());
        }
    }
}