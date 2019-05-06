import java.lang.*;
import java.util.*;
import java.text.*;
import java.io.*;

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

    //public static void main(String args[]){
    public static void main(String args[])throws IOException{
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
        /*
        printMax(34, 3, 3, 2, 56.5);
        printMax(new double[]{1, 2, 3});
        */

        /*
        //使用 BufferedReader 在控制台读取字符
        char c;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        // 读取字符
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
        */

        //文件读写
        //File f = new File("../resource/test.txt");
        //OutputStream f = new FileOutputStream(f);
        /*
        //以二进制形式读写，产生乱码
        try {
            byte bWrite[] = { 11, 21, 3, 40, 5 };
            OutputStream os = new FileOutputStream("resource/test.txt");
            for (int x = 0; x < bWrite.length; x++) {
                os.write(bWrite[x]); // writes the bytes
            }
            os.close();

            InputStream is = new FileInputStream("resource/test.txt");
            int size = is.available();

            for (int i = 0; i < size; i++) {
                System.out.print((char) is.read() + "  ");
            }
            is.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
        */
        File f = new File("resource/test2.txt");
        FileOutputStream fop = new FileOutputStream(f);
        // 构建FileOutputStream对象,文件不存在会自动新建

        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
        // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk

        writer.append("中文输入");
        // 写入到缓冲区

        writer.append("\r\n");
        // 换行

        writer.append("English");
        // 刷新缓存冲,写入到文件,如果下面已经没有写入的内容了,直接close也会写入

        writer.close();
        // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉

        fop.close();
        // 关闭输出流,释放系统资源

        FileInputStream fip = new FileInputStream(f);
        // 构建FileInputStream对象

        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
        // 构建InputStreamReader对象,编码与写入相同

        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char) reader.read());
            // 转成char加到StringBuffer对象中
        }
        System.out.println(sb.toString());
        reader.close();
        // 关闭读取流

        fip.close();
        // 关闭输入流,释放系统资源

    }
}