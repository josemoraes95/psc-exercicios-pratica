//9.Desenvolva um programa que calcula a área de um círculo, onde o raio é fornecido pelo usuário.

import java.util.Scanner;
public class EX9 {

    public static void main(String[] args) {
    float raio,area;
        Scanner scanner = new Scanner(System.in);

        System.out.println("AREA DE UM CIRCULO");
        System.out.print("Qual o raio do circulo: ");
        raio = scanner.nextFloat();
        area = (raio * raio) * 3.14159f;
        System.out.printf("A area do circulo é igual a %f",area);

    }
}