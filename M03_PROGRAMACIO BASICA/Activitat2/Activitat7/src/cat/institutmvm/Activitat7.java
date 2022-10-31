/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package cat.institutmvm;

/*
 * Nom: Dylan
 * Cognoms: Osorio Camuña
 * INS Manuel Vázquez Montalbán
 * Data d'edició: 27/10/2022
 * Nom del cicle formatiu: Administració de sistemes informàtics en xarxa.
 * Nom del mòdul: M03 - Programació básica.
 */
public class Activitat7 {


    public static void main(String[] args) {
        
        //A) Escribir por pantalla los 10 primeros números comenzando por el 0, por tanto, del 0 al 9.
        int numero, i;
        numero = 0;
        i = 0;
        while (i < 10) {
            System.out.print(numero + i + " ");
            i++;
        } 
        System.out.println(" ");
        
        //B) Escribir por pantalla los 100 primeros números comenzando por el 0, por tanto, del 0 al 99.
        int numero1;
        numero1 = 0;
        i = 0;
        while (i < 100) {
            System.out.print(numero1 + i + " ");
            i++;
        }
        System.out.println(" ");
        
        //C) Escribir los primeros 100 números pares comenzando por el 0.
        int numero2;
        numero2 = 0;
        while(numero2<200){
            if(numero2%2 == 0){
                System.out.print(numero2 + " ");
            }
            numero2++;
        }
        System.out.println("");
        
        //D) Escribir los numeros del 0 al 100 en orden descendente.
        int numero3, j;
        numero3 = 100;
        j = 0;
        while(j < 101){
            System.out.print(numero3 - j + " ");
            j++;
        }
    }
}


