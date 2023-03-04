public class IfElse {
    public static void main (String[] args) {
        int edad;

        if (args.length == 0) {
            System.out.println("Debes decirme tu edad.");
            return;
        }

        edad = Integer.valueOf(args[0]);
        if (edad < 0)
            System.out.println("Paciencia, en " + Math.abs(edad) + " años llegarás a la tierra.");
        else if (edad < 5)
            System.out.println("Recién empezando, te deseo ¡éxitos en esta vida!");
        else if (edad < 18)
            System.out.println("Eres MENOR de edad");
        else if (edad < 100 )
            System.out.println("Eres MAYOR de edad");
        else
            System.out.println("Debes ser muy sabio, ya que has vivido tantos años :/");

    }
}
