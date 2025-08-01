public class Main {
    public static int fun(int a, int b) {
        if (a != 0 && b != 0 && (a + b) > 0) {
            return a + fun(a - 2, b - 2) + b;
        }
        return a ^ b; // Bitwise XOR
    }

    public static void main(String[] args) {
        int res = fun(8, 8);
        System.out.println(res);  // Output: 40
    }
}
