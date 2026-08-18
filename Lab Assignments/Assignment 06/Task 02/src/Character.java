//Task 02

public class Character {
    public String name;
    public int health;
    public String group;
    public static String[] plist={"Kid", "Teen", "Adult"};
    public static int[]nlist={0,0,0};
    public static int id;
    public static String strong;
    public static int shealth;
    public static int total;
    public static double avg;
    public static int count;

    public Character (String s, String l, int n){
        id+=1;
        name=s;
        group=l;
        for(int i =0;i< plist.length;i++){
            if(l.equals(plist[i])){
                nlist[i]+=1;
            }
        }
        health=n;
        total+=n;
        avg=total/id;
        if(n>shealth){
            shealth=n;
            strong=s;
        }
    }
    public Character (String s, int n){
        this(s, "Teen", n);
    }
    public void printDetails(){
        System.out.println("ID: "+id+", Name: "+name);
        System.out.println("Group: "+group);
        System.out.println("Health: "+health);
    }
    public static void printStats(){
        if(id==0){
            System.out.println("Total Characters: "+0);
            System.out.println("Kids: "+0);
            System.out.println("Teens: "+0);
            System.out.println("Adults: "+0);
            System.out.println("Average Health: "+0);
            System.out.println("Strongest Character: None");
        }
        else {
            System.out.println("Total Characters: " + id);
            System.out.println("Kids: " + nlist[0]);
            System.out.println("Teens: " + nlist[1]);
            System.out.println("Adults: " + nlist[2]);
            System.out.println("Average Health: " + avg);
            System.out.println("Strongest Character:");
            System.out.println(strong + " (Health " + shealth + ")");
        }
    }
}
