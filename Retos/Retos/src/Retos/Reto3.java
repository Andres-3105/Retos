// Reto 3: Juego de cara o sello con condicionales
package Retos;
import java.util.Scanner;
public class Reto3 {
    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);
        //Declaramos variables
        int ladoMoneda;
        int random = (int)(Math.random()*2);
        int aleatorio = random;
        System.out.println("Ingrese cara o sello\n 1. Cara\n 2. Sello ");
        ladoMoneda = capturar.nextInt();
        if (ladoMoneda==1) {
            if(aleatorio==0){
            System.out.println("El resultado del lanzamiento es sello");
            System.out.println("Usted eligio cara");
            System.out.println("Has perdido");
            } else if(aleatorio==1){
            System.out.println("El resultado del lanzamiento es cara");
            System.out.println("Usted eligio cara");
            System.out.println("Has ganado");
            }  
        }
        else if (ladoMoneda==2) {
            if(aleatorio==0){
            System.out.println("El resultado del lanzamiento es cara");
            System.out.println("Usted eligio sello");
            System.out.println("Has perdido");
            } else if(aleatorio==1){
            System.out.println("El resultado del lanzamiento es sello");
            System.out.println("Usted eligio sello");
            System.out.println("Has ganado");
            }
        } else {
        System.out.println("Ingrese una opcion valida");
        }   
        capturar.close();
    }
}