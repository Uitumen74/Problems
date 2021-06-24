package Tests;

import java.util.HashSet;
import java.util.Set;

public class HashSetTut {

    public static void main(String args[]) {
        HashSet<Integer> hash = new HashSet<Integer>();
        hash.add(5);
        hash.add(1);
        hash.add(2);
        hash.add(4);
        hash.add(8);
        hash.add(2);
        hash.add(1);
        System.out.println(hash);
    }
}
