package ExerciseTombola;

public class Main {

    public static void main(String[] args) {
        Pari evenNumber = new Pari();

        evenNumber.setNumber(5);

        if(evenNumber.isEven()) {
            System.out.println("is even number");
        }
            System.out.println("is odd number");
    }

}
