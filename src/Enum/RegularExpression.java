package Enum;

public class Demo2{
    public static void main(String[] args) {
        //只能输入数字
        String str = "124354232a";
        char[] arr = str.toCharArray();
        boolean flag = true;
        for(int i = 0 ;  i< arr.length ; i++){
            if(!(arr[i]>=48&&arr[i]<=57)){
                flag = false;
            }
        }
        System.out.println(flag?"输入正确":"输出只能是数字");

        //只能输入数字
        String str2 = "12435423a2";
        boolean flag2 = str2.matches("[0-9]+");
        System.out.println(flag2?"输入正确":"只能输入数字");

    }
}
