package Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Demo9 {
    public static void main(String[] args) {
        ArrayList<Object> arr = new ArrayList<Object>();
        arr.add(new Object());
        arr.add("String");
        print(arr);
        //将集合的泛型设置类String类型，是Object子类
        HashSet<String> hs = new HashSet<String>();
        hs.add("hello");
        hs.add("jack");
        //由于print方法接收的集合进行了元素限定，只接受限定为Object类型的集合,编译不通过
        print(hs);
    }
    public static void print(Collection<?> coll) {
        Iterator<?> it = coll.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            System.out.println(next);
        }
    }
}

