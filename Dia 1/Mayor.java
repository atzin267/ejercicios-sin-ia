import java.util.Scanner;

public class Mayor {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int x = mayor(a, b, c);
            System.out.println(x);
        }
static int mayor(int a, int b, int c) {
            int x;
            if (a >= b && a >= c) {
                x=a;
            } else if (b >= a && b >= c) {
                x=b;
            } else {
                x=c;
            }
            return x;
        }
    }

    