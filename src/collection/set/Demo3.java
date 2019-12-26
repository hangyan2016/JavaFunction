package collection.set;

import java.util.HashSet;
import java.util.Scanner;

class User{
    String userName;
    String password;
    public User(String userName, String password) {
        super();
        this.userName = userName;
        this.password = password;
    }
    public String toString() {
        return "{ 用户名："+this.userName+" 密码："+ this.password+"}";
    }
    public boolean equals(Object obj) {
        User user = (User)obj;
        return this.userName.equals(user.userName);
    }
    public int hashCode() { //  abc 123   ， 123 abc
        return userName.hashCode();
    }
}
public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet set = new HashSet();
        while(true){
            System.out.println("请输入用户名:");
            String userName = scanner.next();
            System.out.println("请输入密码：");
            String password = scanner.next();
            //创建一个对象
            User user = new User(userName, password);
            if(set.add(user)){
                System.out.println("注册成功...");
                System.out.println("当前的用户有："+ set);
            }else{
                System.out.println("注册失败...");
            }
        }
    }
}
