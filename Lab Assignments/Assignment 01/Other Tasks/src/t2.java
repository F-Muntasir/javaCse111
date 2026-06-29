import java.util.Scanner;
public class t2 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            int a = ch;
            int b;
            char c;
            if (a == 97) {
                b = 122;
                c = (char) b;
                System.out.print(c);
            } else if (a == 65) {
                b = 90;
                c = (char) b;
                System.out.print(c);
            } else {
                b = a - 1;
                c = (char) b;
                System.out.print(c);
            }
        }
    }
}
