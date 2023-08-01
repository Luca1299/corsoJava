package timerExercise;
public class Main {
    public static void main(String[] args) {
        final int max = 1000000000;
        Timer1 t =new Timer1();

        t.start();
        int i = 1;
        for (i = 0; i < max; i++) {
            int x = 1;
            int y = 1;
            int z = x++;
            int z2 = x * y;
        }

        t.end();

        System.out.println("il tempo trascorso e': " + t.getElapsedTime());
    }
}
