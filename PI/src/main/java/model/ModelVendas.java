package model;

import java.util.Date;

public class ModelVendas {
    // Atributos de vendas

    private int  id;
    private Date datavenda;
    private double totalVenda;
    // Criou os constructors
    public ModelVendas(int id, Date datavenda, double totalVenda) {
        this.id = id;
        this.datavenda = datavenda;
        this.totalVenda = totalVenda;
    }
    // Criou os Getters
    public int getId() {
        return id;
    }

    public Date getDatavenda() {
        return datavenda;
    }

    public double getTotalVenda() {
        return totalVenda;
    }
    // Criou os Setteres
    public void setId(int id) {
        this.id = id;
    }

    public void setDatavenda(Date datavenda) {
        this.datavenda = datavenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }



}
