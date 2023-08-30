import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class exercise_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        try {
            System.out.print("Inserte su nota final: ");
            double Nota = scanner.nextDouble();

            if (Nota <= 5.9) {
                System.out.println("Obtuviste una E");
            } else if (Nota <= 6.9) {
                System.out.println("Obtuviste una D");
            } else if (Nota <= 7.9) {
                System.out.println("Obtuviste una C");
            } else if (Nota <= 8.9) {
                System.out.println("Obtuviste una B");
            } else if (Nota <= 10.0) {
                System.out.println("Obtuviste una A");
            } else {
                System.out.println("Nota fuera de rango");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, ingrese un valor numérico válido.");
        }
    }
}
