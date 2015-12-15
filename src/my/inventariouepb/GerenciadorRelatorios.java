/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.inventariouepb;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableModel;
import static my.inventariouepb.InventarioUI.getNomeRelatorio;

/**
 *
 * @author Coordenação
 */
public class GerenciadorRelatorios extends javax.swing.JFrame {
    
  
    TableModel modeloTabela = null;

    /**
     * Creates new form Relatorios
     */
    InventarioUI objInventarioUI;
    
    //private String titRelatorio = "Relatório";
    
    public GerenciadorRelatorios(TableModel modelo) {
        modeloTabela = modelo;
        //System.out.println("criou objeto");
        //setModeloTabelaRelat(TabelaRelatorio.getTabela());
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

        painelBotoes = new javax.swing.JPanel();
        botImprimir = new javax.swing.JButton();
        botXLS = new javax.swing.JButton();
        botPDF = new javax.swing.JButton();
        painelRelatorio = new javax.swing.JPanel();
        painelInfo = new javax.swing.JPanel();
        quantitativos = new javax.swing.JLabel();
        painelTabela = new javax.swing.JPanel();
        painelCheck = new javax.swing.JPanel();
        checkEmprest = new javax.swing.JCheckBox();
        checkExtrav = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabRelat = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painelBotoes.setLayout(new javax.swing.BoxLayout(painelBotoes, javax.swing.BoxLayout.LINE_AXIS));

        botImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/imagens/icon_impressora2.png"))); // NOI18N
        botImprimir.setText("Imprimir");
        botImprimir.setMnemonic(KeyEvent.VK_I);
        botImprimir.setMaximumSize(new java.awt.Dimension(107, 25));
        botImprimir.setMinimumSize(new java.awt.Dimension(107, 25));
        botImprimir.setPreferredSize(new java.awt.Dimension(107, 25));
        painelBotoes.add(botImprimir);

        botXLS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/imagens/icon_xls.gif"))); // NOI18N
        botXLS.setText("Gerar XLS");
        botXLS.setMnemonic(KeyEvent.VK_X);
        botXLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botXLSActionPerformed(evt);
            }
        });
        painelBotoes.add(botXLS);

        botPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/imagens/icon_pdf.png"))); // NOI18N
        botPDF.setText("Gerar PDF");
        botPDF.setMnemonic(KeyEvent.VK_P);
        botPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPDFActionPerformed(evt);
            }
        });
        painelBotoes.add(botPDF);

        painelRelatorio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, getNomeRelatorio(), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        quantitativos.setText("Informações xxxxxxxxxx");

        javax.swing.GroupLayout painelInfoLayout = new javax.swing.GroupLayout(painelInfo);
        painelInfo.setLayout(painelInfoLayout);
        painelInfoLayout.setHorizontalGroup(
            painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(quantitativos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelInfoLayout.setVerticalGroup(
            painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelInfoLayout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(quantitativos))
        );

        checkEmprest.setText("Emprestados");
        checkEmprest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkEmprestActionPerformed(evt);
            }
        });

        checkExtrav.setText("Extraviados");

        tabRelat.setModel(/*TabelaRelatorio.getTabela()*/modeloTabela);
        jScrollPane1.setViewportView(tabRelat);

        javax.swing.GroupLayout painelCheckLayout = new javax.swing.GroupLayout(painelCheck);
        painelCheck.setLayout(painelCheckLayout);
        painelCheckLayout.setHorizontalGroup(
            painelCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCheckLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(checkEmprest)
                .addGap(30, 30, 30)
                .addComponent(checkExtrav)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(painelCheckLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelCheckLayout.setVerticalGroup(
            painelCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCheckLayout.createSequentialGroup()
                .addGroup(painelCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkEmprest)
                    .addComponent(checkExtrav))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        painelCheckLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {checkEmprest, checkExtrav});

        javax.swing.GroupLayout painelTabelaLayout = new javax.swing.GroupLayout(painelTabela);
        painelTabela.setLayout(painelTabelaLayout);
        painelTabelaLayout.setHorizontalGroup(
            painelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelTabelaLayout.setVerticalGroup(
            painelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaLayout.createSequentialGroup()
                .addComponent(painelCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelRelatorioLayout = new javax.swing.GroupLayout(painelRelatorio);
        painelRelatorio.setLayout(painelRelatorioLayout);
        painelRelatorioLayout.setHorizontalGroup(
            painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelRelatorioLayout.setVerticalGroup(
            painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRelatorioLayout.createSequentialGroup()
                .addComponent(painelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(painelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(painelRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botXLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botXLSActionPerformed
        File arq = null;
        JFileChooser fileChooser = new JFileChooser();  
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivo XLS", "xls");
        fileChooser.setFileFilter(filtro);
        int returnVal = fileChooser.showSaveDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION){
            //File dir = fileChooser.getCurrentDirectory();
            arq = fileChooser.getSelectedFile();
        }
        ManipulaXLS objManipula = new ManipulaXLS();
        try {
            //objManipula.criaXLS(arq.getAbsolutePath(), "Plan1");
            //objManipula.criaXLS1(arq.getAbsolutePath(), "Plan1");
            objManipula.criaXLS(getTabelaRelat(), arq.getAbsolutePath(), "Plan1");
        } catch (IOException ex) {
            Logger.getLogger(GerenciadorRelatorios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex){
            System.out.println("teste");
        }

    }//GEN-LAST:event_botXLSActionPerformed

    //Retorna a tabela em exibição
    public JTable getTabelaRelat(){
        return tabRelat;
    }
    
    public void setTabelaRelat(JTable tabExterna){
        tabRelat = tabExterna;//tabRelat tem que receber um tabela já formatada
    }
    
    public void setModeloTabelaRelat(TableModel modeloTab){
        tabRelat.setModel(modeloTab);
    }
    
    private void botPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botPDFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botPDFActionPerformed

    private void checkEmprestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkEmprestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkEmprestActionPerformed

    public void mostraChecks(boolean valor){
        //painelCheck.setVisible(valor);
        checkEmprest.setVisible(valor);
        checkExtrav.setVisible(valor);
    }
    
    //Recebe a instância de InventarioUI para poder chamar seus métodos a partir desta
    public void setRefInventarioUI(InventarioUI obj){
        objInventarioUI = obj;
    }
    
    /**
     *
     * @param tit
     */
    /*public void setTitRelatorio(String tit){
        titRelatorio = tit;
        System.out.println("setTit");
    }*/
    
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
            java.util.logging.Logger.getLogger(GerenciadorRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciadorRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciadorRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciadorRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        new GerenciadorRelatorios().setVisible(true);
        }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botImprimir;
    private javax.swing.JButton botPDF;
    private javax.swing.JButton botXLS;
    private javax.swing.JCheckBox checkEmprest;
    private javax.swing.JCheckBox checkExtrav;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelCheck;
    private javax.swing.JPanel painelInfo;
    private javax.swing.JPanel painelRelatorio;
    private javax.swing.JPanel painelTabela;
    private javax.swing.JLabel quantitativos;
    private javax.swing.JTable tabRelat;
    // End of variables declaration//GEN-END:variables
}
