// Reto 1: Calcular los grados °C para la receta de la abuela
package Retos;
public class Reto1 {
    public static void main(String[] args) {
        //Declarar variables
        double gradosF= 350, gradosC=0;
        //Calcular la temperatura en °C
        gradosC = (gradosF-32)/1.8;
        //Mostrar resultados
        System.out.println ("La temperatura para preparar el horno es de " + gradosC + " °C");
    }
}