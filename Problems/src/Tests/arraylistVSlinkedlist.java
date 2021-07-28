package Tests;

import java.util.ArrayList;

/**
 *
 * @author uitumen.t
 */
public class arraylistVSlinkedlist {

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 500; i++) {
            list.add(i);
        }
        list.remove(0);
        System.out.println(list.get(0));
    }
}
