//17.Faça um programa para o seguinte problema:
// Compraram-se N canetas iguais, que foram pagas com uma nota de Z reais, obtendo-se Y reais como troco.
// Quanto custou cada caneta?

import java.util.Scanner;
public class EX17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int canetas;
        float pagoZ,trocoY,custo;

        System.out.println("TROCO DAS CANETAS");
        System.out.print("Quantas canetas foram compradas: ");
        canetas = scanner.nextInt();
        System.out.print("Quanto ele deu de dinheiro: ");
        pagoZ = scanner.nextFloat();
        System.out.print("Quanto foi o troco: ");
        trocoY = scanner.nextFloat();
        custo = (pagoZ - trocoY) / canetas;
        System.out.printf("O custo de cada caneta foi de %.2f",custo);

    }
}