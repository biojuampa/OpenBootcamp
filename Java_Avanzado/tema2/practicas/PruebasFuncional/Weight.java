/* Currying:
*       Es una técnica matemática que convierte una función que toma múltiples
*       argumentos, en una secuencia de funciones que toman un único argumento.
*/

import java.util.function.Function;

public class Weight {

    public static void main(String[] args) {
        System.out.println("My weight on Earth: " + weightOnEarth.apply(60.0));
        System.out.println("My weight on Mars: " + weightOnMars.apply(60.0));

        System.out.println("Mi peso actual: " + weight.apply(9.81).apply(8.0));

    }

    private static Function<Double, Function<Double, Double>> weight = gravity -> (mass -> gravity * mass);

    private static Function<Double, Double> weightOnEarth = weight.apply(9.81); // mass -> 9.81 * mass
    private static Function<Double, Double> weightOnMars = weight.apply(3.75);  // mass -> 3.75 * mass

}
