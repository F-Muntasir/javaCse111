//Task 03

public class Artifact {
    private String name;
    private String owner;
    private  int power;
    private static int highest;
    private static Artifact [] list= new Artifact[4];
    private static int count;

    public Artifact (String s, String o){
            name=s;
            owner=o;
            power= CalcPower();
            if(power>highest){
                highest=power;
            }
    }
    public Artifact (String s){
        this(s,"Okabe");
    }

    public static void  AddtoVault(Artifact obj){
        if(count<4){
            list[count++]=obj;
            System.out.println(obj.owner+"e added "+obj.name+" successfully to the vault.");
        }
        else {
            System.out.println("!! "+obj.owner+" unsuccessful in adding artifact to the \n" +
                    "vault!!");
        }
    }

    public int CalcPower(){
        int sum=0;
        if(name.length()%2==0){
            for(int i=0;i<name.length();i+=2){
                sum += (int) name.charAt(i);
            }
            power=sum;
            return power;
        }
        else {
            for(int i=1;i<name.length();i+=2) {
                sum += (int) name.charAt(i);
            }
            power=sum;
            return power;
        }
    }
    public static String strongest(){
        String strong="no";
        for(int i=0;i<count;i++){
            if(highest==list[i].power){
                strong= list[i].name;
            }
        }
        return strong;
    }
    public void revealArtifact(){
        System.out.println(name+" added by "+owner+" power of "+power);
    }
    public void changeName(String s){
        name=s;
        power=CalcPower();
        if(power>highest){
            highest=power;
        }
        System.out.println("Name changed and power recalculated.");
    }

    public static void labReport(){
        for(int i=0;i<count;i++){
            list[i].revealArtifact();
        }
    }
    public String GetName(){
        return name;
    }
}
