import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int test=scanner.nextInt();
        if(test<=100 &&test>0){
            for(int i=0;i<test;i++){
                int liczbaElementow=scanner.nextInt();
                int[] tablica=new int[liczbaElementow];
                for(int j=0;j<liczbaElementow;j++){
                    int element=scanner.nextInt();
                    tablica[j]=element;
                }
                System.out.println(Arrays.toString(reverse(tablica)));
            }
        }

    }
    public static int[] reverse(int[] tab){
        int i=tab.length-1;
        int[]nowa=new int[tab.length];
        int k=0;
        while(i>=0){
            nowa[k]=tab[i];
            k++;
            i--;
        }
        return nowa;
    }
}