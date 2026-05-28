package Observer;

public class Main {
    public static void main(String[] args) {
        Canal canal = new Canal("UniFil");

        Observador joao = new Inscrito("João");
        Observador maria = new Inscrito("Maria");

        canal.adicionarObservador(joao);
        canal.adicionarObservador(maria);

        canal.publicarVideo("SOLID");

        canal.removerObservador(maria);

        canal.publicarVideo("Patterns");

    }
}
