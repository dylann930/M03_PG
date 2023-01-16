package cat.institutmvm;

import java.util.Scanner;

 /*
 * Nom: Dylan
 * Cognoms: Osorio Camuña
 * INS Manuel Vázquez Montalbán
 * Data d'edició: 26/10/2022
 * Nom del cicle formatiu: Administració de sistemes informàtics en xarxa.
 * Nom del mòdul: M03 - Programació básica.
 */


public class UF2Act4 {

    public static void main(String[] args) {
        UF2Act4 metodo = new UF2Act4();
        System.out.println("El número " + metodo.natural() + " es natural.");
    }
    
    
    public int natural() {
        int num = 0, i = 0;
        boolean valorCorrecto;
        Scanner sc = new Scanner(System.in);
        do { //Utilizamos un do-while para pedir la variable num.
            System.out.println("Introduce un valor natural.");
            valorCorrecto = sc.hasNextInt(); //Nos aseguramos que el valor introducido sea de tipo entero.
            if (valorCorrecto) { // Si el valor introducido es un entero pedimos lo asociamos a la variable num.
                num = sc.nextInt();
                if(num < 1){ //Si se da esta condición valorCorrecto será false y volveŕa a pedir el valor.
                    valorCorrecto = false;
                    System.out.println("El numero introducido no es natural.");
                }
            } else { //Si el valor introducido no es entero avisamos del error y volvemos a pedir el valor.
                sc.next();
                System.out.println("El numero introducido no es natural.");
            }
            i++;
        } while ((!valorCorrecto) && (i < 3)); //El bucle se ejecutará mientras valorCorrecto sea false y la iteración menor a 3.

        return num; //Retornamos el número.
    }
}
