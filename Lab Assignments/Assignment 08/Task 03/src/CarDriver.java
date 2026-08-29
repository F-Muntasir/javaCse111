public class CarDriver extends GenericDriver {
    public String type;
    public static String [] restrictedAreas =new String[2];
    public static int count;

    public CarDriver (String s){
        super(s);
        type= "premium";
    }
    public String toString(){
        return getName()+ "'s driver profile is a "+type;
    }

    public void hasSafetyTraining(){
        super.hasSafetyTraining();
        System.out.println("Premium drivers receive extra safety briefings.");
    }

    public String acceptRide(boolean a){
        return super.acceptRide(a) +"\nMax's driver profile is Premium";
    }

    public static void restrictedAreas(String s){
        restrictedAreas[count++]=s;
    }

    public void fightRestriction(String [] s){
        for(int i=0;i<s.length;i++){
            boolean found =false;
            int temp=0;
            for(int j=0;j<count;j++){
                if(restrictedAreas[j].equals(s[i])){
                    found=true;
                    temp=i;
                    break;
                }
            }
            if(found){
                System.out.println(getName()+" cannot enter "+s[temp]);
            }
            else {
                System.out.println(getName()+" can enter "+s[i]);
            }
        }
    }
}
