//Ejercicio 8: Piedra, papel o tijera con ciclos
package Retos;
import java.util.Scanner;
public class Reto8 {
    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("Ingrese piedra, papel o tijera\n 1. Piedra\n 2. Papel\n 3. Tijera");
            opcion = capturar.nextInt();
            int random = (int)(Math.random()*3);
            int aleatorio = random;
            System.out.println("-----------------------------------------------------------------");
            if (opcion==1) {
                if(aleatorio==0){
                    System.out.println("La maquina eligio tijeras");
                    System.out.println("Usted eligio piedra");
                    System.out.println("Has ganado");
                    System.out.println("-----------------------------------------------------------------");
                } if(aleatorio==1){
                    System.out.println("La maquina eligio piedra");
                    System.out.println("Usted eligio piedra");
                    System.out.println("Has empatado");
                    System.out.println("-----------------------------------------------------------------");
                } if(aleatorio==2){
                    System.out.println("La maquina eligio papel");
                    System.out.println("Usted eligio piedra");
                    System.out.println("Has perdido");
                    System.out.println("-----------------------------------------------------------------");
                }
            }
            if (opcion==2) {
                if(aleatorio==0){
                    System.out.println("La maquina eligio piedra");
                    System.out.println("Usted eligio papel");
                    System.out.println("Has ganado");
                    System.out.println("-----------------------------------------------------------------");
                } if(aleatorio==1){
                    System.out.println("La maquina eligio papel");
                    System.out.println("Usted eligio papel");
                    System.out.println("Has empatado");
                    System.out.println("-----------------------------------------------------------------");
                } if(aleatorio==2){
                    System.out.println("La maquina eligio tijeras");
                    System.out.println("Usted eligio papel");
                    System.out.println("Has perdido");
                    System.out.println("-----------------------------------------------------------------");
                }
            }
            if (opcion==3) {
                if(aleatorio==0){
                    System.out.println("La maquina eligio papel");
                    System.out.println("Usted eligio tijeras");
                    System.out.println("Has ganado");
                    System.out.println("-----------------------------------------------------------------");
                } if(aleatorio==1){
                    System.out.println("La maquina eligio tijeras");
                    System.out.println("Usted eligio tijeras");
                    System.out.println("Has empatado");
                    System.out.println("-----------------------------------------------------------------");
                } if(aleatorio==2){
                    System.out.println("La maquina eligio piedra");
                    System.out.println("Usted eligio tijeras");
                    System.out.println("Has perdido");
                    System.out.println("-----------------------------------------------------------------");
               } 
            }
            System.out.println("La opcion es invalida");
            System.out.println("¿Quiere volver a jugar? 1. Si  2. No");
            opcion = capturar.nextInt();
            System.out.println("-----------------------------------------------------------------");
        }while(opcion==1);
        capturar.close();
    }
}