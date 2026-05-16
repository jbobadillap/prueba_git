import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Calculadora Básica ---");

        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("\nSelecciona la operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Elige una opción (1-4): ");
        int opcion = scanner.nextInt();

        double resultado = 0;
        boolean operacionValida = true;

        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                    operacionValida = false;
                }
                break;
            default:
                System.out.println("Opción no válida.");
                operacionValida = false;
        }

        if (operacionValida) {
            System.out.println("\nEl resultado de la operación es: " + resultado);
        }

        scanner.close();
    }
}
