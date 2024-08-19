import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=scanner.nextInt();
        int i=0;
        int suma = 0;
        while(i<count){
            int a= scanner.nextInt();
             suma=1;
            for(int k=1;k<=a;k++){
                suma*=k;
            }


            int temp=suma;
            int firstly=0;
            int secoundly=0;
            int counter=0;
            while(suma>0){
                if(suma==temp){
                    firstly=suma%10;
                }

                if(counter==1){
                    secoundly=suma%10;
                }
                if(secoundly!=0){
                    break;
                }

                suma/=10;
                counter++;
            }

            System.out.println(secoundly+" "+firstly);

            i++;
        }


    }
}