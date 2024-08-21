import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test=scanner.nextInt();
        int suma=0;
        if(test>0 && test <100){
            for(int i=0;i<test;i++){
                int count=scanner.nextInt();
                for(int j=0;j<count;j++){
                    int liczby=scanner.nextInt();
                    suma+=liczby;
                }
                System.out.println(suma);
                suma=0;
            }
        }

    }
}