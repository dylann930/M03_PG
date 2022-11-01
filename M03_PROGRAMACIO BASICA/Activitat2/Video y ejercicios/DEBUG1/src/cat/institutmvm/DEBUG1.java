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
public class DEBUG1 {

    public static void main(String[] args) {
        // EJERCICIO 4 (APARTADO A) (ALEIX MUÑOZ).
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un número del 1 al 12 ambos incluidos.");
        int mes = sc.nextInt();
        
        if(mes == 1){
            System.out.println("ENERO");
        }
        if(mes == 2){
            System.out.println("FEBRERO");
        }
        if(mes == 3){
            System.out.println("MARZO");
        }
        if(mes == 4){
            System.out.println("ABRIL");
        }
        if(mes == 5){
            System.out.println("MAYO");
        }
        if(mes == 6){
            System.out.println("JUNIO");
        }
        if(mes == 7){
            System.out.println("JULIO");
        }
        if(mes == 8){
            System.out.println("AGOSTO");
        }
        if(mes == 9){
            System.out.println("SEPTIEMBRE");
        }
        if(mes == 10){
            System.out.println("OCTUBRE");
        }
        if(mes == 11){
            System.out.println("NOVIEMBRE");
        }
        if(mes == 12){
            System.out.println("DICIEMBRE");
        }
        if(mes > 12){
            System.out.println("¡ERROR 404, NOT FOUND!");
        }
        System.out.println("");
        
    }

}
