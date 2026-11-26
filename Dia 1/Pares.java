public class Pares {
    public static void main(String[] args) {
        System.out.println(sumarPares(50));
    }
    static int sumarPares(int x)   {
        int suma = 0;
        for (int i=0; i<=x; i++){
            if (i % 2 == 0){
                suma = suma + i;
            }
        }
        return suma;
    }
}
