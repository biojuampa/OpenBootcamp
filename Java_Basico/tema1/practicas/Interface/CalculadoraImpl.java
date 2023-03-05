public class CalculadoraImpl implements Calculadora {

    public float suma(float a, float b) {
        return a+b;
    }

    public float resta(float a, float b) {
        return a-b;
    }

    public float divide(float a, float b) {
        if (b != 0)
            return a/b;
        System.out.print("Imposible dividir por cero! Error: ");
        return -1f;
    }

    public double multiplica(float a, float b) {
        return a*b;
    }

    //public printName {}
}
