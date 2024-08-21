import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        if(N>=1 &&N<=20){
            for(int i=0;i<N;i++){
                int a=scanner.nextInt();
                int b= scanner.nextInt();
                if(a>=10 && a<=30 && b>=10 && b<=30) {
                    System.out.println(nww(a, b));
                }
            }
        }
    }
    public static int nww(int a,int b){
            int wynik=0;
            int i=a+1;
            boolean temp=true;
            while(temp){
                if(i%a==0 && i%b==0){
                    wynik=i;
                    temp=false;
                }
                i++;
            }
            return wynik;

    }
}