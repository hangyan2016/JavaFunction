package collection.set;

import java.util.TreeSet;

public class Demo5 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add("ccc");
        ts.add("aaa");
        ts.add("ddd");
        ts.add("bbb");
        System.out.println(ts); // [aaa, bbb, ccc, ddd]
    }
}
