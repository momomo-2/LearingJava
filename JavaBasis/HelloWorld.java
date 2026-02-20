class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println(10 - 1);
        System.out.println(10 > 5);
        
        System.out.println(true && false); // 逻辑与
        System.out.println(true || false); // 逻辑或
        System.out.println(!true); // 逻辑非


        // if-else 语句
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        } else if (x == 5) {
            System.out.println("x is equal to 5");
        } else {
            System.out.println("x is less than 5");
        }
        

        // switch 表达式
        switch (x) {
            case 10 -> System.out.println("x is 10");
            case 5 -> System.out.println("x is 5");
            default -> System.out.println("x is neither 10 nor 5");
        }

        switch (x) {
            case 10:
                System.out.println("x is 10");
            case 5:
                System.out.println("x is 5");
            default:
                System.out.println("x is neither 10 nor 5");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        

        // while 循环和 do-while 循环
        int count1 = 0;
        while (count1 < 5) {
            System.out.println("count1 = " + count1);
            count1++;
        }
        
        int count2 = 0;
        do {
            System.out.println("count2 = " + count2);
            count2++;
        } while (count2 < 5);


        
    }
}