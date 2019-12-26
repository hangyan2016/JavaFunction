package collectionAndMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
class Demo1
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(3);
        // 排序
        Collections.sort(list);
        // 折半查找的前提是排序好的元素
        System.out.println( Collections.binarySearch( list , 8 ) );  // 找不到返回-插入点-1
        // 反序集合输出
        Collections.reverse( list );
        System.out.println( list );
        // 求最值
        System.out.println( Collections.max( list ) );   // 4
        // fill()  使用指定的元素替换指定集合中的所有元素
        // Collections.fill( list, 5 );
        System.out.println( list );

        // 将数组转换为集合
        Integer is[] = new  Integer[]{6,7,8};
        List<Integer> list2 =  Arrays.asList(is);
        list.addAll( list2 );
        System.out.println( list );

        // 将List转换为数组
        Object [] ins =  list.toArray();
        System.out.println( Arrays.toString( ins ) );


    }
}
