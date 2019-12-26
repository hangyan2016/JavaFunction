package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {

        User user11 = new User(111,"222");
        int id = user11.getId();
        System.out.println(id);

        Collection<String> d = new ArrayList<>();
        d.add("test");
        Collection<String> c = new ArrayList<>();
        c.add("令计划");
        c.add("徐才厚");
        c.add("周永康");
        Object remove = c.remove("令计划");
        System.out.println(remove);
        System.out.println("添加成功吗？"+c.add("郭美美"));
        //创建集合
        Collection<String> c2 = new ArrayList<String>();
        c2.add("徐才厚");
        c2.add("郭美美");
        c2.add("狗娃");

        c.addAll(c2); // 把c2的元素的添加到c集合 中去。
/*		 删除方法:
		c.clear(); //clear()清空集合中的元素
	//  remove 指定集合中的元素删除，删除成功返回true，删除失败返回false.
		System.out.println("删除成功吗？"+c.remove("美美"));
		c.removeAll(c2); //删除c集合中与c2的交集元素。
		c.retainAll(c2); //保留c集合与c2的交集元素，其他的元素一并删除。*/
        System.out.println("查看元素个数："+c.size());
        System.out.println("集合的元素："+ c);


        List<String> list = new ArrayList<String>();
        // 增加：add() 将指定对象存储到容器中
        list.add("计算机网络");
        list.add("现代操作系统");
        list.add("java编程思想");
        list.add("java核心技术");
        list.add("java语言程序设计");
        System.out.println(list);
        // 删除0角标元素
        Object remove1 = list.remove(0);
        System.out.println(remove1);
        System.out.println(list);



    }
}
