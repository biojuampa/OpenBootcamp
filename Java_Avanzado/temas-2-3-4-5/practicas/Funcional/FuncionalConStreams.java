import java.util.ArrayList;


public class FuncionalConStreams {
    private final ArrayList<String> nombres = new ArrayList<>();

    public FuncionalConStreams() {
        nombres.add("Juan Pablo");
        nombres.add("María Lidia");
        nombres.add("Oscar Juan");
    }

    public void listarNombres() {
        nombres.forEach(System.out::println); // (x) -> System.out.println(x) = System.out::println
    }

    public void listarNombresComoTitulo() {
        nombres.stream()
                .map(String::toLowerCase)   // x -> x.toLowerCase() = String::toLowerCase
                .filter(x -> x.startsWith("o"))
                .map(x -> toTitleCase(x))   // FuncionalConStreams::toTitleCase = x -> toTitleCase(x) // función creada por mí
                .forEach(System.out::println)
        ;
    }

    public static String toTitleCase(String str) {

        ArrayList<Character> characters = new ArrayList<>();

        boolean firstChar = true;
        for (int i = 0; i < str.length(); i++) {
            char c = str.toCharArray()[i];
            characters.add(firstChar ? Character.toUpperCase(c) : Character.toLowerCase(c));
            firstChar = (c == ' ');

//            if (firstChar) {
//                characters.add(Character.toUpperCase(c));
//                firstChar = false;
//            } else {
//                characters.add(Character.toLowerCase(c));
//            }
//            if (c == ' ') {firstChar = true;}

        }

        StringBuilder words = new StringBuilder();
        for (char c: characters)
            words.append(c);

        return words.toString();
    }

}
