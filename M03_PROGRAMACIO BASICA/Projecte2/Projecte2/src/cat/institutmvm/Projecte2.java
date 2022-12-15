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

public class Projecte2 {

    private static final String MSG_1 = "Los datos de cuántos clientes va a introducir?"; //Declaramos todos los mensajes que mostraremos al usuario.
    private static final String MSG_2 = "Introduzca el ID del cliente.";
    private static final String MSG_3 = "Error en los datos. Tiene 3 intentos para ingresar cada dato.";
    private static final String MSG_4 = "Introduzca la edad del cliente.";
    private static final String MSG_5 = "TIPO DE VENTA.";
    private static final String MSG_6 = "Venta libre (0)";
    private static final String MSG_7 = "Pensionista (1)";
    private static final String MSG_8 = "Carnet Joven (2)";
    private static final String MSG_9 = "Socio (3)";
    private static final String MSG_10 = "Indique el número de tipo de venta a continuación: ";
    private static final String MSG_11 = "Introduzca el importe total de la compra.";
    private static final String MSG_12 = "Introduzca el número de teléfono del cliente.";
    private static final String MSG_13 = "ID" + "\t" + "EDAD" + "\t" + "TIPO" + "\t" + "IMPORTE" + "\t" + "TELÉFONO";
    private static final String MSG_14 = "La cantidad de registros de clientes introducidos es de ";
    private static final String MSG_15 = "Quiere consultar por tipo de cliente? (si: 1 / no: 0).";
    private static final String MSG_16 = "Qué tipo de cliente? (V.Libre: 0 / Pensión: 1 / C.Joven: 2 / Socio: 3)";
    private static final String MSG_17 = "Error en los datos.";
    private static final String MSG_18 = "Quiere ver un resumen estadístico de los datos? (si: 1 / no: 0).";
    private static final String MSG_19 = "Número de clientes por tipo:";
    private static final String MSG_20 = "Histograma de número de clientes por tipo:";
    private static final String MSG_21 = "Importe total acumulado: ";
    private static final String MSG_22 = "-----------------------------";
    private static final String TXT_VENTALIBRE = "V.Libre"; //Declaramos las constantes.
    private static final String TXT_PENSIONISTA = "Pensión";
    private static final String TXT_CARNETJOVEN = "C.Joven";
    private static final String TXT_SOCIO = "Socio";
    

