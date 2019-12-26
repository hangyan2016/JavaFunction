package collection.func_test;

public class Demo10 {
    public static void main(String[] args) {
        Person p = new Person();
        Producer pro = new Producer(p);
        Consumer con = new Consumer(p);
        Thread t1 = new Thread(pro, "生产者");
        Thread t2 = new Thread(con, "消费者");
        t1.start();
        t2.start();
    }
}
// 使用Person作为数据存储空间
class Person {
    String name;
    String gender;
    boolean flag = false;
    public synchronized void set(String name, String gender) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.name = name;
        this.gender = gender;
        flag = true;
        notify();
    }
    public synchronized void read() {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("name:" + this.name + "----gender:" + this.gender);
        flag = false;
        notify();
    }
}
// 生产者
class Producer implements Runnable {
    Person p;
    public Producer() {
    }
    public Producer(Person p) {
        this.p = p;
    }
    public void run() {
        int i = 0;
        while (true) {
            if (i % 2 == 0) {
                p.set("jack", "man");
            } else {
                p.set("小丽", "女");
            }
            i++;
        }
    }
}
// 消费者
class Consumer implements Runnable {
    Person p;
    public Consumer() {
    }
    public Consumer(Person p) {
        this.p = p;
    }
    public void run() {
        while (true) {
            p.read();
        }
    }
}

