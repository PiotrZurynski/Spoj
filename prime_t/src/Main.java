import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int count=scanner.nextInt();
        int i=0;
        while(i<count){
            int a=scanner.nextInt();
            if(isPrime(a)){
                System.out.println("tak");
            }else{
                System.out.println("nie");
            }
            i++;
        }

    }
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}