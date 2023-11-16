/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package modal.views;

import domain.Veiculo;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import modal.dao.VeiculoDAO;

/**
 *
 * @author gllbo
 */
public class VeiculoViews extends javax.swing.JInternalFrame {

    /**
     * Creates new form VeiculoViews
     */
    public VeiculoViews() {
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
        tfpesqveiculo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfdesmodelo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfnommotorista = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfnropoltronas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfnumero = new javax.swing.JTextField();
        btnsalvarveiculo = new javax.swing.JButton();
        btnexcluirveiculo = new javax.swing.JButton();
        btnlistaveiculo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnpesqveiculo = new javax.swing.JButton();
        tfdesplaca = new javax.swing.JTextField();
        tfnroanomodelo = new javax.swing.JFormattedTextField();
        btnlimparveiculo = new javax.swing.JButton();

        setTitle("Veiculo");

        jLabel1.setText("Placa");

        jLabel2.setText("Modelo");

        jLabel3.setText("Nome do Motorista");

        jLabel4.setText("Ano do Modelo");

        jLabel5.setText("Nº Poltronas");

        jLabel6.setText("Número");

        btnsalvarveiculo.setText("Salvar");
        btnsalvarveiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarveiculoActionPerformed(evt);
            }
        });

        btnexcluirveiculo.setText("Excluir");
        btnexcluirveiculo.setEnabled(false);
        btnexcluirveiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirveiculoActionPerformed(evt);
            }
        });

        btnlistaveiculo.setText("Lista");
        btnlistaveiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistaveiculoActionPerformed(evt);
            }
        });

        jLabel7.setText("Pesquisar por Placa");

        btnpesqveiculo.setText("Buscar");
        btnpesqveiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesqveiculoActionPerformed(evt);
            }
        });

        tfnroanomodelo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("y"))));

        btnlimparveiculo.setText("Limpar");
        btnlimparveiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimparveiculoActionPerformed(evt);
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
                        .addComponent(btnlistaveiculo)
                        .addGap(18, 18, 18)
                        .addComponent(btnlimparveiculo)
                        .addGap(18, 18, 18)
                        .addComponent(btnexcluirveiculo)
                        .addGap(18, 18, 18)
                        .addComponent(btnsalvarveiculo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tfnumero, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfdesplaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(tfnommotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfdesmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfpesqveiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnpesqveiculo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(156, 156, 156)
                                        .addComponent(jLabel3)))
                                .addGap(61, 61, 61)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(tfnroanomodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(tfnropoltronas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 46, Short.MAX_VALUE)))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnpesqveiculo)
                            .addComponent(tfpesqveiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfdesplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfnommotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdesmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfnroanomodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfnropoltronas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsalvarveiculo)
                    .addComponent(btnexcluirveiculo)
                    .addComponent(btnlistaveiculo)
                    .addComponent(btnlimparveiculo))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalvarveiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarveiculoActionPerformed
        // TODO add your handling code here:
        try {
            if (tfdesplaca.getText().isEmpty() || tfnommotorista.getText().isEmpty() || tfdesmodelo.getText().isEmpty() ||
            tfnroanomodelo.getText().isEmpty() || tfnropoltronas.getText().isEmpty() || tfnumero.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos os campos obrigatórios devem ser preenchidos", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                Veiculo veiculo = new Veiculo();
                VeiculoDAO veiculodao = new VeiculoDAO();

                veiculo.setPlaca(tfdesplaca.getText());
                veiculo.setMotorista(tfnommotorista.getText());
                veiculo.setModelo(tfdesmodelo.getText());
                veiculo.setAnomodelo(Integer.valueOf(tfnroanomodelo.getText()));
                veiculo.setQtdpoltronas(Integer.valueOf(tfnropoltronas.getText()));
                veiculo.setNumero(tfnumero.getText());

                veiculodao.cadastrarVeiculo(veiculo);

                tfdesplaca.setText("");
                tfnommotorista.setText("");
                tfdesmodelo.setText("");
                tfnroanomodelo.setText("");
                tfnropoltronas.setText("");
                tfnumero.setText("");
            }
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_btnsalvarveiculoActionPerformed

    private void btnpesqveiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesqveiculoActionPerformed
        // TODO add your handling code here:
        try {
            if (tfpesqveiculo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "O campo de pesquisa deve ser preenchido", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                Veiculo veiculo = new Veiculo();
                VeiculoDAO veiculodao = new VeiculoDAO();

                veiculo = veiculodao.consultarVeiculoPorPlaca(tfpesqveiculo.getText());

                tfdesplaca.setText(veiculo.getPlaca());
                tfnommotorista.setText(veiculo.getMotorista());
                tfdesmodelo.setText(veiculo.getModelo());
                tfnroanomodelo.setText(veiculo.getAnomodelo().toString());
                tfnropoltronas.setText(veiculo.getQtdpoltronas().toString());
                tfnumero.setText(veiculo.getNumero());
                
                btnsalvarveiculo.setEnabled(false);
                btnexcluirveiculo.setEnabled(true);
            }    
            
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_btnpesqveiculoActionPerformed

    private void btnlimparveiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimparveiculoActionPerformed
        // TODO add your handling code here:
        tfdesplaca.setText("");
        tfnommotorista.setText("");
        tfdesmodelo.setText("");
        tfnroanomodelo.setText("");
        tfnropoltronas.setText("");
        tfnumero.setText("");
        tfpesqveiculo.setText("");
    }//GEN-LAST:event_btnlimparveiculoActionPerformed

    private void btnexcluirveiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirveiculoActionPerformed
        // TODO add your handling code here:
        try {
            if (tfpesqveiculo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "O campo de pesquisa deve ser preenchido", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o veículo?", "Confirmação", JOptionPane.YES_NO_OPTION);
            
                Veiculo veiculo = new Veiculo();
                VeiculoDAO veiculodao = new VeiculoDAO();
                if (opcao == JOptionPane.YES_OPTION) {
                    veiculo = veiculodao.consultarVeiculoPorPlaca(tfpesqveiculo.getText());

                    veiculodao.excluirVeiculoPorPlaca(veiculo.getPlaca());

                    btnexcluirveiculo.setEnabled(false);
                    btnsalvarveiculo.setEnabled(true);
                }  
                
                tfdesplaca.setText("");
                tfnommotorista.setText("");
                tfdesmodelo.setText("");
                tfnroanomodelo.setText("");
                tfnropoltronas.setText("");
                tfnumero.setText("");
                tfpesqveiculo.setText("");
            }    
            
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_btnexcluirveiculoActionPerformed

    private void btnlistaveiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistaveiculoActionPerformed
        // TODO add your handling code here:
        ListaVeiculo listaVeiculoFrame = new ListaVeiculo();

        Menu menu = (Menu) SwingUtilities.getWindowAncestor(this);
        menu.getDpmenu().add(listaVeiculoFrame);

        listaVeiculoFrame.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnlistaveiculoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexcluirveiculo;
    private javax.swing.JButton btnlimparveiculo;
    private javax.swing.JButton btnlistaveiculo;
    private javax.swing.JButton btnpesqveiculo;
    private javax.swing.JButton btnsalvarveiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField tfdesmodelo;
    private javax.swing.JTextField tfdesplaca;
    private javax.swing.JTextField tfnommotorista;
    private javax.swing.JFormattedTextField tfnroanomodelo;
    private javax.swing.JTextField tfnropoltronas;
    private javax.swing.JTextField tfnumero;
    private javax.swing.JTextField tfpesqveiculo;
    // End of variables declaration//GEN-END:variables
}
