package collection.func_test;

public class Demo6 {
    public static void main(String[] args) {
        MyTicket mt = new MyTicket();
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);
        Thread t3 = new Thread(mt);
        Thread t4 = new Thread(mt);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}
class MyTicket implements Runnable {
    int tickets = 100;
    public void run() {
        while (true) {
            if (tickets > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "窗口@销售："+ tickets + "号票");
                tickets--;
            } else {
                System.out.println("票已卖完。。。");
                break;
            }
        }
    }
}
