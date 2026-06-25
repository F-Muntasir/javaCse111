import java.util.Scanner;
public class t1 {
public static void main ( String [] args ){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int m= sc.nextInt();
    int k= 0;
    for (int i=n; i<m; i++) {
        int l=0;
        for (int j=2;j<i;j++){
            if(i%j==0){
                l++;
            }
        }
        if(l==0 && i>1){
            k++;
        }
    }
    System.out.println("Ther are "+k+" prime numbers between "+n+" and "+m);
}
}
