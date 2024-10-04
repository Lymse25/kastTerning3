import java.util.Random;
import java.util.Scanner;

public class kastTerning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String valg;
        do {
            // Kast terningen
            int terningVærdi = random.nextInt(6) + 1; // Genererer et tal mellem 1 og 6
            System.out.println("Du kastede en terning og fik: " + terningVærdi);

            // Spørg om brugeren vil kaste igen
            System.out.print("Vil du kaste igen? (ja/nej): ");
            valg = scanner.nextLine().toLowerCase();

        } while (valg.equals("ja"));

        System.out.println("Tak for spillet!");
        scanner.close();
    }
}