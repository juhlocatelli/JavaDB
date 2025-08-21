public class Categoria {
    private int id;
    private String nome;
    private boolean ativo;
    public Categoria(String nome, boolean ativo) {
        this.nome = nome;
        this.ativo = ativo;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome (String nome) { this.nome = nome; }
    public boolean getisAtivo() { return ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }
}