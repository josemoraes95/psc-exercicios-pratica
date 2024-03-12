//10.	Faça um programa que converta a temperatura dada em Fahrenheit para Celsius.
//  Para testar se a sua resposta está correta saiba que 100ºC = 212F. Considere C/5 = (F-32)/9
import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
    float tempF,tempC;
    Scanner scanner = new Scanner(System.in);
        System.out.println("CONVERTE TEMPERATURA");
        System.out.print("Digite a temperatura em fahrenheit usando somente numeros: ");
        tempF = scanner.nextFloat();
        tempC = (tempF - 32) / 1.8f;
        System.out.printf("%.2f graus fahrenheit equivale a %.2f graus celsius",tempF,tempC);

    }
}