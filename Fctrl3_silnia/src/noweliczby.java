public class noweliczby {
    public static void main(String[] args) {
        int number=121;
        int temp=number;
        int first=0;
        while(number>0){
            first+=number%10;
            if(first==temp){
                break;
            }
            first*=10;
            number/=10;


        }
        System.out.println(first);


    }
}
