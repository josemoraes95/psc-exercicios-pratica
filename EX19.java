//19.Escreva um programa que calcule os quadrados e cubos dos números de 0 a 10 e imprima os valores resultantes em formato de tabela
import java.util.Scanner;
public class EX19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("TABELA!");
        System.out.println("NUMERO ---------- QUADRADO ---------- CUBO ");
        for (int num = 0; num<=10; num++){
            int quad = num * num;
            int cubo = num * num * num;
            System.out.printf("---%d ---------------- %d --------------- %d---\n",num,quad,cubo);
        }

    }
}