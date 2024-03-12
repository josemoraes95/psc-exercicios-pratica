//14.	Desenvolva um programa que, dados dois valores A e B, troque os valores de forma que A passe a ter o valor de B e vice-versa.
// Exiba os valores após a troca
import java.util.Scanner;
public class EX14 {
    public static void main(String[] args) {
        int valorA,valorB;
        Scanner scanner = new Scanner(System.in);
        System.out.println("TROQUE OS VALORES");
        System.out.print("Entre com o valor A: ");
        valorA = scanner.nextInt();
        System.out.print("Entre com o valor B: ");
        valorB = scanner.nextInt();

        System.out.printf("O valor de A = %d",valorB);
        System.out.printf("\nO valor de B = %d",valorA);

    }
}