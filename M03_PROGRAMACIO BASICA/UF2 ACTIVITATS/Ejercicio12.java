package cat.institutmvm;
import java.util.Scanner;
import java.util.Random;
/*
 * Nom: Dylan
 * Cognoms: Osorio Camuña
 * INS Manuel Vázquez Montalbán
 * Data d'edició: 27/10/2022
 * Nom del cicle formatiu: Administració de sistemes informàtics en xarxa.
 * Nom del mòdul: M03 - Programació básica.
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numAleatorio = obtenerNumeroAleatorio();
        int intentos = 0;
        boolean acertado = false;

        while (intentos < 3 && !acertado) {
            System.out.print("Adivina el número (entre 0 y 1000): ");
            int numIngresado = input.nextInt();
            intentos++;

            if (numIngresado == numAleatorio) {
                acertado = true;
                System.out.println("¡Felicidades, acertaste!");
            } else {
                if (numIngresado < numAleatorio) {
                    System.out.println("El número es mayor.");
                } else {
                    System.out.println("El número es menor.");
                }
            }
        }
        if (!acertado) {
            System.out.println("Lo siento, se te agotaron los intentos. El número era " + numAleatorio);
        }
    }

    public static int obtenerNumeroAleatorio() {
        Random rand = new Random();
        return rand.nextInt(1001);
    }
}