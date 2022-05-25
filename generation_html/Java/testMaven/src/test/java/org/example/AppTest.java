package org.example;

import org.junit.jupiter.api.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void saludoTest()
    {
        App saludo = new App();
        Assertions.assertEquals("Hola Mundo!", saludo.saludo());
    }

    @Test
    public void saludoStaticTest() {
        Assertions.assertEquals("Hola Mundo!", App.saludoStatic());
    }
}
