import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Vamos falar a sequência");
        System.out.print("Digite um número inteiro: ");

        int numero = ler.nextInt();
        int sequencia = 1;

        while(sequencia <= numero){
            System.out.println(sequencia);
            sequencia = sequencia * 2;

        }
    }
}
