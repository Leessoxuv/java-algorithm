package BasicAlgorithm01;

import java.util.Scanner;

public class Test2 {
    static int min3(int a, int b, int c) {
        int min = a;
        if( min > b)
            min = b;
        if ( min > c)
            min = c;
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a의 값 : ");
        int a = sc.nextInt();
        System.out.println("b의 값 : ");
        int b = sc.nextInt();
        System.out.println("c의 값 : ");
        int c = sc.nextInt();

        System.out.println("최솟값은 " + min3(a,b,c) + "입니다.");
    }
}
