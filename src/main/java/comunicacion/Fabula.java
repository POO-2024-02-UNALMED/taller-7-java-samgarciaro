package comunicacion;

public class Fabula extends Escrito {
    private String ensenanzas;
    private String interpretacion;

    // Constructor
    public Fabula(String origen, String titulo, String autor, int paginas, String resumen, String ensenanzas, String interpretacion) {
        super(origen, titulo, autor, paginas, resumen); // Calling parent constructor
        this.ensenanzas = ensenanzas;
        this.interpretacion = interpretacion;
    }

    // Getter for ensenanzas
    public String getEnsenanzas() {
        return ensenanzas;
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
