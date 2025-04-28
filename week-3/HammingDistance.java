public class HammingDistance {
    public static void main(String[] args) {
        int a=8;
        int b=7;
        int m=a^b;
        int r=count(m);
        System.out.println(r);
    }
    public static int count(int n){
        int c=0;
        int temp=n;
        while(temp>0){
            if((temp&1)==1){
                c=c+1;
            }
            temp>>=1;
        }
        return c;
    }
}
