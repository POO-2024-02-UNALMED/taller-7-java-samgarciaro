package comunicacion;

public class Fabula extends Escrito {
    private String ensenanzas;
    private String interpretacion;

    public Fabula(String titulo, String autor, int paginas, String resumen, String ensenanzas, String interpretacion) {
        super(titulo, autor, paginas, resumen);
        this.ensenanzas = ensenanzas;
        this.interpretacion = interpretacion;
    }

    public String getEnsenanzas() {
        return ensenanzas;
    }

    public void setEnsenanzas(String ensenanzas) {
        this.ensenanzas = ensenanzas;
    }

    @Override
    public int palabrasTotales(int parametro) {
        return super.getPaginas * parametro * 1;
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        return super.getTitulo + "\n" + super.getAutor + "\n" + super.getPaginas + "\n" + resumen + "\n" + ensenanzas;
    }
}