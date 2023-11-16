package application;
import entities.Rent;
import java.util.Locale;
import java.util.Scanner;

public class rent {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Crie um array de objetos Rent para armazenar as informações de aluguel
        Rent[] rent = new Rent[10];

        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();

        // Peça ao usuário para fornecer as informações de aluguel para cada cômodo
        for (int i = 1; i <= n; i++) {
            System.out.println("Rent #" + i + ": ");
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.next();
            System.out.println("Room:");
            int roomNumber = sc.nextInt();

            // modo antigo
            // rent[i] = new Rent(name, email, roomNumber);
            // modo novo que da no mesmo
            rent[roomNumber] = new Rent(name, email);
            //instanciando o objeto e atribuindo a referencia dele para o vetor na posição desejada
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for(int i=0; i<10; i++) {
            if(rent[i] != null) {
                System.out.println(i + ": " + rent[i]);
            }
        }


        sc.close();
    }
}
