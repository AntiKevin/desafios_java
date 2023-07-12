package desafio02;
import java.util.Scanner;

public class SepararNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valor = input.nextDouble();

        System.out.println("NOTAS:");
        int[] notas = {100, 50, 20, 10, 5, 2};
        for (int nota : notas) {
            int quantidadeNotas = (int) (valor / nota);
            System.out.printf("%d nota(s) de R$ %.2f%n", quantidadeNotas, (double) nota);
            valor %= nota;
        }

        System.out.println("MOEDAS:");
        double[] moedas = {1.0, 0.5, 0.25, 0.1, 0.05, 0.01};
        for (double moeda : moedas) {
            int quantidadeMoedas = (int) (valor / moeda);
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidadeMoedas, moeda);
            valor %= moeda;
        }
    }
}