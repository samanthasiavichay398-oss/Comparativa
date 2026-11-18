import java.util.List;
import java.util.concurrent.Callable;
import java.util.s

public class App {
    public static void main(String[] args) throws Exception {
        Generador g = new Generador();
        Benchmark b = new Benchmark ();

        List<Integer> list = g.generate(size:10000);
        System.out.println(list);
    }
}