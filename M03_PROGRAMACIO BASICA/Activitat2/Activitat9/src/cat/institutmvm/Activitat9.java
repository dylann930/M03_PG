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

import java.util.Scanner;
public class Activitat9 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero, suma=0, media;
        int i = 0;
        System.out.println("Este programa calcula la media de una serie de números hasta que pulse '0'.");
        System.out.println("Introduzca los números y, por último, pulse 0:");
        numero = sc.nextDouble();
        while (numero != 0){
            suma = suma + numero;
            i++;
            numero = sc.nextDouble();
        }
        if (numero == 0){
            media = suma/i;
            System.out.println("La media de los números introducidos es: "+ media);
        }
    }	
}
    


