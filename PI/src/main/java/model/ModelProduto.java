package model;

public class ModelProduto {

    private int idProduto;
    private String nome;
    private String categoria;
    private int quantidade;
    private String marca;
    private float valor;


    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public ModelProduto(int idProduto, String nome, String categoria, int quantidade, String marca, float valor) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.marca = marca;
        this.valor = valor;


    }
}
