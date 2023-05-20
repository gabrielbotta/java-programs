import java.util.Scanner;

public class Exercicio1 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double i = 0;
    for (i = 0; i < 10; i++) {
      System.out.print("Digite o valor: ");
      double valor = s.nextDouble();
      if (valor % 2 == 0) {
        System.out.println("o valor:" + valor + " é par");
        continue;
      }
    }

  }
}