package comunicacion;

public class Libro {
    private String origen;
    private String titulo;
    private String autor;
    private int paginas;
    private String resumen;
    private String editorial;
    private String edicion;
    private String contenido;
    private String co_autor;

    // Constructor
    public Libro(String origen, String titulo, String autor, int paginas, String resumen, String editorial, String edicion, String contenido, String co_autor) {
        this.origen = origen;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.resumen = resumen;
        this.editorial = editorial;
        this.edicion = edicion;
        this.contenido = contenido;
        this.co_autor = co_autor;
    }


    // Getter for coAutor
    public String getCoAutor() {
        return coAutor;
    }

    // Setter for coAutor
    public void setCoAutor(String coAutor) {
        this.coAutor = coAutor;
    }

    // Getter for editorial
    public String getEditorial() {
        return editorial;
    }

    // Setter for editorial
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    // Getter for edicion
    public String getEdicion() {
        return edicion;
    }

    // Setter for edicion
    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    @Override
    public int palabrasTotales(int parametro) {
        // Assuming this is a method in the parent class to calculate the total words
        return super.getPaginas() * parametro * 2;
    }

    @Override
    public String interpretacion() {
        return interpretacion;  // Return the interpretation specific to the 'Libro' class
    }

    @Override
    public String toString() {
        return super.getTitulo() + "\n" + super.getAutor() + "\n" + super.getPaginas() + "\n" + super.resumen() + "\n" + coAutor + "\n" + editorial + "\n" + edicion;
    }
}
