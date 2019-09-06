package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Generate Random Int Array
 * @author Administrator
 */
public class RandomIntArray {
    public static int[] generate(int n) {
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < n; i++) {
            list.add(i);
        }

        Collections.shuffle(list);

        int[] array = new int[n];

        for(int i = 0; i < n; i ++) {
            array[i] = list.get(i);
        }

        return array;
    }
}
