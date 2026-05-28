package Decorator;
public class Suco implements Bebida {
    @Override
    public double getPreco(){
        return 8.00;
    }

    @Override
    public String getDescricao(){
        return "Suco Simples";
    }
}
