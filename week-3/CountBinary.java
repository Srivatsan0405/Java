public class CountBinary {
    public static void main(String[] args) {
        int n=11;
        int c=0;
        int temp=n;
        while(temp>0){
            if((temp&1)==1){
                c=c+1;
            }
            temp>>=1;
        }
        System.out.println(c);
    }
}
