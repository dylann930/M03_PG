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
public class Activitat8 {


    public static void main(String[] args) {
        
        //A) Pedir al usuario numeros enteros hasta que introduzca 0 para finalizar el programa.
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca un numero entero y cuando quiera finalizar el programa pulse el 0.");
        int num;
        num = 1;
        while(num != 0){
            num = sc.nextInt();
        }
        
        //B) Pedir números enteros al usuario pero hacer que el primer número que pida sea la cantidad de números que pedirá.
        
        int cantidadnum, i;
        System.out.println("Cuántos números quiere introducir en el programa?");
        cantidadnum = sc.nextInt();
        i = 0;
        while(i < cantidadnum){
             int num2 = sc.nextInt();
            i++;
        }
        

    }

}
