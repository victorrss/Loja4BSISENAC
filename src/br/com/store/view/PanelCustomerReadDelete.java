package br.com.store.view;

import br.com.store.model.Customer;
import br.com.store.model.enums.CustomerSearchTypeEnum;
import br.com.store.service.ServiceCustomer;
import br.com.store.utils.DataUtil;
import br.com.store.view.main.FrameMain;
import java.util.List;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;

public class PanelCustomerReadDelete extends javax.swing.JPanel {

    public PanelCustomerReadDelete() {
        initComponents();
        loadList();
    }

    public void loadList() {
        DefaultTableModel model = (DefaultTableModel) tableCustomerSearch.getModel();
        model.setNumRows(0);
        List<Customer> list = null;
        try {
            list = ServiceCustomer.getInstance().list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
        if (list == null) {
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

    private void loadSearch(String value) {
        DefaultTableModel model = (DefaultTableModel) tableCustomerSearch.getModel();
        model.setNumRows(0);
        List<Customer> list = null;
        CustomerSearchTypeEnum searchType = (CustomerSearchTypeEnum) cbCustomerSearchField.getSelectedItem();
        try {
            list = ServiceCustomer.getInstance().search(searchType, value);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
        if (list == null) {
            JOptionPane.showMessageDialog(this, "Nenhum cliente foi encontrado",
                    "Pesquisa", JOptionPane.ERROR_MESSAGE);
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCustomerSearch = new javax.swing.JPanel();
        cbCustomerSearchField = new javax.swing.JComboBox<>();
        txtCustomerSearchField = new javax.swing.JTextField();
        btnCustomerSearch = new javax.swing.JButton();
        scrollCustomerSearch = new javax.swing.JScrollPane();
        tableCustomerSearch = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        panelCustomerSearch.setBackground(new java.awt.Color(255, 255, 255));
        panelCustomerSearch.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        cbCustomerSearchField.setModel(new javax.swing.DefaultComboBoxModel(br.com.store.model.enums.CustomerSearchTypeEnum.values()));

        btnCustomerSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/search.png"))); // NOI18N
        btnCustomerSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCustomerSearchLayout = new javax.swing.GroupLayout(panelCustomerSearch);
        panelCustomerSearch.setLayout(panelCustomerSearchLayout);
        panelCustomerSearchLayout.setHorizontalGroup(
            panelCustomerSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustomerSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbCustomerSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCustomerSearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCustomerSearch)
                .addContainerGap())
        );
        panelCustomerSearchLayout.setVerticalGroup(
            panelCustomerSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustomerSearchLayout.createSequentialGroup()
                .addGroup(panelCustomerSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCustomerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCustomerSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbCustomerSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCustomerSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableCustomerSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Tipo Doc.", "Documento", "Nascimento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
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
        tableCustomerSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableCustomerSearchMousePressed(evt);
            }
        });
        scrollCustomerSearch.setViewportView(tableCustomerSearch);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Cliente - Visualização");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelCustomerSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollCustomerSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
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
                .addComponent(panelCustomerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollCustomerSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCustomerSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerSearchActionPerformed
        loadSearch(txtCustomerSearchField.getText());
    }//GEN-LAST:event_btnCustomerSearchActionPerformed

    private void tableCustomerSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCustomerSearchMousePressed
        Integer id = DataUtil.parseInteger(tableCustomerSearch.getModel().getValueAt(tableCustomerSearch.getSelectedRow(), 0) + "");
        if (id < 1) {
            return;
        }
        JPopupMenu popup = new JPopupMenu();
        JMenuItem mItemUpdate = new JMenuItem("Alterar/Ver");
        mItemUpdate.addActionListener((e) -> {
            FrameMain.showCustomerUpdate(id);
        });

        JMenuItem mItemDelete = new JMenuItem("Deletar");
        mItemDelete.addActionListener((e) -> {
            deleteCustomer(id);
        });

        popup.add(mItemUpdate);
        popup.add(mItemDelete);
        //popup.add(new JPopupMenu.Separator());

        popup.show(tableCustomerSearch, (int) evt.getX(), (int) evt.getY());
    }//GEN-LAST:event_tableCustomerSearchMousePressed
    public void deleteCustomer(Integer id) {
        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja excluir este cliente?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.NO_OPTION) {
            return;
        }

        try {
            ServiceCustomer.getInstance().delete(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }

        JOptionPane.showMessageDialog(this, "Cliente excluído com sucesso!",
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        loadList();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomerSearch;
    private javax.swing.JComboBox<String> cbCustomerSearchField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelCustomerSearch;
    private javax.swing.JScrollPane scrollCustomerSearch;
    private javax.swing.JTable tableCustomerSearch;
    private javax.swing.JTextField txtCustomerSearchField;
    // End of variables declaration//GEN-END:variables
}
