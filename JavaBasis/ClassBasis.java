class printarray {
    int[] arr = new int[5];
    //private int[] arr = new int[5]; 定义一个成员变量arr，类型为int数组，并初始化为长度为5的数组，并且将其访问权限设置为private，表示只能在printarray类内部访问

    public printarray(int[] arr) {
        this.arr = arr; //实例化对象时，传入一个数组参数，并将其赋值给成员变量arr
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); //遍历数组并打印每个元素
        }
    }
}



public class ClassBasis {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        printarray pa = new printarray(numbers); //实例化printarray对象，并传入数组参数
    }

}

