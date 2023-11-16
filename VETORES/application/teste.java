package application;

import java.util.Locale;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("vector lenght: ");
        int n = sc.nextInt();
        //sintaxe de vetor de n posições
        double[] v = new double[n];

        //aproveita o laço for para percorrer as posições do vetor
        for(int i=0; i<n; i++) {
            //incrementa o numero digitado na posicao i do vetor v
            v[i] =sc.nextDouble();
        }

        double sum = 0;
        for(int i=0; i<n; i++) {
            //acumula a soma dos valores que estao no vetor
            sum += v[i];
        }
        double avg = sum/n;

        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);

        sc.close();
    }
}
