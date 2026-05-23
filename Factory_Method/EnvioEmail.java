package Factory_Method;

public class EnvioEmail implements IntNotificacao {
    @Override
    public void enviar(){
        System.out.println("Envio por Email!");
    }
}
