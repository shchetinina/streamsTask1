package ru.netology;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Редактирование коллекции средствами коллекции");
        Integer[] array = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(array));

        arrayList.removeIf(item -> item < 1 || item % 2 != 0);
        arrayList.sort(Comparator.naturalOrder());
        arrayList.forEach(System.out::println);

        System.out.println("Редактирование коллекции средствами Stream API");
        StreamMain streamMain = new StreamMain();
        streamMain.main();
    }
}
