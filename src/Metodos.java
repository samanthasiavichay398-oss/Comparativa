import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Metodos {

    public void sortBubble(List<Integer> lista) {

        for (int i = 0; i < lista.size(); i++) {

            for (int j = 0; j < lista.size() - 1; j++) {

                if (lista.get(j) > lista.get(j + 1)) {

                    int numero = lista.get(j);

                    lista.set(j, lista.get(j + 1));

                    lista.set(j + 1, numero);
                }
            }
        }
    }

    public void sortQuick(List<Integer> lista) {

        if (lista.size() <= 1) {
            return;
        }

        int pivote = lista.get(0);

        List<Integer> menores = new ArrayList<>();
        List<Integer> mayores = new ArrayList<>();

        for (int i = 1; i < lista.size(); i++) {

            if (lista.get(i) <= pivote) {
                menores.add(lista.get(i));
            } else {
                mayores.add(lista.get(i));
            }
        }

        sortQuick(menores);
        sortQuick(mayores);

        lista.clear();

        lista.addAll(menores);
        lista.add(pivote);
        lista.addAll(mayores);
    }

    public void sortCollectors(List<Integer> lista) {

        List<Integer> nueva = lista.stream()
                .sorted()
                .collect(Collectors.toList());

        lista.clear();
        lista.addAll(nueva);
    }

    public void sortCollectorsV2(List<Integer> lista) {

        List<Integer> nueva = lista.parallelStream()
                .sorted()
                .collect(Collectors.toList());

        lista.clear();
        lista.addAll(nueva);
    }
}