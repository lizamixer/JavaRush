package JavaCore.level20;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x;
        int y = 0;
        while(console.hasNextInt()) {
            x = console.nextInt();
            y = y+x;
        }
        System.out.println(y);
    }

}
