//11.	Crie um programa que calcula a média simples de três notas fornecidas pelo usuário.
import java.util.Scanner;
public class EX11 {
    public static void main(String[] args) {
        float nota1,nota2,nota3,mediaNotas;
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULA A MEDIA DE TRES NOTAS");
        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextFloat();
        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextFloat();
        System.out.print("Digite a terceira nota: ");
        nota3 = scanner.nextFloat();

        mediaNotas = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A media das notas foi %.2f",mediaNotas);
    }
}