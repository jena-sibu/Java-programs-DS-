
// 18. Calculate Simple Interest

import java.util.Scanner;

public class j18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble(), r = sc.nextDouble(), t = sc.nextDouble();
        double si = (p * r * t) / 100;
        System.out.println("Simple Interest: " + si);
    }
}