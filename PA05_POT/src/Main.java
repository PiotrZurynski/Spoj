import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=scanner.nextInt();
        int finaly=0;
        if(count>=1 && count<=10) {
            for (int i = 0; i < count; i++) {
                double a = scanner.nextInt();
                double b = scanner.nextInt();
                if (a <= 1000 && b <= 1000 && a >= 1 && b >= 1) {
                    double wynik=Math.pow(a,b);
                    finaly =(int) wynik%10;
                }
                System.out.println(finaly);
            }
        }
    }
}