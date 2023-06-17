public class Main {
    static int[] numeros = {34, 22, 12, 55, -98, 2, 0};

    public static void main(String[] args) {
        llamaMayorYMenor();
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
}
