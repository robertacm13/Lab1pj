package ex4tema;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        int n, m;
        Random random = new Random();
        n = random.nextInt(30) + 1;
        m = random.nextInt(30) + 1;

        System.out.println("Numerele generate sunt: " + n + " și " + m);

        while (n != m) {
            if (n > m) {
                n -= m;
            } else {
                m -= n;
            }
        }

        System.out.println("CMMDC-ul celor două numere este: " + n);
    }
}
