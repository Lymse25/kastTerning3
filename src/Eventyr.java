import java.util.Scanner;

public class Eventyr {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        startEventyr();
    }

    private static void startEventyr() {
        System.out.println("Velkommen til eventyret! Du står foran et mystisk slot.");
        System.out.println("Vil du gå ind i slottet eller gå rundt om det?");
        System.out.println("Indtast 'ind' for at gå ind i slottet eller 'rundt' for at gå rundt.");

        String valg = scanner.nextLine();

        if (valg.equalsIgnoreCase("ind")) {
            gåIndSlottet();
        } else if (valg.equalsIgnoreCase("rundt")) {
            gåRundtOmSlottet();
        } else {
            System.out.println("Ugyldigt valg, prøv igen.");
            startEventyr();
        }
    }

    private static void gåIndSlottet() {
        System.out.println("Du træder ind i slottet og ser en smuk trappe.");
        System.out.println("Vil du gå op ad trappen eller udforske stuen?");
        System.out.println("Indtast 'op' for at gå op ad trappen eller 'stue' for at udforske stuen.");

        String valg = scanner.nextLine();

        if (valg.equalsIgnoreCase("op")) {
            gåOpAdTrappen();
        } else if (valg.equalsIgnoreCase("stue")) {
            udforskeStuen();
        } else {
            System.out.println("Ugyldigt valg, prøv igen.");
            gåIndSlottet();
        }
    }

    private static void gåRundtOmSlottet() {
        System.out.println("Du går rundt om slottet og finder en hemmelig dør.");
        System.out.println("Vil du åbne døren eller gå tilbage til indgangen?");
        System.out.println("Indtast 'åbne' for at åbne døren eller 'tilbage' for at gå tilbage.");

        String valg = scanner.nextLine();

        if (valg.equalsIgnoreCase("åbne")) {
            System.out.println("Døren åbner sig, og du finder en skat! Du har vundet!");
        } else if (valg.equalsIgnoreCase("tilbage")) {
            startEventyr();
        } else {
            System.out.println("Ugyldigt valg, prøv igen.");
            gåRundtOmSlottet();
        }
    }

    private static void gåOpAdTrappen() {
        System.out.println("Du går op ad trappen og finder en drage!");
        System.out.println("Vil du kæmpe mod dragen eller løbe væk?");
        System.out.println("Indtast 'kæmp' for at kæmpe mod dragen eller 'løb' for at løbe væk.");

        String valg = scanner.nextLine();

        if (valg.equalsIgnoreCase("kæmp")) {
            System.out.println("Du kæmper tappert og besejrer dragen! Du har vundet!");
        } else if (valg.equalsIgnoreCase("løb")) {
            System.out.println("Du løber væk og når sikkert tilbage til indgangen. Eventyret er slut.");
        } else {
            System.out.println("Ugyldigt valg, prøv igen.");
            gåOpAdTrappen();
        }
    }

    private static void udforskeStuen() {
        System.out.println("I stuen finder du en magisk bog.");
        System.out.println("Vil du læse bogen eller tage den med dig?");
        System.out.println("Indtast 'læse' for at læse bogen eller 'tage' for at tage den med dig.");

        String valg = scanner.nextLine();

        if (valg.equalsIgnoreCase("læse")) {
            System.out.println("Bogen indeholder magiske hemmeligheder! Du har vundet!");
        } else if (valg.equalsIgnoreCase("tage")) {
            System.out.println("Du tager bogen med dig, men slottet begynder at kollapse! Du skal løbe væk!");
            System.out.println("Du når lige akkurat at slippe væk! Eventyret er slut.");
        } else {
            System.out.println("Ugyldigt valg, prøv igen.");
            udforskeStuen();
        }
    }
}