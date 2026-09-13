public class InPatient extends Patient {
    public String dept;
    public static int ip;

    public InPatient(String n, String d, String dep){
        super(n,d);
        dept=dep;
        ip++;
        System.out.println("New patient admitted in "+dep);
    }

    public static void details(){
        System.out.println("Total patients: "+total);
        System.out.println("Admitted In-Patients: "+ip);
        System.out.println("Out-Patients: "+(total-ip));
    }

    public String toString(){
        return super.toString()+"\nDepertment: "+dept;
    }
}
