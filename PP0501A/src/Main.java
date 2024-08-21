import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int test=scanner.nextInt();
        for(int i=0;i<test;i++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            System.out.println(nwd(a,b));
        }

    }
    public static int nwd(int a,int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}