import java.util.Scanner;
    public class Exercicio6{
       public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            double cont=0;
            double soma=0;
            double num=1;
            while(num!=0){
               System.out.print("digite um numero: ");
               num = s.nextDouble();
               cont = cont+1;
               soma = soma+num;
            }
               System.out.println("Foram digitados: "+cont+ " numeros");
               System.out.println("A soma dos numeros digitados é: "+soma);

            
      }
}
