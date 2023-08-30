import java.util.Scanner;

public class exercise_4 {
    public static void main(String[] args) {
        int depreciation;

        System.out.print("Inserte el valor de compra: ");
        Scanner scanner = new Scanner(System.in);

        float purchaseValue = scanner.nextFloat();

        System.out.println("\n<= Calcular el valor de depreciacion =>");

        System.out.println(
                "1. Edificios\n" +
                "2. Maquinaria, muebles y enseres\n" +
                        "3. Vehiculos\n" +
                        "4. Computadores\n"
        );

        System.out.print("Ingrese la clase de articulo (1,2,3,4): ");

        Scanner scannerType = new Scanner(System.in);
        int articleType = scannerType.nextInt();

        switch (articleType) {
            case 1:
                depreciation = 20;
                break;
            case 2:
                depreciation = 10;
                break;
            case 3:
                depreciation = 5;
                break;
            case 4:
                depreciation = 3;
                break;
            default:
                throw new IllegalStateException("Insertaste un valor incorrecto: " + articleType);
        }

        float depreciationValue = purchaseValue/depreciation;
        System.out.println("El valor de depreciacion es: " + depreciationValue);

    }
}
