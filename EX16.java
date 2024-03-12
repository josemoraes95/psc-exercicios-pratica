//16.Faça um programa que receba de entrada a distância total (em km) percorrida por um automóvel
// e a quantidade de combustível (em litros) consumida para percorrê-la,
// calcule e imprima o consumo médio de combustível. Fórmula: distância/litro.
import java.util.Scanner;
public class EX16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float dist,comb,media;
        System.out.println("DISTANCIA X COMBUSTIVEL");

        System.out.print("Qual foi a distancia percorrida: ");
        dist = scanner.nextFloat();
        System.out.print("Quanto de combustivel foi consumido: ");
        comb = scanner.nextFloat();

        media = dist/comb;

        System.out.printf("A media de combustivel consumida foi %.3f litros por km",media);
    }
}