//7.Crie um algoritmo que lê o salário de um funcionário, reajusta o salário em 7% e mostra o resultado.

import java.util.Scanner;

public class EX7 {

    public static void main(String[] args) {

        float salIn,valRea,salFn;
        Scanner scanner = new Scanner(System.in);

        System.out.println("REAJUSTE DE SALARIO");
        System.out.print("Qual salario atual: ");
        salIn = scanner.nextFloat();
        valRea = salIn * 0.07f;
        salFn = valRea + salIn;
        System.out.printf("O salario apos o reajuste é de %.2f",salFn);


    }
}