import java.util.Scanner;

public class exercise_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float[] sales = new float[5];
        float totalSales = 0;

        for(int i = 0; i< 5; i++){
            System.out.print("Inserte el valor de la venta numero " + (i +1) + ": ");
            sales[i] = scanner.nextFloat();
            totalSales += sales[i];
        }

        System.out.print("Inserta tu salario basico: ");
        Scanner scanner1 = new Scanner(System.in);

        float baseSalary = scanner1.nextFloat();

        float comision = 0;
                if(totalSales <= 1000000){
                    comision = totalSales * 0.05F;
                } else if(totalSales <= 1500000) {
                    comision = totalSales * 0.07F;
                } else {
                    comision = totalSales * 0.10F;
                }

                float totalSalary = baseSalary + comision;

                float discount = 0;
                if(totalSalary <= 500000){
                    discount = totalSalary * 0.05F;
                } else if(totalSalary <= 1000000) {
                    discount = totalSalary * 0.06F;
                } else {
                    discount = totalSalary * 0.8F;
                }

                float totalDevengado = totalSalary - discount;

        System.out.println("Total de ventas: " + totalSales);
        System.out.println("Total ganado por comisiones: " + comision);
        System.out.println("Total devengado (salario + comisiones): " + totalSalary);
        System.out.println("Total de descuentos: " + discount);
        System.out.println("Salario a pagar: " + totalDevengado );


    }
}
