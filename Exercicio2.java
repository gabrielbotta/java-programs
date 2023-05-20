import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Informe o valor 1: ");
        double v1 = s.nextDouble();
        System.out.print("Informe o valor 2: ");
        double v2 = s.nextDouble();
        System.out.println("A média é: " + (v1 + v2) / 2);
    }
}