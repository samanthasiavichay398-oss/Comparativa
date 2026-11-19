public class Benchmark {

    public static Results medir(Runnable accion, String nombre, String sample) {

        long tA = System.nanoTime();

        accion.run();

        long tF = System.nanoTime();

        long tiempoTotal = tF - tA;

        Results results = new Results(nombre, sample, tiempoTotal);

        return results;
    }
}