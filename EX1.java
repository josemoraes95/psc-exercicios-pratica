//Exercicio 1
//1.Crie um programa que solicita ao usuário dois números e, em seguida, mostra a soma desses números.

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        int num1,num2,soma;
        Scanner scanner = new Scanner(System.in);

        System.out.print("DIGITE NUMEROS\n");
        System.out.print("Digite o primeiro numero: ");
        num1 = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        num2 = scanner.nextInt();

        soma = num1 + num2;

        System.out.printf ("A soma dos numeros e: " + soma);


    }

}