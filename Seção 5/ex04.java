import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Inicial = sc.nextInt();
        int Final = sc.nextInt();

        int d;
            if (Inicial < Final) {
                d = Final - Inicial;
            }
            else {
                d = 24 - Inicial + Final;
            }

        System.out.println("O JOGO DUROU " + d + " HORA(S)");
        sc.close();
    }
}
