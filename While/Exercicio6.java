import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Olá, vamos ver qual é o menor número dos 10 números que você digitar");
        
        int contador = 1;
        int numeroMaior = 0;

        while(contador<=10) {
            System.out.print("Digite o " +contador + "º numero: ");
            int numero = ler.nextInt();

            if(numero>numeroMaior){
                numeroMaior = numero;
            }
            contador++;
        }
        System.out.println("O maior número é " +numeroMaior);
    }
}
