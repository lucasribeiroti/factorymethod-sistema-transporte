package src.main.java.test;

import org.junit.Test;
import src.main.java.TransporteFactory;

public class TransporteFactoryTest {
    @Test(expected = IllegalArgumentException.class)
    public void testObterTransporteInexistente() {
        TransporteFactory.obterTransporte("Navio");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testObterTransporteInvalido() {
        TransporteFactory.obterTransporte("Invalido");
    }
}