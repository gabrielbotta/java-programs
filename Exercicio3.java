import java.util.Scanner;
    public class Exercicio3{
        
       public static void main(String[] args){
            String nome;
            Scanner s = new Scanner(System.in);
            System.out.print("Informe o ano de nascimento: ");
            double nasc = s.nextDouble();
            System.out.print("Informe o nome: ");
            nome = s.next();
            System.out.print("Informe um ano futuro: ");
            double anof = s.nextDouble();
            double idadef = anof - nasc;
            System.out.println("Em "+ anof + ", "+ nome+ " terá "+ idadef+ " anos");
            
            }
}
