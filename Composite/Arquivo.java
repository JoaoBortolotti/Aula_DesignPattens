package Composite;

public class Arquivo implements ItensSistema {
    private String nome;

    public Arquivo(String nome){
        this.nome = nome;
    }

    @Override
    public void exibir(){
        System.out.println("Item: " + nome);
    }
}
