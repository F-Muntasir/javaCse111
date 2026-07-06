//Task 04

public class MobilePhone {
    public int name;
    public String[] namelist;
    public int[] numberlist;
    public int cap;
    public int l;

    public void setContactCapacity(int n){
        namelist= new String[n];
        numberlist= new int[n];
        cap =n;
    }
    public void addContact(String s, int n){
        if(l<cap){
            namelist[l]= s;
            numberlist[l]=n;
            name++;
            l++;
            System.out.println("The contact of "+s+" is added.");
        }
        else if (l>=cap) {
            System.out.println("Storage Full!!");
        }
    }
    public void makeCall(int n){
        int a=0;
        for (int i =0; i<name; i++) {
            if (n == numberlist[i]) {
                System.out.println("Calling " + namelist[i] + " . . .");
                a++;
                break;
            }
        }
        if(a==0){
            System.out.println("Calling " + n + " . . .");
        }
    }

    public void details(){
        System.out.println("Total contacts: "+ name);
        System.out.println("Contact List:");
        for(int i =0; i<name;i++){
            System.out.println(namelist[i]+":"+numberlist[i]);
        }
    }
}
