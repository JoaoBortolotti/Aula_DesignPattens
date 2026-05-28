package Strategy;

public class RetiradaLoja implements EnvioStrategy {

    @Override
    public double calcular(double peso){
        return peso * 0.0;
    }
}
