import java.util.*;

public class BitwisePowerOf2{
    public static void main(String[] args){
        int num=new Scanner(System.in).nextInt();
        int num2=num-1;
        if((num&num2)==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}