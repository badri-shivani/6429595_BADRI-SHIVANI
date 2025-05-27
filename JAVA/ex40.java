public class ex40 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            Thread.startVirtualThread(() -> {
                System.out.println("Running in virtual thread: " + Thread.currentThread());
            });
        }

        long end = System.currentTimeMillis();
        System.out.println("All virtual threads started in: " + (end - start) + " ms");
    }
}
