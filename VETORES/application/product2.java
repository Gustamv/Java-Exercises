package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class product2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // exemplo utilizando vetor de referencia
        System.out.println("Quantos produtos serao catalogados?");
        int n = sc.nextInt();
        Product[] v = new Product[n];

        // loop for para capturar os valores e jogar dentro do vetor
        for(int i=0; i<n; i++) {
            String name = sc.next();
            double price = sc.nextDouble();
            v[i] = new Product(name, price);
        }

        double sum = 0;

        for(int i=0; i<n; i++) {
            // incrementar o valor do price na posião do vetor i
            sum+= v[i].getPrice();
        }

        double avg = sum/n;
        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        sc.close();
    }
}
