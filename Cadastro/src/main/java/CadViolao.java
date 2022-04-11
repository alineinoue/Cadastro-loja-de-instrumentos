//Aline Inoue Cerqueira

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadViolao extends javax.swing.JFrame {

        private Violao violao = new Violao();
        private BancoViolao bvio = new BancoViolao();
        private Corda corda = new Corda();
        private BancoCorda bcor = new BancoCorda();
        private Caracteristicas caract = new Caracteristicas();
        private BancoCaracteristicas bcar = new BancoCaracteristicas();
        
    public CadViolao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtMarca = new javax.swing.JLabel();
        rtAno = new javax.swing.JLabel();
        rtValor = new javax.swing.JLabel();
        cxMarca = new javax.swing.JTextField();
        cxAno = new javax.swing.JTextField();
        cxValor = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblViolao = new javax.swing.JTable();
        btCham2Tab = new javax.swing.JButton();
        cxTipo = new javax.swing.JTextField();
        rtTipo = new javax.swing.JLabel();
        rtNum = new javax.swing.JLabel();
        cxNum = new javax.swing.JTextField();
        btCor = new javax.swing.JLabel();
        cxCor = new javax.swing.JTextField();
        btTipo = new javax.swing.JLabel();
        cxTipo1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Instrumento");

        rtMarca.setText("MARCA DO VIOLÃO:");

        rtAno.setText("ANO DE FABRICAÇÃO:");

        rtValor.setText("VALOR:");

        cxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxMarcaActionPerformed(evt);
            }
        });

        cxValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxValorActionPerformed(evt);
            }
        });

        btCadastrar.setText("CADASTRAR");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btLimpar.setText("LIMPAR");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

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

        btCham2Tab.setText("Segunda Tabela");
        btCham2Tab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCham2TabActionPerformed(evt);
            }
        });

        rtTipo.setText("TIPO DA CORDA:");

        rtNum.setText("NÚMERO DE CORDAS:");

        btCor.setText("COR:");

        cxCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCorActionPerformed(evt);
            }
        });

        btTipo.setText("TIPO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(btCadastrar)
                .addGap(45, 45, 45)
                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtValor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxValor, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtMarca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(rtTipo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxTipo))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(rtAno)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxAno, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btCor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cxCor))
                                    .addComponent(rtNum))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxNum, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btTipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(235, 235, 235))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btCham2Tab)
                        .addGap(33, 33, 33)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtMarca)
                    .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtAno)
                    .addComponent(cxAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtValor)
                    .addComponent(cxValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtTipo)
                    .addComponent(cxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtNum)
                    .addComponent(cxNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCor)
                    .addComponent(cxCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTipo)
                    .addComponent(cxTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btCham2Tab))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxValorActionPerformed

    private void cxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxMarcaActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed
   
    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadastrar();
        listarTabela();
        limpar();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btCham2TabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCham2TabActionPerformed
        CadViolaoTab cadViolaoTab = new CadViolaoTab();
        cadViolaoTab.listarTabela2(bvio, bcor, bcar);
    }//GEN-LAST:event_btCham2TabActionPerformed

    private void cxCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCorActionPerformed
    
    public void sair(){
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair? ", "Saída", JOptionPane.YES_NO_OPTION);
        if(resp == 0){
            dispose();
        }
    }
    
    public void limpar(){
        cxMarca.setText("");
        cxAno.setText("");
        cxValor.setText("");
        cxTipo.setText("");
        cxNum.setText("");
        cxCor.setText("");
        cxTipo1.setText("");
        cxMarca.requestFocus();
    }
    
    public void cadastrar(){
        violao = new Violao();
        corda = new Corda();
        caract = new Caracteristicas();
        violao.setMarca(cxMarca.getText());
        violao.setAno(Integer.parseInt(cxAno.getText()));
        corda.setTipo(cxTipo.getText());
        caract.setCor(cxCor.getText());
        caract.setTipo(cxTipo1.getText());
        
        try{
            violao.setValor(Float.parseFloat(cxValor.getText()));
            corda.setNum(Integer.parseInt(cxNum.getText()));
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Valor deve ser inteiro", "ERROR", 0 );
            limpar();
        }
        
        violao = bvio.cadViolao(violao);
        corda = bcor.cadCorda(corda);
        caract = bcar.cadCaracteristicas(caract);
        
        if(violao!= null){
                JOptionPane.showMessageDialog(null, "Violao cadastrado com sucesso!", "Confirmação de cadastro", -1 );
        }else{
                JOptionPane.showMessageDialog(null, "Violão já cadastrado no sistema!", "ERROR - Violao já cadastrado no sistema", 0 );
        }
    }
    
    public void listarTabela(){
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
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCham2Tab;
    private javax.swing.JLabel btCor;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel btTipo;
    private javax.swing.JTextField cxAno;
    private javax.swing.JTextField cxCor;
    private javax.swing.JTextField cxMarca;
    private javax.swing.JTextField cxNum;
    private javax.swing.JTextField cxTipo;
    private javax.swing.JTextField cxTipo1;
    private javax.swing.JTextField cxValor;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel rtAno;
    private javax.swing.JLabel rtMarca;
    private javax.swing.JLabel rtNum;
    private javax.swing.JLabel rtTipo;
    private javax.swing.JLabel rtValor;
    private javax.swing.JTable tblViolao;
    // End of variables declaration//GEN-END:variables
}
