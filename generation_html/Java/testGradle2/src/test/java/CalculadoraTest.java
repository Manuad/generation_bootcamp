import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    @DisplayName("Método para comprobar suma")
    public void testSumar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.sumar(2, 2), "El resultado de la suma debe ser: " + 5);
    }

    @Test
    @DisplayName("Método para comprobar assertions")
    public void assetionTrue() {
        boolean valorBoolean = true;
        assertTrue(valorBoolean);
    }

    @Test
    public void testMultiplicar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(6, calculadora.multiplicar(2, 3), "El resultado de la multiplicación debe ser: " + 6);
    }

    @Test
    @DisplayName("Método para comprobar resta")
    public void testRestar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(0, calculadora.restar(2, 2), "El resultado de la resta debe ser: " + 0);
    }

    @Test
    @DisplayName("Método para comprobar división")
    public void testDividir() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2, calculadora.dividir(4, 2), "El resultado de la división debe ser: " + 2);
    }
}
