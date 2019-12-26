package collection.set.tree;

import java.util.TreeSet;

public class Demo8 {
    public static void main(String[] args) {
        String str="8 10 15 5 2 7";
        String[] datas = str.split(" ");
        TreeSet tree = new TreeSet();
        for(int i = 0 ; i<datas.length ; i++){
			int y = Integer.parseInt(datas[i]);
			tree.add(y);
            //parseInt(String s)将字符串参数作为有符号的十进制整数进行解析。
            // 字符串转int类型数据是需要使用Integer.parseInt()
            //tree.add(Integer.parseInt( datas[i]));
        }
        //遍历treeSet的元素拼接成对应的字符串
		/*Iterator it = tree.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}*/
        System.out.println(tree);
    }
}

