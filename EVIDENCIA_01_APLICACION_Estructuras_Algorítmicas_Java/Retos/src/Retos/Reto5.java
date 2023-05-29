// Reto 5: Mostrar el signo zodiacal con sus caracteristicas con condicionales
package Retos;
import java.util.Scanner;;
public class Reto5 {
    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);
        int dia, mes;
        System.out.println("Ingrese su dia de nacimiento");
        dia = capturar.nextInt();
        System.out.println("Ingrese su mes de nacimiento");
        mes = capturar.nextInt();
        if (mes==12 & dia>=22 & dia<=31 || mes==1 & dia>=1 & dia<=20) {
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("Usted es Capricornio");
            System.out.println("Los capricornianos son responsables, ambiciosos y prácticos, pero también pueden ser fríos y demasiado controladores.");
            System.out.println("------------------------------------------------------------------------------------------------------------------");         
        }  else if (mes==1 & dia>=21 & dia<=31 || mes==2 & dia>=1 & dia<=19){
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("Usted es Acuario");
            System.out.println("Los acuarianos son innovadores, humanitarios y originales, pero también pueden ser excéntricos y rebeldes.");
            System.out.println("------------------------------------------------------------------------------------------------------------------");         
        }  else if (mes==2 & dia>=20 & dia<=28 || mes==3 & dia>=1 & dia<=20){
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("Usted es Picis");
            System.out.println("Los piscianos son intuitivos, compasivos y soñadores, pero también pueden ser pasivos y evasivos.");
            System.out.println("------------------------------------------------------------------------------------------------------------------");         
        }  else if (mes==3 & dia>=21 & dia<=31 || mes==4 & dia>=1 & dia<=20){
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("Usted es Aries");
            System.out.println("Los arianos son líderes naturales, impulsivos y enérgicos, pero también pueden ser impulsivos y un poco egoístas.");
            System.out.println("------------------------------------------------------------------------------------------------------------------");         
        }  else if (mes==4 & dia>=21 & dia<=30 || mes==5 & dia>=1 & dia<=20){
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("Usted es Tauro");
            System.out.println("Los taurinos son tercos, leales y persistentes, pero también pueden ser posesivos y tercos.");
            System.out.println("------------------------------------------------------------------------------------------------------------------");         
        }  else if (mes==5 & dia>=21 & dia<=31 || mes==6  & dia>=1 & dia<=20){
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("Usted es Geminis");
            System.out.println("Los geminianos son curiosos, sociales y adaptables, pero también pueden ser superficiales y cambiantes.");
            System.out.println("------------------------------------------------------------------------------------------------------------------");         
        }  else if (mes==6 & dia>=21 & dia<=30 || mes==7 & dia>=1 & dia<=22){
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("Usted es Cancer");
            System.out.println("Los cancerianos son emocionales, sensibles y protectores, pero también pueden ser posesivos y pesimistas.");
            System.out.println("------------------------------------------------------------------------------------------------------------------");         
        }  else if (mes==7 & dia>=23 & dia<=31 || mes==8 & dia>=1 & dia<=23){
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("Usted es Leo");
            System.out.println("Los leoninos son seguros de sí mismos, creativos y generosos, pero también pueden ser arrogantes y mandones.");
            System.out.println("------------------------------------------------------------------------------------------------------------------");         
        }  else if (mes==8 & dia>=24 & dia<=31 || mes==9 & dia>=1 & dia<=22){
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("Usted es Virgo");
            System.out.println("Los virginianos son analíticos, trabajadores y humildes, pero también pueden ser críticos y preocupados en exceso.");
            System.out.println("------------------------------------------------------------------------------------------------------------------");         
        }  else if (mes==9 & dia>=23 & dia<=30 || mes==10 & dia>=1 & dia<=23){
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("Usted es Libra");
            System.out.println("Los librianos son equilibrados, sociales y diplomáticos, pero también pueden ser indecisos y evasivos.");
            System.out.println("------------------------------------------------------------------------------------------------------------------");         
        }  else if (mes==10 & dia>=24 & dia<=31 || mes==11 & dia>=1 & dia<=22){
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("Usted es Escorpio");
            System.out.println("Los escorpianos son apasionados, misteriosos y poderosos, pero también pueden ser celosos y vengativos.");
            System.out.println("------------------------------------------------------------------------------------------------------------------");         
        }  else if (mes==11 & dia>=23 & dia<=30 || mes==12 & dia>=1 & dia<=21){
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("Usted es Sagitario");
            System.out.println("Los sagitarianos son aventureros, optimistas y filosóficos, pero también pueden ser descuidados y arrogantes.");
            System.out.println("------------------------------------------------------------------------------------------------------------------");         
        } else {
            System.out.println("Ingrese un dia y mes valido segun el calendario");
        }
        capturar.close();
    }
}