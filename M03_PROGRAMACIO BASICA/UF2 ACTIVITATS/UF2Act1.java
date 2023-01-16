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
public class UF2Act1 {

    private static final String MSG_1 = "Introduce un valor por teclado.";
    
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        sc.close();
        UF2Act1 metodo = new UF2Act1(); //Declaramos el metodo.
        System.out.println(metodo.Negativo(num));
    }
    public int Negativo(int num) {
        if (num < 0) { //Indicamos la condición que se debe cumplir.
            System.out.println("El numero es negativo.");
        }else{ //Printamos según si la condición se cumple o no.
            System.out.println("El numero no es negativo");
        }
        return num; //Retornamos el número.
    }
}
