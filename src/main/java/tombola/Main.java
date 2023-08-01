package tombola;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        TombolaSimulator2 tombola = new TombolaSimulator2();
        int extractMaxValue = 20;

        tombola.extractValue(extractMaxValue);

        ArrayList<Integer> extractedNumber = tombola.getExtractValues();
        System.out.println("Extracted number: ");
        for(int number : extractedNumber) {
            System.out.println(number);
        }
    }
}
