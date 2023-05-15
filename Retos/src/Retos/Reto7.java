// Ejercicio 7: Casino o juego de cara y sello con ciclos
package Retos;
import java.util.Scanner;
public class Reto7 {
    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);
        //Declaramos variables
        int dinapos, ladoMoneda, vecju=1, opcion, dinacum=0;
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ¡Bienvenido al programa! Usted podra ingresar el dinero que desea apostar, al final le mostrara cuantas veces jugó y el dinero que acumuló |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
        do {
            int random = (int)(Math.random()*2);
            int aleatorio = random;
            System.out.println("Ingrese cara o sello\n 1. Cara\n 2. Sello ");
            ladoMoneda = capturar.nextInt();
            System.out.println("Ingrese el dinero que desea apostar");
            dinapos = capturar.nextInt();
            if (ladoMoneda==1) {
                if(aleatorio==0){
                System.out.println("El resultado del lanzamiento es sello");
                System.out.println("Usted eligio cara");
                System.out.println("El dinero apostado fue de " + dinapos);
                System.out.println("Has perdido");
                dinacum-=dinapos;
                System.out.println("El dinero acumulado durante las " + vecju + " veces jugadas fue de " + dinacum);
                } else if(aleatorio==1){
                System.out.println("El resultado del lanzamiento es cara");
                System.out.println("Usted eligio cara");
                System.out.println("El dinero apostado fue de " + dinapos);
                System.out.println("Has ganado");
                dinacum+=dinapos;
                System.out.println("El dinero acumulado durante las " + vecju + " veces jugadas fue de " + dinacum);
                }  
            } else if (ladoMoneda==2) {
                if(aleatorio==0){
                System.out.println("El resultado del lanzamiento es cara");
                System.out.println("Usted eligio sello");
                System.out.println("El dinero apostado fue de " + dinapos);
                System.out.println("Has perdido");
                dinacum-=dinapos;
                System.out.println("El dinero acumulado durante las " + vecju + " veces jugadas fue de " + dinacum);
                } else if(aleatorio==1){
                System.out.println("El resultado del lanzamiento es sello");
                System.out.println("Usted eligio sello");
                System.out.println("El dinero apostado fue de " + dinapos);
                System.out.println("Has ganado");
                dinacum+=dinapos;
                System.out.println("El dinero acumulado durante las " + vecju + " veces jugadas fue de " + dinacum);
                } 
            } else {
                System.out.println("Ingrese una opcion valida");
            }
            System.out.println("------------------------------------");
            System.out.println("Usted ha jugado " + vecju + " veces");
            vecju++;
            System.out.println("¿Desea volver a jugar?\n 1. Si   2. No");
            opcion = capturar.nextInt();
        } while(opcion==1);
        capturar.close();
    }    
}