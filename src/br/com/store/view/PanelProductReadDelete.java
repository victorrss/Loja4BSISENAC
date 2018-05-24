package br.com.store.view;

import br.com.store.model.Product;
import br.com.store.model.enums.ProductSearchTypeEnum;
import br.com.store.service.ServiceProduct;
import br.com.store.utils.DataUtil;
import br.com.store.view.main.FrameMain;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class PanelProductReadDelete extends javax.swing.JPanel {

    public PanelProductReadDelete() {
        initComponents();
        loadList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelProductSearch = new javax.swing.JPanel();
        txtProductSearchField = new javax.swing.JTextField();
        btnProductSearch = new javax.swing.JButton();
        cbProductSearchType = new javax.swing.JComboBox<>();
        scrollProduct = new javax.swing.JScrollPane();
        tableProductSearch = new javax.swing.JTable();
        lblPanelTitle = new javax.swing.JLabel();
        btnProductUpdate = new javax.swing.JButton();
        btnProductDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        panelProductSearch.setBackground(new java.awt.Color(255, 255, 255));
        panelProductSearch.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        btnProductSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/search.png"))); // NOI18N
        btnProductSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductSearchActionPerformed(evt);
            }
        });

        cbProductSearchType.setModel(new javax.swing.DefaultComboBoxModel(br.com.store.model.enums.ProductSearchTypeEnum.values()));

        javax.swing.GroupLayout panelProductSearchLayout = new javax.swing.GroupLayout(panelProductSearch);
        panelProductSearch.setLayout(panelProductSearchLayout);
        panelProductSearchLayout.setHorizontalGroup(
            panelProductSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductSearchLayout.createSequentialGroup()
                .addComponent(cbProductSearchType, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtProductSearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProductSearch)
                .addContainerGap())
        );
        panelProductSearchLayout.setVerticalGroup(
            panelProductSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductSearchLayout.createSequentialGroup()
                .addGroup(panelProductSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProductSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbProductSearchType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableProductSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Código de Barras", "Nome", "Modelo", "Preço", "Estoque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProductSearch.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableProductSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableProductSearchMousePressed(evt);
            }
        });
        tableProductSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableProductSearchKeyPressed(evt);
            }
        });
        scrollProduct.setViewportView(tableProductSearch);

        lblPanelTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblPanelTitle.setText("Produto - Visualização");

        btnProductUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/update-30.png"))); // NOI18N
        btnProductUpdate.setToolTipText("Alterar produto");
        btnProductUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductUpdateActionPerformed(evt);
            }
        });

        btnProductDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/trash-30.png"))); // NOI18N
        btnProductDelete.setToolTipText("Excluir produto");
        btnProductDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE)
                    .addComponent(panelProductSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnProductUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProductDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPanelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelProductSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProductDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProductUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductSearchActionPerformed
        loadSearch(txtProductSearchField.getText());
    }//GEN-LAST:event_btnProductSearchActionPerformed

    private void tableProductSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductSearchMousePressed
        if (evt.getButton() != MouseEvent.BUTTON3 || tableProductSearch.getSelectedRow() < 0) {
            return;
        }

        Integer id = DataUtil.parseInteger(tableProductSearch.getModel().getValueAt(tableProductSearch.getSelectedRow(), 0) + "");

        JPopupMenu popup = new JPopupMenu();
        JMenuItem mItemUpdate = new JMenuItem("Alterar/Ver");

        mItemUpdate.addActionListener((e) -> {
            FrameMain.loadCardProductUpdate(id, true);
        });

        JMenuItem mItemDelete = new JMenuItem("Deletar");

        mItemDelete.addActionListener((e) -> {
            deleteProduct(id);
        });

        popup.add(mItemUpdate);

        popup.add(mItemDelete);

        popup.show(tableProductSearch,
                (int) evt.getX(),
                (int) evt.getY()
        );
    }//GEN-LAST:event_tableProductSearchMousePressed

    private void btnProductUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductUpdateActionPerformed
        if (tableProductSearch.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um produto na lista",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Integer id = DataUtil.parseInteger(tableProductSearch.getModel().getValueAt(tableProductSearch.getSelectedRow(), 0) + "");

        FrameMain.loadCardProductUpdate(id, true);
    }//GEN-LAST:event_btnProductUpdateActionPerformed

    private void btnProductDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductDeleteActionPerformed
        if (tableProductSearch.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um produto na lista",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Integer id = DataUtil.parseInteger(tableProductSearch.getModel().getValueAt(tableProductSearch.getSelectedRow(), 0) + "");
        deleteProduct(id);
    }//GEN-LAST:event_btnProductDeleteActionPerformed

    private void tableProductSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableProductSearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            if (tableProductSearch.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(this, "Selecione um produto na lista",
                        "Atenção", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            Integer id = DataUtil.parseInteger(tableProductSearch.getModel().getValueAt(tableProductSearch.getSelectedRow(), 0) + "");
            deleteProduct(id);
        }
    }//GEN-LAST:event_tableProductSearchKeyPressed

    public void deleteProduct(Integer id) {
        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja excluir este produto?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.NO_OPTION) {
            return;
        }

        try {
            ServiceProduct.getInstance().delete(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Produto excluído com sucesso!",
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        loadList();
    }

    public void loadList() {
        DefaultTableModel model = (DefaultTableModel) tableProductSearch.getModel();
        model.setNumRows(0);
        TableColumn column = tableProductSearch.getColumnModel().getColumn(0);
        if ("Código".equals(column.getHeaderValue().toString())) {
            tableProductSearch.removeColumn(column);
        }
        List<Product> list = null;
        try {
            list = ServiceProduct.getInstance().list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (list == null) {
            return;
        }
        for (Product p : list) {
            model.addRow(new Object[]{
                p.getId(),
                p.getBarcode(),
                p.getName(),
                p.getModel(),
                p.getPrice().toString().replace(".", ","),
                p.getStock()
            });
        }
    }

    private void loadSearch(String value) {
        DefaultTableModel model = (DefaultTableModel) tableProductSearch.getModel();
        model.setNumRows(0);
        List<Product> list = null;
        ProductSearchTypeEnum searchType = (ProductSearchTypeEnum) cbProductSearchType.getSelectedItem();
        try {
            list = ServiceProduct.getInstance().search(searchType, value);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (list == null) {
            JOptionPane.showMessageDialog(this, "Nenhum produto foi encontrado",
                    "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (Product p : list) {
            model.addRow(new Object[]{
                p.getId(),
                p.getBarcode(),
                p.getName(),
                p.getModel(),
                p.getPrice().toString().replace(".", ","),
                p.getStock()
            });

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProductDelete;
    private javax.swing.JButton btnProductSearch;
    private javax.swing.JButton btnProductUpdate;
    private javax.swing.JComboBox<String> cbProductSearchType;
    private javax.swing.JLabel lblPanelTitle;
    private javax.swing.JPanel panelProductSearch;
    private javax.swing.JScrollPane scrollProduct;
    private javax.swing.JTable tableProductSearch;
    private javax.swing.JTextField txtProductSearchField;
    // End of variables declaration//GEN-END:variables
}
