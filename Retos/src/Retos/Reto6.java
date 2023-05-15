// Reto 6: Comprar n cantidad de productos en una tienda
package Retos;
import java.util.Scanner;
public class Reto6 {
    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);
        int producto, valor, total=0;
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("| ¡Bienvenido al programa! Usted podra compra la cantidad de productos que desee en la tienda |");
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("Ingrese la cantidad de productos que desea comprar");
        producto = capturar.nextInt();
        for (int i = 0; i < producto; i++) {
            System.out.println("Ingrese el valor del producto " + (i+1));
            valor = capturar.nextInt();
            total+=valor;
        }
        System.out.println("Usted selecciono " + producto + " productos");
        System.out.println("El total de la compra es " + total);
        capturar.close();
    }
}