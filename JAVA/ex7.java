public class ex7 {
    public static void main(String[] args) {
        double myDouble = 9.78;
        int myInt = (int) myDouble; // Explicit casting: double to int

        int anotherInt = 42;
        double convertedDouble = anotherInt; // Implicit casting: int to double

        System.out.println("Original double: " + myDouble);
        System.out.println("Double cast to int: " + myInt);
        System.out.println("Original int: " + anotherInt);
        System.out.println("Int cast to double: " + convertedDouble);
    }
}
