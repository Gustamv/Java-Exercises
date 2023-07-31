import java.util.Locale;
import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int a = 0, g = 0,d = 0, n = sc.nextInt();

        while (n != 4) {

            if (n != 1 && n != 2 && n != 3 && n != 4) {
                System.out.println("Numero invalido, digite novamente");
                n = sc.nextInt();
            }
            else if (n == 1){
                a += 1;
                n = sc.nextInt();
            }
            else if (n == 2){
                g += 1;
                n = sc.nextInt();
            }
            else {
                d += 1;
                n = sc.nextInt();
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + a);
        System.out.println("Gasolina: " + g);
        System.out.println("Diesel: " + d);


        sc.close();
    }
}


