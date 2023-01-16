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
public class Ejercicio13 {


    
    public static void main(String[] args) {
        int eleccion, num, num1, num2, rango1, rango2;
        String TXT = "";
        Ejercicio13 method = new Ejercicio13();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un (0) si quieres comparar dos números o pulsa (1) si quieres comprobar si un valor está dentro de un rango.");
        eleccion = sc.nextInt();
        if(eleccion == 0){
            System.out.println("Introduce dos números por teclado para comprobar cual es el más pequeño.");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println("El valor más pequeño de los dos introducidos és: " + method.Pequeño(num1, num2));
        } else if(eleccion == 1){
            System.out.println("Introduce un valor.");
            num = sc.nextInt();
            System.out.println("Introduca un valor mínimo y otro valor máximo para determinar un rango.");
            rango1 = sc.nextInt();
            rango2 = sc.nextInt();
            sc.close();
            System.out.println(method.Rango(TXT, num, rango1, rango2));
        }
    }
    
    
    public int Pequeño(int num1, int num2){
        if(num1 < num2){
            return num1;
        } else {
            return num2;
        }
    }
    
    public String Rango (String TXT, int num, int rango1, int rango2){
        if((num > rango1)&&(num < rango2)){
            return TXT = "El valor introducido si está dentro del rango.";
        } else {
            return TXT = "El valor introducido NO está dentro del rango.";
        }
    }

}
