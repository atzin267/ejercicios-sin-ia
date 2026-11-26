
public record Producto(String nombre, double precio, int stock) {
    public Producto {
        if (precio < 0 || stock < 0) {
            throw new IllegalArgumentException("Precio y stock deben ser mayores o iguales a cero");
        }
        
    }
    public double valorInventario() {
        return precio * stock;
    }    
}
