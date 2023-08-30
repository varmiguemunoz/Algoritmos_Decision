import java.util.Scanner;

public class exercise_9 {
    public static void main(String[] args) {
        System.out.print("Inserte el total de horas trabajadas: ");
        Scanner scanner = new Scanner(System.in);

        int totalHours = scanner.nextInt();
        float valuePerHour = 0;

        System.out.println("\n<= Categorias => \n" + "1. Categoria A = $25.000\n" + "2. Categoria B = $22.000\n" + "3. Categoria C = $20.000\n" + "4. Categoria D = $19.000\n");

        System.out.print("Inserte la categoria a la que pertenece (1,2,3,4): ");
        Scanner scanner_2 = new Scanner(System.in);

        int category = scanner_2.nextInt();

        switch (category){
            case 1:
                valuePerHour = 25000;
                break;

            case 2:
                valuePerHour = 22000;
                break;

            case 3:
                valuePerHour = 20000;
                break;

            case 4:
                valuePerHour = 19000;
                break;

            default:
                System.out.println("Inserta la categoria correcta");
        }

        float baseSalary = totalHours * valuePerHour;
        float discount = baseSalary * 0.10F;

        float TotalSalary = baseSalary -= discount;
        System.out.println("EL salario total devengado es: " + TotalSalary);
    }
}
