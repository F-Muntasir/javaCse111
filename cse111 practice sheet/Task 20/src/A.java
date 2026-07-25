public class A{
     public int x = 4, y, z = 5;
     public double p = 0.0;
     public A(int x) {
                 this.x = methodB(x++);
                 p = x + this.x + z * 3.0;
                 System.out.println(this.x +" " + x + " " + p) ;
             }
     public int methodB(int q, int n) {
                 int arr[] = {3,4,5};
                 arr[0] = arr[0] + this.x + n;
                 arr[1] = q + arr[1];
                 System.out.println(arr[0] +" " + arr[1] + " " + arr[2]) ;
                 return arr[1] + arr[2];
             }
     public int methodB(int y) {
                 if(y % 2 == 0) {
                         return this.methodB(2, y);
                     }
                 else{
                         return 4;
                    }
             }
 }
