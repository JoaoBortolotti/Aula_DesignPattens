package Adapter;

public class CartaoPagamento implements Pagamentos {
    @Override
    public void pagar(double valor){
        System.out.println("Pago com Cartão: " + valor);
    }
}
