package src.main.java.test;

import org.junit.Test;
import src.main.java.TransporteCarro;

import static org.junit.Assert.*;

public class TransporteCarroTest {

    @Test
    public void testIniciarCarro() {
        TransporteCarro carro = new TransporteCarro();
        assertEquals("Carro acelerando", carro.iniciar());
    }

    @Test
    public void testPararCarro() {
        TransporteCarro carro = new TransporteCarro();
        assertEquals("Carro freando", carro.parar());
    }
}