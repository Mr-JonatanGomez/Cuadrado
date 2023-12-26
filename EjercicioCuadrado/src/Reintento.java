import java.util.Scanner;

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
public class Reintento {

    private static int cuadraditoMagico[][];

    private static int N;
    private static int numerosRepetidos[];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dimension del cuadrado");
        N = scanner.nextInt();
        cuadraditoMagico = new int[N][N];
        numerosRepetidos = new int [N*N];


        recorrerCuadrado();
    }

    public static void recorrerCuadrado() {
        for (int i = 0; i < cuadraditoMagico.length; i++) {// i FILAS
            for (int j = 0; j < cuadraditoMagico.length; j++) {// j COLUMNAS
                int numero;
                boolean repetido;
                do {
                    repetido = false;
                    numero = (int) (Math.random() * (N * N)) + 1;
                    numerosRepetidos[i] = numero;
                    for (int k = 0; k < cuadraditoMagico.length; k++) {
                        for (int l = 0; l < cuadraditoMagico.length; l++) {
                            if (numero == numerosRepetidos[k]) {
                                repetido = true;
                            }
                        }
                        if (repetido){
                        break;
                        }
                    }
                } while (repetido);
                cuadraditoMagico[i][j] = numero;
                System.out.print(cuadraditoMagico[i][j] + "\t");
            }
            System.out.println();//salto linea

        }

    }
}

/*
do {
                    numero = (int) (Math.random()*N)+1;
                    if (numero==numerosRepetidos[]){

                    }
                }while (true);
                */