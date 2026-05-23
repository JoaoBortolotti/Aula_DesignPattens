package Factory_Method;

public class Main {
    public static void main(String[] args) {
        IntNotificacao notificacao = new FabricaNotificacoes()
            .criarNotificacao("sms");
        notificacao.enviar();
    }
}
