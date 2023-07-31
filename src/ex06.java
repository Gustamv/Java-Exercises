import java.util.Locale;
import java.util.Scanner;

public class ex06 {

    public static void main(String[] args) {

        // declara a função scanner e locale, importando as bibliotecas
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // declara as variaveis
        int c1, c2, n1, n2;
        double v1, v2, T;


        // faz com que as variaveis recebam os valores lidos
        c1 = sc.nextInt();
        n1 = sc.nextInt();
        v1 = sc.nextDouble();
        c2 = sc.nextInt();
        n2 = sc.nextInt();
        v2 = sc.nextDouble();

        // função para as variáveis
        T = n1 * v1 + n2* v2;
        //imprimir a variavel "soma"
        System.out.printf("VALOR A PAGAR: R$ %.2f", T);

        sc.close();
    }
}

