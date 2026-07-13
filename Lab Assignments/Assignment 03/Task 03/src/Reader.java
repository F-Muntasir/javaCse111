//Task 03
public class Reader {
    public String name;
    public int cap;
    public int num;
    public String[] book ;
    public Reader(String s, int a){
        name=s;
        cap=a;
        book=new String[cap];
        System.out.println("A new reader is created!");
    }
    public Reader(String s){
        this(s,2);
    }
    public void addBook(String s){
        if(num<cap){
            book[num++]=s;
        }
        else{
            System.out.println("No more capacity");
        }
    }
    public void updateCapacity(int a ){
        cap=a;
        String[] newbook=new String[a];
        for(int i=0;i<num;i++){
            newbook[i]=book[i];
        }
        book=newbook;
        System.out.println("Capacity has changed to "+a);
    }
    public void readerInfo(){
        System.out.println("Name: "+name);
        System.out.println("Capacity: "+cap);
        System.out.println("books:");
        boolean found = true;
        for(int i=0;i<num;i++){
            if (!book[i].equals("null")) {
                found=false;
            }
            System.out.println("Book "+(i+1)+": "+book[i]);
        }
        if(found==true){
            System.out.println("No books added yet");
        }
    }
}
