package BasicAlgorithm01;

import java.util.Scanner;

public class Test1 {
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a의 값 : ");
        int a = sc.nextInt();
        System.out.println("b의 값 : ");
        int b = sc.nextInt();
        System.out.println("c의 값 : ");
        int c = sc.nextInt();
        System.out.println("d의 값 : ");
        int d = sc.nextInt();

        System.out.println("최솟값은 " + max4(a,b,c,d) + "입니다.");
    }
}
