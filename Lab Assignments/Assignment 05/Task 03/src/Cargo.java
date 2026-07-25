public class Cargo {
    private String name;
    private int weight;

    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setWeight(int a){
        weight=a;
    }
    public int getWeight(){
        return weight;
    }
    public Cargo(String n, int a){
        setName(n);
        setWeight(a);
    }
}
