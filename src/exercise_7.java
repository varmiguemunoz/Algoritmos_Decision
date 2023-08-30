import java.util.Scanner;

public class exercise_7 {
    public static void main(String[] args) {
        float basicRegistration = 0;

        System.out.print("Inserte la edad del deportista: ");
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        if(age < 5) { //se mueve al principio, para evitar que el programa recorra todo el resto de condiciones
            System.out.println("el deportista no tiene la edad suficiente");
        } else if (age >=5 && age <=8) {
            basicRegistration =38000;
        } else if (age >= 9 && age <= 17){
            basicRegistration = 40100;
        } else if (age >= 18) {
            basicRegistration =  45800;
        } else {
            System.out.println("edad no valida");
        }

        float extraCharge = basicRegistration * 0.10F;
        float matricula = basicRegistration += extraCharge;

        System.out.println("Tu valor total a pagar es: " + matricula);

    }
}
