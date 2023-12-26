import java.util.Scanner;

public class Palabras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5]; // NEW es para clases complejas
        String palabra = "Hola que tal"; // es compleja porque empieza en mayuscula


        //cuantos caracteres tengo
        palabra.length();
        //posicion de primera letra
        palabra.indexOf("o");
        //cambia todos los caracteres por otros
        palabra.replaceAll("e","i"); // cambia las e por i
        // me das el conjunto de elementos cortados por el caracter indicado
        palabra.split(" "); // indicamos espacio y nos da ("Hola","que","tal")
        // me indica si la palabra está
        palabra.contains("Hola");
        //indica el subconjunto de una palabra
        palabra.substring(0,1); // va desde la palabra 0 hasta la 1
        //indica el subconjunto de una palabra
        palabra.substring(1); // va desde la palabra 1 hasta el final

        //saber si una palabra es igual a otra, nunca if (palabra =="ejemplo") usar metodo equals
        if (palabra.equalsIgnoreCase("hola")){};//ignora si es mayus o minus

        // sustituye %s por ejemplo y ejemplo2...
        palabra = String.format("esto es un %s de %s formateada","ejemplo","ejemplo2");

        // sacamos todas las palabras
        palabra = "esto es una frase para poder analizar la palabra desde java";
        for (int i = 0; i < palabra.length(); i++) {
            System.out.println(palabra.charAt(i));

        }
        // para contablizar las palabras
        int numeroPalabras = palabra.split(" ").length;//split es un cuchillo que corta por los espacios y pregunto por su longitud .lenght
        System.out.printf("el numero de palabras es"+numeroPalabras);

        //contablizar letras
        int contador = 0;
        String[]palabras = palabra.split(" ");// corta palabra por los espacios
        for (String item:palabras) {
            contador+= item.length();
        }
        System.out.println("el numero de letras es "+contador);
    }
}
