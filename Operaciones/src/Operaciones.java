import java.util.Scanner;

public class Operaciones {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elija una opción:");
        System.out.println("1. Realizar una suma");
        System.out.println("2. Realizar una resta");
        System.out.println("3. Realizar una multiplicación");
        System.out.println("4. Realizar una división");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("¿Cuántos números desea sumar?");
                int n1 = scanner.nextInt();
                int[] numeros1 = new int[n1];
                for (int i = 0; i < n1; i++) {
                    System.out.println("Ingrese el número " + (i + 1) + ":");
                    numeros1[i] = scanner.nextInt();
                }
                int resultado1 = sumarN(numeros1);
                System.out.println("El resultado de la suma es: " + resultado1);
                break;
            case 2:
                System.out.println("Ingrese el primer número:");
                int num1 = scanner.nextInt();
                System.out.println("Ingrese el segundo número:");
                int num2 = scanner.nextInt();
                int resultado2 = restar(num1, num2);
                System.out.println("El resultado de la resta es: " + resultado2);
                break;
            case 3:
                System.out.println("¿Cuántos números desea multiplicar?");
                int n3 = scanner.nextInt();
                int[] numeros3 = new int[n3];
                for (int i = 0; i < n3; i++) {
                    System.out.println("Ingrese el número " + (i + 1) + ":");
                    numeros3[i] = scanner.nextInt();
                }
                int resultado3 = multiplicarN(numeros3);
                System.out.println("El resultado de la multiplicación es: " + resultado3);
                break;
            case 4:
                System.out.println("Ingrese el dividendo:");
                int dividendo = scanner.nextInt();
                System.out.println("Ingrese el divisor:");
                int divisor = scanner.nextInt();
                double resultado4 = dividir(dividendo, divisor);
                System.out.println("El resultado de la división es: " + resultado4);
                break;
            default:
                System.out.println("Opción inválida");
        }

        scanner.close();
    }

    public static int sumarN(int[] numeros) {
        int resultado = 0;
        for (int i = 0; i < numeros.length; i++) {
            resultado += numeros[i];
        }
        return resultado;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicarN(int[] numeros) {
        int resultado = 1;
        for (int i = 0; i < numeros.length; i++) {
            resultado *= numeros[i];
        }
        return resultado;
    }

    public static double dividir(int dividendo, int divisor) {
        return (double) dividendo / divisor;
    }
}