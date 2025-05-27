public class ex12 {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 5 and 10 (int): " + add(5, 10));
        System.out.println("Sum of 3.5 and 2.5 (double): " + add(3.5, 2.5));
        System.out.println("Sum of 1, 2, and 3 (int): " + add(1, 2, 3));
    }
}
