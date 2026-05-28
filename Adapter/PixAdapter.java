package Adapter;

public class PixAdapter implements Pagamentos {
    private PixAPIExterno pixApi;

    public PixAdapter(PixAPIExterno pixApi){
        this.pixApi = pixApi;
    }

    @Override
    public void pagar(double valor){

        valor = valor*5.20;
        pixApi.pagarComPix(valor);
    }
}
