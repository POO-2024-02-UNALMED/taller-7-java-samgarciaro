package comunicacion;

public class Fabula {
    private String origen;
    private String titulo;
    private String autor;
    private int paginas;
    private String resumen;
    private String idea;
    private String ensenanza;

    public Fabula(String origen, String titulo, String autor, int paginas, String resumen, String idea, String ensenanza) {
        this.origen = origen;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.resumen = resumen;
        this.idea = idea;
        this.ensenanza = ensenanza;
    }

    // Getters and Setters (if needed)
    public String getEnsenanza() {
        return ensenanza;
    }
}


    // Setter for ensenanzas
    public void setEnsenanzas(String ensenanzas) {
        this.ensenanzas = ensenanzas;
    }

    @Override
    public int palabrasTotales(int parametro) {
        return super.getPaginas() * parametro * 1; // Assuming 1 is your factor here
    }

    @Override
    public String interpretacion() {
        return interpretacion;  // Return the interpretation specific to the 'Fabula' class
    }

    @Override
    public String toString() {
        return super.getTitulo() + "\n" + super.getAutor() + "\n" + super.getPaginas() + "\n" + super.resumen() + "\n" + ensenanzas;
    }
}
