package comunicacion;

public class Libro extends Escrito {
    private String coAutor;
    private String editorial;
    private String edicion;
    private String interpretacion;

    // Constructor
    public Libro(String origen, String titulo, String autor, int paginas, String resumen, String coAutor, String editorial, String edicion, String interpretacion) {
        super(origen, titulo, autor, paginas, resumen); // Call the parent class constructor
        this.coAutor = coAutor;
        this.editorial = editorial;
        this.edicion = edicion;
        this.interpretacion = interpretacion;
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
