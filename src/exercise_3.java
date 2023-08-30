import java.util.Scanner;

public class exercise_3 {
    public static void main(String[] args) {
        float ratePerHour;

        System.out.print("Inserte la categoria del usuario (1, 2, 3, 4) : ");
        Scanner scanner = new Scanner(System.in);

        int userCategory = scanner.nextInt();

        System.out.print("Inserte el total de horas: ");
        Scanner scanner_2 = new Scanner(System.in);

        int totalHours = scanner_2.nextInt();

           switch ( userCategory) {
               case 1:
                   ratePerHour = 3000;
            break;

               case 2:
                   ratePerHour = 5000;
                   break;

               case 3:
                   ratePerHour= 8000;
                   break;

               case 4:
                   ratePerHour = 10500;
                   break;

               default:
                   throw new IllegalStateException("Unexpected value: " + userCategory);
           }

        float salary = ratePerHour * totalHours;
           float health = (float) (salary * 0.08);

         float totalSalary = salary -= health;

        if (salary < 1000000) {
            double subsidio = salary * 0.15;
            totalSalary = salary += subsidio;
        }

        System.out.println("El salario mensual con todas las deducciones es: $" + totalSalary);

    }
}
