package ex2tema;

import java.io.*;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("C:\\Users\\Roberta Chiton\\Desktop\\ANUL 3\\SEM 1\\PJ\\lab1\\src\\ex2tema\\in.txt"));
        FileWriter iesire = new FileWriter("C:\\Users\\Roberta Chiton\\Desktop\\ANUL 3\\SEM 1\\PJ\\lab1\\src\\ex2tema\\out.txt");

        int suma = 0;
        int[] vec = new int[100];
        int i = 0;
        while (scanner.hasNextInt()) {
            vec[i++] = scanner.nextInt();
        }
        int min = vec[0];
        int max = vec[0];
        for (int j = 0; j < i; j++) {
            suma += vec[j];
            if (min > vec[j]) min = vec[j];
            if (max < vec[j]) max = vec[j];
        }
        float med = (float) suma / i;

        System.out.println("Suma = " + suma + " Min = " + min + " Max = " + max + " Media = " + med);
        iesire.write("Suma = " + suma + " Min = " + min + " Max = " + max + " Media = " + med);
        iesire.close();
    }
}
