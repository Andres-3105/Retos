// Reto 1: Calcular los grados °C para la receta de la abuela
package Retos;
public class Reto1 {
    public static void main(String[] args) {
        //Declarar variables
        double GradosF= 350, GradosC =0;
        //Calcular la temperatura en °C
        GradosC = (GradosF-32)/1.8;
        //Mostrar resultados
        System.out.println ("La temperatura para preparar el horno es de " + GradosC + " °C");
    }
}