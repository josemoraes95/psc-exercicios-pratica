//Crie um algoritmo que leia o primeiro nome do usuário e escreva uma saudação para ele.
import java.util.Scanner;

public class EX3 {

    public static void main(String[] args) {
        String nome;
        Scanner scanner = new Scanner(System.in);

        System.out.println("LER E ESCREVER O NOME DO USUARIO COM UMA SAUDACAO");
        System.out.print("Digite seu primeiro nome: ");
        nome = scanner.next();

        System.out.printf("Saudaçoes %s espero que tenha um otimo dia!",nome);


    }
}