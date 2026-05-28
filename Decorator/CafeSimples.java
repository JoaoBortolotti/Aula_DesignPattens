package Decorator;
public class CafeSimples implements Bebida {

    @Override
    public double getPreco(){
        return 2.50;
    }

    @Override
    public String getDescricao(){
        return "Café Simples";
    }

}
