 public class Player {
    public String name;
    public int hp;
    public String [] enemy= new String[5];
    public int count;

    public Player(String s, int h){
        name = s;
        hp=h;
        System.out.println(name +" joined the game");
        System.out.println("HP: "+hp);
    }

    public Player (String s){
        this(s,100);
    }

    public void defeatVillain(String s, int a){
        if(hp>=a){
            hp+=a;
            System.out.println("defeated "+s);
            enemy[count++]=s;
        }
        else {
            System.out.println("failed to defeat "+s);
        }
    }
    public void defeatVillain(char c, String s, int a){
        int b= c-'0';
        hp=hp*b;
        System.out.println("HP with "+b+" x boost: "+hp);
        defeatVillain(s,a);
    }

    public void defeatVillain(Player s){
        String n= s.name;
        int h=s.hp;
        defeatVillain(n,h);
    }

    public void viewInfo(){
        System.out.println("Player Name: "+name);
        System.out.println("Current HP: "+hp);
        if(enemy[0]!= null) {
            System.out.println("Defeated: ");
            for (int i = 0; i < count; i++) {
                System.out.print(enemy[i] + ", ");
            }
            System.out.println();
        }
    }
}