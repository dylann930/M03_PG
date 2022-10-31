/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

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


public class Activitat3 {
    
    private static final String MSG_1 = "Introduce un número.";
    private static final String MSG_2 = "El número introducido es negativo.";
    private static final String MSG_3 = "El número introducido no es negativo.";
    private static final String MSG_4 = "El número introducido es más grande que 35.";
    private static final String MSG_5 = "El número introducido es más pequeño que 35.";
    private static final String MSG_6 = "El número introducido es igual a 35.";
    private static final String MSG_7 = "El número introducido es positivo y menor que 100.";
    private static final String MSG_8 = "El número introducido es negativo y menor que 100.";
    private static final String MSG_9 = "El número introducido es igual a 0 y menor que 100.";
    private static final String MSG_10 = "El número introducido es igual a 100.";
    private static final String MSG_11 = "El número introducido es mayor que 100.";
    private static final String MSG_12 = "El número introducido está dentro del intervalo [-3 ,27].";
    private static final String MSG_13 = "El número introducido no está dentro del intervalo [-3 ,27].";
    private static final String MSG_14 = "El número introducido está dentro del intervalo [25 ,50].";
    private static final String MSG_15 = "El número introducido no está dentro del intervalo [25 ,50].";
    private static final String MSG_16 = "El módulo del número introducido no es mayor a 15";
    private static final String MSG_17 = "El módulo del número introducido es mayor a 15.";
    private static final String MSG_18 = "El número introducido es impar.";
    private static final String MSG_19 = "El número introducido no es impar, por lo tanto, será par.";
    private static final String MSG_20 = "El número más grande es: ";
    private static final String MSG_21 = "Los dos valores introducidos son iguales.";
    private static final String MSG_22 = "Introduce otro número para compararlo con el anterior.";
    private static final String MSG_23 = "Introduce un número más pequeño que el anterior.";
    private static final String MSG_24 = "Introduce el número de LITROS de agua que has consumido este mes para calcular tu factura.";

    


    public static void main(String[] args) {
        
        //Determinar si un número es negativo.
        Scanner sc = new Scanner (System.in);
        System.out.println(MSG_1);
        int num = sc.nextInt();
        if(num < 0){
        System.out.println(MSG_2);
        }
        else{
            System.out.println(MSG_3);
        }
        System.out.println(" ");
        
        //Determinar si un número es más grande que 35.
        System.out.println(MSG_1);
        int n = sc.nextInt();
        if(n > 35){
            System.out.println(MSG_4);
        }
        if(n < 35){
            System.out.println(MSG_5);
        }
        if(n == 35){
            System.out.println(MSG_6);
        }
        System.out.println(" ");
        
        //Determinar si un número es positivo y menos que 100.
        System.out.println(MSG_1);
        int n2 = sc.nextInt();
        if((n2 < 100)&&(n2 > 0)){
            System.out.println(MSG_7);
        }
        if ((n2 < 100)&& (n2 < 0)){
            System.out.println(MSG_8);
        }
        if(n2 ==0){
            System.out.println(MSG_9);
        }
        if(n2 == 100){
            System.out.println(MSG_10);
        }
        if(n2 > 100){
            System.out.println(MSG_11);
        }
        System.out.println(" ");
        
        //Determinar si un número pertenece al intervalo [-3 ,27].
        System.out.println(MSG_1);
        int n3 = sc.nextInt();
        if((n3 >= -3)&&(n3 <= 27)){
            System.out.println(MSG_12);
        }
        else{
            System.out.println(MSG_13);
        }
        System.out.println(" ");
        
        //Determinar si un número no pertenece al intervalo [25 ,50].
        System.out.println(MSG_1);
        int n4 = sc.nextInt();
        if((n4 >= 25)&&(n4 <=50)){
            System.out.println(MSG_14);
        }
        else{
            System.out.println(MSG_15);
        }
        System.out.println(" ");
        
        //Determinar si el módulo de un número es menor que 15. Sin utilizar la función abs.
        System.out.println(MSG_1);
        int n5 = sc.nextInt();
        if((n5 >= -15)&&(n5 <= 15)){
            System.out.println(MSG_16);
        }
        else{
            System.out.println(MSG_17);
        }
        System.out.println(" ");
        
        //Determinar si un número entero es impar.
        System.out.println(MSG_1);
        int n6 = sc.nextInt();
        if(n6%2 != 0){
            System.out.println(MSG_18);
        }
        else{
            System.out.println(MSG_19);
        }
        System.out.println(" ");
        
        //Elevar un número al cuadrado si es par y al cubo si es impar.
        System.out.println(MSG_1);
        int n7 = sc.nextInt();
        if(n7%2 == 0){
            System.out.println(n7 * n7 );
        }
        if(n7%2 != 0){
            System.out.println(n7*n7*n7);
        }
        System.out.println("");
        
        //Determinar el número más grande de dos valores enteros introducidos por teclado. 
        System.out.println(MSG_1);
        int n9 = sc.nextInt();
        System.out.println(MSG_22);
        int n8 = sc.nextInt();
        if (n8 == n9){
            System.out.println(MSG_21);
        }
        if(n8 > n9){
            System.out.println(MSG_20 + n8);
        }
        if(n9 > n8){
            System.out.println(MSG_20 + n9);
        }
        System.out.println("");
        
        //Determinar el número más grande de tres valores enteros introducidos por teclado.
        System.out.println(MSG_1);
        int n10 = sc.nextInt();
        System.out.println(MSG_22);
        int n11 = sc.nextInt();
        System.out.println(MSG_22);
        int n12 = sc.nextInt();
        if((n10 > n11)&&(n10 > n12)){
            System.out.println(MSG_20 + n10);
        }
        if ((n11 > n10)&&(n11 > n12)){
            System.out.println(MSG_20 + n11);
        }
        if ((n12 > n11)&&(n12 > n10)){
            System.out.println(MSG_20 + n12);
        }
        System.out.println(" ");
        
        //Dados dos números determina si uno es múltiple del otro.
        System.out.println(MSG_1);
        int n13 = sc.nextInt();
        System.out.println(MSG_23);
        int n14 = sc.nextInt();
        if(n13%n14 == 0){
            System.out.println("El número " + n13 + " es multiplo de " + n14 );
        }
        else{
            System.out.println("El número " + n13 + " no es multiplo de " + n14 );
        }
        System.out.println(" ");
        
        /* Determinar la factura de agua teniendo en cuenta que:
        * La cuota fija es de 6€.
        * Los primeros 50L de agua son gratis.
        * Entre los 50L y los 200L, el litro cuesta 0,10€.
        * A partir de los 200L el litro cuesta 0,30€.
        */
        System.out.println(MSG_24);
        int n15 = sc.nextInt();
        double resultado = n15*0.10 + 6;
        double resultado1 = n15*0.30 + 6;
        if(n15 <= 50){
            System.out.println("Tu factura es de: 6€.");
        }
        if((n15 > 50 )&&(n15 <= 200)){
            System.out.println("Tu factura es de: " + resultado);
        }
        if(n15 > 200){
            System.out.println("Tu factura es de: " + resultado1);
        }
    }
}
