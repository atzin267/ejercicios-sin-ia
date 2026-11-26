import java.util.Scanner;

public class Invertir {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String linea = sc.nextLine();
    System.out.println(invertir(linea));
    }
    static String invertir(String linea) {
        int x = linea.length();
        char[] c = new char[x];
        for (int i = 0; i < x; i++) {

            c[x - 1 - i] = linea.charAt(i);

        }
        return new String(c);
    } 
}
