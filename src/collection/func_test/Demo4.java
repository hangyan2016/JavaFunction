package collection.func_test;

class SaleTicket extends Thread{
    static int num = 50;//票数非静态的成员变量,非静态的成员变量数据是在每个对象中都会维护一份数据的。
    static	Object o = new Object();
    public SaleTicket(String name) {
        super(name);
    }
    public void run() {
        while(true){
            //同步代码块
            synchronized ("锁") {	//string常量在常量池中唯一，也是可以锁住的。如果是new String（"锁"）的话，是锁不住的，因为其不是唯一的。
                if(num>0){
                    System.out.println(Thread.currentThread().getName()+"售出了第"+num+"号票");
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    num--;
                }else{
                    System.out.println("售罄了..");
                    break;
                }
            }
        }
    }
}
public class Demo4 {
    public static void main(String[] args) {
        //创建三个线程对象，模拟三个窗口
        SaleTicket thread1 = new SaleTicket("窗口1");
        SaleTicket thread2 = new SaleTicket("窗口2");
        SaleTicket thread3 = new SaleTicket("窗口3");
        //开启线程售票
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
