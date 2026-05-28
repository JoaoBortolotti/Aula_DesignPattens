package Strategy;

public class Sedex implements EnvioStrategy {
    @Override
    public double calcular(double peso){
        return peso * 0.75;
    }
}
