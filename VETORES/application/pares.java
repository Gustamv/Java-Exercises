package application;

import java.util.Locale;
import java.util.Scanner;

public class pares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce ira digitar? ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for(int i=0; i<n; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        sc.close();
    }
}
