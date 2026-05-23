package Abstract_Factory;

public class FabricaMac implements Fabricas{
    @Override
    public Botao criarBotao(){
        return new BtnMac();
    }

    @Override
    public CaixaTexto criarCaixa(){
        return new CxtxMac();
    }
}
