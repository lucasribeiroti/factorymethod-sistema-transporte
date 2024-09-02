package src.main.java.test;

import org.junit.Test;
import src.main.java.TransporteAviao;

import static org.junit.Assert.*;

public class TransporteAviaoTest {

    @Test
    public void testIniciarAviao() {
        TransporteAviao aviao = new TransporteAviao();
        assertEquals("Avião decolando", aviao.iniciar());
    }

    @Test
    public void testPararAviao() {
        TransporteAviao aviao = new TransporteAviao();
        assertEquals("Avião aterrisando", aviao.parar());
    }
}