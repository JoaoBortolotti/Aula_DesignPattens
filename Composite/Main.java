package Composite;

public class Main {
    public static void main(String[] args) {
        Pasta home = new Pasta("Home");
        Pasta documentos = new Pasta("Documentos");

        Arquivo foto = new Arquivo("Foto.png");
        Arquivo contrato = new Arquivo("Contrato.pdf");

        home.adicionarItem(documentos);
        home.adicionarItem(contrato);

        documentos.adicionarItem(foto);
        
        documentos.exibir();
    }
}
