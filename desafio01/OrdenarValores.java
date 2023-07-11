import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenarValores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o número de linhas de entrada
        System.out.println("Quantos numeros terá sua lista?");
        int n = scanner.nextInt();

        // Lista para armazenar os valores pares
        List<Integer> pares = new ArrayList<>();

        // Lista para armazenar os valores ímpares
        List<Integer> impares = new ArrayList<>();

        System.out.println("seus numeros");
        // Lê os valores de entrada
        for (int i = 0; i < n; i++) {
            int valor = scanner.nextInt();
            if (valor % 2 == 0) {
                // Valor par
                pares.add(valor);
            } else {
                // Valor ímpar
                impares.add(valor);
            }
        }

        // Ordena os valores pares em ordem crescente
        Collections.sort(pares);

        // Ordena os valores ímpares em ordem decrescente
        Collections.sort(impares, Collections.reverseOrder());

        System.out.println("seus numeros ordenados");
        // Imprime os valores pares
        for (int valor : pares) {
            System.out.println(valor);
        }

        // Imprime os valores ímpares
        for (int valor : impares) {
            System.out.println(valor);
        }
    }
}
