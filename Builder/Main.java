package Builder;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new PedidoBuilder()
            .build();

        System.out.println(pedido);

    }
}
