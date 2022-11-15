/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.ModelProduto;
import model.ModelVenda;
import util.Conexao;

/**
 *
 * @author Lucas
 */
public class VendaDAO {
    public static boolean salvar(ModelVenda venda) {
        String sql = "INSERT INTO venda "
                + "(idVenda, dataVenda,totalVenda,idCliente,idProduto) "
                + "VALUES(?, ?, ?, ?,?)";
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        
        try {
            conexao = Conexao.abrirConexao();
            comandoSQL = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            comandoSQL.setInt(1, venda.getIdVendas());
            comandoSQL.setDate(2, new java.sql.Date(venda.getDatavenda().getTime()));
            comandoSQL.setFloat(3, venda.getTotalVenda());
            comandoSQL.setInt(4, venda.getIdCliente().getIdCliente());
            comandoSQL.setInt(5, venda.getIdProduto().getIdProduto());


            int salvar = comandoSQL.executeUpdate();
            if (salvar > 0) {
                retorno = true;
                ResultSet rs = comandoSQL.getGeneratedKeys();
                if (rs.next()) {
                    venda.setIdVendas(rs.getInt(1));
                } else {
                    throw new SQLException("Falha ao obter o ID da venda.");
                }
            } else {
                retorno = false;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problema em conectar com o banco " + ex);
            retorno = false;
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver não encontrado " + ex);
        } finally {
            try {
                if (comandoSQL != null) {
                    comandoSQL.close();
                    Conexao.fecharConexao();
                }
            } catch (SQLException e) {
            }
        }
        return retorno;
    }
}
