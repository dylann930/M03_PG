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


public class UF2Act2 {

    public static void main(String[] args) {
        UF2Act2 metodo = new UF2Act2(); //Declaramos el metodo.
        System.out.println(metodo.Natural());
    }
    public int Natural(){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un valor.");
        num = sc.nextInt(); //Pedimos un valor por teclado.
        if ((num > 0)&&(num < 100)) { //Indicamos la condición que se debe cumplir.
            System.out.println("El numero es positivo y menor que 100.");
        }else{ //Printamos según si la condición se cumple o no.
            System.out.println("El numero no es positivo y menor que 100");
        }
        return num; //Retornamos el número.
    }
}
