//Task 02

public class ImaginaryNumber {
    public  int realPart;
    public int imaginaryPart;

    public String printNumber(){
        return realPart + " + " + imaginaryPart+"i";
    }
}


public class Assignment {
    public int tasks;
    public String difficulty;
    public boolean submission;

    public void printDetails(){
        System.out.println("Number of tasks: "+tasks);
        System.out.println("Difficulty level: "+difficulty);
        System.out.println("Submission required: "+submission);
    }

    public String makeOptional(){
        boolean p= false;
        if(p==submission){
            return "Submission is already not required";
        }
        else{
            submission= false;
            return "Assignment will not require submission";
        }
    }
}
