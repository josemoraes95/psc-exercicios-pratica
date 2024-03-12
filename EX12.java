//12.Escreva um algoritmo para ler um valor e escrever o seu antecessor e o seu sucessor.
import java.util.Scanner;

public class EX12 {
    public static void main(String[] args) {
        int num,ant,suc;
        Scanner scanner = new Scanner (System.in);
        System.out.println("ANTECESSOR E SUCESSOR");
        System.out.print("Digite um numero: ");
        num = scanner.nextInt();
        ant = num - 1;
        suc = num + 1;
        System.out.printf("O antecessor de %d é %d",num,ant);
        System.out.printf("\nO sucessor de %d é %d",num,suc);
    }
}