public class SwapTwoIntWithoutUsingTemp {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;

        a = a + b; //6
        b = a - b; // 6 - 4
        a = a - b;
        System.out.println(a);
        System.out.println(b);

    }
}
