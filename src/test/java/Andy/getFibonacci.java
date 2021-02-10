package Andy;

import java.util.Scanner;

public class getFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pick the 'n'-th Fibonacci element (n=?): ");
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num) {
        long op1 = 0;
        long op2 = 1;
        long current = 1;

        if (num > 0) {
            if (num == 1) {
                System.out.println(0);
            } else if (num == 2) {
                System.out.println(1);
            } else {

                for (int cycle = 2; cycle <= num; cycle++) {
                    current = op1 + op2;
                    op1 = op2;
                    op2 = current;
                }
            }
            System.out.println(current);
        }

    }
}
