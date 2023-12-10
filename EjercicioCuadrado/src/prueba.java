import java.util.Scanner;

public class prueba {

    private static int cuadradoM[][];
    private static int N;

    public static void main(String[] args) {
        // generar cuadrado
        System.out.println("Ingresa nº impar 3,5,7 o 9 para el cuadrado mágico");
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        cuadradoM = new int[N][N];

        recorrerCuadrado();
    }

    public static void recorrerCuadrado() {
        int numeroMaximo = N * N;

        for (int i = 0; i < cuadradoM.length; i++) { // filas
            for (int j = 0; j < cuadradoM.length; j++) { // columnas
                int numero;
                boolean repetido;

                do {
                    numero = (int) (Math.random() * numeroMaximo) + 1;
                    repetido = false;

                    // Verificar si el número ya está en la matriz
                    for (int k = 0; k < cuadradoM.length; k++) {
                        for (int l = 0; l < cuadradoM.length; l++) {
                            if (cuadradoM[k][l] == numero) {
                                repetido = true;
                                break;
                            }
                        }
                        if (repetido) {
                            break;
                        }
                    }
                } while (repetido);

                cuadradoM[i][j] = numero;
                System.out.print(cuadradoM[i][j] + "\t");
            }
            System.out.println(); // salto de línea
        }
    }
}
