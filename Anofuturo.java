import java.util.Scanner;
    public class Anofuturo{
        
       public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            double ifa;
            System.out.print("Qual ano vc nasceu?: ");
            double a = s.nextDouble();
            System.out.print("Digite o ano futuro: ");
            double f = s.nextDouble();
            ifa = (f-a);
            
            
            System.out.println("Sua idade no ano de "+f+" sera: " + ifa + " anos ");
            }
}