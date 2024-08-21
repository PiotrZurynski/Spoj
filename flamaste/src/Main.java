import java.util.Scanner;

public class Main {

    public static String skrocWyraz(String wyraz) {
        StringBuilder skroconyWyraz = new StringBuilder();
        int n = wyraz.length();
        int i = 0;
        while (i < n) {
            char aktualnaLitera = wyraz.charAt(i);
            int licznik = 1;
            while (i + 1 < n && wyraz.charAt(i) == wyraz.charAt(i + 1)) {
                licznik++;
                i++;
            }
            if (licznik > 2) {
                skroconyWyraz.append(aktualnaLitera).append(licznik);
            } else {
                for (int j = 0; j < licznik; j++) {
                    skroconyWyraz.append(aktualnaLitera);
                }
            }
            i++;
        }
        return skroconyWyraz.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int C = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < C; i++) {
            String wyraz = scanner.nextLine();
            System.out.println(skrocWyraz(wyraz));
        }
    }
}
