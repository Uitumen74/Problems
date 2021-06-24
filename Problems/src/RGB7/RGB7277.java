package RGB7;

import java.util.ArrayList;
import java.util.Scanner;

public class RGB7277 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ret = Robot(n);
        System.out.print(ret);
    }

    public static int Robot(int n) {
        Scanner scann = new Scanner(System.in);
        String[] array;
        for (int i = 0; i < n; i++) {
            int duo = scann.nextInt();
            for (int j = 0; j < duo; j++) {
                String str = scann.nextLine();
                array[j] = str;
            }
        }
        return 1;
    }
}
