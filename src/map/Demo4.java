package map;

import java.util.TreeMap;

public class Demo4 {
    public static void main(String[] args) {
        TreeMap<String, Integer> tree = new TreeMap<String, Integer>();
        tree.put("张三", 19);
        tree.put("李四", 20);
        tree.put("王五", 21);
        tree.put("赵六", 22);
        tree.put("周七", 23);
        tree.put("张三", 24);
        System.out.println(tree);
        System.out.println("张三".compareTo("李四"));//-2094
    }
}
