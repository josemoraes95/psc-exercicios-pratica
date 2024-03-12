//15.Construa um programa que calcule as raízes de uma equação de 2º grau (Ax2+Bx+C).
//Sendo que os valores A,B e C são fornecidos pelo usuário. Considere que tem duas raízes.
// bhaskara x= b²-4.a.c / x = (-b ± √Δ) / (2a)
import java.util.Scanner;

public class EX15 {
    public static void main(String[] args) {
    double numA,numB,numC,res,delta,x1,x2;
    Scanner scanner = new Scanner(System.in);
        System.out.println("EQUAÇÃO DE 2 GRAU");
        System.out.print("Digite o numero A: ");
        numA = scanner.nextDouble();
        System.out.print("Digite o numero B: ");
        numB = scanner.nextDouble();
        System.out.print("Digite o numero C: ");
        numC = scanner.nextDouble();

        delta = (numB * numB) - 4*numA * numC;

        if (delta < 0){
            System.out.print("A equaçao nao possui raizes reais.");
        }
        else{
            x1 = (-numB + Math.sqrt (delta)) / (2*numA);
            x2 = (-numB - Math.sqrt (delta)) / (2*numA);

            System.out.printf("As raizes da equaçao sao x1= %f e x2= %f ",x1,x2);

        }








    }
}