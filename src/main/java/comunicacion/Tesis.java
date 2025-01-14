package comunicacion;


public class Tesis {
    private String origen;
    private String titulo;
    private String autor;
    private int paginas;
    private String resumen;
    private String idea;
    private String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    // Constructor
    public Tesis(String origen, String titulo, String autor, int paginas, String resumen, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
        this.origen = origen;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.resumen = resumen;
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }

    // Getter and Setter methods
    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public String[] getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(String[] argumentos) {
        this.argumentos = (argumentos != null) ? argumentos : new String[0]; // Avoid null arrays
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

    // Overridden method for calculating total words
    @Override
    public int palabrasTotales(int parametro) {
        return super.getPaginas() * parametro * 5; // This factor should be reviewed as per your requirement
    }

    // Overridden method for interpretation
    @Override
    public String interpretacion() {
        return interpretacion;
    }

    // Method to get the number of arguments
    public int cantidadArgumentos() {
        return (argumentos != null) ? argumentos.length : 0;
    }

    // Overridden toString method for a formatted output
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getTitulo()).append("\n")
          .append(super.getAutor()).append("\n")
          .append(super.getPaginas()).append("\n")
          .append(super.resumen()).append("\n")
          .append("Idea: ").append(idea).append("\n")
          .append("Conclusion: ").append(conclusion).append("\n")
          .append("Referencias: ").append(referencias).append("\n")
          .append("Argumentos: ");
        
        // Append each argumento if available
        if (argumentos != null && argumentos.length > 0) {
            for (String argumento : argumentos) {
                sb.append(argumento).append("\n");
            }
        } else {
            sb.append("No arguments provided.\n");
        }
        
        return sb.toString();
    }
}
