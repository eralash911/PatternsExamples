package ComparatorExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortSomething {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{213,43,43,5,66,788,89,900,12};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
