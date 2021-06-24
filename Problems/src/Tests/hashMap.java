package Tests;

import java.util.HashMap;

public class hashMap {

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 1};
        int target = 3;
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            int con = target - arr[i];
            if (hash.containsKey(con)) {
                System.out.println(hash.get(con) + "   " + i);
            }
            hash.put(arr[i], i);
        }
    }
}
