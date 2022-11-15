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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ModelProduto;
import util.Conexao;

/**
 *
 * @author Lucas
 */
public class ProdutoDAO {
    public static boolean salvar(ModelProduto produto) {
        String sql = "INSERT INTO produto "
                + "(nome, categoria,quantidade,valor) "
                + "VALUES(?, ?, ?, ?)";
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        
        try {
            conexao = Conexao.abrirConexao();
            comandoSQL = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            comandoSQL.setString(1, produto.getNome());
            comandoSQL.setString(2, produto.getCategoria());
            comandoSQL.setInt(3, produto.getQuantidade());
            comandoSQL.setFloat(4, produto.getValor());


            int salvar = comandoSQL.executeUpdate();
            if (salvar > 0) {
                retorno = true;
                ResultSet rs = comandoSQL.getGeneratedKeys();
                if (rs.next()) {
                    produto.setIdProduto(rs.getInt(1));
                } else {
                    throw new SQLException("Falha ao obter o ID do produto.");
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

    public static ArrayList<ModelProduto> listar() {
        String sql = "SELECT * FROM produto; ";

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ArrayList<ModelProduto> lista = new ArrayList<>();
        try {
            conexao = Conexao.abrirConexao();
            comandoSQL = conexao.prepareStatement(sql);
            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {

                while (rs.next()) {
                    ModelProduto produto = new ModelProduto();
                    produto.setIdProduto(rs.getInt("idProduto"));
                    produto.setNome(rs.getString("nome"));
                    produto.setCategoria(rs.getString("categoria"));
                    produto.setQuantidade(rs.getInt("quantidade"));
                    produto.setValor(rs.getFloat("valor"));

                    lista.add(produto);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public static ArrayList<ModelProduto> listarPorNome(String nome) {
        String sql = "SELECT * FROM produto WHERE nome like '%" + nome + "%' ;";

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ArrayList<ModelProduto> lista = new ArrayList<>();
        try {
            conexao = Conexao.abrirConexao();
            comandoSQL = conexao.prepareStatement(sql);
            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {

                while (rs.next()) {
                    ModelProduto produto = new ModelProduto();
                    produto.setIdProduto(rs.getInt("idProduto"));
                    produto.setNome(rs.getString("nome"));
                    produto.setCategoria(rs.getString("categoria"));
                    produto.setQuantidade(rs.getInt("quantidade"));
                    produto.setValor(rs.getFloat("valor"));

                    lista.add(produto);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public static ModelProduto listarPorCodigo(int id) {
        String sql = "SELECT * FROM produto WHERE idProduto= ?;";

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ModelProduto produto = new ModelProduto();
        try {
            conexao = Conexao.abrirConexao();
            comandoSQL = conexao.prepareStatement(sql);
            comandoSQL.setInt(1, id);
            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    produto.setIdProduto(rs.getInt("idProduto"));
                    produto.setNome(rs.getString("nome"));
                    produto.setCategoria(rs.getString("categoria"));
                    produto.setQuantidade(rs.getInt("quantidade"));
                    produto.setValor(rs.getFloat("valor"));
                }

            } else {

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return produto;
    }

    public static boolean editar(ModelProduto produto) {
        String sql = "UPDATE produto SET "
                + "nome =?,categoria=?,quantidade=?,valor=?"
                + "WHERE idProduto=?; ";

        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;

        try {
            conexao = Conexao.abrirConexao();
            comandoSQL = conexao.prepareStatement(sql);
            comandoSQL.setString(1, produto.getNome());
            comandoSQL.setString(2, produto.getCategoria());
            comandoSQL.setInt(3, produto.getQuantidade());
            comandoSQL.setFloat(4, produto.getValor());
            comandoSQL.setInt(5, produto.getIdProduto());

            int resultado = comandoSQL.executeUpdate();
            if (resultado > 0) {
                retorno = true;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
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

    public static boolean atualizarQuantidade(ModelProduto produto) {
        String sql = "UPDATE produto SET "
                + "quantidade=?"
                + "WHERE idProduto=?; ";

        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;

        try {
            conexao = Conexao.abrirConexao();
            comandoSQL = conexao.prepareStatement(sql);
            comandoSQL.setInt(1, produto.getQuantidade());
            comandoSQL.setInt(2, produto.getIdProduto());

            int resultado = comandoSQL.executeUpdate();
            if (resultado > 0) {
                retorno = true;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
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
    
    public static boolean excluir(int id) {
        String sql = "DELETE FROM produto WHERE idProduto =?;";

        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;

        try {
            conexao = Conexao.abrirConexao();
            comandoSQL = conexao.prepareStatement(sql, id);
            comandoSQL.setInt(1, id);

            int resultado = comandoSQL.executeUpdate();
            if (resultado > 0) {
                retorno = true;

            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
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
