public class Main {


    public static void main(String[] args) throws InterruptedException {
        ThreadGroup mainGroup = new ThreadGroup("main group");
        MyThread Thread1 = new MyThread(mainGroup, "поток 1");
        MyThread Thread2 = new MyThread(mainGroup, "поток 2");
        MyThread Thread3 = new MyThread(mainGroup, "поток 3");
        MyThread Thread4 = new MyThread(mainGroup, "поток 4");
        Thread1.start();
        Thread2.start();
        Thread3.start();
        Thread4.start();


        Thread.sleep(15000);
        mainGroup.interrupt();


    }
}
