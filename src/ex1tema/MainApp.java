package ex1tema;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lungime=");
        int lungime = scan.nextInt();
        System.out.println("latime=");
        int latime = scan.nextInt();
        System.out.println("Perimetrul=" + 2*(lungime+latime));
        System.out.println("Aria=" + (lungime*latime));
    }
}
