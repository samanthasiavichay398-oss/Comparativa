public class Benchmark {
    public static Results medir(Runnable accion, String nombre, String Sample) {
        long tA =Syste.nanoTime();
        accion,run();
        long tF = System.nano.Time();
        Results results = new Results(nombre, Sample, tiempoTotal);
        return results;
    }
}
