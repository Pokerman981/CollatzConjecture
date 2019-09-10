package me.pokerman99.CollatzConjecture;

import org.jetbrains.annotations.Contract;

import java.util.*;

public class main {

    static List<Long> integerList = new ArrayList<>();
    static Map<Long, Long> map = new HashMap<>();

    static int DISPLAYAMOUNT = 30;
    static int RANDOMBOUND = 999999000;

    public static void main(String[] args) {
        Random random = new Random();
        for (int x = 0; x < DISPLAYAMOUNT; x++) integerList.add(Long.parseLong(String.valueOf(random.nextInt(RANDOMBOUND))));

        integerList.forEach(integer -> algorithm(integer));
        //algorithm(-1234564443);


        System.out.println("All numbers are converted to positive with ABS\nOG Number\tTimes looped");
        map.forEach((lon, lon2) -> System.out.println(lon + "\t\t" + lon2));
        System.out.println("\n\nMost times looped\t" + Collections.max(map.values()));

    }

    public static void algorithm(long lon) {

        long counter = 0;
        long control = isNegative(lon) ? Math.abs(lon) : lon;

        if (control==0) return;
        while (control != 1) {
            if (control % 2 == 0) { //Even
                control = control / 2;
            } else {
                control = 3 * control;
                control++;
            }
            counter++;
        }

        map.put(isNegative(lon) ? Math.abs(lon) : lon, counter);
    }

    @Contract(pure = true)
    static boolean isNegative(long lon) {
        if (lon > 0) {
            return false;
        } else {
            return true;
        }
    }

}
