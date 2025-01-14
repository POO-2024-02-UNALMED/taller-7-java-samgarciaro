package comunicacion;

public class Periodico {
    private String origen;
    private String titulo;
    private String autor;
    private int paginas;
    private String fecha;
    private String tema;
    private String resumen;
    private String tipo;

    // Constructor
    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String tema, String resumen, String tipo) {
        this.origen = origen;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.fecha = fecha;
        this.tema = tema;
        this.resumen = resumen;
        this.tipo = tipo;
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
