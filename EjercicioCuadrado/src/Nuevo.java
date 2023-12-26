import java.util.Scanner;

public class Nuevo {

    private static int cuadradoMagico[][];
    private static int N;
    private static int numerosSacadosArray[];
    private static int numerosCuadrado;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce numero impar para dimensiones (N) del sudoku");
        N = scanner.nextInt();

        iniciarArrays();
        generarCuadrado();

    }

    public static void iniciarArrays() {
        cuadradoMagico = new int[N][N];
        numerosSacadosArray = new int[N * N];//asigno nº posiciones
    }

    public static void generarCuadrado() {
        boolean repetidos = false;
        int numeroSacado;

        for (int i = 0; i < N; i++) {//i FILAS
            for (int j = 0; j < N; j++) {//j COLUMNAS


                do {
                    numeroSacado = (int) (Math.random() * (N * N)) + 1;
                    for (int k = 0; k < N; k++) {
                        for (int l = 0; l < N; l++) {
                            numerosSacadosArray [N*N] = numeroSacado;
                            if(repetidos==false)
                                cuadradoMagico[k][l]=numeroSacado;
                        }
                    }

                }while (true);








              // cuadradoMagico[k][l] = numeroSacado;
              //  System.out.print("\t" + cuadradoMagico[i][j]);
            }
            System.out.println();
        }


        //System.out.println(N);

    }
}
