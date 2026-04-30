package pruebas;

import clases.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculadoraTest {

    @Test
    public void testSuma() {
        Calculadora calculadora = new Calculadora();
        double a = 4;
        double b = 2;
        double total = a + b;
        double suma = calculadora.suma(a,b);
        assertEquals(total,suma);
    }
    @Test
    public void testResta() {
        Calculadora calculadora = new Calculadora();
        double a = 4;
        double b = 2;
        double resta = a - b;
        double total = calculadora.resta(a,b);
        assertEquals(total,resta);
    }
}
