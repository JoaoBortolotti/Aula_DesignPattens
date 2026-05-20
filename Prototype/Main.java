package Prototype;

public class Main {
    public static void main(String[] args) {
        Contrato contrato = new Contrato(
            "CTL",
            "Pessoa Padrão", 
            "Prestação de Serviços", 
            15000
        );

        Contrato contratoJoao = (Contrato) contrato.clone();
        contratoJoao.setNome("João");

        Contrato contratoMaria = (Contrato) contratoJoao.clone();
        contratoMaria.setNome("Maria");
        contratoMaria.setValor(20000);


        System.out.println(contrato);
        System.out.println(contratoJoao);
        System.out.println(contratoMaria);
    
    }
}
