                                                                                                  //---------------------------------------//
//--FABIAN LEONARDO FLOREZ GONZALEZ------//
//---CODIGO 202614060--------------------//
//---------------------------------:D----//

import java.util.Scanner; // Importar es como traer una herramienta de la caja de herramientas.

public class Teclado004 {
    public static void main(String[] args) {
        // Creamos el objeto "lector" que va a escanear el teclado (System.in)
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Escribe tu primer apellido: ");
        // .next() solo lee una palabra. .nextLine() lee toda la frase.
        String apellido = lector.next(); 
        
        System.out.print("¿Cuantos años tienes?: ");
        // .nextInt() es espesifico para numeros enteros.
        int edadInput = lector.nextInt(); 
        
        System.out.println("Registrado: " + apellido + " de " + edadInput + " años.");
    }
}
