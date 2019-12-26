package map;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        // 定义一个Map的容器对象
        Map<String, Integer > map1 = new HashMap<String, Integer >();
        map1.put("jack", 20);
        map1.put("rose", 18);
        map1.put("lucy", 17);
        map1.put("java", 25);
        System.out.println(map1);
        // 添加重复的键值（值不同）,会返回集合中原有（重复键）的值，		 System.out.println(map1.put("jack", 30)); //20

        Map<String, Integer> map2 = new HashMap<String, Integer>();
        map2.put("张三丰", 100);
        map2.put("虚竹", 20);
        System.out.println("map2:" + map2);
// 从指定映射中将所有映射关系复制到此映射中。
        map1.putAll(map2);
        System.out.println("map1:" + map1);
        //


        // 删除：
        // remove() 删除关联对象，指定key对象
        // clear() 清空集合对象

        Map<String, Integer> map3 = new HashMap<String, Integer>();
        map3.put("jack", 20);
        map3.put("rose", 18);
        map3.put("lucy", 17);
        map3.put("java", 25);
        System.out.println(map1);
// 指定key，返回删除的键值对映射的值。
        System.out.println("value:" + map3.remove("java"));
        //map3.clear();
        System.out.println("map1:" + map3);
        System.out.println("value:" + map3.get("jack"));
        System.out.println("map.size:" + map3.size());


        System.out.println(map1);
        System.out.println("isEmpty:" + map1.isEmpty());
        System.out.println("containskey:" + map1.containsKey("jack"));
        System.out.println("containsvalues:" + map1.containsValue(100));



    }
}
