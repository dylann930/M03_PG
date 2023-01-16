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

public class Ejercicio7 {

    public static void main(String[] args) {
       Ejercicio7 metodo = new Ejercicio7(); //Declaramos nuevo metodo.
        System.out.println("El valor absoluto del número entero introducido es: " + metodo.Absoluto());
    }
    public int Absoluto(){
        int num; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un valor entero.");
        num = sc.nextInt(); //Pedimos por teclado un valor entero mediante la variable num.
        num = Math.abs(num); //Generamos el valor absoluto de la variable num.
        return num; //Retornamos num.
    }

}
