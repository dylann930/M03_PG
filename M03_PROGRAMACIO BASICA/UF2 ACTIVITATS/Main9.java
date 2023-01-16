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

public class Main9 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[20];
        // Pedir 20 números enteros por teclado
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Ingrese un número entero: ");
            numbers[i] = sc.nextInt();
        }
        // Llamar al método para obtener los números impares
        int[] impares = obtenerImpares(numbers);

        // Imprimir los números impares
        System.out.print("Los números impares son: ");
        for (int num : impares) {
            System.out.print(num + " ");
        }
    }

    public static int[] obtenerImpares(int[] numbers) {
        int count = 0;
        // Contar cuantos números son impares
        for (int num : numbers) {
            if (num % 2 != 0) {
                count++;
            }
        }
        // Crear un arreglo para almacenar los números impares
        int[] impares = new int[count];
        int i = 0;
        // Guardar los números impares en el arreglo
        for (int num : numbers) {
            if (num % 2 != 0) {
                impares[i] = num;
                i++;
            }
        }
        return impares;
    }
}
