import java.util.*;

public class BitwiseCompliment {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        int mask=0;
        int temp=n;
        if(n==0){
            System.out.println(1);
        }
        while (temp != 0) {
            mask = (mask << 1) | 1;
            temp >>= 1;
        }
        System.out.println(n^mask);
    }
}
