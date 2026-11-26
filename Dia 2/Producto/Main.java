public class Main {
    public static void main(String[] args) {
try {
    Producto malo = new Producto("Roto", -5, 1);
} catch (IllegalArgumentException e) {
    System.out.println("Error: " + e.getMessage());
}

Producto a = new Producto("Mouse", 25, 10);
Producto b = new Producto("Mouse", 25, 10);
System.out.println(a.equals(b));   
System.out.println(a == b);        
    }
}