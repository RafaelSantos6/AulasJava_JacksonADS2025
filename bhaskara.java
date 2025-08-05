import java.util.Scanner;
import java.lang.Math;

public class bhaskara {

    public static void main(String[] args) {

        System.out.println("Calcular ");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(" Valor1 ");
            double valor1 = scanner.nextDouble();
            System.out.println(" Valor2 ");
            double valor2 = scanner.nextDouble();
            System.out.println(" valor3 ");
            double valor3 = scanner.nextDouble();

            double delta = (valor2 * valor2) - 4.0 * valor1 * valor3;

            if (delta < 0) {
                System.out.println("a equaçao nao possui raizes reais. ");
            } else {
                double x1 = (-valor2 + Math.sqrt(delta)) / (2.0 * valor1);
                double x2 = (-valor2 - Math.sqrt(delta)) / (2.0 * valor1);

                System.out.println("Raiz x1: " + x1);
                System.out.println("Raiz x2: " + x2);

            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();

        }
    }
}
