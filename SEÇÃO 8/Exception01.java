import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position-1]);
        }
        // esse "e" é apenas uma forma de identificar, um apelino padrão
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
        }
        catch (InputMismatchException e) {
            System.out.println("Input error!");
        }
        System.out.println("End of program.");
    }
}