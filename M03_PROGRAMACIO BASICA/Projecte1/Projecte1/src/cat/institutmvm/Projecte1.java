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
    private static final String MSG_2 = "Introduzca la edad del cliente.";
    private static final String MSG_3 = "TIPO DE VENTA.";
    private static final String MSG_4 = "Venta libre (0)";
    private static final String MSG_5 = "Pensionista (1)";
    private static final String MSG_6 = "Carnet Joven (2)";
    private static final String MSG_7 = "Socio (3)";
    private static final String MSG_8 = "Error en los datos. Tiene 3 intentos para ingresar cada dato o el programa finalizará.";
    private static final String MSG_9 = "Introduzca el importe total de la compra.";
    private static final String MSG_10 = "Introduzca el número de teléfono del cliente.";
    private static final String MSG_11 = "Indique el número de tipo de venta a continuación: ";
    
    public static void main(String[] args) {
        int id = 0, edad = 0, venta = 0, importeCompra = 0, telefono = 0;
        boolean valorCorrecto; //Con 'valorCorrecto' nos aseguraremos que los valores introducidos sean enteros.
        String ventastring = ""; // Utilizamos una variable String para más tarde asignarle un texto al resultado de la variable 'venta'.
        Scanner sc = new Scanner(System.in);
        int i = 0;
        do { //Utilizamos un do-while para pedir la variable ID.
            System.out.println(MSG_1);
            valorCorrecto = sc.hasNextInt();
            if (valorCorrecto) { //Comprobamos que el valor introducido sea del tipo que pedimos (evitar carácteres).
                id = sc.nextInt();
                if((id < 111) || (id > 999)){ //Limitamos la variable ID para que sea [111,999].
                    valorCorrecto = false;
                    System.out.println(MSG_8);
                }
            } else {
                sc.next();
                System.out.println(MSG_8);
            }
            i++;
        } while ((!valorCorrecto) && (i < 3)); //Le pediremos la ID siempre que el valor introducido sea un carácter y la i sea menor que 3.                                              
        if( i<=3 && valorCorrecto){ //Si el usuario introduce 3 veces mal el dato valorCorrecto será FALSE y por lo tanto saltará todos los bloques condicionales hasta finalizar.
            i = 0;
            do { //Utilizamos un do-while para pedir la variable edad.
                System.out.println(MSG_2);
                valorCorrecto = sc.hasNextInt();
                if (valorCorrecto) { //Comprobamos que el valor introducido sea del tipo que pedimos (evitar carácteres).
                    edad = sc.nextInt();
                    if((edad < 14) || (edad > 120)){ //Limitamos la variable edad para que sea [14,120].
                        valorCorrecto = false;
                        System.out.println(MSG_8);
                    }
                } else {
                    sc.next();
                    System.out.println(MSG_8);
                }
                i++;
            } while ((!valorCorrecto) && (i < 3)); //Le pediremos la edad siempre que el valor introducido sea un carácter y la i sea menor que 3. 
        }
        if( i<=3 && valorCorrecto){
            i = 0;
            do {  //Realizamos el mismo proceso para la variable 'venta'.
                System.out.println(MSG_3);
                System.out.println(MSG_4);
                System.out.println(MSG_5);
                System.out.println(MSG_6);
                System.out.println(MSG_7);
                System.out.println(MSG_11);
                valorCorrecto = sc.hasNextInt();
                if (valorCorrecto) {
                    venta = sc.nextInt();
                    if((venta < 0) || (venta > 3)){ //Limitamos la variable venta para que sea [0,3].
                        valorCorrecto = false;
                        System.out.println(MSG_8);
                    }
                } else {
                    sc.next();
                    System.out.println(MSG_8);
                }
                i++;
            } while ((!valorCorrecto) && (i < 3)); 
            switch(venta){ //Con Switch-Case asociamos el valor numérico de venta  a una variable de tipo String para despues mostrar los resultados por pantalla.
                case 0:    
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
        }
        if( i <= 3 && valorCorrecto){
            i = 0;  //Mismo proceso para la variable 'importeCompra'.
            do {
                System.out.println(MSG_9);
                valorCorrecto = sc.hasNextInt();
                if (valorCorrecto) {
                    importeCompra = sc.nextInt();
                     if((importeCompra < 0) || (importeCompra > 1000)){ //Limitamos la variable importeCompra para que sea [0,1000].
                        valorCorrecto = false;
                        System.out.println(MSG_8);
                    }
                } else {
                    sc.next();
                    System.out.println(MSG_8);
                }
                i++;
            } while ((!valorCorrecto) && (i < 3)); 
        }
        if( i <= 3 && valorCorrecto){
            i = 0;  //Mismo proceso con la variable 'telefono', solo admitirá números de 9 cifras.
            do {
                System.out.println(MSG_10);
                valorCorrecto = sc.hasNextInt();
                if (valorCorrecto) {
                    telefono = sc.nextInt();
                    if((telefono < 111111111) || (telefono > 999999999)){ //Limitamos la variable telefono para que sea [111111111,999999999].
                        valorCorrecto = false;
                        System.out.println(MSG_8);
                    }
                } else {
                    sc.next();
                    System.out.println(MSG_8);
                }
                i++;
            } while ((!valorCorrecto) && (i < 3)); 
        
        //MOSTRAMOS LOS RESULTADOS.
        System.out.println( "ID" + "     " + "EDAD" + "     " + "TIPO" + "     " + "IMPORTE" + "     " + "TELÉFONO");
        System.out.println( id + "     " + edad + "     " + ventastring  + "       " + importeCompra + "      " + telefono);
        }
    }
   
}