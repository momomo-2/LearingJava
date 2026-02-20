import java.util.Arrays;

public class PrimativeTypes {
    public static void main(String[] args) {
        // 整数类型
        byte b = 127; // 8位有符号整数
        short s = 32767; // 16位有符号整数
        int i = 2147483647; // 32位有符号整数
        long l = 9223372036854775807L; // 64位有符号整数

        // 浮点数类型
        float f = 3.14f; // 32位浮点数
        double d = 3.141592653589793; // 64位浮点数

        // 字符类型
        char c = 'A'; // 16位 Unicode 字符

        // 布尔类型
        boolean boolTrue = true;
        boolean boolFalse = false;

        // 数组类型
        int[] arr = { 1, 2, 3, 4, 5 }; // 声明并初始化一个整数数组简化版
        int[] arr2 = new int[5]; // 声明一个长度为5的整数数组
        int[] arr3 = new int[]{ 1, 2, 3, 4, 5 }; // 声明并初始化一个整数数组完整版
        
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean true: " + boolTrue);
        System.out.println("boolean false: " + boolFalse);

        System.out.print("arr: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        System.out.println(Arrays.toString(arr2)); // 输出 arr2 的内容，默认值为0

        System.out.println("arr3 length: " + arr3.length); // 输出 arr3 的长度
        
    }
    
}
