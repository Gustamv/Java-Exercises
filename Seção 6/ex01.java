import java.util.Locale;
import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite a senha: ");
        int senha = sc.nextInt();

        while (senha != 2002){
            System.out.println("Senha Invalida, digite novamente: ");
            senha = sc.nextInt();
        }
        System.out.println("Acesso permitido");

        sc.close();
    }
}
