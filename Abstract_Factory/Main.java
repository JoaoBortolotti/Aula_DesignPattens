package Abstract_Factory;

public class Main {
    public static void main(String[] args) {
        String tipo = "win";

        if(tipo.equals("mac")){
            Fabricas fabricaMac = new FabricaMac();

            Botao btnMac = fabricaMac.criarBotao();
            CaixaTexto cxtMac = fabricaMac.criarCaixa();

            btnMac.renderizar();
            cxtMac.renderizar();

        }else if(tipo.equals("win")){
            Fabricas fabricaWin = new FabricaWindows();

            Botao btnWin = fabricaWin.criarBotao();
            CaixaTexto cxtWin = fabricaWin.criarCaixa();

            btnWin.renderizar();
            cxtWin.renderizar();
        }
    }
}
