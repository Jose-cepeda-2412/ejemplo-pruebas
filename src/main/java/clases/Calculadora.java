package clases;

public class Calculadora {

    public Calculadora() {
    }

    public double suma (double a, double b) {
        double c = a + b;
        return c;
    }

    public double multiplicacion (double a, double b) {
        double c = a * b;
        return c;
    }

    public double division (double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("no es posible hacer la division");
        }
        double c = a / b;
        return c;
    }

    public double resta (double a, double b) {
        double c = a - b;
        return c;
    }

}
