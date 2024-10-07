package ex3tema;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args){
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("N=");
        n=scanner.nextInt();
        int i;
        int d=0;
        for(i=2;i<=n/2;i++) {
            if(n%i==0)
            {
                System.out.println(i);
                d++;
            }

        }
        if(d==0)
            System.out.println("Numarul este prim");
    }
}
