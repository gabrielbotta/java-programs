import java.util.Scanner;
    public class Modelo{
        
       public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            System.out.print("Entre com o valor da cotacao do dolar: ");
            double cota = s.nextDouble();
            System.out.print("entre com o valor do dolar para efetuar o cambio: ");
            double troca = s.nextDouble();
            System.out.println("o valor da troca em reais é de: "+ (cota*troca));
            System.out.println("O valor da cotacao informado : "+ cota);
            }
}