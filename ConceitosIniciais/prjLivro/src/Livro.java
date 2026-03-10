
public class Livro {

    private int identificacao;
    private String titulo;
    private boolean situacao;
    private double valMultaDiaria;

    public Livro(int identificacao, String titulo) {
        this.identificacao = identificacao;
        this.titulo = titulo;
    }

    public void emprestar() {
        this.situacao = true;
    }

    public double devolver(int diasAtraso) {
        this.situacao = false;
        return this.valMultaDiaria * diasAtraso;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public double getValMultaDiaria() {
        return valMultaDiaria;
    }

    public void setValMultaDiaria(double valMultaDiaria) {
        this.valMultaDiaria = valMultaDiaria;
    }
}
