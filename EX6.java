//6.Crie um algoritmo que leia a idade de uma pessoa e calcule quantos dias essa pessoa já viveu.
import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
    int idade,diasVida;
        Scanner scanner = new Scanner(System.in);

        System.out.println("QUANTOS DIAS UMA PESSOA JA VIVEU");
        System.out.print("Qual é a sua idade: ");
        idade = scanner.nextInt();

        diasVida = idade * 365;

        System.out.printf("Voce já viveu aproximadamente %d dias",diasVida);
    }
}