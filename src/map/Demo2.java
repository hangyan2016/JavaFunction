package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "aaaa");
        map.put(2, "bbbb");
        map.put(3, "cccc");
        System.out.println(map);

        //
        // 获取方法：
        // 第一种方式: 使用keySet
        // 需要分别获取key和value，没有面向对象的思想
        // Set<K> keySet() 返回所有的key对象的Set集合

        Set<Integer> ks = map.keySet();
        Iterator<Integer> it = ks.iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            String value = map.get(key);
            System.out.println("key=" + key + " value=" + value);
        }
    }
}

