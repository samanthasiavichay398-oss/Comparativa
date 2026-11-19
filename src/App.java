import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Metodos m = new Metodos();

        List<Integer> lista1 = Generador.generate(10000);
        List<Integer> lista2 = Generador.generate(50000);
        List<Integer> lista3 = Generador.generate(100000);

        // Pruebas con 10000

        Results r1 = Benchmark.medir(
                () -> m.sortBubble(new ArrayList<>(lista1)),
                "Burbuja", "10.000");

        Results r2 = Benchmark.medir(
                () -> m.sortQuick(new ArrayList<>(lista1)),
                "Quicksort", "10.000");

        Results r3 = Benchmark.medir(
                () -> m.sortCollectors(new ArrayList<>(lista1)),
                "Collectors", "10.000");

        Results r4 = Benchmark.medir(
                () -> m.sortCollectorsV2(new ArrayList<>(lista1)),
                "Collectors V2", "10.000");


        // Pruebas con 50000

        Results r5 = Benchmark.medir(
                () -> m.sortBubble(new ArrayList<>(lista2)),
                "Burbuja", "50.000");

        Results r6 = Benchmark.medir(
                () -> m.sortQuick(new ArrayList<>(lista2)),
                "Quicksort", "50.000");

        Results r7 = Benchmark.medir(
                () -> m.sortCollectors(new ArrayList<>(lista2)),
                "Collectors", "50.000");

        Results r8 = Benchmark.medir(
                () -> m.sortCollectorsV2(new ArrayList<>(lista2)),
                "Collectors V2", "50.000");


        // Pruebas con 100000

        Results r9 = Benchmark.medir(
                () -> m.sortBubble(new ArrayList<>(lista3)),
                "Burbuja", "100.000");

        Results r10 = Benchmark.medir(
                () -> m.sortQuick(new ArrayList<>(lista3)),
                "Quicksort", "100.000");

        Results r11 = Benchmark.medir(
                () -> m.sortCollectors(new ArrayList<>(lista3)),
                "Collectors", "100.000");

        Results r12 = Benchmark.medir(
                () -> m.sortCollectorsV2(new ArrayList<>(lista3)),
                "Collectors V2", "100.000");


        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

        System.out.println(r5);
        System.out.println(r6);
        System.out.println(r7);
        System.out.println(r8);

        System.out.println(r9);
        System.out.println(r10);
        System.out.println(r11);
        System.out.println(r12);
    }
}