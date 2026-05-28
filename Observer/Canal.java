package Observer;

import java.util.ArrayList;
import java.util.List;


public class Canal implements Observavel {
    private String nome;
    private List<Observador> observadors = new ArrayList<>();

    public Canal(String nome){
        this.nome = nome; 
    }

    @Override
    public void adicionarObservador(Observador observador){
        observadors.add(observador);
    }

    @Override
    public void removerObservador(Observador observador){
        observadors.remove(observador);
    }

    @Override
    public void notificarObservadores(String mensagem){
        for(Observador observador : observadors){
            observador.envioEmail(mensagem);
        }
    }

    public void publicarVideo(String titulo){
        String mensagem = "O canal " + nome + " publicou o vídeo " + titulo;
        notificarObservadores(mensagem);
    }
}
