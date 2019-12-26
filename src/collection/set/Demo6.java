package collection.set;

import java.util.Comparator;
import java.util.TreeSet;

class  Emp implements Comparable<Emp>{
    int id;
    String name;
    int salary;
    public Emp(int id, String name, int salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String toString() {
        return "{ 编号："+  this.id+" 姓名："+ this.name+" 薪水："+ this.salary+"}";
    }
    //元素与元素之间的比较规则。
    // 负整数、零或正整数，根据此对象是小于、等于还是大于指定对象。
    public int compareTo(Emp o) {
		//System.out.println(this.name+"compare"+ e.name);
        return this.salary- o.salary;
    }
}
//自定义一个比较器
class MyComparator implements Comparator<Emp> {
    public int compare(Emp o1, Emp o2) {
        return o1.id-o2.id;
    }
    //根据第一个参数小于、等于或大于第二个参数分别返回负整数、零或正整数。
	/*
	public int compare(Object o1, Object o2) {
		Emp e1 = (Emp) o1;
		Emp e2 = (Emp) o2;
		return e1.id - e2.id;
	}*/
}
public class Demo6 {
    public static void main(String[] args) {
        //创建一个比较器对象
        //MyComparator comparator = new MyComparator();
        //创建TreeSet的时候传入比较器
        //可以把上下两行注释，使集合按compareTo方法进行比较。
      TreeSet tree = new TreeSet();
//        TreeSet tree = new TreeSet(comparator);
        tree.add(new Emp(110, "老陆", 100));
        tree.add(new Emp(113, "老钟", 200));
        tree.add(new Emp(220, "老汤", 300));
        tree.add(new Emp(120, "老蔡", 500));
        System.out.println("集合的元素："+tree);
    }
}
