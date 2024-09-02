package src.main.java.test;

import org.junit.Test;
import src.main.java.TransporteTrem;
import static org.junit.Assert.*;

public class TransporteTremTest {

    @Test
    public void testIniciarTrem() {
        TransporteTrem trem = new TransporteTrem();
        assertEquals("Trem acelerando", trem.iniciar());
    }

    @Test
    public void testPararTrem() {
        TransporteTrem trem = new TransporteTrem();
        assertEquals("Trem freando", trem.parar());
    }
}