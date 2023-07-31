package tombola;
import java.util.*;

public class TombolaSimulator {
    public static void main(String[] args) {
        int totalNumber = 90;
        int maxNumber = 20;

        Set<Integer> extractedNumbers = new HashSet<>();
        Random random = new Random();

        while (extractedNumbers.size() < maxNumber) {
            int randomNumber = random.nextInt(totalNumber) + 1;
            extractedNumbers.add(randomNumber);
        }

        System.out.println("Extracted number: ");
        for (int number : extractedNumbers) {
            System.out.println(number + " ");
        }
    }
}

class tombolaSimulator2 {
    public static void main(String[] args) {

        int totalNumber = 90;
        int maxNumber = 20;

        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();

        while (arrayList.size() < maxNumber) {
            int randomNumber = random.nextInt(totalNumber) + 1;
            if (!arrayList.contains(randomNumber)) {
                arrayList.add(randomNumber);
            }
        }

            System.out.println("Extracted number: ");
            for (int number : arrayList) {
                System.out.println(number + " ");
            }
    }
}