package br.com.store.view;

import br.com.store.model.SubCategory;
import br.com.store.model.enums.FormOperationEnum;
import br.com.store.service.ServiceSubCategory;
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

public class PanelSubCategory extends javax.swing.JPanel {

    private Integer subCategoryId;
    private FormOperationEnum operation;

    public PanelSubCategory() {
        initComponents();
        loadList();
    }

    public PanelSubCategory(FormOperationEnum op, Integer id) {
        initComponents();
        loadList();
        prepareFormOperation(op, id);
    }

    private void prepareFormOperation(FormOperationEnum op, Integer id) {
        this.operation = op;
        this.subCategoryId = id;
        if (this.operation == FormOperationEnum.CREATE) {
            lblPanelTitle.setText("Sub Categoria - Novo");
        } else {
            lblPanelTitle.setText("Sub Categoria - Alteração");
            loadSubCategory(subCategoryId);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabSubCategory = new javax.swing.JTabbedPane();
        tabSubCategoryRegister = new javax.swing.JPanel();
        panelSubCategoryRegister = new javax.swing.JPanel();
        lblSubCategoryName = new javax.swing.JLabel();
        txtSubCategoryName = new javax.swing.JTextField();
        btnSubCategorySave = new javax.swing.JButton();
        btnSubCategoryCancel = new javax.swing.JButton();
        tabSubCategoryList = new javax.swing.JPanel();
        panelSubCategorySearch = new javax.swing.JPanel();
        lblSubCategorySearchField = new javax.swing.JLabel();
        txtSubCategorySearchField = new javax.swing.JTextField();
        btnSubCategorySearch = new javax.swing.JButton();
        scrollSubCategory = new javax.swing.JScrollPane();
        tableSubCategorySearch = new javax.swing.JTable();
        btnSubCategoryListRefresh = new javax.swing.JButton();
        btnSubCategoryDelete = new javax.swing.JButton();
        btnSubCategoryUpdate = new javax.swing.JButton();
        lblPanelTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tabSubCategoryRegister.setBackground(new java.awt.Color(255, 255, 255));

        panelSubCategoryRegister.setBackground(new java.awt.Color(255, 255, 255));
        panelSubCategoryRegister.setBorder(javax.swing.BorderFactory.createTitledBorder("Sub Categoria"));

        lblSubCategoryName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSubCategoryName.setText("Nome");

        javax.swing.GroupLayout panelSubCategoryRegisterLayout = new javax.swing.GroupLayout(panelSubCategoryRegister);
        panelSubCategoryRegister.setLayout(panelSubCategoryRegisterLayout);
        panelSubCategoryRegisterLayout.setHorizontalGroup(
            panelSubCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSubCategoryRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSubCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSubCategoryName, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelSubCategoryRegisterLayout.setVerticalGroup(
            panelSubCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSubCategoryRegisterLayout.createSequentialGroup()
                .addGroup(panelSubCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSubCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSubCategoryName))
                .addContainerGap(215, Short.MAX_VALUE))
        );

        btnSubCategorySave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/save.png"))); // NOI18N
        btnSubCategorySave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubCategorySaveActionPerformed(evt);
            }
        });

        btnSubCategoryCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/cancel-30.png"))); // NOI18N
        btnSubCategoryCancel.setToolTipText("Cancelar");
        btnSubCategoryCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubCategoryCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabSubCategoryRegisterLayout = new javax.swing.GroupLayout(tabSubCategoryRegister);
        tabSubCategoryRegister.setLayout(tabSubCategoryRegisterLayout);
        tabSubCategoryRegisterLayout.setHorizontalGroup(
            tabSubCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSubCategoryRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabSubCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSubCategoryRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabSubCategoryRegisterLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSubCategoryCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSubCategorySave, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        tabSubCategoryRegisterLayout.setVerticalGroup(
            tabSubCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSubCategoryRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSubCategoryRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabSubCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSubCategorySave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubCategoryCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        tabSubCategory.addTab("Nova", tabSubCategoryRegister);

        tabSubCategoryList.setBackground(new java.awt.Color(255, 255, 255));

        panelSubCategorySearch.setBackground(new java.awt.Color(255, 255, 255));
        panelSubCategorySearch.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        lblSubCategorySearchField.setText("Nome");

        btnSubCategorySearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/search.png"))); // NOI18N
        btnSubCategorySearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubCategorySearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSubCategorySearchLayout = new javax.swing.GroupLayout(panelSubCategorySearch);
        panelSubCategorySearch.setLayout(panelSubCategorySearchLayout);
        panelSubCategorySearchLayout.setHorizontalGroup(
            panelSubCategorySearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSubCategorySearchLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblSubCategorySearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSubCategorySearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubCategorySearch)
                .addGap(2, 2, 2))
        );
        panelSubCategorySearchLayout.setVerticalGroup(
            panelSubCategorySearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSubCategorySearchLayout.createSequentialGroup()
                .addGroup(panelSubCategorySearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubCategorySearchField)
                    .addComponent(btnSubCategorySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSubCategorySearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableSubCategorySearch.setModel(new javax.swing.table.DefaultTableModel(
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
        tableSubCategorySearch.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableSubCategorySearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableSubCategorySearchMousePressed(evt);
            }
        });
        tableSubCategorySearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableSubCategorySearchKeyPressed(evt);
            }
        });
        scrollSubCategory.setViewportView(tableSubCategorySearch);

        btnSubCategoryListRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/refresh.png"))); // NOI18N
        btnSubCategoryListRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubCategoryListRefreshActionPerformed(evt);
            }
        });

        btnSubCategoryDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/trash-30.png"))); // NOI18N
        btnSubCategoryDelete.setToolTipText("Excluir produto");
        btnSubCategoryDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubCategoryDeleteActionPerformed(evt);
            }
        });

        btnSubCategoryUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/update-30.png"))); // NOI18N
        btnSubCategoryUpdate.setToolTipText("Alterar");
        btnSubCategoryUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubCategoryUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabSubCategoryListLayout = new javax.swing.GroupLayout(tabSubCategoryList);
        tabSubCategoryList.setLayout(tabSubCategoryListLayout);
        tabSubCategoryListLayout.setHorizontalGroup(
            tabSubCategoryListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSubCategoryListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabSubCategoryListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabSubCategoryListLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSubCategoryUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSubCategoryDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabSubCategoryListLayout.createSequentialGroup()
                        .addComponent(panelSubCategorySearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSubCategoryListRefresh))
                    .addComponent(scrollSubCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabSubCategoryListLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSubCategoryDelete, btnSubCategoryUpdate});

        tabSubCategoryListLayout.setVerticalGroup(
            tabSubCategoryListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSubCategoryListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabSubCategoryListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelSubCategorySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubCategoryListRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollSubCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabSubCategoryListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSubCategoryDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubCategoryUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        tabSubCategory.addTab("Listagem", tabSubCategoryList);

        lblPanelTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblPanelTitle.setText("Sub Categoria");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabSubCategory)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPanelTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPanelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabSubCategory))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubCategorySaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubCategorySaveActionPerformed
        String temp = "", temp2 = "";
        if (operation == FormOperationEnum.CREATE) {
            temp = "cadastrar";
            temp2 = "cadastrada";
        } else {
            temp = "alterar";
            temp2 = "alterada";
        }

        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja " + temp + " esta sub categoria?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.NO_OPTION) {
            return;
        }

        SubCategory subCategory = new SubCategory();
        subCategory.setName(txtSubCategoryName.getText());

        try {
            if (operation == FormOperationEnum.CREATE) {
                ServiceSubCategory.getInstance().insert(subCategory);
            } else {
                ServiceSubCategory.getInstance().update(subCategory);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Sub categoria " + temp2 + " com sucesso",
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        txtSubCategoryName.setText("");
        loadList();
    }//GEN-LAST:event_btnSubCategorySaveActionPerformed

    private void btnSubCategoryListRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubCategoryListRefreshActionPerformed
        loadList();
    }//GEN-LAST:event_btnSubCategoryListRefreshActionPerformed

    private void btnSubCategorySearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubCategorySearchActionPerformed
        loadSearch(txtSubCategorySearchField.getText());
    }//GEN-LAST:event_btnSubCategorySearchActionPerformed

    private void btnSubCategoryDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubCategoryDeleteActionPerformed
        if (tableSubCategorySearch.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione uma sub categoria na lista",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Integer id = DataUtil.parseInteger(tableSubCategorySearch.getModel().getValueAt(tableSubCategorySearch.getSelectedRow(), 0) + "");
        deleteSubCategory(id);
    }//GEN-LAST:event_btnSubCategoryDeleteActionPerformed

    private void tableSubCategorySearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableSubCategorySearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            if (tableSubCategorySearch.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(this, "Selecione uma sub categoria na lista",
                        "Atenção", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            Integer id = DataUtil.parseInteger(tableSubCategorySearch.getModel().getValueAt(tableSubCategorySearch.getSelectedRow(), 0) + "");
            deleteSubCategory(id);
        }
    }//GEN-LAST:event_tableSubCategorySearchKeyPressed

    private void tableSubCategorySearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSubCategorySearchMousePressed
        if (evt.getButton() != MouseEvent.BUTTON3 || tableSubCategorySearch.getSelectedRow() < 0) {
            return;
        }

        Integer id = DataUtil.parseInteger(tableSubCategorySearch.getModel().getValueAt(tableSubCategorySearch.getSelectedRow(), 0) + "");

        JPopupMenu popup = new JPopupMenu();

        JMenuItem mItemUpdate = new JMenuItem("Alterar/Ver");
        mItemUpdate.addActionListener((e) -> {
            PanelSubCategory p = new PanelSubCategory(FormOperationEnum.UPDATE, id);
            FrameMain.loadCard(p, "SubCategory", true);
        });
        popup.add(mItemUpdate);

        JMenuItem mItemDelete = new JMenuItem("Deletar");
        mItemDelete.addActionListener((e) -> {
            deleteSubCategory(id);
        });
        popup.add(mItemDelete);

        popup.show(tableSubCategorySearch,
                (int) evt.getX(),
                (int) evt.getY()
        );
    }//GEN-LAST:event_tableSubCategorySearchMousePressed

    private void btnSubCategoryCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubCategoryCancelActionPerformed
        PanelSubCategory p = new PanelSubCategory(FormOperationEnum.CREATE, null);
        FrameMain.loadCard(p, "SubCategory", true);
    }//GEN-LAST:event_btnSubCategoryCancelActionPerformed

    private void btnSubCategoryUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubCategoryUpdateActionPerformed
        if (tableSubCategorySearch.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione uma sub categoria na lista",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Integer id = DataUtil.parseInteger(tableSubCategorySearch.getModel().getValueAt(tableSubCategorySearch.getSelectedRow(), 0) + "");

        PanelSubCategory p = new PanelSubCategory(FormOperationEnum.UPDATE, id);
        FrameMain.loadCard(p, "SubCategory", true);
    }//GEN-LAST:event_btnSubCategoryUpdateActionPerformed

    public void deleteSubCategory(Integer id) {
        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja excluir esta sub categoria?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.NO_OPTION) {
            return;
        }

        try {
            ServiceSubCategory.getInstance().delete(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Sub categoria excluída com sucesso!",
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        loadList();
    }

    private void loadSubCategory(Integer id) {
        SubCategory sc;
        try {
            sc = ServiceSubCategory.getInstance().get(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        subCategoryId = sc.getId();
        txtSubCategoryName.setText(sc.getName());
    }

    public void loadList() {
        DefaultTableModel model = (DefaultTableModel) tableSubCategorySearch.getModel();
        model.setNumRows(0);
        TableColumn column = tableSubCategorySearch.getColumnModel().getColumn(0);
        if ("Código".equals(column.getHeaderValue().toString())) {
            tableSubCategorySearch.removeColumn(column);
        }
        List<SubCategory> list = null;
        try {
            list = ServiceSubCategory.getInstance().list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (list == null) {
            return;
        }
        for (SubCategory p : list) {
            model.addRow(new Object[]{
                p.getId(),
                p.getName()
            });
        }
    }

    private void loadSearch(String value) {
        DefaultTableModel model = (DefaultTableModel) tableSubCategorySearch.getModel();
        model.setNumRows(0);
        List<SubCategory> list = null;

        try {
            list = ServiceSubCategory.getInstance().search(value);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (list == null) {
            JOptionPane.showMessageDialog(this, "Nenhuma sub categoria foi encontrada",
                    "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (SubCategory p : list) {
            model.addRow(new Object[]{
                p.getId(),
                p.getName()
            });

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubCategoryCancel;
    private javax.swing.JButton btnSubCategoryDelete;
    private javax.swing.JButton btnSubCategoryListRefresh;
    private javax.swing.JButton btnSubCategorySave;
    private javax.swing.JButton btnSubCategorySearch;
    private javax.swing.JButton btnSubCategoryUpdate;
    private javax.swing.JLabel lblPanelTitle;
    private javax.swing.JLabel lblSubCategoryName;
    private javax.swing.JLabel lblSubCategorySearchField;
    private javax.swing.JPanel panelSubCategoryRegister;
    private javax.swing.JPanel panelSubCategorySearch;
    private javax.swing.JScrollPane scrollSubCategory;
    private javax.swing.JTabbedPane tabSubCategory;
    private javax.swing.JPanel tabSubCategoryList;
    private javax.swing.JPanel tabSubCategoryRegister;
    private javax.swing.JTable tableSubCategorySearch;
    private javax.swing.JTextField txtSubCategoryName;
    private javax.swing.JTextField txtSubCategorySearchField;
    // End of variables declaration//GEN-END:variables

}
