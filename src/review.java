import java.lang.*;
import java.util.*;
import java.text.*;

public class review{
    //数组作为函数参数
    private static void printArray(int[] array){
        for(int i =0;i<array.length;i++)
            System.out.print(array[i]+" ");
        System.out.print("\n");
    }

    //数组作为返回值
    private static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }

    //可变参数
    public static void printMax(double... numbers){
        if(numbers.length == 0){
            System.out.println("No argument passed");
            return;
        }

        double result = numbers[0];

        for (int i = 1; i <  numbers.length; i++){
            if (numbers[i] >  result) {
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }

    public static void main(String args[]){
        //System.out.println("test1");

        //Number类型
        /*
        Integer x = 5;
        x = x+ 10;
        System.out.println(x);
        */

        //for-each循环
        /*
        double[] testList = {1.9, 2.9, 3.4, 3.5};
        for(double a:testList)
            System.out.println(a);
        */

        /*
        int[] a = new int[]{8,4,2,1};
        //数组作为函数参数
        printArray(a);

        //数组作为返回值
        int[] b = reverse(a);
        printArray(b);
        */

        /*
        //获取日期时间
        Date date = new Date();
        System.out.println(date.toString());

        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(ft.format(date));
        */

        //可变参数
        printMax(34, 3, 3, 2, 56.5);
        printMax(new double[]{1, 2, 3});
    }
}