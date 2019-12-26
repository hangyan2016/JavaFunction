package Generic;

public class Demo7 {
    public static void main(String[] args) {
        Father<String> f = new Father<String>("jack");
        System.out.println(f.getT());
        Father<Integer> f2 = new Father<Integer>(20);
        System.out.println(f2.getT());
    }
}
class Father<T> {
    private T t;
    public Father() {
    }
    public Father(T t) {
        super();
        this.t = t;
    }
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
}


//子类指定了具体的类型
class Son extends Father<String>{
}
//子类也需要使用泛型
class Son3<T> extends Father<T>{
}
//错误写法，父类上定义有泛型需要进行处理
class Son2<T> extends Father<T>{
}
