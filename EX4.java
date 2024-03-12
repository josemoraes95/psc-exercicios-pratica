//Crie um algoritmo que solicite o nome, o endereço e o telefone do usuário e depois mostre os dados digitados.

import java.util.Scanner;


public class EX4 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String nome,cidade,estado,rua;
    int num,tel;

        System.out.println("DADOS DO USUARIO");
        System.out.print("Qual é o seu nome: ");
        nome = scanner.next();
        System.out.print("Qual o estado onde mora: ");
        estado = scanner.next();
        System.out.print("Qual a cidade onde mora: ");
        cidade = scanner.next();
        System.out.print("Qual a rua onde mora: ");
        rua = scanner.next();
        System.out.print("Qual é o numero da sua residencia: ");
        num = scanner.nextInt();
        System.out.print("Qual é o seu telefone: ");
        tel = scanner.nextInt();

        System.out.printf("Nome: %s \n",nome);
        System.out.printf("Estado: %s\n",estado);
        System.out.printf("Cidade: %s\n",cidade);
        System.out.printf("Rua: %s numero: %d \n",rua,num);
        System.out.printf("Telefone: " +tel);




    }
}