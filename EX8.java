//8.Escreva um programa que converte uma quantidade de metros para centímetros.
import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        float met,cm;
        Scanner scanner = new Scanner(System.in);

        System.out.println("CONVERTE METROS PARA CENTIMETROS");
        System.out.print("Quantos metros voce quer converter para centimetros: ");
        met = scanner.nextFloat();

        cm = met * 100f;

        System.out.printf("%.2f metros equivalem a %.2f centimetros",met,cm);


    }
}