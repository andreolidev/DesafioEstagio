import java.util.Scanner;

public class VerificaLetraA {

    // Função que conta as ocorrências da letra 'a' ou 'A'
    public static int contarOcorrenciasA(String str) {
        int count = 0;
        // Converte a string para minúsculas e percorre os caracteres
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma string:");
        String input = scanner.nextLine();

        int ocorrencias = contarOcorrenciasA(input);

        if (ocorrencias > 0) {
            System.out.println("A letra 'a' aparece " + ocorrencias + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }

        scanner.close();
    }
}