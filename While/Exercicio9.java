import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int codigo = 0;
        double valorCachorroQuente = 0;
        double valorBauruSimples = 0;
        double valorBauruOvo = 0;
        double valorHamburguer = 0;
        double valorCheeseburguer = 0;
        double valorRefrigerante = 0;
        double valorFinal = 0;

        do {
            System.out.println("      CARDÁPIO LANCHONETE");
            System.out.println("=================================");
            System.out.println("CÓDIGO       PRODUTO       PREÇO");
            System.out.println(" 100     Cachorro Quente   1,20");
            System.out.println(" 101     Bauru Simples     1,30");
            System.out.println(" 102     Bauru com Ovo     1,50");
            System.out.println(" 103     Hambúrguer        1,20");
            System.out.println(" 104     Cheeseburguer     1,30");
            System.out.println(" 105     Refrigerante      1,00");
            System.out.println("=================================");
            System.out.println(" 106     Finalizar pedido");

            System.out.print("\nDigite o código do produto que deseja: ");
            codigo = ler.nextInt();

            if (codigo == 100) {
                System.out.print("Digite a quantidade de cachorros-quente: ");
                int quantidade = ler.nextInt();
                valorCachorroQuente += quantidade * 1.2;
            } else if (codigo == 101) {
                System.out.print("Digite a quantidade de baurus simples: ");
                int quantidade = ler.nextInt();
                valorBauruSimples += quantidade * 1.3;
            } else if (codigo == 102) {
                System.out.print("Digite a quantidade de baurus com ovo: ");
                int quantidade = ler.nextInt();
                valorBauruOvo += quantidade * 1.5;
            } else if (codigo == 103) {
                System.out.print("Digite a quantidade de hambúrgueres: ");
                int quantidade = ler.nextInt();
                valorHamburguer += quantidade * 1.2;
            } else if (codigo == 104) {
                System.out.print("Digite a quantidade de cheeseburgueres: ");
                int quantidade = ler.nextInt();
                valorCheeseburguer += quantidade * 1.3;
            } else if (codigo == 105) {
                System.out.print("Digite a quantidade de refrigerantes: ");
                int quantidade = ler.nextInt();
                valorRefrigerante += quantidade * 1.0;
            } else if (codigo != 106) {
                System.out.println("Código inválido! Tente novamente.");
            }

            valorFinal = valorCachorroQuente + valorBauruSimples + valorBauruOvo
                       + valorHamburguer + valorCheeseburguer + valorRefrigerante;

        } while (codigo != 106);

        if (valorCachorroQuente > 0) {
            System.out.println("O valor total do Cachorro Quente foi R$ " + valorCachorroQuente);
        }
        if (valorBauruSimples > 0) {
            System.out.println("O valor total do Bauru Simples foi R$ " + valorBauruSimples);
        }
        if (valorBauruOvo > 0) {
            System.out.println("O valor total do Bauru com Ovo foi R$ " + valorBauruOvo);
        }
        if (valorHamburguer > 0) {
            System.out.println("O valor total do Hambúrguer foi R$ " + valorHamburguer);
        }
        if (valorCheeseburguer > 0) {
            System.out.println("O valor total do Cheeseburguer foi R$ " + valorCheeseburguer);
        }
        if (valorRefrigerante > 0) {
            System.out.println("O valor total do Refrigerante foi R$ " + valorRefrigerante);
        }

        System.out.printf("O valor total da compra foi R$ %.2f\n", valorFinal);

        ler.close();
    }
}
