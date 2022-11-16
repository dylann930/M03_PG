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
public class Projecte1 {
    
    private static final String MSG_1 = "Introduzca el ID del cliente.";
    private static final String MSG_2 = "El ID introducido es: ";
    private static final String MSG_3 = "Introduzca la edad del cliente.";
    private static final String MSG_4 = "TIPO DE VENTA.";
    private static final String MSG_5 = "Venta libre (0)";
    private static final String MSG_6 = "Pensionista (1)";
    private static final String MSG_7 = "Carnet Joven (2)";
    private static final String MSG_8 = "Socio (3)";
    private static final String MSG_9 = "Programa finalizado por error en los datos. Tiene 3 intentos para ingresar cada dato.";
    private static final String MSG_10 = "Introduzca el importe total de la compra.";
    private static final String MSG_11 = "Introduzca el número de teléfono del cliente.";
    private static final String MSG_12 = "La edad introducida es: ";
    private static final String MSG_13 = "El tipo de venta introducida es el número: ";
    private static final String MSG_14 = "El importe total introducido es: ";
    private static final String MSG_15 = "El número de teléfono introducido es: ";
    private static final String MSG_16 = "Indique el número de tipo de venta a continuación: ";
    
    public static void main(String[] args) {
        int id = 0, edad = 0, venta = 0, importeCompra = 0, telefono = 0;
        boolean valorCorrecto; //Con 'valorCorrecto' nos aseguraremos que los valores introducidos sean enteros.
        String ventastring = ""; // Utilizamos una variable String para más tarde asignarle un texto al resultado de la variable 'venta'.
        Scanner sc = new Scanner(System.in);
        int i = 0;
        do { //Utilizamos un do-while para pedir la variable ID.
            if(i == 3){
                System.out.println(MSG_9); //Al tercer fallo a la hora de introducir la ID el programa informará y finalizará.
                return;                    //Sin utilizar ni break ni System.exit();.
            }
            System.out.println(MSG_1);
            valorCorrecto = sc.hasNextInt();
            if (valorCorrecto) { //Comprobamos que el valor introducido sea del tipo que pedimos (evitar carácteres).
                id = sc.nextInt();
                i++;
            } else {
                sc.next();
                i++;
            }
        } while ((!valorCorrecto) || ((id < 111) || (id > 999))); //Le pediremos la ID siempre que el valor introducido sea un carácter.
                                                                  //O cuando no esté dentro del intervalo que hemos asignado (111, 999).
        System.out.println(MSG_2 + id); //Mostramos el valor de ID.
        System.out.println("");
        i = 0; //Inicializamos 'i' para realizar el mismo proceso y ahora pedir la variable edad.
        do { 
            if(i == 3){
                System.out.println(MSG_9); //Al tercer fallo a la hora de introducir la ID el programa informará y finalizará.
                return;                      //Sin utilizar ni break ni System.exit();.
            }
            System.out.println(MSG_3);
            valorCorrecto = sc.hasNextInt(); //Comprobamos que el valor introducido sea del tipo que pedimos (evitar carácteres).
            if (valorCorrecto) {
                edad = sc.nextInt();
                i++;
            } else {
                sc.next();
                i++;
            }
        } while ((!valorCorrecto) || ((edad < 14) || (edad > 120))); //Le pediremos la edad siempre que el valor introducido sea un carácter.
                                                                     //O cuando no esté dentro del intervalo que hemos asignado (14, 120).
        System.out.println(MSG_12 + edad); //Mostramos valor de edad.
        System.out.println(" ");
        i = 0;
        do {  //Realizamos el mismo proceso para la variable 'venta'.
            if(i == 3){
                System.out.println(MSG_9);
                return;
            }
            System.out.println(MSG_4);
            System.out.println(MSG_5);
            System.out.println(MSG_6);
            System.out.println(MSG_7);
            System.out.println(MSG_8);
            System.out.println(MSG_16);
            valorCorrecto = sc.hasNextInt();
            if (valorCorrecto) {
                venta = sc.nextInt();
                i++;
            } else {
                sc.next();
                i++;
            }
        } while ((!valorCorrecto) || ((venta < 0) || (venta > 3)));
        
        System.out.println(MSG_13 + venta); //Mostramos el valor de la variable 'venta'.
        System.out.println(" ");
        switch(venta){ //Con Switch-Case asociamos el valor numérico de venta  a una variable de tipo String para despues mostrar
            case 0:    // los resultados por pantalla.
                ventastring = "VentaL.";
                break;
            case 1:
                ventastring = "Pensión";
                break;
            case 2:
                ventastring = "C.Joven";
                break;
            case 3:
                ventastring = "Socio";
        }
        i = 0;  //Mismo proceso para la variable 'importeCompra'.
        do {
            if(i == 3){
                System.out.println(MSG_9);
                return;
            }
            System.out.println(MSG_10);
            valorCorrecto = sc.hasNextInt();
            if (valorCorrecto) {
                importeCompra = sc.nextInt();
                i++;
            } else {
                sc.next();
                i++;
            }
        } while ((!valorCorrecto) || ((importeCompra < 0) || (importeCompra > 1000)));
        
        System.out.println(MSG_14 + importeCompra); // Mostramos valor de importeCompra.
        System.out.println(" ");
        i = 0;  //Mismo proceso con la variable 'telefono', solo admitirá números de 9 cifras.
        do {
            if(i == 3){
                System.out.println(MSG_9);
                return;
            }
            System.out.println(MSG_11);
            valorCorrecto = sc.hasNextInt();
            if (valorCorrecto) {
                telefono = sc.nextInt();
                i++;
            } else {
                sc.next();
                i++;
            }
        } while ((!valorCorrecto) || ((telefono < 111111111) || (telefono > 999999999)));
        
        System.out.println(MSG_15 + telefono);
        System.out.println(" ");
        
        //MOSTRAMOS LOS RESULTADOS.
        System.out.println( "ID" + "     " + "EDAD" + "     " + "TIPO" + "     " + "IMPORTE" + "     " + "TELÉFONO");
        System.out.println( id + "     " + edad + "     " + ventastring  + "       " + importeCompra + "      " + telefono);
    }
   
}