import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {

        // declara a função scanner, importando a biblioteca
        Scanner sc = new Scanner(System.in);

        // declara as variaveis
        int A, B, soma;

        // faz com que as variaveis recebam os valores lidos
        A = sc.nextInt();
        B = sc.nextInt();

        // função para somar as variáveis
        soma = A + B;

        //imprimir a variavel "soma"
        System.out.println("SOMA = " + soma);

    }
}