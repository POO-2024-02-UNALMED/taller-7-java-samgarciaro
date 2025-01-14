package comunicacion;

public class Fabula extends Escrito{
    String ensenanzas;
    String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanzas, String interpretacion){
        super(origen,titulo,autor,paginas);
        this.ensenanzas = ensenanzas;
        this.interpretacion = interpretacion;
    }

    public void setEnsenanza(){
        this.ensenanzas = ensenanzas;
    }

    public String getEnsenanza(){
        return this.ensenanzas;
    }

    public int palabrasTotales(int palabrasPagina){
        int factor = 1;
        return getPaginas() * palabrasPagina * factor;
    }

    @Override
    public String toString() {
        return getOrigen() + "\n" +
               getTitulo() + "\n" +
               getAutor() + "\n" +
               getPaginas() + "\n" +
               ensenanzas;
    }

    @Override
    public String interpretacion() {
    return interpretacion;
    }
}