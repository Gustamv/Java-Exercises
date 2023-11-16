package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Pessoa;
import entities.Product;

public class pessoa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao catalogadas?");
        int n = sc.nextInt();
        // instancia um novo vetor objeto de comprimento n
        Pessoa[] pessoa = new Pessoa[n];

        for(int i=0; i<n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa: ");
            System.out.println("Nome: ");
            String nome = sc.next();
            System.out.println("idade: ");
            int idade = sc.nextInt();
            System.out.println("altura: ");
            double altura = sc.nextDouble();
            // no final, instanciar o vetor com os parametros coletados
            pessoa[i] = new Pessoa(nome, idade, altura);
        }

        //instanciar uma variavel para coletar a altura media por meio de um loop for
        double sum = 0;

        for(int i=0; i<n; i++) {
            //incrementa no somatorio das alturas o valor da altura na posição i
            sum += pessoa[i].getAltura();
        }

        double altMedia = sum/n;
        
        //agora eh pegar a porcentagem de pessoas com menos de 16 anos e seus nomes
        double menorDe16 = 0;
        for(int i=0; i<n; i++) {
            if(pessoa[i].getIdade() < 16){
                menorDe16 += 1;
                System.out.println(pessoa[i].getNome() + " tem menos de 16 anos");
            }
        }

        double porcentagem = (menorDe16/n) * 100;
        System.out.println("Altura media: " + altMedia + "%");
        System.out.println("porcentagem dos menores de 16 anos: " + porcentagem);

        sc.close();
    }
}
