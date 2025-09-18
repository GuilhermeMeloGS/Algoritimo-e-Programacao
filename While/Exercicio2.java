import java.util.Scanner;

public class Main{
    public static void main (String []args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Vamos falar quais números pares e quais são impares");
        int resto;
        int contador = 0;
        int numPar = 0;
        int numImpar = 0;

        while (contador<10){
            System.out.println("Digite o " + (contador+1) + "º número");
            int numero = ler.nextInt();
            resto = numero % 2;
            if (resto==0){
                System.out.printf("O número %d é par\n",numero);
                numPar++;
            }
            else{
                System.out.printf("O número %d é impar\n",numero);
                numImpar++;
            }
            contador++;
        }
        System.out.println("\nQuantidade de números pares: " + numPar);
        System.out.println("\nQuantidade de números impares: " + numImpar);
    }
}
