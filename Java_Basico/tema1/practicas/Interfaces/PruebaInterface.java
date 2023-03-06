// package Interfaces;

public class PruebaInterface {
    public static void main(String[] args) {

        Calculadora op = new CalculadoraImpl();

        System.out.println(op.suma(1f, 23f));
        System.out.println(op.resta(12.5f, 23f));
        System.out.println(op.divide(15f, 0f));
        System.out.println(op.multiplica(2f, 17.44f));

        Calculadora calculadora = new CalcImpl();

        System.out.println(calculadora.suma(1f, 23f));
        System.out.println(calculadora.resta(12.5f, 23f));
        System.out.println(calculadora.divide(15f, 10f));
        System.out.println(calculadora.multiplica(2f, 17.44f));

    }
}
