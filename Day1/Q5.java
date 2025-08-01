public class Main {
    public static int fun(int a, int b) {
        for (int c = 2; c < 5; c++) {
            if ((a % 2) < (b % 3)) {
                a = 4 % 3; // a = 1
            }
            if ((5 % 3) > b) {
                a = b;
            }
            b = 1;
        }
        return a + b;
    }

    public static void main(String[] args) {
        int result = fun(7, 5);
        System.out.println(result);  // Output: 2
    }
}
