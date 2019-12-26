package collection.func_test;

public class Demo1 {

    public static void main(String[] args) {
        MyRun my = new MyRun();
        Thread t1 = new Thread(my);
        t1.start();
        for (int i = 0; i < 200; i++) {
            System.out.println("main:" + i);
            System.out.print("test %d\n"+i);
        }
    }
}
class MyRun implements Runnable {
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.err.println("MyRun:" + i);
        }
    }

}

