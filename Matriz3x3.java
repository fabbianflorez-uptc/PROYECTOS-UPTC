//---------------------------------------//
//--FABIAN LEONARDO FLOREZ GONZALEZ------//
//---CODIGO 202614060--------------------//
//--MAS PROYECTOS EN---------------------//
//--https://github.com/fabbianflorez-uptc//
//---------------------------------:D----//
package matriz3x3;

public class matrix3x3 {

    public static void main(String[] args) {
      		// TODO Auto-generated method stub
        int n = 3;
        int[][] matriz = new int[n][n];
        int num = 1;

        // Datos de la matrix 1 al 9
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = num++;
            }
        }

        // Imprimir matrix
        System.out.println("Matriz completa:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Imprimir en diagonal (lista de valores)
        System.out.println("\nDATOS EN DIAGONAL:");
        for (int i = 0; i < n; i++) {
            // En la diagonal el indice es i,i (ES UN PATRON)
            System.out.println("Posición [" + i + "][" + i + "]: " + matriz[i][i]);
        }

        // --- NUEVA SECCIÓN ---
        // Imprimir tabla visual mostrando solo diagonal y el resto con "-"
        System.out.println("\n--------Ver solo datos en diagonal-------_-:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Si estamos en la diagonal, imprimimos el número
                if (i == j) {
                    System.out.print("|\t"+matriz[i][j] + "\t|");
                } else {
                    // Si no, imprimimos un guion
                    System.out.print("|\t"+"-\t|");
                    
                }
            }
            // Pasar a ka sig fila
            System.out.println();
        }
    }
}
