import java.util.Scanner;

public class exercise_6 {
    public static void main(String[] args) {
        System.out.print("Inserte el primer valor: ");
        Scanner scanner = new Scanner(System.in);

        int value_1 = scanner.nextInt();

        System.out.print("Inserte el segundo valor: ");
        Scanner scanner_2 = new Scanner(System.in);

        int value_2 = scanner_2.nextInt();

        System.out.print("Inserte el tercer valor: ");
        Scanner scanner_3 = new Scanner(System.in);

        int value_3 = scanner_3.nextInt();

        int mayor, menor, medio;

        if(value_1 > value_2 && value_1 > value_3){
            mayor = value_1;
            if(value_2 > value_3){
                medio = value_2;
                menor = value_3;
            } else {
                medio = value_3;
                menor = value_2;
            }
        } else if (value_2 > value_1 && value_2 > value_3) {
            mayor = value_2;
            if (value_1 > value_3){
                medio = value_1;
                menor = value_3;
            } else {
                medio = value_3;
                menor = value_1;
            }

        } else {
            mayor = value_3;
            if(value_1 > value_2){
                medio = value_1;
                menor = value_2;
            } else {
                medio = value_2;
                menor = value_1;
            }
        }
        System.out.println("El valor mayor es: " + mayor);
        System.out.println("El valor medio es: " + medio);
        System.out.println("El valor menor es: " + menor);
    }
}
