package cat.institutmvm;
import java.util.Random;

/*
 * Nom: Dylan
 * Cognoms: Osorio Camuña
 * INS Manuel Vázquez Montalbán
 * Data d'edició: 27/10/2022
 * Nom del cicle formatiu: Administració de sistemes informàtics en xarxa.
 * Nom del mòdul: M03 - Programació básica.
 */

public class Ejercicio11 {

    public static void main(String[] args) {
        // Llamar al método para obtener un número aleatorio
        Ejercicio11 numAleatorio = new Ejercicio11();
        System.out.println("Número aleatorio: " + numAleatorio.obtenerNumeroAleatorio());
    }

    public int obtenerNumeroAleatorio() {
        Random rand = new Random();
        return rand.nextInt(257);
    }
}
