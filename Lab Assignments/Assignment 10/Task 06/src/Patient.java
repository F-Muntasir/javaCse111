public class Patient {
    String name;
    String doctor;
    static String id="P0";
    static int total;

    public Patient(String n, String d){
        name=n;
        doctor=d;
        total++;
    }
    public static void details(){
        System.out.println("Total Patients: "+total+".");
    }

    public String toString(){
        return "Patient ID: "+id+total+", Name: "+name+"\nDoctor: "+doctor;
    }

    public static void details(Patient[] obj){
        System.out.println("Details of "+total+" selected patients:");
        System.out.println("== == == == == ");
        for(int i=0; i< obj.length;i++){
              System.out.println(obj[i].toString());
              System.out.println("== == == == == ");
          }
    }
}
