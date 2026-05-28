package Observer;

public class Inscrito implements Observador {
    private String nome;

    public Inscrito(String nome){
        this.nome = nome;
    }

    @Override
    public void envioEmail(String mensagem){
        System.out.println(nome + " recebeu notificacao: " + mensagem);
    }
}
