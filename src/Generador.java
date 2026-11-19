import java.util.List;
import java.util.ArrayList;

public class Generador {

    public static List<Integer> generate(int size) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * size));
        }

        return list;
    }
}