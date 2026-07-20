public class Connect {
    public int totalAdvisee;
    public Student [] slist=new Student[5];
    public int count;

    public Connect(){
        System.out.println("Connect is ready to use!");
    }

    public void login(Student obj){
        if(obj.email!=null && obj.password!=null){
            System.out.println("Login successful");
            obj.lstutus="yes";
        }
        else{
            System.out.println("Email and password need to be set.");
        }
    }

    public void advising(Student obj){
        if(obj.lstutus==null){
            System.out.println("Please login to advise courses!");
        }
        else {
            System.out.println("You haven't selected any courses.");
        }
    }
    public void advising(Student obj, String c1, String c2, String c3, String c4){
        System.out.println("You need special approval to take more than 3 courses.");
    }
    public void advising(Student obj, String c1, String c2, String c3){
        slist[count++]=obj;
        obj.course[obj.count++]=c1;
        obj.course[obj.count++]=c2;
        obj.course[obj.count++]=c3;
        System.out.println("Advising successful!");
    }

    public void allAdviseeInfo(){
        System.out.println("Total Advisee: "+count);
        for(int i=0;i<count;i++){
            System.out.println("Name: "+slist[i].name+" ID: "+slist[i].id);
            System.out.println("Depertment: "+slist[i].dept);
            System.out.println("Advised Courses:");
            for(int j=0;j<slist[i].count;j++){
                System.out.print(slist[i].course[j]+" ");
            }
            System.out.println();
            System.out.println("==============");
        }
    }
}
