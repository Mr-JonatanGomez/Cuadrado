import java.util.Scanner;

public class Cuadrado {
    /*
    Un cuadrado mágico es una matriz cuadrada en la que la suma de cada fila, cada
    columna y ambas diagonales principales es la misma. Tu tarea es escribir un
    programa en Java que genere un cuadrado mágico de tamaño N, donde N es un número
    impar mayor o igual a 3.

    1- Solicita al usuario que ingrese un número impar N (3, 5, 7, ...).
    2- Crea un cuadrado mágico de tamaño N.
    3- Llena la matriz de manera que cada número del 1 al N^2 esté presente y no se repita.
    4- Imprime el cuadrado mágico resultante.

- Realizar una aplicación que permita crear un cuadrado mágico.
- Para ello nada más arrancar la aplicación pedirá el tamaño del cuadrado (3x3, 4x4, etc...)
- Una vez echo esto se mostrará por consola el cuadrado generado
- Para que un cuadrado sea mágico, todas cada una delas filas, columnas
  y diagonales es la misma



*/

    private static int cuadradoM[][];
    private static int N;
    private static boolean repetido;


    public static void main(String[] args) {
        // generar cuadrado
        System.out.println("Ingresa nº impar 3,5,7 o 9 para el sudoku");
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        cuadradoM = new int[N][N];

        recorrerCuadrado();
    }

    public static void recorrerCuadrado() {
        for (int i = 0; i < cuadradoM.length; i++) { //filas

            for (int j = 0; j < cuadradoM.length; j++) {//columnas
                repetido = false;
                int numero = (int) (Math.random() * (N * N) + 1);
                if (numero == cuadradoM[j][i]) {
                    repetido = true;
                    break;
                }

                if (!repetido) {
                    cuadradoM[j][i] = numero;
                    System.out.print(cuadradoM[j][i] + " ");
                    /*
                    System.out.println("fila: " + i + ", columna: " + j + ", numero ocupado: " + numero);
                    con este sout imprimo en letras el cuadrado (fila 0 columna 0...etc)
                    */
                }

            }
            System.out.println();//salto linea??
        }
    }
}
