package src.main.java;

public class TransporteCarro implements ITransporte {

    public String iniciar() {
        return "Carro acelerando";
    }

    public String parar() {
        return "Carro freando";
    }
}