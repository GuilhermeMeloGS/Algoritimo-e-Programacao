//Aluno: Guilherme Melo Gonçalves dos Santos

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.println("Olá Usuário, vamos calcular.");

        System.out.print("Digite um número: ");
        double num1 = ler.nextDouble();
        System.out.print("Digite outro número: ");
        double num2 = ler.nextDouble();

        System.out.println("Agora, escolha qual conta deseja realizar");
        System.out.println("Média entre os números digitados - M\nDiferença do maior pelo menor - S\nProduto entre os números digitados - P\nDivisão do primeiro pelo segundo - D");
        System.out.print("Digite a opção do menu: ");
        char opcao = ler.next().toUpperCase().charAt(0);

        switch (opcao){
            case 'M':
                double media = (num1+num2)/2;
                System.out.printf("\nA média dos números digitados é %.2f",media);
                break;

            case 'S':
                if(num1>=num2){
                    double subtracao = num1-num2;
                    System.out.printf("\nO resultado da subtração é %.2f",subtracao);
                }
                else {
                    double subtracao = num2-num1;
                    System.out.printf("\nO resultado da subtração é %.2f",subtracao);
                }
                break;

            case 'P':
                double produto = num1*num2;
                System.out.printf("\nO resultado da multiplicação é %.2f", produto);
                break;

            case 'D':
                if(num2!=0){
                    double divisao = num1/num2;
                    System.out.printf("\nO resultado da divisão é %.2f", divisao);
                }
                else {
                    System.out.println("\nDivisão inválida, impossível dividir um número por zero");
                }
                break;

            default:
                System.out.println("\nOpção inválida");
        }
    }
}
