
// 15. Check whether input character is vowel or consonant

import java.util.Scanner;

public class j15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if ("aeiouAEIOU".indexOf(ch) != -1) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
