package collectionAndMap;

import java.util.Arrays;
import java.util.Set;
import java.util.List;
import java.util.HashSet;

// 1. 描述Person类
class Person {
    public String name;
    public int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {

        return getClass().getName() + " : name=" + this.name + " age="
                + this.age;

    }

    // 4. 重写hashCode和equals()
    public int hashCode() {

        return this.age;
    }

    public boolean equals(Object o) {
        Person p = null;
        if (o instanceof Person)
            p = (Person) o;
        return this.name.equals(p.name) && (this.age == p.age);
    }
}

class Demo2 {
    public static void main(String[] args) {
        Person[] ps = new Person[] { new Person("jack", 34),
                new Person("lucy", 20), new Person("lili", 10),
                new Person("jack", 34) };
        // 遍历数组
        System.out.println(Arrays.toString(ps));
        // 2. 将自定义对象数组转换为List集合
        List<Person> list = Arrays.asList(ps);
        // 3. 将List转换为Set
        Set<Person> set = new HashSet<Person>();
        set.addAll(list);
        System.out.println(set);

    }
}

