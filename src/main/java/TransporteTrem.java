package src.main.java;

public class TransporteTrem implements ITransporte {

    public String iniciar() {
        return "Trem acelerando";
    }

    public String parar() {
        return "Trem freando";
    }
}