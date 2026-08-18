//Task 04

public class Animalkeepers {
    public String name;
    public static int id;
    private static int uid=101 ;
    public static int keepers;
    public static int tasks;
    public static String [] Animals={"Lion", "Tiger", "Seal", "Gorilla", "Deer"};
    public static String[] work={"Feed","Bathe","Clean Pen","Play","Add Food"};
    public static String[]doAnimal=new String[5];
    public static String []worker=new String[5];

    public Animalkeepers(String s){
        name=s;
        id=uid++;
        keepers++;
        System.out.println(name+" with ID "+id+" got the job!");
    }
    public void doTask(String s, String w){
        boolean found=false;
        int temp=0;
        for(int i =0;i<Animals.length;i++){
            if(Animals[i].equals(s)) {
                found = true;
                temp = i;
            }
        }
        if(found==true) {
            for (int j = 0; j < work.length; j++) {
                if (work[j].equals(w)) {
                    worker[j] = name;
                    doAnimal[j] = s;
                    tasks++;
                    System.out.println("Task assigned to " + name);
                }
            }
        }
        else {
            System.out.println("Animal not in the Safari");
        }
    }

    public static void printTasks(){
        for (int i=0;i<doAnimal.length;i++){
            if(doAnimal[0]==null){
                System.out.println("No tasks assigned.");
                break;

            }
            else {
                if(doAnimal[i]!=null)
                  System.out.println(work[i]+" (Keeper - "+worker[i]+") === "+doAnimal[i]);
            }
        }
    }
    public static void details(){
        if(doAnimal[0]==null){
            System.out.println("No Animal Keepers working yet.");
        }
        else {
            System.out.println("Total Animal Keeper: " + keepers);
            System.out.println("Total Task assigned: " + tasks);
            printTasks();
        }
    }

    }