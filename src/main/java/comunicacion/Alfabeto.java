package comunicacion;

import comunicacion.Pictograma;

public class Alfabeto extends Pictograma{
    private String[] letras;
    private String interpretacion;

    public Alfabeto(String[] letras, String interpretacion){
    this.letras = letras;
    this.interpretacion = interpretacion;
    }

    public void setLetras(String[] letras){
        this.letras = letras;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setInterpretacion() {
        this.interpretacion = interpretacion;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public String interpretacion() {
        return interpretacion;
    }

    public int cantidadLetras(){
        if (letras == null){
            return 0;
        }
        return letras.length;
    }

    @Override
    public String toString() {
        if (letras == null || letras.length == 0) {
            return ""; 
        }
        return String.join(", ", letras);
    }
}
