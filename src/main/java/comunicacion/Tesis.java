package comunicacion;

import java.util.List;

import comunicacion.Escrito;

public class Tesis extends Escrito{
    String idea;
    String[] argumentos;
    String conclusion;
    String referencias;
    String interpretacion;

    public Tesis(String titulo, String autor, int paginas, String resumen, String idea, List<String> argumentos, String conclusion, String referencias, String interpretacion) {
        super(titulo, autor, paginas, resumen);
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public List<String> getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(List<String> argumentos) {
        this.argumentos = argumentos;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    @Override
    public int palabrasTotales(int parametro) {
        return super.getPaginas() * parametro * 5;
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }

    public int cantidadArgumentos() {
        return argumentos.length;
    }

    @Override
    public String toString() {
        return super.getTitulo() + "\n" + super.getAutor() + "\n" + super.getPaginas() + "\n" + resumen + "\n" + idea + "\n" + conclusion + "\n" + referencias;
    }
}

