package br.com.store.view;

import br.com.store.model.SaleListCancel;
import br.com.store.service.ServiceSale;
import br.com.store.utils.DataUtil;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class PanelSellCancel extends javax.swing.JPanel {

    public PanelSellCancel() {
        initComponents();
        loadList();
    }

    public void loadList() {
        DefaultTableModel model = (DefaultTableModel) tableSellCancel.getModel();
        model.setNumRows(0);
        TableColumn column = tableSellCancel.getColumnModel().getColumn(0);
        if ("Código".equals(column.getHeaderValue().toString())) {
            tableSellCancel.removeColumn(column);
        }
        List<SaleListCancel> list = null;
        try {
            list = ServiceSale.getInstance().listCancel();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (list == null) {
            return;
        }
        for (SaleListCancel c : list) {
            model.addRow(new Object[]{
                c.getSaleId(),
                c.getCustomerName(),
                c.getTotal().toString().replace(".", ","),
                DataUtil.getDateFormat("dd/MM/yyyy").format(c.getCreatedAt())
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollCustomerSearch = new javax.swing.JScrollPane();
        tableSellCancel = new javax.swing.JTable();
        lblPanelTitle = new javax.swing.JLabel();
        btnCustomerDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tableSellCancel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Cliente", "Total", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableSellCancel.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableSellCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableSellCancelMousePressed(evt);
            }
        });
        tableSellCancel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableSellCancelKeyPressed(evt);
            }
        });
        scrollCustomerSearch.setViewportView(tableSellCancel);

        lblPanelTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblPanelTitle.setText("Cancelar Venda");

        btnCustomerDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/cancel-30.png"))); // NOI18N
        btnCustomerDelete.setToolTipText("Cancelar Venda");
        btnCustomerDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollCustomerSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblPanelTitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCustomerDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPanelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollCustomerSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCustomerDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableSellCancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSellCancelMousePressed
        if (evt.getButton() != MouseEvent.BUTTON3 || tableSellCancel.getSelectedRow() < 0) {
            return;
        }
        Integer id = DataUtil.parseInteger(tableSellCancel.getModel().getValueAt(tableSellCancel.getSelectedRow(), 0) + "");

        JPopupMenu popup = new JPopupMenu();
        JMenuItem mItemCancel = new JMenuItem("Cancelar");
        mItemCancel.addActionListener((e) -> {
            cancelSale(id);
        });
        popup.add(mItemCancel);
        popup.show(tableSellCancel, (int) evt.getX(), (int) evt.getY());
    }//GEN-LAST:event_tableSellCancelMousePressed

    private void btnCustomerDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerDeleteActionPerformed
        if (tableSellCancel.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione uma venda na lista",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Integer id = DataUtil.parseInteger(tableSellCancel.getModel().getValueAt(tableSellCancel.getSelectedRow(), 0) + "");
        cancelSale(id);
    }//GEN-LAST:event_btnCustomerDeleteActionPerformed

    private void tableSellCancelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableSellCancelKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            if (tableSellCancel.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(this, "Selecione uma venda na lista",
                        "Atenção", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            Integer id = DataUtil.parseInteger(tableSellCancel.getModel().getValueAt(tableSellCancel.getSelectedRow(), 0) + "");
            cancelSale(id);
        }
    }//GEN-LAST:event_tableSellCancelKeyPressed
    public void cancelSale(Integer id) {
        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja cancelar esta venda?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.NO_OPTION) {
            return;
        }

        try {
            ServiceSale.getInstance().delete(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Venda cancelada com sucesso!",
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        loadList();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomerDelete;
    private javax.swing.JLabel lblPanelTitle;
    private javax.swing.JScrollPane scrollCustomerSearch;
    private javax.swing.JTable tableSellCancel;
    // End of variables declaration//GEN-END:variables
}
