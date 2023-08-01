package fibonacchiExercise;

import java.util.Scanner;

public class Main {
 /*   public static void main(String[] args) {
        Fibonacci f = new Fibonacci();

        final Long max = 12l;
        for (Long i = 0L; i < max; i++){
            Long fibo = f.getRicorsiva(i);
            System.out.println("Fibonacci" + i + " -> " + fibo);
        }
    }*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero:");
        int n = scanner.nextInt();

        int firstNumber = 0;
        int secondNumber = 1;

        System.out.println("serie di fibonacci in corso:");

        for (int i = 1; i <= n; i++) {

            System.out.print(firstNumber + ", ");

            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }

       scanner.close();

    }

   /* public static void main(String[] args) {
        int n = 10, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }*/
}
