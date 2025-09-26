import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int votoJoao = 0, votoMaria = 0, votoFelipe = 0, votoMarcia = 0, votoNulo = 0, votoBranco = 0;

        for (int pessoas = 1; pessoas <= 10 ; pessoas++) {
            System.out.println("VOTAÇÃO PRESIDENCIAL");
            System.out.println("1 - João Silva");
            System.out.println("2 - Maria Santos");
            System.out.println("3 - Felipe Pereira");
            System.out.println("4 - Marcia Souza");
            System.out.println("5 - Voto Nulo");
            System.out.println("6 - Voto Branco");
            System.out.printf("\nDigite o voto da %dª pessoa: ",pessoas);
            int voto = ler.nextInt();

            if (voto == 1){
                votoJoao++;
            }
            else if (voto == 2){
                votoMaria++;
            }
            else if (voto == 3){
                votoFelipe++;
            }
            else if (voto == 4){
                votoMarcia++;
            }
            else if (voto == 5){
                votoNulo++;
            }
            else if (voto == 6){
                votoBranco++;
            }
            else {
                System.out.println("Voto Inválido");
                pessoas--;
            }
        }
        System.out.println("\nVOTAÇÃO ENCERRADA\n");
        System.out.println("Votos do candidato João Silva: " + votoJoao);
        System.out.println("Votos da candidata Maria Santos: " + votoMaria);
        System.out.println("Votos do candidato Felipe Pereira: " + votoFelipe);
        System.out.println("Votos da candidata Marcia Souza: " + votoMarcia);
        System.out.println("Votos Nulos: " + votoNulo);
        System.out.println("Votos Brancos: " + votoBranco);
        double percentualNuloBranco = ((votoBranco + votoNulo)/0.10);
        System.out.printf("Percentual de Votos Brancos/Nulos: %.2f%%",percentualNuloBranco);
    }
}
