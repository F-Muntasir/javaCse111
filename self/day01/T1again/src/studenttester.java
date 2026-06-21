public class studenttester{
    public static void main (String[] args){
        student std1= new student();
        student std2= new student();
        System.out.println(std1);
        System.out.println(std1.name);
        System.out.println(std2.cgpa);
        System.out.println("000000000000000000");

        std1.name= "ali";
        std1.id= 5;
        System.out.println(std1.name);
        System.out.println(std2.name);
        std2.id=std1.id++;
        System.out.println(std2.id);
        System.out.println(std1.id);
    }
}