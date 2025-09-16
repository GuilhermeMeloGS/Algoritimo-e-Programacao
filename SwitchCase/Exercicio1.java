//Aluno: Guilherme Melo Gonçalves dos Santos

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Olá Usuário, você irá um número e iremos dar o dia da semana que corresponde.");
        
        System.out.print("Digite um número: ");
        int num = ler.nextInt();

        switch (num) {
            case 1:
                System.out.println("O número 1 corresponde ao domingo");
                break;
            case 2:
                System.out.println("O número 2 corresponde a segunda-feira");
                break;
            case 3:
                System.out.println("O número 3 corresponde a terça-feira");
                break;
            case 4:
                System.out.println("O número 4 corresponde ao quarta-feira");
                break;
            case 5:
                System.out.println("O número 5 corresponde a quinta-feira");
                break;
            case 6:
                System.out.println("O número 6 corresponde a sexta-feira");
                break;
            case 7:
                System.out.println("O número 7 corresponde a sábado");
                break;
            default:
                System.out.println("Número inválido");
        }
    }
}
