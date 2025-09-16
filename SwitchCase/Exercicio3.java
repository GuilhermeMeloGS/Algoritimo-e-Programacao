//Aluno: Guilherme Melo Gonçalves dos Santos

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.println("Olá Usuário, digite o período que você estuda.");

        System.out.println("Matutino- M\nVerpertino - V\nNoturno - N");
        System.out.print("Digite uma letra (precisa ser em maiúscula: ");

        char periodo = ler.next().toUpperCase().charAt(0);

        switch (periodo){
            case 'M' :
                System.out.println("Tenha um bom dia!");
                break;
            case 'V':
                System.out.println("Tenha uma boa tarde");
                break;
            case 'N':
                System.out.println("Tenha uma boa noite");
            default:
                System.out.println("Período Inválido!");
        }
    }
}
