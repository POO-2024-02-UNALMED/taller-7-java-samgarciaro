package comunicacion;

public class Periodico extends Escrito {
    private String fecha;
    private String primicia;
    private String interpretacion;

    // Constructor
    public Periodico(String origen, String titulo, String autor, int paginas, String resumen, String fecha, String primicia, String interpretacion) {
        super(origen, titulo, autor, paginas, resumen); // Calling the parent constructor
        this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = interpretacion;
    }

    // Getter for fecha (date)
    public String getFecha() {
        return fecha;
    }

    // Setter for fecha (date)
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    // Getter for primicia (scoop)
    public String getPrimicia() {
        return primicia;
    }

    // Setter for primicia (scoop)
    public void setPrimicia(String primicia) {
        this.primicia = primicia;
    }

    @Override
    public int palabrasTotales(int parametro) {
        return super.getPaginas() * parametro * 10; // 10 appears to be the factor specific to newspapers
    }

    @Override
    public String interpretacion() {
        return interpretacion;  // Return the interpretation specific to the 'Periodico' class
    }

    @Override
    public String toString() {
        return super.getTitulo() + "\n" + super.getAutor() + "\n" + super.getPaginas() + "\n" + super.resumen() + "\n" + fecha + "\n" + primicia;
    }
}
