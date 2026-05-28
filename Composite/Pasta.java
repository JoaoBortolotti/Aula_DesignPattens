package Composite;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements ItensSistema {
    private String nome;
    private List<ItensSistema> itens = new ArrayList<>();

    public Pasta(String nome){
        this.nome = nome;
    }

    public void adicionarItem(ItensSistema item){
        itens.add(item);
    }

    @Override
    public void exibir(){
        System.out.println("Pasta: " + nome);

        for(ItensSistema item : itens){
            item.exibir();
        }
    }
}
