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
        double esperado = a + b;
        double suma = calculadora.suma(a,b);
        assertEquals(esperado,suma);
    }
    @Test
    public void testResta() {
        Calculadora calculadora = new Calculadora();
        double a = 4;
        double b = 2;
        double resta = a - b;
        double esperado = calculadora.resta(a,b);
        assertEquals(esperado,resta);
    }
    @Test
    public void testMultiplicacion() {
        Calculadora calculadora = new Calculadora();
        double a = 2;
        double b = 3;
        double esperado = calculadora.multiplicacion(a,b);
        double multiplicacion = a * b;
        assertEquals(esperado,multiplicacion);
    }
    @Test
    public void testDivision(){
        Calculadora calculadora = new Calculadora();

        double a = 4;
        double b = 2;

        double esperado = 2;
        double resultado = calculadora.division(a, b);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testDivisionPorCero() {
        Calculadora calculadora = new Calculadora();

        assertThrows(ArithmeticException.class, () -> {
            calculadora.division(4, 0);
        });
    }



}
