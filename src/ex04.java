import java.util.Locale;
import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {

        // declara a função scanner e locale, importando as bibliotecas
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // declara as variaveis
        int N, HT;
        double VH, S;


        // faz com que as variaveis recebam os valores lidos
        N = sc.nextInt();
        HT = sc.nextInt();
        VH = sc.nextDouble();

        // função para as variáveis
        S = HT * VH;
        //imprimir a variavel "soma"
        System.out.println("NUMBER = " + N);
        System.out.printf("SALARY: U$ %.2fn", S);

            sc.close();
    }
}
