package model;

import java.util.Date;

public class ModelRelatorio {
    private int idRelatorio;
    private Date dataInicial;
    private Date dataFinal;
    private ModelCliente idCliente;
    private ModelVenda idVenda;
    private ModelProduto idProduto;

    public int getIdRelatorio() {
        return idRelatorio;
    }

    public void setIdRelatorio(int idRelatorio) {
        this.idRelatorio = idRelatorio;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public ModelCliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(ModelCliente idCliente) {
        this.idCliente = idCliente;
    }

    public ModelVenda getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(ModelVenda idVenda) {
        this.idVenda = idVenda;
    }

    public ModelProduto getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(ModelProduto idProduto) {
        this.idProduto = idProduto;
    }

    public ModelRelatorio(int idRelatorio, Date dataInicial, Date dataFinal, ModelCliente idCliente, ModelVenda idVenda, ModelProduto idProduto) {
        this.idRelatorio = idRelatorio;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.idCliente = idCliente;
        this.idVenda = idVenda;
        this.idProduto = idProduto;


    }
}
