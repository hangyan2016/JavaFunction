package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("西游记");
        list.add("三国演义");
        list.add("水浒传");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
        }
    }
}

