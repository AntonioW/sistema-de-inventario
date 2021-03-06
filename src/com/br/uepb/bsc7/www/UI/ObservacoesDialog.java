/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.uepb.bsc7.www.UI;

import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.JCheckBox;

/**
 *
 * @author Diego
 */
public class ObservacoesDialog extends javax.swing.JDialog {

    InventarioUI objInventarioUI;
    String obs = "";
    /**
     * Creates new form ObservacoesDialog
     */
    public ObservacoesDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        painelObs = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        botGuardar = new javax.swing.JButton();
        botCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outrasObs = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Observações");

        painelObs.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Observações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(0, 0, 204))); // NOI18N

        jCheckBox1.setText("Emprestado Manualmente");

        jCheckBox2.setText("Encadernar");

        jCheckBox3.setText("Exemplar Excluído");

        jCheckBox4.setText("Fora de Empréstimos");

        jCheckBox5.setText("Inexistentes");

        jCheckBox6.setText("Outras:");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        botGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/br/uepb/bsc7/www/images/icon_save2.gif"))); // NOI18N
        botGuardar.setText("Guardar");
        botGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botGuardarActionPerformed(evt);
            }
        });
        botGuardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                botGuardarKeyReleased(evt);
            }
        });

        botCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/br/uepb/bsc7/www/images/icon_cancel.png"))); // NOI18N
        botCancelar.setText("Cancelar");
        botCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCancelarActionPerformed(evt);
            }
        });
        botCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                botCancelarKeyReleased(evt);
            }
        });

        outrasObs.setColumns(20);
        outrasObs.setRows(5);
        outrasObs.setEnabled(false);
        jScrollPane1.setViewportView(outrasObs);

        javax.swing.GroupLayout painelObsLayout = new javax.swing.GroupLayout(painelObs);
        painelObs.setLayout(painelObsLayout);
        painelObsLayout.setHorizontalGroup(
            painelObsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelObsLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(botGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botCancelar)
                .addGap(0, 112, Short.MAX_VALUE))
            .addGroup(painelObsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelObsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(painelObsLayout.createSequentialGroup()
                        .addGroup(painelObsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelObsLayout.setVerticalGroup(
            painelObsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelObsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelObsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botGuardar)
                    .addComponent(botCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelObs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        outrasObs.setEnabled(true);
        outrasObs.requestFocus();
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void botGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botGuardarActionPerformed

        //System.out.println(painelObs.getComponentCount());
        System.out.println("Antes do for.");
        for (int i = 0; i< painelObs.getComponentCount(); i++) {

            Component comp =  painelObs.getComponent(i);

            if (comp instanceof JCheckBox) {

                JCheckBox check = (JCheckBox) comp;

                if (check.isSelected())  {
                    if (check.getText().equals("Outras:")){
                        obs = obs + outrasObs.getText()+ " ";
                    }else{
                        obs = obs + check.getText() + " ";
                    }
                }
            }
        }
        //setObs(obs); //Chamada estática
        System.out.println("Após o for.");
        guardaObs(obs);
    }//GEN-LAST:event_botGuardarActionPerformed

    private void guardaObs(String obsG){
        objInventarioUI.setObs(obsG);
        objInventarioUI.setFocusBotaoInserir();
        objInventarioUI.desmarcarVrfExemplar();
        this.dispose();
    }
    
    public void setRefInventarioUI(InventarioUI obj){
        objInventarioUI = obj;
        System.out.println("setRefInventarioUI");
    }
    
    private void botGuardarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botGuardarKeyReleased
        if ( evt.getKeyCode() == KeyEvent.VK_ENTER){
            guardaObs(obs);
        }
    }//GEN-LAST:event_botGuardarKeyReleased

    private void botCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancelarActionPerformed
        //.desmarcarVrfExemplar(); //Não tá dando certo
        objInventarioUI.desmarcarVrfExemplar();
        this.dispose();
    }//GEN-LAST:event_botCancelarActionPerformed

    private void botCancelarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botCancelarKeyReleased
        if(evt.getKeyCode() == evt.VK_ESCAPE){
            this.dispose();
            objInventarioUI.desmarcarVrfExemplar();
        }
    }//GEN-LAST:event_botCancelarKeyReleased

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ObservacoesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ObservacoesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ObservacoesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ObservacoesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ObservacoesDialog dialog = new ObservacoesDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botCancelar;
    private javax.swing.JButton botGuardar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea outrasObs;
    private javax.swing.JPanel painelObs;
    // End of variables declaration//GEN-END:variables
}
