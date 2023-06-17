public class Main {
    static int[] numeros = {34, 22, 12, 55, -98, 2, 0};

    public static void main(String[] args) {
        llamaMayorYMenor();
        llamaIfAnidados(12,5);
        llamaConstructores();
    }

    private static void llamaMayorYMenor() {
        MayorYMenor.imprimeMayorYMenor1(numeros);
        MayorYMenor.imprimeMayorYMenor2(numeros);
        MayorYMenor.imprimeMayorYMenor3(numeros);
        MayorYMenor.imprimeMayorYMenor4(numeros);
        MayorYMenor.imprimeMayorYMenor5(numeros);
        MayorYMenor.imprimeMayorYMenor6(numeros);
        MayorYMenor.imprimeMayorYMenor7(numeros);
    }

    private static void llamaIfAnidados(int valor1, int valor2) {
        System.out.println(IfAnidados.mayor1(valor1, valor2));
        System.out.println(IfAnidados.mayor2(valor1, valor2));
        System.out.println(IfAnidados.mayor3(valor1, valor2));

        System.out.println(IfAnidados.menor1(valor1, valor2));
        System.out.println(IfAnidados.menor1(valor1, valor2));
        System.out.println(IfAnidados.menor1(valor1, valor2));
    }

    private static void llamaConstructores() {
        ConstructorHiperMegaUltraLargo constructorLargo = new ConstructorHiperMegaUltraLargo(
                "Nombre",
                "Marca",
                "Modelo",
                "Año",
                "Descripción Corta",
                120.33d,
                255)
                ;

        ConstructorCorto constructorCorto = new ConstructorCorto("Nombre")
                .marca("Marca")
                .cantidad(120)
                .modelo("Modelo")
                ;

        System.out.println(constructorLargo);
        System.out.println(constructorCorto);
    }
}
