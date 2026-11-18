public class Benchmark {

    public static Results medir(Runnable accion, String nombre, String Sample) {

        long tA = System.nanoTime();

        accion.run();

        long tF = System.nanoTime();

        long tiempoTotal = (tF - tA) / 1_000_000;

        Results results = new Results(nombre, Sample, tiempoTotal);

        return results;
    }
}