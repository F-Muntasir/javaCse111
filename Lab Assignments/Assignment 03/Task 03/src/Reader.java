import javax.xml.transform.Source;

public class Reader {
    public String name;
    public int cap;
    public int num;
    public String[] book ;
    public Reader(String s, int a){
        name=s;
        cap=a;
        book=new String[cap];
    }
    public Reader(String s){
        Reader(s,2);
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
        book=new String[cap];
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
            System.out.println("Book "+i+": "+book[i]);
        }
    }
}
