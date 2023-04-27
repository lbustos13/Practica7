import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elija una opción:");
        System.out.println("1. Sumar dos números");
        System.out.println("2. Multiplicar dos números");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese dos números enteros:");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                int resultado1 = sumar2(num1, num2);
                System.out.println("El resultado de la suma es: " + resultado1);
                break;
            case 2:
                System.out.println("Ingrese dos números enteros:");
                int num3 = scanner.nextInt();
                int num4 = scanner.nextInt();
                int resultado2 = multiplicar2(num3, num4);
                System.out.println("El resultado de la multiplicación es: " + resultado2);
                break;
            default:
                System.out.println("Opción inválida");
        }

        scanner.close();
    }

    public static int sumar2(int a, int b) {
        return a + b;
    }

    public static int multiplicar2(int a, int b) {
        return a * b;
    }
}