import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class LISTA1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        //adicionando elementos na lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        //imprimindo o tamanho da lista
        //System.out.println(list.size());

        //removendo elemento da lista
        //list.remove("Anna");

        //removendo pela posicao
        //ist.remove(1);

        //remover elementos que atendam a um predicado


        for(String x : list) {
            System.out.println(x);
        }
        System.out.println("-------------");
        // remover todo String x tal que (->) o primeiro caracter do elemtno seja 'M'
        list.removeIf(x -> x.charAt(0) == 'M');
        for(String x : list) {
            System.out.println(x);
        }



        sc.close();
    }
}
