package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo3 {
    public static void main(String[] args) {
        HashMap<Person, String> hm = new HashMap<Person, String>();
        hm.put(new Person("jack", 20), "1001");
        hm.put(new Person("rose", 18), "1002");
        hm.put(new Person("lucy", 19), "1003");
        hm.put(new Person("hmm", 17), "1004");
        hm.put(new Person("ll", 25), "1005");
        System.out.println(hm);
        System.out.println(hm.put(new Person("rose", 18), "1006"));

        Set<Map.Entry<Person, String>> entrySet = hm.entrySet();
        Iterator<Map.Entry<Person, String>> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry<Person, String> next = it.next();
            Person key = next.getKey();
            String value = next.getValue();
            System.out.println(key + " = " + value);
        }
    }
}

class Person {
    private String name;
    private int age;

    Person() {

    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {

        return this.name.hashCode() + age * 37;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person) obj;
            return this.name.equals(p.name) && this.age == p.age;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {

        return "Person@name:" + this.name + " age:" + this.age;
    }

}

