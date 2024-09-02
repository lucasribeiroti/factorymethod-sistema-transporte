package src.main.java;

public class TransporteFactory {

    public static ITransporte obterTransporte(String transporte) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("src.main.java.Transporte" + transporte);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Transporte inexistente");
        }
        if (!(objeto instanceof ITransporte)) {
            throw new IllegalArgumentException("Transporte inválido");
        }
        return (ITransporte) objeto;
    }
}