import java.util.*;

public class BitwiseReverse {
    public static void main(String[] args) {
        int num=new Scanner(System.in).nextInt();
        String bs=Integer.toBinaryString(num);
        System.out.println("Given number: "+num+" Corresponding binary: "+bs);
        int result=rvnum(num);
        String rv_result=Integer.toBinaryString(result);
        System.out.println("Output number: "+result+" Corresponding binary: "+rv_result);
    }
    public static int rvnum(int n){
        int r=0;
        for(int i=0;i<32;i++){
            r<<=1;
            r|=(n&1);
            n>>=1;
        }
        return r;
    }
}
