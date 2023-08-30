import java.util.InputMismatchException;
import java.util.Scanner;

public class exercise_2 {
    public static void main(String[] args) {
        System.out.print("cantidad total de ventas del departamento 1: ");
        Scanner scanner = new Scanner(System.in);
        
      int department_1 = scanner.nextInt();

        System.out.print("cantidad total de ventas del departamento 2: ");
        Scanner scanner_1 = new Scanner(System.in);

        int department_2 = scanner_1.nextInt();

        System.out.print("cantidad total de ventas del departamento 3: ");
        Scanner scanner_2 = new Scanner(System.in);

        int department_3 = scanner_2.nextInt();
        
        int totalSales = department_1 + department_2 + department_3;
        
        float salary = 1200;
        float bonus;

        float salaryDepartment_1 = salary;
        float salaryDepartment_2 = salary;
        float salaryDepartment_3 = salary;

        try {
            if(department_1 >= totalSales * 0.5){
                bonus = (float) (salary * 0.2);
                float newSalary_1 = salaryDepartment_1 += bonus;
                System.out.println("Obtuviste el bono! tu salario es: " + newSalary_1);
            } else if (department_2 >= totalSales * 0.5) {
                bonus = (float) (salary * 0.2);
                float newSalary_2 = salaryDepartment_2 += bonus;
                System.out.println("Obtuviste el bono! tu salario es: " + newSalary_2);
            } else if (department_3 >= totalSales * 0.5) {
                bonus = (float) (salary * 0.2);
                float newSalary_3 = salaryDepartment_3 += bonus;
                System.out.println("Obtuviste el bono! tu salario es: " + newSalary_3);
            } else {
                System.out.println("Ningun equipo obtuvo el bono!");
            }

        } catch (InputMismatchException e) {
            System.out.println("Entrada invalida!");
        }

    }
}
