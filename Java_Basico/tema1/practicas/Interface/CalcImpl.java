public class CalcImpl implements Calculadora {
    
    public float suma(float a, float b) {
        float resultado;
        resultado = a + b;

        return resultado;
    }

    public float resta(float a, float b) {
        float resultado;
        resultado = a - b;

        return resultado;
    }

    public float divide(float a, float b) {
        float resultado;
        if (b != 0) {
            resultado = a / b;
            return resultado;
        }
        System.out.print("Error: ");
        return -1f;
    }

    public double multiplica(float a, float b) {
        double resultado;
        resultado = a * b;

        return resultado;
    }
}

