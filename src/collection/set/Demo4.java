package collection.set;

public class Demo4 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println("两个是同一个对象吗？"+(str1==str2));
        System.out.println("str1的hashCode："+ str1.hashCode());
        System.out.println("str2的hashCode:"+ str2.hashCode());
		/*
		 HashCode默认情况下表示的是内存地址，String 类已经重写了Object的hashCode方法了。
		 注意： 如果两个字符串的内容一致，那么返回的hashCode 码肯定也会一致的。
		 */
    }
}

