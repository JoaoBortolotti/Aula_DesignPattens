package Factory_Method;

public class EnvioSMS implements IntNotificacao {
    @Override
    public void enviar(){
        System.out.println("Envio por SMS!");
    }
}
