package Listas;
import java.util.*;
import java.util.stream.Collectors;

public class Lista1 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Marcos");
        list.add("João Marcos");
        list.add("Tulio");
        list.add("Joaquim");
        list.add(1," João Gustavo");

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("----------------------------------");
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("----------------------------------");

        List <String> resultadoJ = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());

        for (String x : resultadoJ){
            System.out.println(x);
        }
    }
}
