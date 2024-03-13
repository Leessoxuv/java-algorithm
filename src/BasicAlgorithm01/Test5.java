package BasicAlgorithm01;

public class Test5 {
    /*
    static int med3(int a, int b, int c) {
        if ((b >=a && c <= a) || (b <= a && c >= a))
            return a;
        else if ((a > b && c < b) || (a < b && c > b))
            return b;
        return c;
    }
     */
    static int med3(int a, int b, int c) {
        if (a>=b)
            if (b>=c)
                return b;
            else if(a<=c)
                return a;
            else
                return c;
        else if (a>c)
            return a;
        else if (b>c)
            return c;
        else
            return b;
    }

    // 내답
    /*
    if~else 문이 더 효율이 좋은 이유는
    if절에 b>=a와 b<=a
    else if절에 a>b와 a<b등 비교연산자만 뒤집어진 형태로 비교 판단이
    반복되기 때문에 효율이 떨어진다
     */


}
