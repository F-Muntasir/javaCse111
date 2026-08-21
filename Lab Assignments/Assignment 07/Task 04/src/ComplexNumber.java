// Task 04

public class ComplexNumber extends RealNumber {
    public double impart;

    public ComplexNumber(){
        this(1.0,1.0);
    }
    public ComplexNumber(double a, double b){
        super(a);
        impart=b;
    }
    public  String details(){
        return getReal()+"\nImaginaryPart: "+impart;
    }
}
