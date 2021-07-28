package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author uitumen.t
 */
public class CreateTargetArrayintheGivenOrder {

    public static void main(String args[]) {
        int[] nums = {1};
        int[] index = {0};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    static public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < index.length; i++) {
            list.add(index[i], nums[i]);
        }
        int[] ret = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }
}
