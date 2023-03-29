import java.util.Scanner;

public class Producto {
    public static void main(String[] args) {

        Scanner obtener = new Scanner(System.in);
        System.out.println("Ingrese el valor neto del producto");

        double producto =0;
        producto = obtener.nextInt();
        double iva=0;
        iva = (double) (producto*0.12);

        System.out.println("El iva del producto es :" + (iva));

    }
}
