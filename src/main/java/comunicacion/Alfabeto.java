package comunicacion;

public class Alfabeto extends Pictograma{
    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion){
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(){
        this.letras = letras;
    }

    public String interpretacion(){
        return interpretacion;
    }

    public void setInterpretacion(){
        this.interpretacion = interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    @Override
    public String toString() {
        return String.join(", ", letras);
    }

    public int cantidadLetras() {
        return letras.length;
    }
}