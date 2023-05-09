import java.util.function.BiFunction;
import java.util.function.Function;


public class FuncionalMain {

    private static int contador = 0;

    public static void main(String[] args) {
        System.out.println("Contador antes = " + contador);
        int result1 = suma(12, 23);
        int result2 = suma(12, 23);
        System.out.println("Resultado 1 = " + result1);
        System.out.println("Resultado 2 = " + result2);
        System.out.println("Contador después = " + contador);

        System.out.println("\n----------------------------------\n");

        String nombre1 = "Juan Pablo";
        String nombre2 = "María Lidia";

        System.out.println("Imperativa: " + toUpper(nombre1));
        System.out.println("Nro de caracteres: " + nChars(nombre1));
        System.out.println("Funcional (lambda): " + toUpperFunc.apply(nombre2));
        System.out.println("Nro de caracteres: " + nCharsFunc.apply(nombre2));

        System.out.println("\n----------------------------------\n");

        System.out.println(sumaFunc.apply(23, 12));
        System.out.println(sumaEnteros(sumaFunc, 123, 202));

        System.out.println("\n----------------------------------\n");

        FuncionalConStreams f = new FuncionalConStreams();
        f.listarNombres();
        System.out.println();
        f.listarNombresComoTitulo();
        System.out.println(f.toTitleCase("Mi nombre es jUaN paBLo"));

    }

    // Función pura
    private static int suma(int a, int b) {
        //contador++;    // Transformo la función en impura
        return a + b;
    }

    // Funciones que reciben y devuelven funciones
    private static Integer sumaEnteros(BiFunction<Integer,Integer,Integer> suma,
                                Integer a,
                                Integer b)
    {
        return suma.apply(a, b);
    }

    // High level functions (Lambdas)
    private static Function<String,String> toUpperFunc = (x) -> x.toUpperCase();
    private static Function<String,Integer> nCharsFunc = (x) -> x.length();
    private static BiFunction<Integer,Integer,Integer> sumaFunc = (x,y) -> Integer.sum(x,y);

    // Métodos (programación imperativa)
    private static String toUpper(String cadena) {
        return cadena.toUpperCase();
    }
    private static int nChars(String cadena) {
        return cadena.length();
    }

}
