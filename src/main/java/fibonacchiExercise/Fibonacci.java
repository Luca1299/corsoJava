package fibonacchiExercise;

public class Fibonacci {

    public long getRicorsiva (Long n) {
        if (n == 0)
            return 1l;
        if (n.equals(1l))
            return  1l;
        return getRicorsiva(n - 1) + getRicorsiva(n - 2);
    }
}
