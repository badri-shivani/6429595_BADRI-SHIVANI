public class ex8 {
    public static void main(String[] args) {
        int result = 10 + 5 * 2; // Multiplication has higher precedence than addition
        int result2 = (10 + 5) * 2; // Parentheses change the precedence

        System.out.println("Result without parentheses (10 + 5 * 2): " + result);
        System.out.println("Result with parentheses ((10 + 5) * 2): " + result2);
    }
}
