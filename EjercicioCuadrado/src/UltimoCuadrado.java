import java.util.Scanner;

/*probando ademas con METODOS
-Para ello lo primero es declarar las variables en la PUBLIC CLASS
*/
public class UltimoCuadrado {
    static int magicSquare[][];
    static int dimension;
    static int aleatorio;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce un nº impar para la dimensión del cuadrado");
            dimension = sc.nextInt();
        } while (dimension % 2 == 0);

        magicSquare = new int[dimension][dimension];
        System.out.println(" Tu cuadrado es de " + dimension + "x" + dimension);

        //llamada a METODOS

        rellenarCuadrado();
        mostrarCuadrado();
    }

    public static void rellenarCuadrado() {
        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare.length; j++) {

                do {
                    aleatorio = (int) (Math.random() * (dimension * dimension * 1)) + 1;// cambiar a dmension el ultimo
                } while (numeroRepetido(aleatorio) == true);//hacer mientras metodoRepetido(aleatorio es donde buscamos repetido)
                magicSquare[i][j] = aleatorio;

            }
        }
    }
    public static boolean numeroRepetido(int numero) { //copiamos el for anidado de mostrar cuadrado
        for (int[] fila : magicSquare) { // en la primera pos  encontraremos > int [] fila
            for (int item : fila) { // ahora recorremos fila y "item"son elementos de columna
                if (item == numero) {
                    return true; // si item=numero
                }
            }
        }
        //si ya has preguntado a todas filas y columnas y no es true, dame false
        return false;
    }
    public static void mostrarCuadrado() {
        for (int[] fila : magicSquare) { // en la primera pos se pone que encontraremos > int [] fila
            for (int item : fila) { // ahora recorremos fila y nos encontramos con un numero "item"
                System.out.print(item + "\t");
            }
            System.out.println();

        }
    }


}
   /*
Un cuadrado mágico es una matriz cuadrada en la que la suma de cada fila, cada
columna y ambas diagonales principales es la misma. Tu tarea es escribir un
programa en Java que genere un cuadrado mágico de tamaño N, donde N es un número
impar mayor o igual a 3.

1- Solicita al usuario que ingrese un número impar N (3, 5, 7, ...).
1.b- Si no es impar solicita otro
2- Crea un cuadrado mágico de tamaño N.
3- Llena la matriz de manera que cada número no se repita
4- Imprime el cuadrado mágico resultante.
5- Una vez conseguido esto, buscamos hacer que la suma de filas sea igual

*/