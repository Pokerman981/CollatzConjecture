package me.pokerman99.CollatzConjecture;

import java.util.*;

public class main {

    static List<Integer> integerList = new ArrayList<>();
    static Map<Integer, Integer> map = new HashMap();

    static int DISPLAYAMOUNT = 15;
    static int RANDOMBOUND = 99;

    public static void main(String[] args) {
        Random random = new Random();
        for (int x = 0; x < DISPLAYAMOUNT; x++) integerList.add(random.nextInt(RANDOMBOUND));

        integerList.forEach(integer -> algorithm(integer));
        System.out.println("OG Number\tTimes looped");
        map.forEach((integer, integer2) -> System.out.println(integer + "\t\t\t" + integer2));

    }

    public static void algorithm(int integer) {
        int counter = 0;
        int control = integer;
        while (control != 1) {
            if (control % 2 == 0) { //Even
                control = control / 2;
            } else {
                control = 3 * control + 1;
            }
            counter++;
        }

        map.put(integer, counter);
    }


}
