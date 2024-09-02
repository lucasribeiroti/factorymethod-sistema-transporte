package src.main.java;
public class TransporteAviao implements ITransporte {

    public String iniciar() {
        return "Avião decolando";
    }

    public String parar() {
        return "Avião aterrisando";
    }
}
