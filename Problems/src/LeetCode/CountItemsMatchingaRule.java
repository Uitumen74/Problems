package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author uitumen.t
 */
public class CountItemsMatchingaRule {

    public static void main(String args[]) {
        List<List<String>> list = new ArrayList<List<String>>();
        List<String> ll = new ArrayList<String>();
        ll.add("phone");
        ll.add("blue");
        ll.add("pixel");
        list.add(ll);
        List<String> ll1 = new ArrayList<String>();
        ll1.add("computer");
        ll1.add("silver");
        ll1.add("lenovo");
        list.add(ll1);
        List<String> ll2 = new ArrayList<String>();
        ll2.add("phone");
        ll2.add("gold");
        ll2.add("iphone");
        list.add(ll2);
        System.out.println(countMatches(list, "type", "phone"));
    }

    static public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int type = 0;
        int sum = 0;
        if (ruleKey.equals("type")) {
            type = 0;
        } else if (ruleKey.equals("color")) {
            type = 1;
        } else if (ruleKey.equals("name")) {
            type = 2;
        }
        for (List<String> l : items) {
            if (l.get(type).equals(ruleValue)) {
                sum++;
            }
        }
        return sum;
    }
}
