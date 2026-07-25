// Task 03

public class Spaceship {
    public String name;
    public int cap;
    public int count;
    public int item;
    public int over;
    public int available;;
    public Cargo[] cg=new Cargo[100];
    public Spaceship(String n, int c){
        name=n;
        cap=c;
        available=c;
    }
    public void loadCargo(Cargo obj){
        if(obj.getWeight()<available){
            cg[item]=obj;
            count+=obj.getWeight();
            available= cap-count;
            item++;
        }
        else{
            over= obj.getWeight()-available;
            System.out.println("Warning: Unable to load Neutronium inside Falcon. Exceeds capacity by "+over);
        }
    }
    public void displayDetails(){
        System.out.println("Spaceship Name: "+name);
        System.out.println("Capacity: "+cap);
        System.out.println("Current Cargo Weight: "+count);
        System.out.print("Cargo:");
        for (int i=0;i<item;i++){
            System.out.print(cg[i].getName()+" ");
        }
        System.out.println();
    }
}
