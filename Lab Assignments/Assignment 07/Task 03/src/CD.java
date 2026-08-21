public class CD extends Product{
    public String band;
    public int duration;
    public String genre;

    public CD(int a, String s, int b, String d,int c, String k){
        super(a,s,b);
        band =d;
        duration=c;
        genre=k;
    }
    public String printDetail(){
        return getIdTitlePrice()+"\nBand: "+band+" Duration: "+duration+" minutes \nGenre: "+genre;
    }
}
