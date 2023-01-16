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

public class Ejercicio8 {

    public static void main(String[] args) {
        Ejercicio8 metodo = new Ejercicio8(); //Declaramos nuevo método.
        System.out.println("El resultado de la potencia introducida es: " + metodo.Potencia());
    }
    public int Potencia(){
        int num, elevado; //Declaramos variables.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entero."); 
        num = sc.nextInt(); //Pedimos por teclado un valor entero.
        System.out.println("Introduzca por cuánto quiere elevar el número introducido.");
        elevado = sc.nextInt(); //Pedimos a cuánto queremos elevar el número introducido.
        num = (int)Math.pow(num, elevado); //Utilizamos el método Math.pow y retornamos el valor de num.
        return num;
    }

}
