package Decorator;
public class Leite extends BebidaDecorator {
    public Leite(Bebida bebida){
        super(bebida);
    }

    @Override
    public double getPreco(){
        return bebida.getPreco() + 0.50;
    }

    @Override
    public String getDescricao(){
        return bebida.getDescricao() + " + Adicional de leite";
    }
}
