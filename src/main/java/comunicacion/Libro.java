package comunicacion;

public class Libro extends Escrito {
    private String coAutor;
    private String editorial;
    private String edicion;
    private String interpretacion;

    public Libro(String titulo, String autor, int paginas, String resumen, String coAutor, String editorial, String edicion, String interpretacion) {
        super(titulo, autor, paginas, resumen);
        this.coAutor = coAutor;
        this.editorial = editorial;
        this.edicion = edicion;
        this.interpretacion = interpretacion;
    }

    public String getCoAutor() {
        return coAutor;
    }

    public void setCoAutor(String coAutor) {
        this.coAutor = coAutor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    @Override
    public int palabrasTotales(int parametro) {
        return super.getPaginas * parametro * 2;
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        return super.getTitulo() + "\n" + super.getAutor() + "\n" + super.getPaginas() + "\n" + resumen + "\n" + coAutor + "\n" + editorial + "\n" + edicion;
    }
}