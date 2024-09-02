package src.main.java;

public class TransporteOnibus implements ITransporte {

    public String iniciar() {
        return "Ônibus acelerando";
    }

    public String parar() {
        return "Ônibus freando";
    }
}