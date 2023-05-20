import java.util.Scanner;
import java.lang.Math;
    public class Exercicio5{
        
       public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            double pi = 3.14;
            System.out.print("Informe o raio do circulo: ");
            double raio = s.nextDouble();
            double area = pi*Math.pow(raio, 2);
            System.out.println("a area do circulo é: "+ area);
            
            }
}
