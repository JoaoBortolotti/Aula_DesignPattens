package Strategy;

public class Pac implements EnvioStrategy{
    @Override
    public double calcular(double peso){
        return peso * 0.35;
    }
}
