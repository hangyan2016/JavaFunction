package Generic;

import java.util.ArrayList;

class MyArrays<T>{
    //元素翻转
    public void reverse(T[] arr){
        for(int startIndex = 0, endIndex = arr.length-1 ; startIndex<endIndex ; startIndex++,endIndex--){
            T temp  = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
        }
    }
    //	public String toString(String obj){
//		return obj;
//	}
    //
    public String toString(T[] arr){
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < arr.length ; i++){
            if(i==0){
                sb.append("["+arr[i]+",");
            }else if(i==arr.length-1){
                sb.append(arr[i]+"]");
            }else{
                sb.append(arr[i]+",");
            }
        }
        return sb.toString();
    }
    public static <T>void print(T[] t){//可以将这个T，看成成员变量。成员变量与局部变量重名的条件下，默认使用局部变量。
        //为什么类上的泛型无法作用到静态方法上？
        //因为静态方法不需要调用对象，所以类上的泛型无法作用到静态方法上。
        //如果静态的方法需要使用自定义泛型，那么需要在方法上自己声明使用。
    }
}
public class Demo3 {
    public static void main(String[] args) {
        Integer[] arr = {10,12,14,19};
        MyArrays<Integer> tool = new MyArrays<Integer>();
        tool.reverse(arr);
        System.out.println("数组的元素："+tool.toString(arr));
        MyArrays<String> tool2 = new MyArrays<String>();
        String[] arr2 = {"aaa","bbb","ccc"};
        tool2.reverse(arr2);
        System.out.println("数组的元素："+tool2.toString(arr2));
        ArrayList<String> list = new ArrayList<String>();
    }
}
