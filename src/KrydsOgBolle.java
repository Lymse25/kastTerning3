import java.util.Scanner;

public class KrydsOgBolle {
    private static char[][] bræt = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    private static char nuværendeSpiller = 'X';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean spilActive = true;

        while (spilActive) {
            visBræt();
            System.out.println("Spiller " + nuværendeSpiller + ", indtast række og kolonne (0, 1, eller 2): ");
            int række = scanner.nextInt();
            int kolonne = scanner.nextInt();

            if (række >= 0 && række < 3 && kolonne >= 0 && kolonne < 3 && bræt[række][kolonne] == ' ') {
                bræt[række][kolonne] = nuværendeSpiller;
                if (tjekVindere()) {
                    visBræt();
                    System.out.println("Spiller " + nuværendeSpiller + " har vundet!");
                    spilActive = false;
                } else if (erBrætFuldt()) {
                    visBræt();
                    System.out.println("Det er uafgjort!");
                    spilActive = false;
                }
                nuværendeSpiller = (nuværendeSpiller == 'X') ? 'O' : 'X'; // Skift spiller
            } else {
                System.out.println("Ugyldigt træk, prøv igen.");
            }
        }
        scanner.close();
    }

    private static void visBræt() {
        System.out.println("Bræt:");
        for (char[] række : bræt) {
            System.out.println("| " + række[0] + " | " + række[1] + " | " + række[2] + " |");
        }
    }

    private static boolean tjekVindere() {
        // Tjek rækker og kolonner
        for (int i = 0; i < 3; i++) {
            if ((bræt[i][0] == nuværendeSpiller && bræt[i][1] == nuværendeSpiller && bræt[i][2] == nuværendeSpiller) ||
                    (bræt[0][i] == nuværendeSpiller && bræt[1][i] == nuværendeSpiller && bræt[2][i] == nuværendeSpiller)) {
                return true;
            }
        }
        // Tjek diagonaler
        return (bræt[0][0] == nuværendeSpiller && bræt[1][1] == nuværendeSpiller && bræt[2][2] == nuværendeSpiller) ||
                (bræt[0][2] == nuværendeSpiller && bræt[1][1] == nuværendeSpiller && bræt[2][0] == nuværendeSpiller);
    }

    private static boolean erBrætFuldt() {
        for (char[] række : bræt) {
            for (char felt : række) {
                if (felt == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}