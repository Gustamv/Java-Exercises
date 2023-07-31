import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int q = sc.nextInt();

        double t;
        if (numero == 1) {
            t = 4 * q;
        }
        else if (numero == 2) {
            t = 4.5 * q;
        }
        else if (numero == 3) {
            t = 5 * q;
        }
        else if (numero == 4) {
            t = 2 * q;
        }
        else {
            t = 1.5 * q;
        }

        System.out.println("Total: R$" + t);
        sc.close();
    }
}