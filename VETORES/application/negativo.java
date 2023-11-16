package application;

import java.util.Locale;
import java.util.Scanner;

public class negativo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] v = new int[n];

        for(int i=0; i<n; i++) {
            System.out.println("Digite um numero: ");
            v[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            if(v[i] < 0) {
                System.out.println(v[i]);
            }
        }




        sc.close();
    }
}
