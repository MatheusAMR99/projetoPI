package model;

import java.util.Date;

public class ModelVenda {
    // Atributos de vendas

    private int idVendas;
    private Date datavenda;
    private double totalVenda;

    private ModelCliente idCliente;

    // Criou os constructors
    public ModelVenda(int idVendas, Date datavenda, double totalVenda) {
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

    public double getTotalVenda() {
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

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }



}
