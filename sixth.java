public class sixth {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int result = func(a, b);
        System.out.println(result);
    }

    public static int func(int a, int b) {
        a = b;

        if ((1 ^ 1) != 0) {
            a = 1;
        } else {
            b = 2;
        }

        return a + b;
    }
}
