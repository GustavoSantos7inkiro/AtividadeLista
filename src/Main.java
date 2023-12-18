import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list =  new ArrayList<>();

        list.add("Adryan");
        list.add("Vinicius");
        list.add("Carlos");
        list.add("Gustavo");
        list.add("Artur");

        System.out.println("Tamanho da lista: " + list.size());
        for(String x : list) {
            System.out.print(x);
        }
        System.out.println("----------------");

        int positionToGet = 2;
        String elementAtPosition = list.get(positionToGet);
        System.out.println("Na posição " + positionToGet + ";" + elementAtPosition);

        System.out.println("----------------");

        int positionToSet = 1;
        String newName = "Gabriel";
        list.set(positionToSet, newName);
        System.out.println("Novo nome adicionado na posição " + positionToSet + "chamado" + newName);
        for(String x: list) {
            System.out.println(x);
        }

        System.out.println("-----------------");

        Collections.sort(list);
        System.out.print("Lista ordenada: ");
        for(String x : list) {
            System.out.println(x);
        }

        list.removeIf(x -> x.charAt(4) == 'a');
        for(String x : list) {
            System.out.println(x);
        }

        System.out.println("------------------");

        System.out.println("indice do Carlos: " + list.indexOf("Carlos"));
        System.out.println("indice do Gustavo: " + list.indexOf("Gustavo"));

        System.out.println("------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for(String x : result) {
            System.out.print(x);
        }

        System.out.println("------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
        System.out.println(name);



        }


    }
