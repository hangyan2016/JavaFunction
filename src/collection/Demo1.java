package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;


public class Demo1 {
    static Scanner scanner = new Scanner(System.in);
    static Collection users = new ArrayList(); //使用该集合保存所有的用户信息..




    public static void main(String[] args) {
        User user11 = new User(111,"222");
        users.add(user11);
        while(true){
            System.out.println("请选择功能      A(注册 )    B(登陆)");
            String option = scanner.next();
            if("a".equalsIgnoreCase(option)){
                reg();
            }else if("b".equalsIgnoreCase(option)){
                login();
            }else{
                System.out.println("你的选择有误,请重新输入");
            }
        }
    }
    public static void login() {
        System.out.println("请输入账号：");
        int id = scanner.nextInt();
        System.out.println("请输入密码:");
        String password = scanner.next();
        //判断集合的用户是否存在该用户名与密码，不能用contains方法了，因为contains方法依赖于equals方法，但是equals方法，我们已经重新写了。
        //遍历集合的元素，查看是否存在该用户信息
        boolean isLogin = false; 	//定义变量用于记录是否登陆成功的信息  , 默认是没有登陆成功的
        for (Object o : users) {
            User user = (User) o;
            int idUser = user.getId();
            String passwordUser = user.getPassword();
            if (idUser == id && passwordUser.equals(password)) {
                //存在该用户信息，登陆成功...
                isLogin = true;
                break;
            }
        }
        if(isLogin==true){
            System.out.println("欢迎登陆...");
        }else{
            System.out.println("用户名或者密码错误，登陆失败...");
        }
    }
    public static void reg() {
        //110  , 220
        User user = null;
        while(true){
            System.out.println("请输入账号:");
            int id = scanner.nextInt();  //220
            user = new User(id,null);
            if(users.contains(user)){  // contains底层依赖了equals方法。         //如果存在
                System.out.println("该账号已经存在，请重新输入账号");
            }else{
                //不存在
                break;
            }
        }
        System.out.println("请输入密码：");
        String password = scanner.next();
        user.setPassword(password);
        //把user对象保存到集合中
        users.add(user);
        System.out.println("注册成功!");
        System.out.println("当前注册的人员："+users);
    }
}

