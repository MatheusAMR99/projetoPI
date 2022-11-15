package model;

import java.util.Date;

public class ModelVenda {
    // Atributos de vendas

    private int idVendas;
    private Date datavenda;
    private float totalVenda;

    private ModelCliente idCliente;
    private ModelProduto idProduto;

    public ModelVenda() {
    }

    
    // Criou os constructors
    public ModelVenda(int idVendas, Date datavenda, float totalVenda) {
        this.idVendas = idVendas;
        this.datavenda = datavenda;
        this.totalVenda = totalVenda;
    }
    // Criou os Getters


    public ModelCliente getIdCliente() {
        return idCliente;
    }

    public int getIdVendas() {
        return idVendas;
    }

    public Date getDatavenda() {
        return datavenda;
    }

    public float getTotalVenda() {
        return totalVenda;
    }
    // Criou os Setteres


    public void setIdCliente(ModelCliente idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdVendas(int idVendas) {
        this.idVendas = idVendas;
    }

    public void setDatavenda(Date datavenda) {
        this.datavenda = datavenda;
    }

    public void setTotalVenda(float totalVenda) {
        this.totalVenda = totalVenda;
    }

    public ModelProduto getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(ModelProduto idProduto) {
        this.idProduto = idProduto;
    }

    

}
