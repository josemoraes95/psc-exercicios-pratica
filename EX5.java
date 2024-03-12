// 5.Crie um algoritmo que lê um valor real em dólar, e converte o valor para reais. Considere que a cotação é US$ 1 = R$ 4,95.

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    float real;
    float dolar;

        System.out.println("CONVERTE DOLAR EM REAL");
        System.out.print("Digite um valor em dolar: ");
        dolar = scanner.nextFloat();
        real = dolar / 4.95f;
        System.out.printf(" %.2f dolares equivalem a %.2f reais",dolar,real);
    }
}