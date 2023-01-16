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


public class UF2Act6 {

    public static void main(String[] args) {
        UF2Act6 metodo = new UF2Act6();
        System.out.println("El número " + metodo.Natural() + " SI es NEGATIVO.");
    }
    public int Natural(){
        int num;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Introduce un valor negativo.");
            num = sc.nextInt();
        }while(num > -1 );
        
        return num;
   
    }
}
