package Strategy;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido(200, new RetiradaLoja());

        System.out.println(pedido.calcularFrete());
    }
}
