package dao;

import util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import model.ModelCliente;

/**
 *
 * @author Lucas
 */
public class ClienteDAO {

    public static boolean salvar(ModelCliente cliente) {
        String sql = "INSERT INTO cliente "
                + "(nome,cpf,endereco,telefone,email,sexo,estadoCivil,dataNascimento,cep,bairro,cidade,complemento,numero) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?,?,?,?,?,?,?)";
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        
        try {
            conexao = Conexao.abrirConexao();
            comandoSQL = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            comandoSQL.setString(1, cliente.getNome());
            comandoSQL.setString(2, cliente.getCpf());
            comandoSQL.setString(3, cliente.getEndereco());
            comandoSQL.setString(4, cliente.getTelefone());
            comandoSQL.setString(5, cliente.getEmail());
            comandoSQL.setString(6, cliente.getSexo());
            comandoSQL.setString(7, cliente.getEstadoCivil());
            
            comandoSQL.setDate(8, new java.sql.Date(cliente.getDataNascimento().getTime()));
            comandoSQL.setString(9, cliente.getCep());
            comandoSQL.setString(10, cliente.getBairro());
            comandoSQL.setString(11, cliente.getCidade());
            comandoSQL.setString(12, cliente.getComplemento());
            comandoSQL.setString(13, cliente.getNumero());

            int salvar = comandoSQL.executeUpdate();
            if (salvar > 0) {
                retorno = true;
                ResultSet rs = comandoSQL.getGeneratedKeys();
                if (rs.next()) {
                    cliente.setIdCliente(rs.getInt(1));
                } else {
                    throw new SQLException("Falha ao obter o ID do Cliente.");
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

    public static ArrayList<ModelCliente> listar() {
        String sql = "SELECT * FROM cliente; ";

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ArrayList<ModelCliente> lista = new ArrayList<>();
        try {
            conexao = Conexao.abrirConexao();
            comandoSQL = conexao.prepareStatement(sql);
            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {

                while (rs.next()) {
                    ModelCliente cliente = new ModelCliente();
                    cliente.setIdCliente(rs.getInt("idCliente"));
                    cliente.setNome(rs.getString("nome"));
                    cliente.setCpf(rs.getString("cpf"));
                    cliente.setEndereco(rs.getString("endereco"));
                    cliente.setTelefone(rs.getString("telefone"));
                    cliente.setEmail(rs.getString("email"));
                    cliente.setSexo(rs.getString("sexo"));
                    cliente.setEstadoCivil(rs.getString("estadoCivil"));
                    cliente.setDataNascimento(rs.getDate("dataNascimento"));
                    cliente.setCep(rs.getString("cep"));
                    cliente.setBairro(rs.getString("bairro"));
                    cliente.setCidade(rs.getString("cidade"));
                    cliente.setComplemento(rs.getString("complemento"));
                    cliente.setNumero(rs.getString("numero"));

                    lista.add(cliente);
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

    public static ArrayList<ModelCliente> listarPorNome(String nome) {
        String sql = "SELECT * FROM cliente WHERE nome like '%" + nome + "%' ;";

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ArrayList<ModelCliente> lista = new ArrayList<>();
        try {
            conexao = Conexao.abrirConexao();
            comandoSQL = conexao.prepareStatement(sql);
            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {

                while (rs.next()) {
                    ModelCliente cliente = new ModelCliente();
                    cliente.setIdCliente(rs.getInt("idCliente"));
                    cliente.setNome(rs.getString("nome"));
                    cliente.setCpf(rs.getString("cpf"));
                    cliente.setEndereco(rs.getString("endereco"));
                    cliente.setTelefone(rs.getString("telefone"));
                    cliente.setEmail(rs.getString("email"));
                    cliente.setSexo(rs.getString("sexo"));
                    cliente.setEstadoCivil(rs.getString("estadoCivil"));
                    cliente.setDataNascimento(rs.getDate("dataNascimento"));
                    cliente.setCep(rs.getString("cep"));
                    cliente.setBairro(rs.getString("bairro"));
                    cliente.setCidade(rs.getString("cidade"));
                    cliente.setComplemento(rs.getString("complemento"));
                    cliente.setNumero(rs.getString("numero"));

                    lista.add(cliente);
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

    public static ModelCliente buscarCPF(String cpf) {
        String sql = "SELECT * FROM cliente WHERE cpf = ?;";

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ArrayList<ModelCliente> lista = new ArrayList<>();
        ModelCliente cliente = new ModelCliente();

        try {
            conexao = Conexao.abrirConexao();
            comandoSQL = conexao.prepareStatement(sql);
            comandoSQL.setString(1, cpf);
            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {

                while (rs.next()) {

                    cliente.setIdCliente(rs.getInt("idCliente"));
                    cliente.setNome(rs.getString("nome"));
                    cliente.setCpf(rs.getString("cpf"));
                    cliente.setEndereco(rs.getString("endereco"));
                    cliente.setTelefone(rs.getString("telefone"));
                    cliente.setEmail(rs.getString("email"));
                    cliente.setSexo(rs.getString("sexo"));
                    cliente.setEstadoCivil(rs.getString("estadoCivil"));
                    cliente.setDataNascimento(rs.getDate("dataNascimento"));
                    cliente.setCep(rs.getString("cep"));
                    cliente.setBairro(rs.getString("bairro"));
                    cliente.setCidade(rs.getString("cidade"));
                    cliente.setComplemento(rs.getString("complemento"));
                    cliente.setNumero(rs.getString("numero"));

                }

            } else {

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
    }

    public static boolean editar(ModelCliente cliente) {
        String sql = "UPDATE cliente SET "
                + "nome =?,cpf=?,endereco=?,telefone=?,email=?,sexo=?,estadoCivil=?,"
                + "dataNascimento=?,cep=?,bairro=?,cidade=?,complemento=?,numero=? "
                + "WHERE idCliente=?; ";

        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;

        try {
            conexao = Conexao.abrirConexao();
            comandoSQL = conexao.prepareStatement(sql);
            comandoSQL.setString(1, cliente.getNome());
            comandoSQL.setString(2, cliente.getCpf());
            comandoSQL.setString(3, cliente.getEndereco());
            comandoSQL.setString(4, cliente.getTelefone());
            comandoSQL.setString(5, cliente.getEmail());
            comandoSQL.setString(6, cliente.getSexo());
            comandoSQL.setString(7, cliente.getEstadoCivil());
            comandoSQL.setDate(8, new java.sql.Date(cliente.getDataNascimento().getTime()));
            comandoSQL.setString(9, cliente.getCep());
            comandoSQL.setString(10, cliente.getBairro());
            comandoSQL.setString(11, cliente.getCidade());
            comandoSQL.setString(12, cliente.getComplemento());
            comandoSQL.setString(13, cliente.getNumero());
            comandoSQL.setInt(14, cliente.getIdCliente());

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
        String sql = "DELETE FROM cliente WHERE idCliente =?;";

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
