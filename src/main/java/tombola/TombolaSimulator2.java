package tombola;
import java.util.ArrayList;
import java.util.Random;

public class TombolaSimulator2 {
    private ArrayList<Integer> arrayList = new ArrayList<>();
    private void init () {
        for (int i = 1; i < 91; i++) {
            arrayList.add(i);
        }
    }
    public int extractValue (int index) {
        Random random = new Random();
        for (int j = 0; j <= index; j++) {
            index = random.nextInt(arrayList.size());
            arrayList.remove(index);
        }
        return index;
    }
    public ArrayList<Integer> getExtractValues () {
        return arrayList;
    }
}
