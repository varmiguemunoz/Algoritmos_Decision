import java.util.Scanner;

public class exercise_10 {
    public static void main(String[] args) {
        System.out.println("<= Dias de la semana =>\n" + "1. Lunes\n" + "2. Martes\n" + "3. Miercoles\n" + "4. Jueves\n" + "5. Viernes\n" + "6. Sabado\n" + "7. Domingo\n");

        System.out.print("Selecciona un dia para conocer el nombre del astro: ");
        Scanner scanner = new Scanner(System.in);

        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("El nombre del astro es: Luna");
                break;
            case 2:
                System.out.println("El nombre del astro es: Marte");
                break;
            case 3:
                System.out.println("El nombre del astro es: Mercurio");
                break;
            case 4:
                System.out.println("El nombre del astro es: Jupiter");
                break;
            case 5:
                System.out.println("El nombre del astro es: Venus");
                break;
            case 6:
                System.out.println("El nombre del astro es: Saturno");
                break;
            case 7:
                System.out.println("El nombre del astro es: Sol");
            default:
                System.out.println("Inserta una opcion correcta!");
        }


    }
}
