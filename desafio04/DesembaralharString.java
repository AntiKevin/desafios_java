package desafio04;
import java.util.Scanner;

public class DesembaralharString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int casosTeste = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o número de casos de teste
        
        for (int i = 0; i < casosTeste; i++) {
            String linha = scanner.nextLine();
            String linhaDecifrada = decifrarLinha(linha);
            System.out.println(linhaDecifrada);
        }
        
        scanner.close();
    }
    
    private static String decifrarLinha(String linha) {
        int tamanho = linha.length();
        int metade = tamanho / 2;
        StringBuilder sb = new StringBuilder(tamanho);
        
        for (int i = 0; i < metade; i++) {
            sb.append(linha.charAt(metade - 1 - i));
        }
        
        for (int i = metade; i < tamanho; i++) {
            sb.append(linha.charAt(tamanho - 1 - i + metade));
        }
        
        return sb.toString();
    }
}
