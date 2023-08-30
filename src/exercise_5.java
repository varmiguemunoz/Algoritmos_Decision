import java.util.Scanner;

public class exercise_5 {
    public static void main(String[] args) {
        System.out.print("Ingrese el valor de la venta: ");
        Scanner scanner = new Scanner(System.in);

        float purchaseValue = scanner.nextFloat();
        float commission;
        float totalStock;

        if(purchaseValue <= 10000000){
            commission = purchaseValue * 0.02F;
        } else if (purchaseValue <= 15000000) {
            commission = purchaseValue * 0.04F;
        } else {
            commission = purchaseValue * 0.10F;
        }

        totalStock = 4 * commission;
        System.out.println("Tu salario es: " + totalStock);
    }
}
