import java.util.ArrayList;


public class FuncionalConStreams {
    private final ArrayList<String> nombres = new ArrayList<>();

    public FuncionalConStreams() {
        nombres.add("Juan Pablo");
        nombres.add("María Lidia");
        nombres.add("Oscar Juan");
    }

    public void listarNombres() {
        nombres.stream().forEach(System.out::println); // (x) -> System.out.println(x) = System.out::println
    }

    public void listarNombresComoTitulo() {
        nombres.stream()
                .map(x -> x.toLowerCase())
                .filter(x -> x.startsWith("o"))
                .map(x -> toTitleCase(x))   // función creada por mí
                .forEach(System.out::println)
        ;
    }

    public static String toTitleCase(String str) {
        String words = new String();
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

        for (char c: characters)
            words += c;

        return words;
    }

}
