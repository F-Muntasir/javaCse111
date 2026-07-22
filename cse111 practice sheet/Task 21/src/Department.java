public class Department {
    public String name;
    public int num;

    public void mergeStudents (Department obj){
        num+= obj.num;
        System.out.println("Students of "+obj.name+" are merged with students of "+name);
    }

    public Department(String s, int n){
        name=s;
        num=n;
    }

    public void addStudents(int [] s){
        for(int i=0;i<s.length;i++){
            num+=s[i];
            s[i]=0;
        }
    }

    public void info(){
        System.out.println("Name: "+name);
        System.out.println("Total Student: "+num);
    }
}
