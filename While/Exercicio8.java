import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Vamos calcular a média de 10 alunos");
        int contador = 1;
        int nota1 = 0;
        int nota2 = 0;

        while (contador <= 5) {
            System.out.printf("%dº aluno\n",contador);
            do {
                System.out.print("Digite a 1º nota: ");
                nota1 = ler.nextInt();
                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("Digite uma nota entre 0 e 10");
                }
            } while (nota1 < 0 || nota1 > 10);
            do {
                System.out.print("Digite a 2º nota: ");
                nota2 = ler.nextInt();
                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Digite uma nota entre 0 e 10");
                }
            } while (nota2 < 0 || nota2 > 10);

        double media = (nota1 + nota2) / 2;
        System.out.printf("A média do %dº aluno é: %.2f\n", contador, media);
        contador++;
        }
    }
}
