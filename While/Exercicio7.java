import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Calculadora de IMC - 10 pessoas");
        int contador = 1;

        int IMCAbaixo = 0;
        int IMCNormal = 0;
        int IMCAlto = 0;

        while(contador <= 10){

            System.out.printf("Digite a altura da %dº pessoa (em centímetros): ",contador);
            double altura = ler.nextDouble();
            System.out.printf("Agora digete o peso da %dº pessoa: ",contador);
            double peso = ler.nextDouble();

            //Precisa fazer a conversão de cm^2 para m^2 e para isso precisa dividir por 10000
            double IMC = (peso)/((altura*altura)/10000);

            if (IMC<18.5){
                IMCAbaixo++;
            }
            else if (IMC>=18.5 && IMC<24.9){
                IMCNormal++;
            }
            else {
                IMCAlto++;
            }
            contador++;
        }
        System.out.println("Quantidade de pessoas com IMC Abaixo: "+IMCAbaixo);
        System.out.println("Quantidade de pessoas com IMC Normal: "+IMCNormal);
        System.out.println("Quantidade de pessoas com IMC Alto: "+IMCAlto);
    }
}
