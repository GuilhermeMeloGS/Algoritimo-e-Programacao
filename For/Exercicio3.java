import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = ler.nextInt();
        System.out.print("Sequência: ");
        for (int minimo = 1; minimo <=numero; minimo ++){
            System.out.print(minimo + " ");
        }
    }
}
