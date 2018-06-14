package br.com.store.view;

import br.com.store.model.Customer;
import br.com.store.model.enums.CustomerSearchTypeEnum;
import br.com.store.service.ServiceCustomer;
import br.com.store.utils.DataUtil;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class FrameSellSelectCustomer extends javax.swing.JFrame {

    public FrameSellSelectCustomer() {
        initComponents();
        setLocationRelativeTo( null );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        panelSellSelectCustomer = new javax.swing.JPanel();
        cbSellSelectCustomerField = new javax.swing.JComboBox<>();
        txtSellSelectCustomerField = new javax.swing.JTextField();
        btnSellSelectCustomer = new javax.swing.JButton();
        scrollSellSelectCustomer = new javax.swing.JScrollPane();
        tableSellSelectCustomer = new javax.swing.JTable();
        lblPanelTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Selecione o Cliente!");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        panelSellSelectCustomer.setBackground(new java.awt.Color(255, 255, 255));
        panelSellSelectCustomer.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        cbSellSelectCustomerField.setModel(new javax.swing.DefaultComboBoxModel(br.com.store.model.enums.CustomerSearchTypeEnum.values()));

        btnSellSelectCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/search.png"))); // NOI18N
        btnSellSelectCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellSelectCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSellSelectCustomerLayout = new javax.swing.GroupLayout(panelSellSelectCustomer);
        panelSellSelectCustomer.setLayout(panelSellSelectCustomerLayout);
        panelSellSelectCustomerLayout.setHorizontalGroup(
            panelSellSelectCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSellSelectCustomerLayout.createSequentialGroup()
                .addComponent(cbSellSelectCustomerField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSellSelectCustomerField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSellSelectCustomer)
                .addContainerGap())
        );
        panelSellSelectCustomerLayout.setVerticalGroup(
            panelSellSelectCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSellSelectCustomerLayout.createSequentialGroup()
                .addGroup(panelSellSelectCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSellSelectCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelSellSelectCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbSellSelectCustomerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSellSelectCustomerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableSellSelectCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Tipo Doc.", "Documento", "Nascimento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableSellSelectCustomer.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableSellSelectCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableSellSelectCustomerMousePressed(evt);
            }
        });
        tableSellSelectCustomer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableSellSelectCustomerKeyPressed(evt);
            }
        });
        scrollSellSelectCustomer.setViewportView(tableSellSelectCustomer);

        lblPanelTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblPanelTitle.setText("Selecione o Cliente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSellSelectCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollSellSelectCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblPanelTitle)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPanelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSellSelectCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollSellSelectCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 829, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSellSelectCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellSelectCustomerActionPerformed
        loadSearch(txtSellSelectCustomerField.getText());
    }//GEN-LAST:event_btnSellSelectCustomerActionPerformed

    private void tableSellSelectCustomerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSellSelectCustomerMousePressed
        if (evt.getButton() != MouseEvent.BUTTON1 || tableSellSelectCustomer.getSelectedRow() < 0) {
            return;
        }
        Integer id = DataUtil.parseInteger(tableSellSelectCustomer.getModel().getValueAt(tableSellSelectCustomer.getSelectedRow(), 0) + "");

        JPopupMenu popup = new JPopupMenu();
        JMenuItem mItemUpdate = new JMenuItem("Alterar/Ver");
        mItemUpdate.addActionListener((e) -> {

        });
        popup.add(mItemUpdate);

        popup.show(tableSellSelectCustomer, (int) evt.getX(), (int) evt.getY());
    }//GEN-LAST:event_tableSellSelectCustomerMousePressed

    private void tableSellSelectCustomerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableSellSelectCustomerKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (tableSellSelectCustomer.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(this, "Selecione um cliente na lista",
                        "Atenção", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            Integer id = DataUtil.parseInteger(tableSellSelectCustomer.getModel().getValueAt(tableSellSelectCustomer.getSelectedRow(), 0) + "");

        }
    }//GEN-LAST:event_tableSellSelectCustomerKeyPressed
    private void loadSearch(String value) {
        DefaultTableModel model = (DefaultTableModel) tableSellSelectCustomer.getModel();
        model.setNumRows(0);
        TableColumn column = tableSellSelectCustomer.getColumnModel().getColumn(0);
        if ("Código".equals(column.getHeaderValue().toString())) {
            tableSellSelectCustomer.removeColumn(column);
        }
        List<Customer> list = null;
        CustomerSearchTypeEnum searchType = (CustomerSearchTypeEnum) cbSellSelectCustomerField.getSelectedItem();
        try {
            list = ServiceCustomer.getInstance().search(searchType, value);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (list == null) {
            JOptionPane.showMessageDialog(this, "Nenhum cliente foi encontrado",
                    "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (Customer c : list) {
            model.addRow(new Object[]{
                c.getId(),
                c.getName(),
                c.getDocumentType(),
                c.getDocument(),
                DataUtil.getDateFormat("dd/MM/yyyy").format(c.getBirthDate())
            });

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
            java.util.logging.Logger.getLogger(FrameSellSelectCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameSellSelectCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameSellSelectCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameSellSelectCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameSellSelectCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSellSelectCustomer;
    private javax.swing.JComboBox<String> cbSellSelectCustomerField;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblPanelTitle;
    private javax.swing.JPanel panelSellSelectCustomer;
    private javax.swing.JScrollPane scrollSellSelectCustomer;
    private javax.swing.JTable tableSellSelectCustomer;
    private javax.swing.JTextField txtSellSelectCustomerField;
    // End of variables declaration//GEN-END:variables
}
