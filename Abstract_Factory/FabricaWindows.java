package Abstract_Factory;

public class FabricaWindows implements Fabricas {
    @Override
    public Botao criarBotao(){
        return new BtnWin();
    }

    @Override
    public CaixaTexto criarCaixa(){
        return new CxtxWin();
    }
}
