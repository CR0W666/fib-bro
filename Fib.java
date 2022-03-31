import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Fib {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Fib bro");

        final Fibonacci fib = new Fibonacci(getInput());
        
        printSeq(fib.getReverse());

        sc.close();
    }

    public static int getInput() {

        System.out.println("Input a number");
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("NaN");
            return getInput();
        }
        
    }

    public static void printSeq(int[] seq) {
        System.out.println("elements: " + Arrays.toString(seq));
        System.out.println("0\n1");
        for (int i = 2; i < seq.length; i++) {
            System.out.println(seq[i] + " = " + seq[i - 1] + " + " + seq[i - 2]); 
        }
    }
}

class Fibonacci {

    private int[] sequence;

    Fibonacci(int len) {
        sequence = calculateSequence(len);
    }

    public int[] calculateSequence(int ceil) {
        int[] result = new int[ceil + 2];
        result[0] = 0;
        result[1] = 1;

        for(int i = 2; i < result.length; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }

        return result;
    }

    public int[] getSequence() {
        return sequence;
    }

    public int[] getReverse() {
        int[] reversed = sequence;
        Collections.reverse(Arrays.asList(reversed));
        return reversed;
    }

}
