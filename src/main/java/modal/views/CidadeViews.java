/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package modal.views;

import domain.Cidade;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import modal.dao.CidadeDAO;

/**
 *
 * @author gllbo
 */
public class CidadeViews extends javax.swing.JInternalFrame {

    /**
     * Creates new form CidadeView
     */
    public CidadeViews() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfpesqcidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfdesuf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfnomcidade = new javax.swing.JTextField();
        btnsalvarcidade = new javax.swing.JButton();
        btnexcluircidade = new javax.swing.JButton();
        btnlistacidade = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnpesqcidade = new javax.swing.JButton();
        tfidecidade = new javax.swing.JTextField();
        btnlimparcidade = new javax.swing.JButton();

        jLabel1.setText("ID Cidade");

        jLabel2.setText("UF");

        jLabel3.setText("Nome da Cidade");
        jLabel3.setToolTipText("");

        tfnomcidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnomcidadeActionPerformed(evt);
            }
        });

        btnsalvarcidade.setText("Salvar");
        btnsalvarcidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarcidadeActionPerformed(evt);
            }
        });

        btnexcluircidade.setText("Excluir");
        btnexcluircidade.setEnabled(false);
        btnexcluircidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluircidadeActionPerformed(evt);
            }
        });

        btnlistacidade.setText("Lista");
        btnlistacidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistacidadeActionPerformed(evt);
            }
        });

        jLabel7.setText("Pesquisar por ID");

        btnpesqcidade.setText("Buscar");
        btnpesqcidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesqcidadeActionPerformed(evt);
            }
        });

        btnlimparcidade.setText("Limpar");
        btnlimparcidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimparcidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnlistacidade)
                        .addGap(18, 18, 18)
                        .addComponent(btnlimparcidade)
                        .addGap(18, 18, 18)
                        .addComponent(btnexcluircidade)
                        .addGap(18, 18, 18)
                        .addComponent(btnsalvarcidade))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfpesqcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnpesqcidade))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(106, 106, 106)
                                        .addComponent(jLabel3))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfidecidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfnomcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(tfdesuf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 261, Short.MAX_VALUE)))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnpesqcidade)
                    .addComponent(tfpesqcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfidecidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfnomcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdesuf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsalvarcidade)
                    .addComponent(btnexcluircidade)
                    .addComponent(btnlistacidade)
                    .addComponent(btnlimparcidade))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalvarcidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarcidadeActionPerformed
        // TODO add your handling code here:
        try {
            if (tfidecidade.getText().isEmpty() || tfnomcidade.getText().isEmpty() || tfdesuf.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos os campos obrigatórios devem ser preenchidos", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                Cidade cidade = new Cidade();
                CidadeDAO cidadedao = new CidadeDAO();

                cidade.setIdCidade(Integer.valueOf(tfidecidade.getText()));
                cidade.setNomeCidade(tfnomcidade.getText());
                cidade.setUf(tfdesuf.getText());

                cidadedao.cadastrarCidade(cidade);

                tfidecidade.setText("");
                tfnomcidade.setText("");
                tfdesuf.setText("");
            }
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_btnsalvarcidadeActionPerformed

    private void btnexcluircidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluircidadeActionPerformed
        // TODO add your handling code here:
        try {
            if (tfpesqcidade.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "O campo de pesquisa deve ser preenchido", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o veículo?", "Confirmação", JOptionPane.YES_NO_OPTION);

                Cidade cidade = new Cidade();
                CidadeDAO cidadedao = new CidadeDAO();
                if (opcao == JOptionPane.YES_OPTION) {
                    cidade = cidadedao.obterCidadePorId(Integer.valueOf(tfpesqcidade.getText()));

                    cidadedao.excluirCidade(cidade.getIdCidade());

                    btnexcluircidade.setEnabled(false);
                    btnsalvarcidade.setEnabled(true);
                }

                tfidecidade.setText("");
                tfnomcidade.setText("");
                tfdesuf.setText("");
                tfpesqcidade.setText("");
            }

        } catch (SQLException e) {
        }
    }//GEN-LAST:event_btnexcluircidadeActionPerformed

    private void btnlistacidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistacidadeActionPerformed
        // TODO add your handling code here:
        ListaCidade listaCidadeFrame = new ListaCidade();

        Menu menu = (Menu) SwingUtilities.getWindowAncestor(this);
        menu.getDpmenu().add(listaCidadeFrame);

        listaCidadeFrame.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnlistacidadeActionPerformed

    private void btnpesqcidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesqcidadeActionPerformed
        // TODO add your handling code here:
        try {
            if (tfpesqcidade.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "O campo de pesquisa deve ser preenchido", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                Cidade cidade = new Cidade();
                CidadeDAO cidadedao = new CidadeDAO();

                cidade = cidadedao.obterCidadePorId(Integer.valueOf(tfpesqcidade.getText()));

                tfidecidade.setText(cidade.getIdCidade().toString());
                tfnomcidade.setText(cidade.getNomeCidade());
                tfdesuf.setText(cidade.getUf());

                btnsalvarcidade.setEnabled(false);
                btnexcluircidade.setEnabled(true);
            }

        } catch (SQLException e) {
        }
    }//GEN-LAST:event_btnpesqcidadeActionPerformed

    private void btnlimparcidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimparcidadeActionPerformed
        // TODO add your handling code here:
        tfidecidade.setText("");
        tfnomcidade.setText("");
        tfdesuf.setText("");
        tfpesqcidade.setText("");
    }//GEN-LAST:event_btnlimparcidadeActionPerformed

    private void tfnomcidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnomcidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnomcidadeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexcluircidade;
    private javax.swing.JButton btnlimparcidade;
    private javax.swing.JButton btnlistacidade;
    private javax.swing.JButton btnpesqcidade;
    private javax.swing.JButton btnsalvarcidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField tfdesuf;
    private javax.swing.JTextField tfidecidade;
    private javax.swing.JTextField tfnomcidade;
    private javax.swing.JTextField tfpesqcidade;
    // End of variables declaration//GEN-END:variables
}
