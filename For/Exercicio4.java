import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Vamos calcular!");
        int pessoasMais50 = 0;
        double alturaMais50 = 0;
        for(int contador = 1; contador <= 10; contador++){
            System.out.printf("Digite a idade da %dº pessoa",contador);
            int idade = ler.nextInt();
            System.out.print("Digite a altura dessa pessoa em centímetros");
            double altura = ler.nextDouble();

            if (idade>=50){
                alturaMais50 += altura;
                pessoasMais50++;
            }
        }
        double media = ((alturaMais50/pessoasMais50)/100);
        System.out.printf("A média de altura de pessoas + 50 anos é %.2f metros",media);
    }
}
