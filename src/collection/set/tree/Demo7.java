package collection.set.tree;

import java.util.TreeSet;

public class Demo7 {
    public static void main(String[] args) {
        TreeSet tree = new TreeSet();
        tree.add("abvccccccccccccccccc");
        tree.add("abc");
        System.out.println(tree);//[abc, abcccccccccccccccccc]
        System.out.println("abw".compareTo("abvccccccccccc"));//20
    }
}
