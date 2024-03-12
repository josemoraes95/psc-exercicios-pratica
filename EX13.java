//13.Escreva um programa que calcula o salário líquido de um funcionário.
//O programa deve solicitar o valor da hora de trabalho, o número de horas trabalhadas no mês e o percentual de desconto do INSS.

import java.util.Scanner;
public class EX13 {
    public static void main(String[] args) {
    float valorH,horasT,INSS,perINSS,salario;
    Scanner scanner = new Scanner(System.in);
        System.out.println("SALARIO DE UM FUNCIONARIO");
        System.out.print("Qual o valor da hora de trabalho do funcionario: ");
        valorH = scanner.nextFloat();
        System.out.print("Quantas horas o de trabalho o funcionario exerce por mes: ");
        horasT = scanner.nextFloat();
        System.out.print("Qual e o percentual de desconto do em numeros: ");
        INSS = scanner.nextFloat();
        perINSS = INSS / 100;
        salario = (valorH * horasT) - (valorH * horasT * perINSS);

        System.out.printf("O salario do funcionario sera de: %.2f",salario);




    }
}