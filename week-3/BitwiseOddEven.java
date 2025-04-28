import java.util.*;

public class BitwiseOddEven {
    public static void main(String[] args) {
        int num=new Scanner(System.in).nextInt();
        if((num & 1)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    } 
}