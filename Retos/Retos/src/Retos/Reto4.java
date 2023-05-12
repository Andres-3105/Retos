// Reto 4: Juego piedra, papel o tijera con condicionales
package Retos;
import java.util.Scanner;
public class Reto4 {
    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);
        int opcion=0;
        int random = (int)(Math.random()*3);
        int aleatorio = random;
        System.out.println("Ingrese piedra, papel o tijera\n 1. Piedra\n 2. Papel\n 3. Tijera");
        opcion = capturar.nextInt();
        System.out.println("------------------------------------------------------------------");
        switch (opcion) {
            case 1:
                if(aleatorio==0){
                    System.out.println("La maquina eligio tijeras");
                    System.out.println("Usted eligio piedra");
                    System.out.println("Has ganado");
                    } if(aleatorio==1){
                        System.out.println("La maquina eligio piedra");
                        System.out.println("Usted eligio piedra");
                        System.out.println("Has empatado");
                        } if(aleatorio==2){
                            System.out.println("La maquina eligio papel");
                            System.out.println("Usted eligio piedra");
                            System.out.println("Has perdido");
                            } 
            break;
            case 2:
                if(aleatorio==0){
                    System.out.println("La maquina eligio piedra");
                    System.out.println("Usted eligio papel");
                    System.out.println("Has ganado");
                    } if(aleatorio==1){
                        System.out.println("La maquina eligio papel");
                        System.out.println("Usted eligio papel");
                        System.out.println("Has empatado");
                        } if(aleatorio==2){
                            System.out.println("La maquina eligio tijeras");
                            System.out.println("Usted eligio papel");
                            System.out.println("Has perdido");
                            } 
            break;
            case 3:
                if(aleatorio==0){
                    System.out.println("La maquina eligio papel");
                    System.out.println("Usted eligio tijeras");
                    System.out.println("Has ganado");
                    } if(aleatorio==1){
                        System.out.println("La maquina eligio tijeras");
                        System.out.println("Usted eligio tijeras");
                        System.out.println("Has empatado");
                        } if(aleatorio==2){
                            System.out.println("La maquina eligio piedra");
                            System.out.println("Usted eligio tijeras");
                            System.out.println("Has perdido");
                            } 
            break;
            default:
                System.out.println("Ingrese una opcion valida");
            break;
        }
        capturar.close();
    }    
}