package br.com.store.view;

import br.com.store.model.Brand;
import br.com.store.service.ServiceBrand;
import br.com.store.utils.DataUtil;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class PanelBrand extends javax.swing.JPanel {

    public PanelBrand() {
        initComponents();
        loadList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabBrand = new javax.swing.JTabbedPane();
        tabBrandRegister = new javax.swing.JPanel();
        panelBrandRegister = new javax.swing.JPanel();
        lblBrandName = new javax.swing.JLabel();
        txtBrandName = new javax.swing.JTextField();
        btnBrandSave = new javax.swing.JButton();
        tabBrandList = new javax.swing.JPanel();
        panelBrandSearch = new javax.swing.JPanel();
        lbBrandSearchField = new javax.swing.JLabel();
        txtBrandSearchField = new javax.swing.JTextField();
        btnBrandSearch = new javax.swing.JButton();
        scrollBrand = new javax.swing.JScrollPane();
        tableBrandSearch = new javax.swing.JTable();
        btnBrandListRefresh = new javax.swing.JButton();
        btnBrandDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tabBrandRegister.setBackground(new java.awt.Color(255, 255, 255));

        panelBrandRegister.setBackground(new java.awt.Color(255, 255, 255));
        panelBrandRegister.setBorder(javax.swing.BorderFactory.createTitledBorder("Marca"));

        lblBrandName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBrandName.setText("Nome");

        javax.swing.GroupLayout panelBrandRegisterLayout = new javax.swing.GroupLayout(panelBrandRegister);
        panelBrandRegister.setLayout(panelBrandRegisterLayout);
        panelBrandRegisterLayout.setHorizontalGroup(
            panelBrandRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBrandRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBrandName, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBrandRegisterLayout.setVerticalGroup(
            panelBrandRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBrandRegisterLayout.createSequentialGroup()
                .addGroup(panelBrandRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBrandName))
                .addContainerGap(215, Short.MAX_VALUE))
        );

        btnBrandSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/save.png"))); // NOI18N
        btnBrandSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrandSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabBrandRegisterLayout = new javax.swing.GroupLayout(tabBrandRegister);
        tabBrandRegister.setLayout(tabBrandRegisterLayout);
        tabBrandRegisterLayout.setHorizontalGroup(
            tabBrandRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBrandRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabBrandRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBrandRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabBrandRegisterLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBrandSave, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        tabBrandRegisterLayout.setVerticalGroup(
            tabBrandRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBrandRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBrandRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBrandSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabBrand.addTab("Nova", tabBrandRegister);

        tabBrandList.setBackground(new java.awt.Color(255, 255, 255));

        panelBrandSearch.setBackground(new java.awt.Color(255, 255, 255));
        panelBrandSearch.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        lbBrandSearchField.setText("Nome");

        btnBrandSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/search.png"))); // NOI18N
        btnBrandSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrandSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBrandSearchLayout = new javax.swing.GroupLayout(panelBrandSearch);
        panelBrandSearch.setLayout(panelBrandSearchLayout);
        panelBrandSearchLayout.setHorizontalGroup(
            panelBrandSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBrandSearchLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lbBrandSearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBrandSearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBrandSearch)
                .addGap(2, 2, 2))
        );
        panelBrandSearchLayout.setVerticalGroup(
            panelBrandSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBrandSearchLayout.createSequentialGroup()
                .addGroup(panelBrandSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBrandSearchField)
                    .addComponent(btnBrandSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBrandSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableBrandSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableBrandSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableBrandSearchMousePressed(evt);
            }
        });
        tableBrandSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableBrandSearchKeyPressed(evt);
            }
        });
        scrollBrand.setViewportView(tableBrandSearch);

        btnBrandListRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/refresh.png"))); // NOI18N
        btnBrandListRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrandListRefreshActionPerformed(evt);
            }
        });

        btnBrandDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/trash-30.png"))); // NOI18N
        btnBrandDelete.setToolTipText("Excluir produto");
        btnBrandDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrandDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabBrandListLayout = new javax.swing.GroupLayout(tabBrandList);
        tabBrandList.setLayout(tabBrandListLayout);
        tabBrandListLayout.setHorizontalGroup(
            tabBrandListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBrandListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabBrandListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabBrandListLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBrandDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabBrandListLayout.createSequentialGroup()
                        .addComponent(panelBrandSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBrandListRefresh))
                    .addComponent(scrollBrand, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE))
                .addContainerGap())
        );
        tabBrandListLayout.setVerticalGroup(
            tabBrandListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBrandListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabBrandListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelBrandSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrandListRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollBrand, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBrandDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        tabBrand.addTab("Listagem", tabBrandList);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Marca");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabBrand)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabBrand))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrandSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrandSaveActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja cadastar esta marca?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.NO_OPTION) {
            return;
        }

        Brand brand = new Brand();
        brand.setName(txtBrandName.getText());

        try {
            ServiceBrand.getInstance().insert(brand);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Marca cadastrada com sucesso",
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        txtBrandName.setText("");
    }//GEN-LAST:event_btnBrandSaveActionPerformed

    private void btnBrandListRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrandListRefreshActionPerformed
        loadList();
    }//GEN-LAST:event_btnBrandListRefreshActionPerformed

    private void btnBrandSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrandSearchActionPerformed
        loadSearch(txtBrandSearchField.getText());
    }//GEN-LAST:event_btnBrandSearchActionPerformed

    private void btnBrandDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrandDeleteActionPerformed
        if (tableBrandSearch.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione uma marca na lista",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Integer id = DataUtil.parseInteger(tableBrandSearch.getModel().getValueAt(tableBrandSearch.getSelectedRow(), 0) + "");
        deleteBrand(id);
    }//GEN-LAST:event_btnBrandDeleteActionPerformed

    private void tableBrandSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableBrandSearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            if (tableBrandSearch.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(this, "Selecione uma marca na lista",
                        "Atenção", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            Integer id = DataUtil.parseInteger(tableBrandSearch.getModel().getValueAt(tableBrandSearch.getSelectedRow(), 0) + "");
            deleteBrand(id);
        }
    }//GEN-LAST:event_tableBrandSearchKeyPressed

    private void tableBrandSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBrandSearchMousePressed
        if (evt.getButton() != MouseEvent.BUTTON3 || tableBrandSearch.getSelectedRow() < 0) {
            return;
        }

        Integer id = DataUtil.parseInteger(tableBrandSearch.getModel().getValueAt(tableBrandSearch.getSelectedRow(), 0) + "");

        JPopupMenu popup = new JPopupMenu();
        JMenuItem mItemDelete = new JMenuItem("Deletar");

        mItemDelete.addActionListener((e) -> {
            deleteBrand(id);
        });

        popup.add(mItemDelete);

        popup.show(tableBrandSearch,
                (int) evt.getX(),
                (int) evt.getY()
        );
    }//GEN-LAST:event_tableBrandSearchMousePressed

    public void deleteBrand(Integer id) {
        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja excluir esta marca?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.NO_OPTION) {
            return;
        }

        try {
            ServiceBrand.getInstance().delete(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Marca excluída com sucesso!",
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        loadList();
    }

    public void loadList() {
        DefaultTableModel model = (DefaultTableModel) tableBrandSearch.getModel();
        model.setNumRows(0);
        TableColumn column = tableBrandSearch.getColumnModel().getColumn(0);
        if ("Código".equals(column.getHeaderValue().toString())) {
            tableBrandSearch.removeColumn(column);
        }
        List<Brand> list = null;
        try {
            list = ServiceBrand.getInstance().list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (list == null) {
            return;
        }
        for (Brand p : list) {
            model.addRow(new Object[]{
                p.getId(),
                p.getName()
            });
        }
    }

    private void loadSearch(String value) {
        DefaultTableModel model = (DefaultTableModel) tableBrandSearch.getModel();
        model.setNumRows(0);
        List<Brand> list = null;

        try {
            list = ServiceBrand.getInstance().search(value);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (list == null) {
            JOptionPane.showMessageDialog(this, "Nenhuma marca foi encontrada",
                    "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (Brand p : list) {
            model.addRow(new Object[]{
                p.getId(),
                p.getName()
            });

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrandDelete;
    private javax.swing.JButton btnBrandListRefresh;
    private javax.swing.JButton btnBrandSave;
    private javax.swing.JButton btnBrandSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbBrandSearchField;
    private javax.swing.JLabel lblBrandName;
    private javax.swing.JPanel panelBrandRegister;
    private javax.swing.JPanel panelBrandSearch;
    private javax.swing.JScrollPane scrollBrand;
    private javax.swing.JTabbedPane tabBrand;
    private javax.swing.JPanel tabBrandList;
    private javax.swing.JPanel tabBrandRegister;
    private javax.swing.JTable tableBrandSearch;
    private javax.swing.JTextField txtBrandName;
    private javax.swing.JTextField txtBrandSearchField;
    // End of variables declaration//GEN-END:variables
}
