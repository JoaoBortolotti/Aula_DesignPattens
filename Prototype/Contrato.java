package Prototype;

public class Contrato implements ContratoPrototype {
    private String tipo;
    private String nome;
    private String texto;
    private double valor;

    public Contrato(String tipo, String nome, String texto, double valor){
        this.tipo = tipo;
        this.nome = nome;
        this.texto = texto;
        this.valor = valor;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    @Override
    public ContratoPrototype clone(){
        return new Contrato(this.tipo, this.nome, this.texto, this.valor);
    }

    @Override
    public String toString(){
        return "Contrato{ " + "tipo= " + tipo + ", nome= " + nome + ", texto= " + texto + ", valor= " + valor + "}";
    }

}
