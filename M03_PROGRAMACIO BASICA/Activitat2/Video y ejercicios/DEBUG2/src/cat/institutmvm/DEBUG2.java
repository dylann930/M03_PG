/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package cat.institutmvm;

import java.util.Scanner;

/*
 * Nom: Dylan
 * Cognoms: Osorio Camuña
 * INS Manuel Vázquez Montalbán
 * Data d'edició: 27/10/2022
 * Nom del cicle formatiu: Administració de sistemes informàtics en xarxa.
 * Nom del mòdul: M03 - Programació básica.
 */
import java.util.Scanner;
public class DEBUG2 {

        private static final String MSG_1 = "Introduce un año para ver si es bisiesto o no.";
        
    public static void main(String[] args) {
        // EJERCICIO 5 (IVAN CAPURRO)
                Scanner sc = new Scanner (System.in);
        System.out.println(MSG_1);
        int año = sc.nextInt();
        
        if((año%4 == 0)&&(año%100 != 0)||(año %400 ==0)){
            System.out.println("El año " + año + " SI es bisiesto.");
        }
        else {
            System.out.println("El año " + año + " NO es bisiesto.");
        }
        
    
    }

}

