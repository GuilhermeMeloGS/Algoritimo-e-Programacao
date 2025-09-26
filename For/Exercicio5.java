import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int alunosReprovados = 0, alunosExame = 0, alunosAprovados = 0;
        double mediaFinal = 0;

        for (int aluno = 1; aluno <= 6; aluno++) {
            System.out.printf("Calculo da Média do %dºAluno\n", aluno);

            System.out.print("Digite a primeira nota:");
            double nota = ler.nextDouble();
            System.out.print("Digite a segunda nota:");
            double nota2 = ler.nextDouble();

            double mediaAluno =  (nota + nota2) / 2;
            System.out.println("\nA média do aluno foi: " + mediaAluno);
            mediaFinal += mediaAluno;

            if(mediaAluno<= 3){
                System.out.println("O aluno foi reprovado\n");
                alunosReprovados++;
            }
            else if(mediaAluno < 7){
                System.out.println("O aluno está de exame\n");
                alunosExame++;
            }
            else {
                System.out.println("O aluno foi aprovado\n");
                alunosAprovados++;
            }
        }
        System.out.println("O total de alunos reprovados: " + alunosReprovados);
        System.out.println("O total de alunos de exame: " + alunosExame);
        System.out.println("O total de alunos aprovados: " + alunosAprovados);

        double mediaSala = (mediaFinal / 6);
        System.out.println("A Média final da sala é: " + mediaSala);
    }
}
