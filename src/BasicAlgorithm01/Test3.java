package BasicAlgorithm01;

import java.util.Scanner;

// Q3. 네 값의 최솟값을 구하는 min4 메서드를 작성하세요.
public class Test3 {
    static int min4(int a, int b, int c, int d) {
        int min = a;
        if (min > b)
            min = b;
        if (min > c)
            min = c;
        if (min > d)
            min = d;
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a의 값은 : ");
        int a = sc.nextInt();
        System.out.println("b의 값은 : ");
        int b = sc.nextInt();
        System.out.println("c의 값은 : ");
        int c = sc.nextInt();
        System.out.println("d의 값은 : ");
        int d = sc.nextInt();

        System.out.println("최솟값은 " + min4(a,b,c,d) + " 입니다. ");
    }
}
