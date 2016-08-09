package ynwa.fuji.server;


import java.util.Random;

/**
 * Created by ynwa on 16/8/8.
 */
public class Utils {
    public static <T extends Object> T[] shuffle(T[] cards) {
        Random rnd = new Random();
        for (int i=cards.length; i>1; i--)
            swap(cards, i-1, rnd.nextInt(i));
        return cards;
    }

    private static <T extends Object> void swap(T[] arr, int i, int j) {
        T tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
