import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        System.out.println("Calcular Area: ");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite o primeiro Lado");
            double ladoA = scanner.nextDouble();
            System.out.println("Digite o segundo Lado");
            double ladoB = scanner.nextDouble();

            double area = ladoA * ladoB;
            System.out.println("A Area é: " + area);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();

        }

    }
}
