import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer>wyniki=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
        String a = scanner.next();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int suma = 0;
        switch (a) {
            case "+":
                suma = b + c;
                break;
            case "-":
                suma = b - c;
                break;
            case "*":
                suma = b * c;
                break;
            case "/":
                suma = b / c;
                break;
            case "%":
                suma = b % c;
                break;
        }
        wyniki.add(suma);
    }
        for(int numb:wyniki){
            System.out.println(numb);
        }
    }}
