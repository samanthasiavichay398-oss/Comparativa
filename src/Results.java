public class Results {

    private String nombre;
    private String sample;
    private long tiempo;

    public Results(String nombre, String sample, long tiempo) {

        this.nombre = nombre;
        this.sample = sample;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSample() {
        return sample;
    }

    public long getTiempo() {
        return tiempo;
    }

    @Override
    public String toString() {

        return "Results [" + nombre +
                ", duration=" + tiempo +
                "ns, sample=" + sample + "]";
    }
}