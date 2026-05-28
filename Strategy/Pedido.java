package Strategy;

public class Pedido {
    private double peso;
    private EnvioStrategy tipoEnvio;
    
    public Pedido(double peso, EnvioStrategy tipoEnvio){
        this.peso = peso;
        this.tipoEnvio = tipoEnvio;
    }

    public double calcularFrete(){
        return tipoEnvio.calcular(peso);
    }
}
