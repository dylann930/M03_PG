/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package cat.institutmvm;

/*
 * Nom: Dylan
 * Cognoms: Osorio Camuña
 * INS Manuel Vázquez Montalbán
 * Data d'edició: 27/10/2022
 * Nom del cicle formatiu: Administració de sistemes informàtics en xarxa.
 * Nom del mòdul: M03 - Programació básica.
 */
import java.util.Scanner;

public class Activitat6 {
    
    private static final String MSG_1 = "Introduce un año.";
    private static final String MSG_2 = "Introduce un mes para saber el numero de días.";
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        int año = sc.nextInt();
        //Dado un año y un mes, devolver cuantos días tiene el mes.
        if((año%4 == 0)&&(año%100 != 0)||(año %400 ==0)){
            System.out.println(MSG_2);
            int mesb = sc.nextInt();
            if (mesb == 1){
                System.out.println("31");
            }
            if (mesb == 2){
                System.out.println("29");
            }
            if (mesb == 3){
                System.out.println("31");
            }
            if (mesb == 4){
                System.out.println("30");
            }
            if (mesb == 5){
                System.out.println("31");
            }
            if (mesb == 6){
                System.out.println("30");
            }
            if (mesb == 7){
                System.out.println("31");
            }
            if (mesb == 8){
                System.out.println("31");
            }
            if (mesb == 9){
                System.out.println("30");
            }
            if (mesb == 10){
                System.out.println("31");
            }
            if (mesb == 11){
                System.out.println("30");
            }
            if (mesb == 12){
                System.out.println("31");
             }
            if (mesb > 12){
                System.out.println("ERROR");
            }
        }
        else {
            System.out.println(MSG_2);
            int mes = sc.nextInt();
            if (mes == 1){
                System.out.println("31");
            }
            if (mes == 2){
                System.out.println("28");
            }
            if (mes == 3){
                System.out.println("31");
            }
            if (mes == 4){
                System.out.println("30");
            }
            if (mes == 5){
                System.out.println("31");
            }
            if (mes == 6){
                System.out.println("30");
            }
            if (mes == 7){
                System.out.println("31");
            }
            if (mes == 8){
                System.out.println("31");
            }
            if (mes == 9){
                System.out.println("30");
            }
            if (mes == 10){
                System.out.println("31");
            }
            if (mes == 11){
                System.out.println("30");
            }
            if (mes == 12){
                System.out.println("31");
             }
            if (mes > 12){
                System.out.println("ERROR");
            }      
        }
        //Dado un año y un mes, devolver cuantos días tiene el mes. (CON SWITCH-CASE).
        int año2, mes2, febrero, meses;
        System.out.println(MSG_1);
        año2 = sc.nextInt();
        System.out.println(MSG_2);
        mes2 = sc.nextInt();
        if((año%4 == 0)&&(año%100 != 0)||(año %400 ==0)){
            febrero = 29;
        }else {
            febrero = 28;
        }
        if((mes2 == 1)||(mes2 == 3)|| (mes2 == 5)||(mes2 == 7)|| (mes2 == 8)|| (mes2 == 10)||(mes2 == 12)){
            meses = 31;
        }
        else{
            meses = 30;
        }
        switch(mes2){
            case 1: 
                System.out.println("En el año " + año2 + " y en el mes " + mes2 + " los días son " + meses);
                break;
            case 2:
                System.out.println("En el año " + año2 + " y en el mes " + mes2 + " los días son " + febrero);
                break;
            case 3:
                
            case 4:
                
            case 5:
                
            case 6:
                
            case 7:
                
            case 8:
                
            case 9:
                
            case 10:
                
            case 11:
                
            case 12:
                System.out.println("En el año " + año2 + " y en el mes " + mes2 + " los días son " + meses);
                break;
            
            default:
                System.out.println("ERROR 404, NOT FOUND");
        }


        
    }            
}
        
            

    

