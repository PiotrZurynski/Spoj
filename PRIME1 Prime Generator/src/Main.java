
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int cases=scanner.nextInt();
        List<Integer> numbers=new ArrayList<>();
        if(cases>0&&cases<=10){
            for(int j=0;j<cases;j++) {
                int m = scanner.nextInt();
                int n = scanner.nextInt();
                numbers.add(m);
                numbers.add(n);
            }
        }
        int size=numbers.size();
        int[]numberse=new int[size];
        for(int i=0;i<size;i++){
            numberse[i]=numbers.get(i);
        }
        for(int j=0;j<numberse.length;j+=2){
            int m=numberse[j];
            int n=numberse[j+1];
            for(int k=m;k<=n;k++){
                if(isPrime(k)){
                    System.out.println(k);
                }
            }
            System.out.println("\n");
        }
    }
    public static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        if(num==2){
            return true;
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}