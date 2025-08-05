import java.util.Scanner;

public class Volume {

    public static void main(String[] args) {

        System.out.println("Calcular o volume");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite o primeiro valor: ");
            double valor1 = scanner.nextDouble();
            System.out.println("Digite o segundo valor: ");
            double valor2 = scanner.nextDouble();
            System.out.println("Digite o terceiro valor: ");
            double valor3 = scanner.nextDouble();

            double volume = (valor1 * valor2 * valor3);
            System.out.println("o volume é: " + volume);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();

        }
    }
}
