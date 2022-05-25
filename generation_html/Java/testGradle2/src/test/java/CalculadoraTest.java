import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    @DisplayName("Método para comprobar suma")
    public void testSumar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.sumar(2, 3));
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
        assertEquals(6, calculadora.multiplicar(2, 3));
    }

}
