public class App {

    public static void main(String[] args) throws Exception {

        Generador g = new Generador();

        Results resultado = Benchmark.medir(() -> {
            g.generate(1000000);
        }, "Generacion de listado", "Sample 1");

        System.out.println(resultado);
    }
}