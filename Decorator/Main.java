package Decorator;
public class Main {
    public static void main(String[] args) {
        Bebida cafe = new CafeSimples();
        System.out.println(cafe.getDescricao());
        System.out.println(cafe.getPreco());


        cafe = new Leite(cafe);

        System.out.println(cafe.getDescricao());
        System.out.println(cafe.getPreco());


    }
}
