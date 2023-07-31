import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {

        // declara a função scanner, importando a biblioteca
        Scanner sc = new Scanner(System.in);

        // declara as variaveis
        int A, B, C, D, dif;


        // faz com que as variaveis recebam os valores lidos
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        // função para as variáveis
        dif = A * B - C * D;
        //imprimir a variavel "soma"
        System.out.println("DIFERENCA = " + dif);

    }
}