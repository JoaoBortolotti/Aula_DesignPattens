package Adapter;

public class Main {
    public static void main(String[] args) {
        Pagamentos pagamentoCartao = new CartaoPagamento();
        pagamentoCartao.pagar(100.00);

        PixAPIExterno pixApi = new PixAPIExterno();
        Pagamentos pagamentoPix = new PixAdapter(pixApi);

        pagamentoPix.pagar(100.00);
    }
}
