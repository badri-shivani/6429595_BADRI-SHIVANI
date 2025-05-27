public class ex30 {
    public static void main(String[] args) {
        testSwitchPatternMatching("Hello");
        testSwitchPatternMatching(42);
        testSwitchPatternMatching(3.14);
        testSwitchPatternMatching(true);
    }

    public static void testSwitchPatternMatching(Object obj) {
        String result = switch (obj) {
            case Integer i -> "It's an Integer: " + i;
            case String s -> "It's a String: " + s;
            case Double d -> "It's a Double: " + d;
            case Boolean b -> "It's a Boolean: " + b;
            default -> "Unknown type";
        };
        System.out.println(result);
    }
}