    public static void main(String[] args) {
        int clientes, error = 0, error1, a = 1, consulta = 0, tipoCliente = 0, contador = 0, contador1 = 0, contador2 = 0, contador3 = 0, total = 0; // Declaramos variables de tipo entero.
        boolean valorCorrecto = true; //Declaramos variable de tipo booleana para poder comprobar que los datos introducidos són de tipo entero y no de otro tipo.
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        clientes = sc.nextInt(); //Comenzamos pidiendo la cantidad de clientes que el usuario desea introducir.
        int[] id = new int[clientes]; //Declaramos la variable clientes como longitud de cada array que utilizaremos posteriormente. (ID, edad, ventas, importeCompra, telefono).
        int[] edad = new int[clientes];
        int[] ventas = new int[clientes];
        String[] ventasString = new String[clientes]; //Se declara una array de tipo String donde almacenaremos el tipo de venta en forma de texto para despues printarlo por pantalla.
        int[] importeCompra = new int[clientes];
        int[] telefono = new int[clientes];
        int[] barras = new int[4]; //Esta array la utilizaremos posteriormente para el histograma.
        for(int i = 0; i < id.length; i++, a++){
            error = 0;
            error1 = 0;
                System.out.println("CLIENTE " +  a); //Mostramos el número del cliente del cual estamos introduciéndo los datos.   
                do{
                    System.out.println(MSG_2);
                    valorCorrecto = sc.hasNextInt();
                    if(valorCorrecto){
                        id[i] = sc.nextInt();
                        if((id[i] < 111)||(id[i] > 999)){ //Pedimos por teclado el valor de la ID la cual tiene que cumplir esta condición.
                            valorCorrecto = false;
                            System.out.println(MSG_3);
                            error1++;//Incrementa si no cumple la condición.
                        }
                    }else{
                        sc.next();
                        System.out.println(MSG_3);
                        error1++;//Incrementa si no cumple la condición.
                    }
                    error++;
                }while ((!valorCorrecto) && (error < 3));//Lo pedirá mientras el valorCorrecto sea incorrecto y los errores menores a 3..
            error = 0; //Inicializamos a 0 la variable error antes de pedir cada VALOR para así poder contabilizar los 3 errores.
            if( error<3 && valorCorrecto){
                error1 = 0;
                do{
                    System.out.println(MSG_4);
                    valorCorrecto = sc.hasNextInt();
                    if(valorCorrecto){
                        edad[i] = sc.nextInt();
                        if((edad[i] < 14)||(edad[i] > 120)){ //Pedimos por teclado el valor de la edad la cual tiene que cumplir esta condición.
                            valorCorrecto = false;
                            System.out.println(MSG_3);
                            error1++;//Incrementa si no cumple la condición.
                        }
                    }else{
                        sc.next();
                        System.out.println(MSG_3);
                        error1++;//Incrementa si no cumple la condición.
                    }
                    error++;
                }while ((!valorCorrecto) && (error < 3));
            }
            error = 0;
            if( error<3 && valorCorrecto){ //El programa solo ejecutará cada bloque (pedir cada valor) si los errores son menores a 3 y valorCorrecto = true.
                error1 = 0;
                do{
                    System.out.println(MSG_5); //Mostramos un menú con los tipos de ventas.
                    System.out.println(MSG_6);
                    System.out.println(MSG_7);
                    System.out.println(MSG_8);
                    System.out.println(MSG_9);
                    System.out.println(MSG_10);
                    valorCorrecto = sc.hasNextInt();
                    if(valorCorrecto){
                        ventas[i] = sc.nextInt();
                        if((ventas[i] < 0)||(ventas[i] > 3)){ //Pedimos por teclado el valor de la ventas la cual tiene que cumplir esta condición.
                            valorCorrecto = false;
                            System.out.println(MSG_3);
                            error1++;//Incrementa si no cumple la condición.
                        }
                    }else{
                        sc.next();
                        System.out.println(MSG_3);
                        error1++;//Incrementa si no cumple la condición.
                    }
                    error++;
                }while ((!valorCorrecto) && (error < 3));
            }
            error = 0;
            if( error<3 && valorCorrecto){
                error1 = 0;
                do {
                    System.out.println(MSG_11);
                    valorCorrecto = sc.hasNextInt();
                    if (valorCorrecto) {
                        importeCompra[i] = sc.nextInt();
                         if((importeCompra[i] < 0) || (importeCompra[i] > 1000)){ //Pedimos por teclado el valor de la importeCompra la cual tiene que cumplir esta condición.
                            valorCorrecto = false;
                            System.out.println(MSG_3);
                            error1++;//Incrementa si no cumple la condición.
                        }
                    } else {
                        sc.next();
                        System.out.println(MSG_3);
                        error1++;//Incrementa si no cumple la condición.
                    }
                    error++;
                } while ((!valorCorrecto) && (error < 3));
            }
            error = 0;
            if( error<3 && valorCorrecto){
                error1 = 0;
                do {
                    System.out.println(MSG_12);
                    valorCorrecto = sc.hasNextInt();
                    if (valorCorrecto) {
                        telefono[i] = sc.nextInt();
                        if((telefono[i] < 111111111) || (telefono[i] > 999999999)){ //Pedimos por teclado el valor de telefono la cual tiene que cumplir esta condición.
                            valorCorrecto = false;
                            System.out.println(MSG_3);
                            error1++; //Incrementa si no cumple la condición.
                        }
                    } else {
                        sc.next();
                        System.out.println(MSG_3);
                        error1++;//Incrementa si no cumple la condición.
                    }
                    error++;
                } while ((!valorCorrecto) && (error < 3));
            }
            if(error1 >= 3){ //Mediante esta variable la cual incrementa cada vez que hay un error en la introducción de alguno de los datos hacemos que
                i = i - 1;   //si se cometen más de tres errores en la introducción en lugar de pasar al siguiente cliente volverá a pedir el mismo.
                a = a - 1;
            }
        }
        for(int i = 0; i < ventas.length; i++){ //Mediante un switch-case asociamos los valores de la array ventas[i] la cual es de tipo entero a una array
            switch(ventas[i]){                  //de tipo String para después poder mostrarlo por pantalla de manera legible.
                case 0:
                   ventasString[i] = TXT_VENTALIBRE;
                   break;
                case 1:
                    ventasString[i] = TXT_PENSIONISTA;
                    break;
                case 2:
                    ventasString[i] = TXT_CARNETJOVEN;
                    break;
                case 3:
                    ventasString[i] = TXT_SOCIO;
                    break;
            }
        }
        if( error<3 && valorCorrecto){
            System.out.println("");
            System.out.println(MSG_13); //Mostramos por pantalla todos los datos de los clientes introducidos por teclado.
            for (int i = 0; i < clientes; i++) {
                System.out.print(id[i]);
                System.out.print("\t"); //Utilizo tabulaciones para que las columnas cuadren.
                System.out.print(edad[i]);
                System.out.print("\t");
                System.out.print(ventasString[i]);
                System.out.print("\t");
                System.out.print(importeCompra[i] + "€");
                System.out.print("\t");
                System.out.print(telefono[i]);
                System.out.println();
            }
        }
        if( error<3 && valorCorrecto){
        System.out.println("");
        System.out.println(MSG_14 + clientes);
        System.out.println("");
        do {
            System.out.println(MSG_15);
            valorCorrecto = sc.hasNextInt();
            if (valorCorrecto) {
                consulta = sc.nextInt();
                if((consulta < 0) || (consulta > 1)){ //Pedimos al usuario que introduzca un 0 o 1 si quiere consultar por tipo de venta.
                    valorCorrecto = false;
                    System.out.println(MSG_17);
                }
            } else {
                sc.next();
                System.out.println(MSG_17);
            }
        } while ((!valorCorrecto)); //Lo hará siempre que escriba 0 o 1.
        if(consulta == 1){ //Si elige consultar por tipo de venta realizamos el mismo proceso con la variable tipoCliente.
        do {               //Para así pedirle cual es el tipo de cliente del cual quiere realizar la consulta.
            System.out.println(MSG_16);
            valorCorrecto = sc.hasNextInt();
            if (valorCorrecto) {
                tipoCliente = sc.nextInt();
                if((tipoCliente < 0) || (tipoCliente > 3)){
                    valorCorrecto = false;
                    System.out.println(MSG_17);
                }
            } else {
                sc.next();
                System.out.println(MSG_17);
            }
        } while ((!valorCorrecto)); //Lo hará siempre que escriba 0, 1, 2 o 3.
        if(tipoCliente == 0){ //Si quiere consultar por Venta Libre pulsará 0.
            System.out.println(MSG_13);
            for(int i = 0; i < ventas.length; i++){
            if(ventas[i] == 0){ //Y mediante este bucle solo se printarán las posiciones en la cuál la array ventas[i] sea igual a 0 , es decir, Venta Libre.
                System.out.print(id[i]);
                System.out.print("\t");
                System.out.print(edad[i]);
                System.out.print("\t");
                System.out.print(ventasString[i]);
                System.out.print("\t");
                System.out.print(importeCompra[i] + "€");
                System.out.print("\t");
                System.out.print(telefono[i]);
                System.out.println();
            }          
            }
        }
        if(tipoCliente == 1){ //Si quiere consultar por Pensionista pulsará 1.
            System.out.println(MSG_13);
            for(int i = 0; i < ventas.length; i++){
            if(ventas[i] == 1){ //Y mediante este bucle solo se printarán las posiciones en la cuál la array ventas[i] sea igual a 1 , es decir, Pensionista.
                System.out.print(id[i]);
                System.out.print("\t");
                System.out.print(edad[i]);
                System.out.print("\t");
                System.out.print(ventasString[i]);
                System.out.print("\t");
                System.out.print(importeCompra[i] + "€");
                System.out.print("\t");
                System.out.print(telefono[i]);
                System.out.println();
            }          
            }
        }
        if(tipoCliente == 2){ //Si quiere consultar por Carnet Joven pulsará 2.
            System.out.println(MSG_13);
            for(int i = 0; i < ventas.length; i++){
            if(ventas[i] == 2){ //Y mediante este bucle solo se printarán las posiciones en la cuál la array ventas[i] sea igual a 2 , es decir, Carnet Joven.
                System.out.print(id[i]);
                System.out.print("\t");
                System.out.print(edad[i]);
                System.out.print("\t");
                System.out.print(ventasString[i]);
                System.out.print("\t");
                System.out.print(importeCompra[i] + "€");
                System.out.print("\t");
                System.out.print(telefono[i]);
                System.out.println();
            }          
            }
        }
        if(tipoCliente == 3){ //Si quiere consultar por Socio pulsará 3.
            System.out.println(MSG_13);
            for(int i = 0; i < ventas.length; i++){
            if(ventas[i] == 3){ //Y mediante este bucle solo se printarán las posiciones en la cuál la array ventas[i] sea igual a 3 , es decir, Socio.
                System.out.print(id[i]);
                System.out.print("\t");
                System.out.print(edad[i]);
                System.out.print("\t");
                System.out.print(ventasString[i]);
                System.out.print("\t");
                System.out.print(importeCompra[i] + "€");
                System.out.print("\t");
                System.out.print(telefono[i]);
                System.out.println();
            }          
            }
        }
        }
        System.out.println("");
        System.out.println(MSG_18);
        consulta = sc.nextInt();
        if(consulta == 1){ //Aquí le pedimos si quiere consultar un resumen estadístico de los datos de clientes introducidos.
            System.out.println("");
            System.out.println(MSG_14 + a);
            System.out.println("");
            System.out.println(MSG_19);
            System.out.println("");
            for(int i = 0; i < ventas.length; i++){ //Recorremos la array de ventas y asociamos una variable contador a cada tipo de venta.
                if(ventas[i] == 0){                 //Y cada variable contador iterará si corresponde con el valor indicado.
                    contador = contador + 1;        //Así sabremos la cantidad de tipos de clientes que se han introducido por teclado
                }
                if(ventas[i] == 1){
                    contador1 = contador1 + 1;
                }
                if(ventas[i] == 2){
                    contador2 = contador2 + 1;
                }
                if(ventas[i] == 3){
                    contador3 = contador3 + 1;
                }
            }
            if(contador > 0){ //Con estos condicionales nos aseguramos de que solo se printen los tipos de clientes que se han introducido y los que no no se printarán.
                System.out.println("V.Libre: " + contador);
                System.out.println("");
            }
            if(contador1 > 0){
                System.out.println("Pensionista: " + contador1);
                System.out.println("");
            }
            if(contador2 > 0){
                System.out.println("C.Joven: " + contador2);
                System.out.println("");
            }
            if(contador3 > 0){
                System.out.println("Socio: " + contador3);
                System.out.println("");
            }
            barras[0] = contador; //Asociamos cada contador a cada una de las posiciones de la array barras[i] con la cual printaremos el histograma.
            barras[1] = contador1;
            barras[2] = contador2;
            barras[3] = contador3;
            System.out.println(MSG_20);
            System.out.println(MSG_22);
            for (int i = 0; i < barras.length; i++) {
            switch(i) {
              case 0:
                if(barras[i] > 0){  //Con este condicional solo printaremos los tipos de ventas que han sido introducidos por teclado, los que no no se printarán.
                System.out.print("V.Libre: ");
                break;
                }
              case 1:
                if(barras[i] > 0){  
                System.out.print("Pensión: ");
                break;
                }
              case 2:
                if(barras[i] > 0){
                System.out.print("C.Joven: ");
                break;
                }
              case 3:
                if(barras[i] > 0){  
                System.out.print("Socio: ");
                break;
                }
            }
            for (int j = 0; j < barras[i]; j++) { //Printamos la cantidad de cada posición de la array barras[i] en forma de asteriscos.
              System.out.print("*");
            }
            System.out.println();
            } 
            for(int i = 0; i < importeCompra.length; i++){ //Recorremos la array importeCOmpra y vamos sumando cada valor dentro de la variable Total y después lo mostramos por pantalla.
                total = total + importeCompra[i];
            }
            System.out.println("");
            System.out.println(MSG_21 + total + "€");
            System.out.print("");
        }
        }
        
    }
}


