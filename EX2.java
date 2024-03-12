import java.util.Scanner;

public class EX2 {

    public static void main(String[] args) {
        int num1,num2;
        float resto;

        Scanner scanner = new Scanner(System.in);

        System.out.print("CALCULA RESTO DIVISÃO");
        System.out.print("Digite o primeiro numero: ");
        num1 = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        num2 = scanner.nextInt();

        resto = num1 % num2;
        System.out.print("O resto da divisão e igual a: " + resto);
    }
}