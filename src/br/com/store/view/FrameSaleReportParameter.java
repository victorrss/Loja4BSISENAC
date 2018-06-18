package br.com.store.view;

import br.com.store.report.SaleReport;
import br.com.store.utils.DataUtil;
import br.com.store.view.main.FrameMain;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;

public class FrameSaleReportParameter extends javax.swing.JFrame {

    public FrameSaleReportParameter() {
        initComponents();
        setMaskDate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitleFrame = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        txtStartDate = new javax.swing.JFormattedTextField();
        txtEndDate = new javax.swing.JFormattedTextField();
        lblEndDate = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        lblTitleFrame.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitleFrame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleFrame.setText("Relatório de Vendas");

        lblStartDate.setText("Data Início");

        txtStartDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        txtEndDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        lblEndDate.setText("Data Fim");

        btnView.setText("Gerar");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitleFrame, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnView))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblStartDate)
                            .addComponent(lblEndDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEndDate)
                            .addComponent(txtStartDate))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartDate)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndDate)
                    .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnView, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        Date start, end;
        start = DataUtil.parseDate("dd/MM/yyyy", txtStartDate.getText());
        end = DataUtil.parseDate("dd/MM/yyyy", txtEndDate.getText());

        if (start.getTime() == DataUtil.parseDate("dd/MM/yyyy", "01/01/1500").getTime()
                || end.getTime() == DataUtil.parseDate("dd/MM/yyyy", "01/01/1500").getTime()) {

            JOptionPane.showMessageDialog(this, "Insira uma data válida!",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Calendar test = Calendar.getInstance();
        test.setLenient(false);
        test.setTime(start);
        test.add(Calendar.DATE, 30);

        if (end.getTime() > test.getTime().getTime()) {
            JOptionPane.showMessageDialog(this, "O período não pode ultrapassar 30 dias!",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        SaleReport report = new SaleReport(start, end);
        this.dispose();
        try {
            report.view();
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(FrameMain.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnViewActionPerformed

    private void setMaskDate() {
        javax.swing.text.MaskFormatter maskFmt = new javax.swing.text.MaskFormatter();
        try {
            maskFmt = new javax.swing.text.MaskFormatter("##/##/####");
            maskFmt.setPlaceholderCharacter('_');
            txtStartDate.setValue(null);
            txtStartDate.setFormatterFactory(new DefaultFormatterFactory(maskFmt));
            txtEndDate.setValue(null);
            txtEndDate.setFormatterFactory(new DefaultFormatterFactory(maskFmt));

        } catch (ParseException ex) {
            Logger.getLogger(PanelCustomerCreateUpdate.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

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
            java.util.logging.Logger.getLogger(FrameSaleReportParameter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameSaleReportParameter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameSaleReportParameter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameSaleReportParameter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameSaleReportParameter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnView;
    private javax.swing.JLabel lblEndDate;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTitleFrame;
    private javax.swing.JFormattedTextField txtEndDate;
    private javax.swing.JFormattedTextField txtStartDate;
    // End of variables declaration//GEN-END:variables
}
