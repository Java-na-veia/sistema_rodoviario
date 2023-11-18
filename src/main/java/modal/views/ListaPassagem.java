/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package modal.views;

import domain.Passagem;
import java.sql.SQLException;
import java.util.List;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import modal.dao.PassagemDAO;

/**
 *
 * @author gllbo
 */
public class ListaPassagem extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListaPassagem
     */
    public ListaPassagem() {
        initComponents();
        
        try {
            ListagemPassagem();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void ListagemPassagem() throws SQLException {
        PassagemDAO passagemdao = new PassagemDAO();
        List<Passagem> listapassagems = passagemdao.listarTodasPassagens();

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("COD Passagem");
        model.addColumn("Cidade Origem");
        model.addColumn("Cidade Destino");
        model.addColumn("Placa Veiculo");
        model.addColumn("Poltrona");
        model.addColumn("Data Saida");
        model.addColumn("Hora Saida");
        model.addColumn("Valor Passagem");

       for (Passagem passagem : listapassagems) {
            model.addRow(new Object[]{
                passagem.getIdpassagem(),
                passagem.getCidadeorigem() != null ? passagem.getCidadeorigem().getNomeCidade() : "",
                passagem.getCidadedestino() != null ? passagem.getCidadedestino().getNomeCidade() : "",
                passagem.getVeiculo() != null ? passagem.getVeiculo().getPlaca() : "",
                passagem.getPoltrona(),
                passagem.getDatasaida(),
                passagem.getHorasaida(),
                passagem.getValorpassagem()
            });
        }


        tlistacidade.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tlistacidade = new javax.swing.JTable();
        btnvoltarcidade = new javax.swing.JButton();

        tlistacidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tlistacidade);

        btnvoltarcidade.setText("Voltar");
        btnvoltarcidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarcidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnvoltarcidade))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnvoltarcidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnvoltarcidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarcidadeActionPerformed
        // TODO add your handling code here:
        PassagemViews passagemviews = new PassagemViews();

        Menu menu = (Menu) SwingUtilities.getWindowAncestor(this);
        menu.getDpmenu().add(passagemviews);

        passagemviews.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnvoltarcidadeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnvoltarcidade;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tlistacidade;
    // End of variables declaration//GEN-END:variables
}
