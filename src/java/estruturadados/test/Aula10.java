package estruturadados.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class Aula10 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("A");
        array.add("C");
        array.add("b");
        array.add("E");
        array.add("B");
        System.out.println(array);

        array.add(1, "B");
        System.out.println(array);

        System.out.println("Contains: " + array.contains("C"));
        System.out.println("IndexOf \"B\": " + array.indexOf("B"));
        for (String s1 : array) {
            System.out.println("Get("+array.indexOf(s1) +"): "+s1);
        }
        array.removeIf(s -> {
            return Objects.equals(s, "B");
        });
        System.out.println("Depois do removeIf(): "+ array);
    }
}
