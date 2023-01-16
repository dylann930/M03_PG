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


public class UF2Act3 {

    public static void main(String[] args) {
        UF2Act3 metodo = new UF2Act3();
        System.out.println("Su factura es de:" + metodo.LitrosAgua() + "€");
    }
    public double LitrosAgua(){
        int litros;
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique la cantidad de litros que ha gastado en un mes.");
        litros = sc.nextInt(); //Pedimos por teclado la cantidad de litros consumidos.
        double resultado = 0;
        if(litros <= 50){ //Los primeros 50L son gratuitos pero la cuota fija son 6€.
            resultado = 6;
        }
        if((litros > 50 )&&(litros <= 200)){ //Multiplicamos la cantidad de litros por el precio del litro en este rango (0.10€) y sumamos la quota fija (6€).
            resultado = litros *0.10 + 6; //Guardamos el resultado en la variable "resultado".
        }
        if(litros > 200){ //Multiplicamos la cantidad de litros por el precio del litro en este rango (0.30€) y sumamos la quota fija (6€).
            resultado = litros*0.30 + 6; //Guardamos el resultado en la variable "resultado".
        }
        return resultado; //Retornamos el valor de la variable "resultado".
    }
}

