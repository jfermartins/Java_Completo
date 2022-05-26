import java.util.List;
import java.util.ArrayList;

public class List {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        //adicionar à lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        //vizualizar o tamanho da lista
        System.out.println(list.size());

        //remover pelo nome
        list.remove("Anna");

        //remover pelo índice
        list.remove(1);

        for(String x : list) {
            System.out.println(x);
        }
    }
}
