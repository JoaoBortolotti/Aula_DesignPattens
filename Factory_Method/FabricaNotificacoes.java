package Factory_Method;

public class FabricaNotificacoes {
    public IntNotificacao criarNotificacao(String tipo){
        if(tipo.equalsIgnoreCase("email")){
            return new EnvioEmail();
        }else if (tipo.equalsIgnoreCase("sms")){
            return new EnvioSMS();
        }

        throw new IllegalArgumentException("Tipo Notificação Inválida");
    }
}
