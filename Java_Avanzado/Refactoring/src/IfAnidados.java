public class IfAnidados {
    public static int mayor1(int valor1, int valor2) {
        if (valor1 > valor2) {
            return valor1;
        } else {
            return valor2;
        }
    }

    public static int mayor2(int valor1, int valor2) {
        if (valor1 > valor2) {
            return valor1;
        }
        return valor2;
    }

    public static int mayor3(int valor1, int valor2) {
        return Math.max(valor1, valor2);
    }

    public static int menor1(int valor1, int valor2) {
        if (valor1 < valor2) {
            return valor1;
        } else {
            return valor2;
        }
    }

    public static int menor2(int valor1, int valor2) {
        if (valor1 < valor2) {
            return valor1;
        }
        return valor2;
    }

    public static int menor3(int valor1, int valor2) {
        return Math.min(valor1, valor2);
    }
}

