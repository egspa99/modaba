package modaba;
import java.util.Scanner;

public class ModabaPrueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el número "n"
        System.out.print("Ingrese un número para 'y modaba': ");
        try {
            int n = scanner.nextInt();
            if (n < 0) {
                throw new IllegalArgumentException("Ingrese un número no negativo.");
            }
            generarModaba(n);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + ". Por favor, ingrese un número válido.");
        } finally {
            scanner.close();
        }
    }

    static void generarModaba(int n) {
        String palabra = "y modaba";
        for (int i = 1; i <= n; i++) {
            String resultado = palabra + "a".repeat(i);
            System.out.println(resultado);
        }
    }
}
