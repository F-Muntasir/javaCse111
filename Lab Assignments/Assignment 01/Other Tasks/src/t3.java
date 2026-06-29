//task 03

import java.util.Scanner;
public class t3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [] m=new int[n];
        for (int i=0; i<m.length;i++){
            m[i]=sc.nextInt();
        }
        for(int i=0; i<m.length;i++){
            int h=1;
            int g=0;
            for(int j=i+1;j<m.length;j++){
                if(m[j]==m[i]){
                    h++;
                }
            }
            for(int j=i;j>=0;j--){
                if(m[j]==m[i]){
                  g++;
                }
            }
            if(g==1){
                System.out.println(m[i]+ " - "+h+" times");
            }
        }
    }
}
