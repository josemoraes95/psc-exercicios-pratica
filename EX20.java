//20.	Escrever um algoritmo que lê:
// - a porcentagem do IPI a ser acrescido no valor das peças - o código da peça 1, valor unitário da peça 1, quantidade de peças 1 -
// o código da peça 2, valor unitário da peça 2, quantidade de peças 2. O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
import java.util.Scanner;

public class EX20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        float cod1,val1,quant1,valT1;
        float cod2,val2,quant2,valT2;
        float ipi,ipiP,total,totalM;
        System.out.println("CALCULO DO IPI");
        System.out.print("Qual e a porcentagem do IPI: ");
        ipi = scanner.nextFloat();
        System.out.print("Qual o codigo da primeira peca: ");
        cod1 = scanner.nextFloat();
        System.out.print("Qual o valor da peca: ");
        val1 = scanner.nextFloat();
        System.out.print("Qual a quantidade de pecas: ");
        quant1 = scanner.nextFloat();
        System.out.print("Qual o codigo da segunda peca: ");
        cod2 = scanner.nextFloat();
        System.out.print("Qual o valor da peca: ");
        val2 = scanner.nextFloat();
        System.out.print("Qual  a quantidade de pecas: ");
        quant2 = scanner.nextFloat();
        valT1 = val1 * quant1;
        valT2 = val2 * quant2;
        ipiP = ipi/100;
        total = (valT1 + valT2) * ipiP;
        totalM = valT1 + valT2 + total;

        System.out.printf("O valor total do IPI a ser pago e de %.2f",total);
        System.out.printf("\nO valor total a ser pago e de %.2f",totalM);




    }
}