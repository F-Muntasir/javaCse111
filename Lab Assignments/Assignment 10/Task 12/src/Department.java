public class Department {
    public String chant = "I love my Department!";
   public void task1(){
             System.out.println(chant);
           }
   public void task2(){
             task1();
             System.out.println("Doing Task 2 "+ chant);
           }
   public void advising(){
             System.out.println("Advising is Pain.");
           }
   public String toString(){
             advising();
             return chant;
           }
 }
 class CSEDept extends Department{
   public String chant = "CSE is Love.";
   public void task2(){
             System.out.println("Doing Task 2 "+ chant);
           }
   public void advising(){
             System.out.println("Advising is Pain.");
           }
 }
 class EEEDept extends Department{
   public String chant = "Help.";
   public void task1(){
             System.out.println("Doing Task 1 "+ chant);
           }
   public void advising(){
             super.advising();
             System.out.println(chant);
           }
   public String toString(){
             task2();
             return chant;
           }
 }
 class SoftwareDept extends CSEDept{
   public String chant = "Software is fun!";
   public String toString(){

             advising();
             return chant;
           }
   public void task1(){
             System.out.println("Doing Task 1 "+ chant);
             task2();
           }
 }
 class RoboticsDept extends EEEDept{
   public String chant = "New Department woohoo!";
   public void task2(){
             System.out.println("Doing Task 2 "+ chant);
           }
   public void advising(){
             super.advising();
             task1();
             System.out.println(chant);
           }
}
