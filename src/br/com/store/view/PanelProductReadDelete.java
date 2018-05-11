package br.com.store.view;


import br.com.store.model.Product;
import br.com.store.service.ServiceProduct;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
        scrollProduct = new javax.swing.JScrollPane();
        tableProductSearch = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        panelProductSearch.setBackground(new java.awt.Color(255, 255, 255));
        panelProductSearch.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar por nome"));

        btnProductSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/search.png"))); // NOI18N
        btnProductSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProductSearchLayout = new javax.swing.GroupLayout(panelProductSearch);
        panelProductSearch.setLayout(panelProductSearchLayout);
        panelProductSearchLayout.setHorizontalGroup(
            panelProductSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductSearchLayout.createSequentialGroup()
                .addComponent(txtProductSearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProductSearch)
                .addGap(2, 2, 2))
        );
        panelProductSearchLayout.setVerticalGroup(
            panelProductSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductSearchLayout.createSequentialGroup()
                .addGroup(panelProductSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProductSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableProductSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Código de Barras", "Nome", "Modelo", "Preço", "Estoque"
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
        scrollProduct.setViewportView(tableProductSearch);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Produto - Visualização");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
                    .addComponent(panelProductSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelProductSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductSearchActionPerformed

    }//GEN-LAST:event_btnProductSearchActionPerformed

    private void loadList() {
        DefaultTableModel model = (DefaultTableModel) tableProductSearch.getModel();
        model.setNumRows(0);
        List<Product> list = null;
        try {
            list = ServiceProduct.getInstance().list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
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
        try {
            list = ServiceProduct.getInstance().search(value);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
        if (list == null) {
            JOptionPane.showMessageDialog(this, "Nenhum produto foi encontrado",
                    "Pesquisa", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JButton btnProductSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelProductSearch;
    private javax.swing.JScrollPane scrollProduct;
    private javax.swing.JTable tableProductSearch;
    private javax.swing.JTextField txtProductSearchField;
    // End of variables declaration//GEN-END:variables
}
