package comunicacion;

public class Alfabeto extends Pictograma {
    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras != null ? letras : new String[0];
        this.interpretacion = interpretacion != null ? interpretacion : "";
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }

    public int cantidadLetras() {
        if (letras == null) {
            return 0;
        }
        return letras.length;
    }

    @Override
    public String toString() {
        if (letras == null || letras.length == 0) {
            return "No letters available.";
        }
        return String.join(", ", letras);
    }
}
