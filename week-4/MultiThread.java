public class MultiThread extends Thread{
    public static void main(String[] args) {
        //This below step is called as multithread     -->   start()
        MultiThread multiThread=new MultiThread();
        multiThread.start();
        MultiThread multiThread2=new MultiThread();
        multiThread2.start();
        MultiThread multiThread3=new MultiThread();
        multiThread3.start();
        // MultiThread multiThread=new MultiThread();
        // multiThread.run();
        // MultiThread multiThread2=new MultiThread();
        // multiThread2.run();
        // MultiThread multiThread3=new MultiThread();
        // multiThread3.run();
    }
    @Override
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println(i);
        }
    }
}

    