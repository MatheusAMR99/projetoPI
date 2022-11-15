/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import dao.ProdutoDAO;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelProduto;
import util.Validacao;

/**
 *
 * @author Lucas
 */
public class Produto extends javax.swing.JFrame {

    /**
     * Creates new form TelaProduto
     */
    public Produto() {
        initComponents();
        txtID.setEditable(false);
        txtID.setBackground(Color.LIGHT_GRAY);
        txtPesquisar.grabFocus();
        lblMensagem.setText("");
        listar();
        URL url = this.getClass().getResource("/icone.png");
        Image logo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(logo);
    }
    Validacao validar = new Validacao();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipa = new javax.swing.JPanel();
        produto = new javax.swing.JPanel();
        nome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        quantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        valor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        categoria = new javax.swing.JLabel();
        cboCategoria = new javax.swing.JComboBox<>();
        lblMensagem = new javax.swing.JLabel();
        pesquisa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        botoes = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painelPrincipa.setBackground(new java.awt.Color(202, 231, 255));

        produto.setBackground(new java.awt.Color(202, 221, 241));
        produto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        nome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nome.setText("Nome: ");

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtNome.setEnabled(false);

        quantidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        quantidade.setText("Quantidade: ");

        txtQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtQuantidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtQuantidade.setEnabled(false);
        txtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuantidadeKeyPressed(evt);
            }
        });

        valor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        valor.setText("Valor");

        txtValor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtValor.setEnabled(false);

        id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        id.setText("ID: ");

        txtID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtID.setEnabled(false);

        categoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        categoria.setText("Categoria: ");

        cboCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anéis", "Bolsas", "Bonés", "Brincos", "Carteiras", "Cachecois", "Chapéus", "Chaveiros", "Cintos", "Colares", "Jóias e Bijuterias", "Mochilas", "Óculos", "Pulseiras", "Relógios" }));
        cboCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        cboCategoria.setEnabled(false);

        lblMensagem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMensagem.setForeground(new java.awt.Color(255, 0, 0));
        lblMensagem.setText(" * mensagem  *");
        lblMensagem.setToolTipText("AVISO");

        javax.swing.GroupLayout produtoLayout = new javax.swing.GroupLayout(produto);
        produto.setLayout(produtoLayout);
        produtoLayout.setHorizontalGroup(
            produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(produtoLayout.createSequentialGroup()
                        .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(produtoLayout.createSequentialGroup()
                        .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(quantidade, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nome, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(produtoLayout.createSequentialGroup()
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(categoria)
                                .addGap(18, 18, 18)
                                .addComponent(cboCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtNome))))
                .addContainerGap())
        );
        produtoLayout.setVerticalGroup(
            produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtoLayout.createSequentialGroup()
                .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(produtoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nome)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id))
                        .addGap(18, 18, 18)
                        .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(quantidade)
                            .addComponent(valor)
                            .addComponent(categoria)))
                    .addGroup(produtoLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(produtoLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(produtoLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pesquisa.setBackground(new java.awt.Color(202, 221, 241));
        pesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Categoria", "Quantidade", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblProduto.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblProduto);

        txtPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPesquisar.setToolTipText("Campo de busca");
        txtPesquisar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/buscar.png"))); // NOI18N
        btnPesquisar.setToolTipText("Botão pesquisar");
        btnPesquisar.setBorderPainted(false);
        btnPesquisar.setContentAreaFilled(false);
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pesquisaLayout = new javax.swing.GroupLayout(pesquisa);
        pesquisa.setLayout(pesquisaLayout);
        pesquisaLayout.setHorizontalGroup(
            pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pesquisaLayout.createSequentialGroup()
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pesquisaLayout.setVerticalGroup(
            pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisaLayout.createSequentialGroup()
                .addGroup(pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPesquisar)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botoes.setBackground(new java.awt.Color(202, 221, 241));

        btnSalvar.setBackground(new java.awt.Color(0, 204, 0));
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/confirmar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("Confirmar ");
        btnSalvar.setBorderPainted(false);
        btnSalvar.setContentAreaFilled(false);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(255, 204, 0));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setToolTipText("Realizar alteração");
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setToolTipText("Cadastrar novo produto");
        btnNovo.setBorderPainted(false);
        btnNovo.setContentAreaFilled(false);
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.setFocusPainted(false);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 0, 0));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remover.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("Realizar exclusão");
        btnExcluir.setBorderPainted(false);
        btnExcluir.setContentAreaFilled(false);
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.setToolTipText("Voltar a página principal");
        btnVoltar.setBorderPainted(false);
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botoesLayout = new javax.swing.GroupLayout(botoes);
        botoes.setLayout(botoesLayout);
        botoesLayout.setHorizontalGroup(
            botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addGap(78, 78, 78)
                .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addGap(76, 76, 76)
                .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addGap(59, 59, 59)
                .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addGap(112, 112, 112)
                .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );
        botoesLayout.setVerticalGroup(
            botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoesLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnEditar)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnVoltar))
                .addContainerGap())
        );

        javax.swing.GroupLayout painelPrincipaLayout = new javax.swing.GroupLayout(painelPrincipa);
        painelPrincipa.setLayout(painelPrincipaLayout);
        painelPrincipaLayout.setHorizontalGroup(
            painelPrincipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipaLayout.createSequentialGroup()
                .addGroup(painelPrincipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(produto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelPrincipaLayout.setVerticalGroup(
            painelPrincipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQuantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyPressed
        Validacao modelValidacao = new Validacao();
        modelValidacao.validarTeclasNumericas(evt, txtQuantidade);
    }//GEN-LAST:event_txtQuantidadeKeyPressed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        validar();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tblProduto.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um produto para editar");
        } else {
            editar();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limparCampos();
        habilitarCampos();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tblProduto.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um produto para excluir");
        } else {
            excluir();
            limparCampos();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed

        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String pesquisa = txtPesquisar.getText();
        if (pesquisa.trim().equals("")) {
            listar();
        } else {
            listarPorNome();
        }

    }//GEN-LAST:event_btnPesquisarActionPerformed

    public void limparCampos() {
        txtID.setText("");
        txtNome.setText("");
        txtQuantidade.setText("");
        txtValor.setText("");
    }

    public void habilitarCampos() {
        txtNome.setEnabled(true);
        txtNome.grabFocus();
        txtQuantidade.setEnabled(true);
        txtValor.setEnabled(true);
        cboCategoria.setEnabled(true);

        btnSalvar.setEnabled(true);
    }

    public void desabilitarCampos() {
        txtPesquisar.grabFocus();
        txtNome.setEnabled(false);
        txtQuantidade.setEnabled(false);
        txtValor.setEnabled(false);
        cboCategoria.setEnabled(false);
    }

    public void validar() {
        List<Boolean> verificar = new ArrayList<>();
        verificar.add(validar.validarString(txtNome));
        verificar.add(validar.validarNumero(txtQuantidade));
        verificar.add(validar.validarNumero(txtValor));

        if (verificar.contains(false)) {
            txtNome.grabFocus();
            lblMensagem.setText("Preencha os campos");
        } else {
            salvar();
        }
    }

    public void salvar() {
        if (txtID.getText().trim().equals("")) {
            //cadastra
            ModelProduto produto = new ModelProduto();
            produto.setNome(txtNome.getText());
            produto.setCategoria(String.valueOf(cboCategoria.getSelectedItem()));
            produto.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
            produto.setValor(Float.parseFloat(txtValor.getText().replace(",", ".")));
            ProdutoDAO.salvar(produto);
            JOptionPane.showMessageDialog(this, "cadastro realizado com sucesso");
            limparCampos();
            desabilitarCampos();
            listar();
        } else {
            //atualiza
            ModelProduto produto = new ModelProduto();
            produto.setIdProduto(Integer.parseInt(txtID.getText()));
            produto.setNome(txtNome.getText());
            produto.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
            produto.setValor(Float.parseFloat(txtValor.getText().replace(",", ".")));
            produto.setCategoria(cboCategoria.getSelectedItem().toString());
            boolean retorno = ProdutoDAO.editar(produto);
            if (retorno) {
                JOptionPane.showMessageDialog(this, "Dados atualizados com sucesso!");
                limparCampos();
                desabilitarCampos();
                listar();
            } else {
                JOptionPane.showMessageDialog(this, "Falha ao atualizar informações!");
            }
        }
    }

    public void listar() {
        ArrayList<ModelProduto> lista = ProdutoDAO.listar();
        DefaultTableModel modelo = (DefaultTableModel) tblProduto.getModel();
        modelo.setRowCount(0);
        for (ModelProduto produto : lista) {
            modelo.addRow(new String[]{
                String.valueOf(produto.getIdProduto()),
                produto.getNome(),
                produto.getCategoria(),
                String.valueOf(produto.getQuantidade()),
                String.valueOf(produto.getValor())
            });

        }
    }

    public void listarPorNome() {
        String nome = txtPesquisar.getText();
        ArrayList<ModelProduto> lista = ProdutoDAO.listarPorNome(nome);
        DefaultTableModel modelo = (DefaultTableModel) tblProduto.getModel();
        modelo.setRowCount(0);
        for (ModelProduto produto : lista) {
            modelo.addRow(new String[]{
                String.valueOf(produto.getIdProduto()),
                produto.getNome(),
                produto.getCategoria(),
                String.valueOf(produto.getQuantidade()),
                String.valueOf(produto.getValor())
            });
        }
    }

    public void excluir() {
        int linha = tblProduto.getSelectedRow();
        int id = Integer.parseInt(tblProduto.getValueAt(linha, 0).toString());
        boolean retorno = ProdutoDAO.excluir(id);
        if (retorno) {
            JOptionPane.showMessageDialog(this, "Produto excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Falha ao excluir o produto!");
        }
    }

    public void editar() {
        habilitarCampos();

        int linha = tblProduto.getSelectedRow();
        txtID.setText(tblProduto.getValueAt(linha, 0).toString());
        txtNome.setText(tblProduto.getValueAt(linha, 1).toString());
        cboCategoria.setSelectedItem(tblProduto.getValueAt(linha, 2).toString());
        txtQuantidade.setText(tblProduto.getValueAt(linha, 3).toString());
        txtValor.setText(tblProduto.getValueAt(linha, 4).toString().replace(".", ","));
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botoes;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel categoria;
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JLabel id;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel nome;
    private javax.swing.JPanel painelPrincipa;
    private javax.swing.JPanel pesquisa;
    private javax.swing.JPanel produto;
    private javax.swing.JLabel quantidade;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValor;
    private javax.swing.JLabel valor;
    // End of variables declaration//GEN-END:variables
}