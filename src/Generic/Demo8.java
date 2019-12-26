package Generic;

public class Demo8 {
    public static void main(String[] args) {
        MyInter<String> my = new MyInter<String>();
        my.print("泛型");
        MyInter2 my2 = new MyInter2();
        my.print("只能传字符串");
    }
}
interface Inter<T> {
    void print(T t);
}
// 实现不知为何类型时可以这样定义
class MyInter<T> implements Inter<T> {
    public void print(T t) {
        System.out.println("myprint:" + t);
    }
}
//使用接口时明确具体类型。
class MyInter2 implements Inter<String> {
    public void print(String t) {
        System.out.println("myprint:" + t);
    }
}

