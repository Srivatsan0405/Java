public class MultiplyBinary {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int pos=0;
        int r=0;
        while(b>0){
            if(b%2==1){
                r+=a<<pos;
            }
            pos++;
            b>>=1;
        }
        System.out.println(r);
    }
}
