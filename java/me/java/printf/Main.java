package me.java.printf;

public class Main {
    public static void main(String[] args) {
        int i = 10;
        float f = 12.34f;
        double d = 56.78;
        char c = 'a';
        String s = "Hello World";
        boolean b = true;

        // int
        System.out.printf("%d\n" , i);
        System.out.printf("%10d\n" , i); // 오른쪽으로 정렬
        System.out.printf("%-10d\n" , i); // 왼쪽으로 정렬

    }
}
