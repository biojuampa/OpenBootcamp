public class Reverse {
    public static void main(String[] args) {
         
        String texto;

        texto = reverse("Hola mundo!");
        System.out.println(texto + "\n");

        texto = reverse("¡Gracias Open Bootcamp!");
        System.out.println(texto + "\n");

        texto = reverse("Mi Nombre es Juan Pablo");
        System.out.println(texto + "\n");
        
        // Palíndromo
        texto = reverse("Neuquén");
        System.out.println(texto + "\n");

    }

    public static String reverse(String texto) {
        
        int length = texto.length();
        char[] otxetArray = new char[length];

        for (int i = 0; i < length ; i++)
            otxetArray[length-i-1] = texto.charAt(i);

        String otxet = new String(otxetArray);
        
        return otxet;

    }
}

