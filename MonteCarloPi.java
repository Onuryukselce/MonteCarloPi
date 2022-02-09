public class MonteCarloPi {

    public static void main(String... args) {
        System.out.println(calculatePi(10000000L));
    }

    private static double calculatePi(long dots) {
        double x = 0;
        double y = 0;
        long inCircleCounter = 0;
        for (long i = 0; i < dots; i++) {
            x = Math.random() * 2 - 1;
            y = Math.random() * 2 - 1;
            if (Math.pow(x, 2) + Math.pow(y, 2) <= 1)
                inCircleCounter++;
            System.out.print(inCircleCounter);
            System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");

        }
        System.out.println("ic : " + inCircleCounter);
        return 4 * (double) inCircleCounter / dots;
    }
}
