public class Concatena {
    public static void main(String[] args) {

        String[] textos = {"Este",
                           "es un",
                           "ejercicio",
                           "más para",
                           "Open Bootcamp.\n",
                           "Espero",
                           "pronto conseguir",
                           "un buen trabajo,",
                           "de lo",
                           "contrario,\n",
                           "temo perder la",
                           "oportundidad para",
                           "siempre."
                          };

        String frase = "";
        for (String texto: textos) {
            frase += " " + texto;
        }

        System.out.println(frase);

    }
}

