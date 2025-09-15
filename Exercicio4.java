//Aluno: Guilherme Melo Gonçalves dos Santos

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.println("Olá Usuário, vamos calcular o seu aumento.");
        System.out.println("Primeiramente digite o seu plano de trabalho");
        System.out.println("Plano A\nPlano B\nPlano C");

        System.out.print("Digite a leta do plano: ");
        char plano = ler.next().toUpperCase().charAt(0);
        System.out.print("Agora digite o seu salário atual -> R$ ");
        double salarioAtual = ler.nextDouble();

        switch (plano) {
            case 'A':
                double salarioNovoA = salarioAtual + (salarioAtual*0.10);
                System.out.printf("Você recebeu um aumento de 10 por cento, o seu novo salário é R$ %.2f",salarioNovoA);
                break;
            case 'B':
                double salarioNovoB = salarioAtual + (salarioAtual*0.15);
                System.out.printf("Você recebeu um aumento de 15 por cento, o seu novo salário é R$ %.2f",salarioNovoB);
                break;
            case 'C':
                double salarioNovoC = salarioAtual + (salarioAtual*0.20);
                System.out.printf("Você recebeu um aumento de 20 por cento, o seu novo salário é R$ %.2f",salarioNovoC);
                break;
            default:
                System.out.println("Plano Inválio, sem aumento para você...");
        }
    }
}
