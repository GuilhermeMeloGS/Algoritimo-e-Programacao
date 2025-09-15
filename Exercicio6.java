import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("BEM VINDO A LANCHONETE COMA BEM\n");
        System.out.println("----------- CARDÁPIO -----------");
        System.out.println("--------------------------------");
        System.out.println("CODIGO   PRODUTO           PREÇO");
        System.out.println("--------------------------------");
        System.out.println("100      Cachorro-Quente  R$ 1,20");
        System.out.println("101      Bauru Simples    R$ 1,30");
        System.out.println("102      Bauro com Ovo    R$ 1,50");
        System.out.println("103      Hambúguer        R$ 1,20");
        System.out.println("104      Cheeseburguer    R$ 1,30");
        System.out.println("105      Refrigerante     R$ 1,00");
        System.out.println("--------------------------------");

        System.out.print("\nEscolha uma das opções que deseja comprar (Digite o código): ");
        int opcao = ler.nextInt();
        System.out.print("Agora digite a quantidade que você irá querer desse produto: ");
        int quantidade = ler.nextInt();

        switch (opcao) {

            case 100:
                double cachorroQuente = 1.20;
                double precoFinalCachorroQuente = quantidade * cachorroQuente;
                System.out.println("\nVocê deseja comprar o Cachorro-Quente!");
                System.out.printf("Como você quer comprar %d itens, o valor dará %.2f", quantidade, precoFinalCachorroQuente);
                break;

            case 101:
                double bauruSimples = 1.30;
                double precoFinalBauruSim = quantidade * bauruSimples;
                System.out.println("\nVocê deseja comprar o Bauru Simples");
                System.out.printf("Como você quer comprar %d itens, o valor dará %.2f", quantidade, precoFinalBauruSim);
                break;

            case 102:
                double bauruComOvo = 1.50;
                double precoFinalBauruComOvo = quantidade * bauruComOvo;
                System.out.println("\nVocê deseja comprar o Bauru com Ovo");
                System.out.printf("Como você quer comprar %d itens, o valor dará %.2f", quantidade, precoFinalBauruComOvo);
                break;

            case 103:
                double hamburguer = 1.20;
                double precoFinalHamburguer = quantidade * hamburguer;
                System.out.println("\nVocê deseja comprar o Hamburguer");
                System.out.printf("Como você quer comprar %d itens, o valor dará %.2f",quantidade, precoFinalHamburguer);
                break;

            case 104:
                double cheeseburguer = 1.30;
                double precoFinalCheeseburguer = quantidade * cheeseburguer;
                System.out.println("\nVocê deseja comprar o Cheeseburguer");
                System.out.printf("Como você quer comprar %d itens, o valor dará %.2f",quantidade, precoFinalCheeseburguer);
                break;

            case 105:
                double refrigerante = 1.00;
                double precoFinalRefrigerante = quantidade * refrigerante;
                System.out.println("\nVocê deseja comprar o Refrigerante");
                System.out.printf("Como você quer comprar %d itens, o valor dará %.2f",quantidade, precoFinalRefrigerante);
        }
    }
}
