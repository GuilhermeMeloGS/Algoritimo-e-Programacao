import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idadeMais50 = 0, idadeEntre10e20 = 0, pesoMenos40 = 0;
        double somaAltura = 0;

        for (int pessoas = 1; pessoas <= 10 ; pessoas++) {
            System.out.printf("Digite a idade da %dº pessoa ", pessoas);
            int idade = ler.nextInt();
            System.out.printf("Digite a altura da %dº pessoa(centimetros) ", pessoas);
            double altura = ler.nextDouble();
            System.out.printf("Digite o peso da %dº pessoa ", pessoas);
            double peso = ler.nextInt();

            if(idade >50){
                idadeMais50++;
            }
            if(idade>=10 && idade<=20){
                somaAltura += altura;
                idadeEntre10e20++;
            }
            if (peso<40){
                pesoMenos40++;
            }
        }
        System.out.println("A Quantidade de pessoas com mais de 50 anos é: " + idadeMais50);
        double mediaAltura = somaAltura/ idadeEntre10e20;
        System.out.println("A Média da altura das pessoas entre 10 e 20 anos é: " + mediaAltura);
        System.out.printf("O Percentual de pessoas com menos de 40 quilos é: %d%%", (pesoMenos40/0.1));
    }
}
