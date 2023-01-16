package cat.institutmvm;
import java.util.Random;
import java.util.Scanner;
/*
 * Nom: Dylan
 * Cognoms: Osorio Camuña
 * INS Manuel Vázquez Montalbán
 * Data d'edició: 27/10/2022
 * Nom del cicle formatiu: Administració de sistemes informàtics en xarxa.
 * Nom del mòdul: M03 - Programació básica.
 */
public class Main14 {
    
    private static final String MSG_1 = "Introduzca un valor.";
    
    public static void main(String[] args) {
        Main14 mt = new Main14();
        int[] aleatorios = new int[10];
        mt.ListaAleatorio(aleatorios);
        System.out.println(MSG_1);
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(mt.EncontrarValor(aleatorios, num));
    }
    
    public int[] ListaAleatorio(int []aleatorios) {
        Random rand = new Random();
        for(int i = 0; i < aleatorios.length; i++){
            aleatorios[i] = rand.nextInt(201);
            System.out.println(aleatorios[i]);
        }
        return aleatorios;
    }
    
    public boolean EncontrarValor (int[] aleatorios, int num){
        boolean encontrado = false;
        for(int i = 0; i < aleatorios.length; i++){
            if(num == aleatorios[i]){
                encontrado = true;
            }
        }
        return encontrado;
    }

}
