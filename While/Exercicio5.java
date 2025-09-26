public class Main{
    public static void main(String[] args){
        System.out.println("Tabuada do 5");
        
        int numero = 5;
        int multiplicador = 0;
        
        while (multiplicador <= 10){
            int resultado = numero * multiplicador;
            System.out.printf("%d X %d = %d\n",numero,multiplicador,resultado);
            multiplicador++;
        }
    }
}
