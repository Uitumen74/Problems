package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author uitumen.t
 */
public class PascalsTriangle {

    public static void main(String[] args) {
        int n = 1;
        List<List<Integer>> ret = generate(n);
        for (List<Integer> l : ret) {
            System.out.println(l);
        }
    }

    static public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> doubleLs = new ArrayList<List<Integer>>();
        List<Integer> ls = new ArrayList<Integer>();
        ls.add(1);
        doubleLs.add(ls);
        for (int i = 1; i < numRows; i++) { 
               
            doubleLs.add(ls);
            ls.clear();
        }
        return doubleLs;
    }
}
