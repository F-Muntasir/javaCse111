// Task 03

public class Book extends Product {
    public String publisher;
    public String isbn;

    public Book(int a, String s, int b, String c, String d){
        super(a,s,b);
        publisher=d;
        isbn=c;

    }
    public String printDetail(){
        return getIdTitlePrice()+"\nISBN: "+isbn+" Publisher: "+publisher;
    }
}
