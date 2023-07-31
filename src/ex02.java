import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {

        // declara a função scanner, importando a biblioteca
        Scanner sc = new Scanner(System.in);

        // declara as variaveis
        int A, B, soma;
        double pi = 3.14159, R, pot;


        // faz com que as variaveis recebam os valores lidos
        R = sc.nextDouble();

        // função para as variáveis
        pot = Math.pow(R,2);

        //imprimir a variavel "soma"
        System.out.println("Area = " + pi * pot);

    }
}
