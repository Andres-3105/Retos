// Reto 2: Mostrar el nombre de la enfermera, el bebe y el padre del bebe. Ademas de la dosis de vacuna que se debe aplicar al bebe
package Retos;
import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) {
        Scanner Lector = new Scanner(System.in);
       //Declarar variables
       int pesoBebe, mesesBebe, dosisVacuna;
       String nomEnfermera, nomBebe, nomPapa;
       //Ingresamos el nombre de las personas, el peso y meses del bebe
       System.out.println("Ingrese el nombre de la enfermera que le aplicara la dosis al bebe ");
       nomEnfermera = Lector.nextLine();
       System.out.println("Ingrese el nombre del bebe ");
       nomBebe = Lector.nextLine();
       System.out.println("Ingrese el nombre del papa del bebe ");
       nomPapa = Lector.nextLine();
       System.out.println("Ingrese los meses del bebe");
       mesesBebe = Lector.nextInt();
       System.out.println("Ingrese el peso del bebe");
       pesoBebe = Lector.nextInt();
       //Mostramos los nombres de las personas, el peso y los meses del bebe
       System.out.println("La edad del bebe es " + mesesBebe + " meses");
       System.out.println("El peso del bebe es " + pesoBebe + "kg");
       System.out.println("El nombre de la enfermera que le aplicara la vacuna al bebe es " + nomEnfermera);
       System.out.println("El nombre del bebe es " + nomBebe);
       System.out.println("El nombre del papá del bebe es " + nomPapa);
       //Hacemos la operacion para saber la dosis de la vacuna del bebe
       dosisVacuna = (pesoBebe+10/mesesBebe*10)*8;
       System.out.println("La dosis que se le debe aplicar al bebe es de " + dosisVacuna + " ml");
       //Mostramos el resultado de la dosis que se le debe aplicar al bebe
       Lector.close();
    }
}