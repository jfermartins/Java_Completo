import java.util.List;
import java.util.ArrayList;

public class List {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        //adicionar elementos à lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        //vizualizar o tamanho da lista
        System.out.println(list.size());

        //remover elementos pelo nome
        list.remove("Anna");

        //remover elementos pelo índice
        list.remove(1);

        //remover elementos que atendam a predicados
        //remover todos elementos que comecem pela letra M
        list.removeIf(x -> charAt(0) == 'M');

        //deixar na lista os elementos com a letra "A"
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A');


        for(String x : list) {
            System.out.println(x);
        }

        System.out.println("Index of Bob: " + list.indexOf("Bob"));
    }
}
