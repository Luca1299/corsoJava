package ExerciseTombola;

public class Pari {

    public int number;

    public boolean isEven () {

        return (this.number % 2 == 0);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
