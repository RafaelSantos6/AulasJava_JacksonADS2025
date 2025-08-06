import java.util.Scanner;

public class VelocidadeMedia {

    public static void main(String[] args) {
        System.out.println("Calcular Velocidade media: ");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite o tempo em horas");
            double tempo = scanner.nextDouble();
            System.out.println("Digite a distancia em KM");
            double distancia = scanner.nextDouble();

            double VelocidadeMedia = distancia / tempo;
            System.out.println("" + VelocidadeMedia);

        } catch (Exception e) {
            System.out.println(" Use Números " + e.getMessage());
        } finally {
            scanner.close();

        }

    }
}
