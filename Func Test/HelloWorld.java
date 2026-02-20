class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println(10 - 1);
        System.out.println(10 > 5);
        
        System.out.println(true && false); // 逻辑与
        System.out.println(true || false); // 逻辑或
        System.out.println(!true); // 逻辑非

        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        } else if (x == 5) {
            System.out.println("x is equal to 5");
        } else {
            System.out.println("x is less than 5");
        }
        
        switch (x) {
            case 10:
                System.out.println("x is 10");
                break;
            case 5:
                System.out.println("x is 5");
                break;
            default:
                System.out.println("x is neither 10 nor 5");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        
        int count = 0;
        while (count < 5) {
            System.out.println("count = " + count);
            count++;
        }

        
    }
}