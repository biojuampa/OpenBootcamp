import java.util.function.Function;

public class PruebasFunction {

    public static void main(String[] args) {
        String saludo = saluda.apply("Juan Pablo");
        String eco = echo.apply("Hola, soy un eco");
        System.out.println(saludo);
        System.out.println(eco);

        Function<String,String> nuevoSaludo = saluda;
        String nuevo = nuevoSaludo.apply("María");
        System.out.println(nuevo);

        System.out.println("---------------------------");

        System.out.println(math.apply(2));
        System.out.println(queLoco.apply(echo));

        System.out.println("---------------------------");

        Integer numero = operacion.apply(12).apply(12);
        Integer numero2 = multiplica.apply(2);
        System.out.println(numero);
        System.out.println(numero2);

    }

    private static Function<String,String> saluda = (x) -> "Hola, " + x;
    private static Function<String,String> echo = (x) -> x;
    private static Function<Integer,Double> math = (x) -> {
            double resultado = Math.pow(x, 5);
            return resultado;
    };

    private static Function<Function<String,String>, String> queLoco = f -> f.apply("Qué Loco!");

    // a=3 , b=2
    private static Function<Integer, Function<Integer,Integer>> operacion = a -> (b -> a * b);
    private static Function<Integer,Integer> multiplica = operacion.apply(3); // b -> 3 * b

}
