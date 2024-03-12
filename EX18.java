//18.	Cada degrau de uma escada tem X de altura.
// Faça um programa que receba essa altura e a altura que o usuário deseja alcançar subindo a escada,
// calcule e mostre quantos degraus ele deverá subir para atingir seu objetivo, sem se preocupar com a altura do usuário.
// Todas as medidas fornecidas devem estar em metros.

import java.util.Scanner;
public class EX18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float altD,altS,degrau;
        System.out.println("SUBINDO UMA ESCADA");
        System.out.print("Quanto mede cada degrau em metros: ");
        altD = scanner.nextFloat();
        System.out.print("Quantos metros ele quer subir: ");
        altS = scanner.nextFloat();
        degrau = altS/altD;
        System.out.printf("Ele deve subir %.1f para alcançar seu objetivo",degrau);

    }
}