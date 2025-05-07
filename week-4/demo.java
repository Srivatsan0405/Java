
class demo {

    public static void main(String[] args) {
        int c = 0;
        call(c);
        System.out.println("Using loop:");
        for (int i = 0; i < 10000; i++) {
            c += 1;
            System.out.println(c);
        }
        c = 0;
        System.out.println("Using recursion:");
        call(c);
    }

    public static void call(int c) {
        System.out.println(c);
        if (c < 10000) {
            call(c + 1);
        }
    }
}   