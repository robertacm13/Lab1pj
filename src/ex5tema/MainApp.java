package ex5tema;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Random random = new Random();
        int numar = random.nextInt(21);

        System.out.println("Numărul generat este: " + numar);

        if (fib(numar)) {
            System.out.println("Numărul " + numar + " aparține șirului Fibonacci.");
        } else {
            System.out.println("Numărul " + numar + " nu aparține șirului Fibonacci.");
        }
    }

    public static boolean fib(int numar) {
        int a = 0;
        int b = 1;
        if (numar == a || numar == b) {
            return true;
        }
        int c = a + b;
        while (c <= numar) {
            if (c == numar) {
                return true;
            }
            a = b;
            b = c;
            c = a + b;
        }

        return false;
    }
}
