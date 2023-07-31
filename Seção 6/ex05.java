import java.util.Locale;
import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt(), in = 0, out = 0;

        for (int i = 1; i <= n; i++) {

            int x = sc.nextInt();

            if (x >=10 && x <= 20) {
                in += 1;
            }
            else {
                out += 1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
        sc.close();
    }
}



