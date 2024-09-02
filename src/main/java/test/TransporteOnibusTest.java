package src.main.java.test;

import org.junit.Test;
import src.main.java.TransporteOnibus;

import static org.junit.Assert.*;

public class TransporteOnibusTest {

    @Test
    public void testIniciarOnibus() {
        TransporteOnibus onibus = new TransporteOnibus();
        assertEquals("Ônibus acelerando", onibus.iniciar());
    }

    @Test
    public void testPararOnibus() {
        TransporteOnibus onibus = new TransporteOnibus();
        assertEquals("Ônibus freando", onibus.parar());
    }
}