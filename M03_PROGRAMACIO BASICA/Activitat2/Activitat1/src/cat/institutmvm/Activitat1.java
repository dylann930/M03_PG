/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;


public class Activitat1 {
    
    private static final String MSG_1 = "Mi nombre es Dylan.";
    private static final String MSG_2 = "Mi nombre y apellidos son Dylan Osorio Camuña.";
    private static final String MSG_3 = "Mis apellidos son Osorio Camuña.";
    private static final String MSG_4 = "   ";
    private static final String MSG_5 = "Cuadrado de 10 x 10 con asteriscos: ";
    private static final String MSG_6 = "Triángulo de base 10 con asteriscos: ";
    


    public static void main(String[] args) {
        
        System.out.println(MSG_1);
        System.out.println(MSG_2);
        System.out.println(MSG_1);
        System.out.println(MSG_3);
        
        int size = 10;
        
        System.out.println(MSG_4);
        System.out.println(MSG_5);
        System.out.println("");
        
        //Parte superior del cuadrado.
        for(int i=0;i < size; i++) {
            System.out.print("* ");
        }
        System.out.println();
        
        //parte central del cuadrado.
        for(int i = 0; i < size -2; i++) {
            System.out.print("*");
            for(int j = 0; j < 17; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
        //Parte inferior del cuadrado.
        for(int i = 0; i < size; i++) {
            System.out.print("* ");
        }
        System.out.println(MSG_4);
        System.out.println(MSG_4);
        System.out.println(MSG_6);
        
        //Cima del triángulo.
        System.out.println("");
        for(int i = 0; i < 4; i++){
            System.out.print(" ");
        }
        System.out.print("**");
        System.out.println("");
        
        for(int i = 0; i < 3; i++) {
            System.out.print(" ");
        }
        System.out.print("****");
        System.out.println("");
        
        for(int i = 0; i < 2; i++) {
            System.out.print(" ");
        }
        System.out.print("******");
        System.out.println("");

        for(int i = 0; i < 1; i++) {
            System.out.print(" ");
        }
        System.out.print("********");
        System.out.println("");
        
        System.out.print("**********");
        System.out.println("");
        //Base del triángulo.
        }
      
        }
        


            
        
    
