//Aline Inoue Cerqueira 

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadViolaoTab extends javax.swing.JFrame {
        
    public CadViolaoTab() {
        initComponents();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSair = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblViolao = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Instrumento");

        btSair.setText("SAIR");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        tblViolao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "MARCA ", "ANO ", "VALOR", "TIPO CORDA", "NÚMERO", "COR", "TIPO"
            }
        ));
        tblViolao.setGridColor(new java.awt.Color(0, 102, 204));
        tblViolao.setSelectionForeground(new java.awt.Color(0, 204, 255));
        tblViolao.setShowGrid(false);
        jScrollPane2.setViewportView(tblViolao);
        tblViolao.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed
       
    public void sair(){
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair? ", "Saída", JOptionPane.YES_NO_OPTION);
        if(resp == 0){
            dispose();
        }
    }
    
    public void listarTabela2(BancoViolao bvio, BancoCorda bcor, BancoCaracteristicas bcar){
        Violao violao = new Violao();
        Corda corda = new Corda();
        Caracteristicas caract = new Caracteristicas();
        DefaultTableModel modelo = (DefaultTableModel) tblViolao.getModel();
        modelo.setRowCount(0);
           
        for(int posLin = 0; posLin < bvio.getBdViolao().size(); posLin ++){
            violao.setMarca(bvio.getBdViolao().get(posLin).getMarca());
            violao.setAno(bvio.getBdViolao().get(posLin).getAno());
            violao.setValor(bvio.getBdViolao().get(posLin).getValor());
            corda.setTipo(bcor.getBdCorda().get(posLin).getTipo());
            corda.setNum(bcor.getBdCorda().get(posLin).getNum());
            caract.setCor(bcar.getBdCaracteristicas().get(posLin).getCor());
            caract.setTipo(bcar.getBdCaracteristicas().get(posLin).getTipo());
      
            modelo.insertRow(posLin, new Object[]{violao.getMarca(), violao.getAno(), violao.getValor(), corda.getTipo(), corda.getNum(), caract.getCor(), caract.getTipo()});
        }
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
            java.util.logging.Logger.getLogger(CadViolao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadViolao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadViolao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadViolao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadViolao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSair;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblViolao;
    // End of variables declaration//GEN-END:variables
}
