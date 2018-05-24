package br.com.store.view;

import br.com.store.model.Category;
import br.com.store.model.enums.FormOperationEnum;
import br.com.store.service.ServiceCategory;
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

public class PanelCategory extends javax.swing.JPanel {

    private Integer categoryId;
    private FormOperationEnum operation;

    public PanelCategory() {
        initComponents();
        loadList();
    }

    public PanelCategory(FormOperationEnum op, Integer id) {
        initComponents();
        loadList();
        prepareFormOperation(op, id);
    }

    private void prepareFormOperation(FormOperationEnum op, Integer id) {
        this.operation = op;
        this.categoryId = id;
        if (this.operation == FormOperationEnum.CREATE) {
            lblPanelTitle.setText("Categoria - Novo");
        } else {
            lblPanelTitle.setText("Categoria - Alteração");
            loadCategory(categoryId);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabCategory = new javax.swing.JTabbedPane();
        tabCategoryRegister = new javax.swing.JPanel();
        panelCategoryRegister = new javax.swing.JPanel();
        lblCategoryName = new javax.swing.JLabel();
        txtCategoryName = new javax.swing.JTextField();
        btnCategorySave = new javax.swing.JButton();
        btnCategoryCancel = new javax.swing.JButton();
        tabCategoryList = new javax.swing.JPanel();
        panelCategorySearch = new javax.swing.JPanel();
        lblCategorySearchField = new javax.swing.JLabel();
        txtCategorySearchField = new javax.swing.JTextField();
        btnCategorySearch = new javax.swing.JButton();
        scrollCategory = new javax.swing.JScrollPane();
        tableCategorySearch = new javax.swing.JTable();
        btnCategoryListRefresh = new javax.swing.JButton();
        btnCategoryDelete = new javax.swing.JButton();
        btnCategoryUpdate = new javax.swing.JButton();
        lblPanelTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tabCategoryRegister.setBackground(new java.awt.Color(255, 255, 255));

        panelCategoryRegister.setBackground(new java.awt.Color(255, 255, 255));
        panelCategoryRegister.setBorder(javax.swing.BorderFactory.createTitledBorder("Categoria"));

        lblCategoryName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCategoryName.setText("Nome");

        javax.swing.GroupLayout panelCategoryRegisterLayout = new javax.swing.GroupLayout(panelCategoryRegister);
        panelCategoryRegister.setLayout(panelCategoryRegisterLayout);
        panelCategoryRegisterLayout.setHorizontalGroup(
            panelCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCategoryRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCategoryName, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCategoryRegisterLayout.setVerticalGroup(
            panelCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoryRegisterLayout.createSequentialGroup()
                .addGroup(panelCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCategoryName))
                .addContainerGap(215, Short.MAX_VALUE))
        );

        btnCategorySave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/save.png"))); // NOI18N
        btnCategorySave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategorySaveActionPerformed(evt);
            }
        });

        btnCategoryCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/cancel-30.png"))); // NOI18N
        btnCategoryCancel.setToolTipText("Cancelar");
        btnCategoryCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabCategoryRegisterLayout = new javax.swing.GroupLayout(tabCategoryRegister);
        tabCategoryRegister.setLayout(tabCategoryRegisterLayout);
        tabCategoryRegisterLayout.setHorizontalGroup(
            tabCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCategoryRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCategoryRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabCategoryRegisterLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCategoryCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCategorySave, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        tabCategoryRegisterLayout.setVerticalGroup(
            tabCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCategoryRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCategoryRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCategorySave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCategoryCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tabCategory.addTab("Nova", tabCategoryRegister);

        tabCategoryList.setBackground(new java.awt.Color(255, 255, 255));

        panelCategorySearch.setBackground(new java.awt.Color(255, 255, 255));
        panelCategorySearch.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        lblCategorySearchField.setText("Nome");

        btnCategorySearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/search.png"))); // NOI18N
        btnCategorySearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategorySearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCategorySearchLayout = new javax.swing.GroupLayout(panelCategorySearch);
        panelCategorySearch.setLayout(panelCategorySearchLayout);
        panelCategorySearchLayout.setHorizontalGroup(
            panelCategorySearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategorySearchLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblCategorySearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCategorySearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCategorySearch)
                .addGap(2, 2, 2))
        );
        panelCategorySearchLayout.setVerticalGroup(
            panelCategorySearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategorySearchLayout.createSequentialGroup()
                .addGroup(panelCategorySearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategorySearchField)
                    .addComponent(btnCategorySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCategorySearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableCategorySearch.setModel(new javax.swing.table.DefaultTableModel(
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
        tableCategorySearch.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableCategorySearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableCategorySearchMousePressed(evt);
            }
        });
        tableCategorySearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableCategorySearchKeyPressed(evt);
            }
        });
        scrollCategory.setViewportView(tableCategorySearch);

        btnCategoryListRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/refresh.png"))); // NOI18N
        btnCategoryListRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryListRefreshActionPerformed(evt);
            }
        });

        btnCategoryDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/trash-30.png"))); // NOI18N
        btnCategoryDelete.setToolTipText("Excluir produto");
        btnCategoryDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryDeleteActionPerformed(evt);
            }
        });

        btnCategoryUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/update-30.png"))); // NOI18N
        btnCategoryUpdate.setToolTipText("Alterar");
        btnCategoryUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabCategoryListLayout = new javax.swing.GroupLayout(tabCategoryList);
        tabCategoryList.setLayout(tabCategoryListLayout);
        tabCategoryListLayout.setHorizontalGroup(
            tabCategoryListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCategoryListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabCategoryListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabCategoryListLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCategoryUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCategoryDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabCategoryListLayout.createSequentialGroup()
                        .addComponent(panelCategorySearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCategoryListRefresh))
                    .addComponent(scrollCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabCategoryListLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCategoryDelete, btnCategoryUpdate});

        tabCategoryListLayout.setVerticalGroup(
            tabCategoryListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCategoryListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabCategoryListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelCategorySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCategoryListRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabCategoryListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCategoryDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCategoryUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        tabCategory.addTab("Listagem", tabCategoryList);

        lblPanelTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblPanelTitle.setText("Categoria");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabCategory)
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
                .addComponent(tabCategory))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCategorySaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategorySaveActionPerformed
        String temp = "", temp2 = "";
        if (operation == FormOperationEnum.CREATE) {
            temp = "cadastrar";
            temp2 = "cadastrada";
        } else {
            temp = "alterar";
            temp2 = "alterada";
        }

        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja " + temp + " esta categoria?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.NO_OPTION) {
            return;
        }

        Category category = new Category();
        category.setName(txtCategoryName.getText());

        try {
            if (operation == FormOperationEnum.CREATE) {
                ServiceCategory.getInstance().insert(category);
            } else {
                ServiceCategory.getInstance().update(category);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Categoria " + temp2 + " com sucesso",
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        txtCategoryName.setText("");
        loadList();
    }//GEN-LAST:event_btnCategorySaveActionPerformed

    private void btnCategoryListRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryListRefreshActionPerformed
        loadList();
    }//GEN-LAST:event_btnCategoryListRefreshActionPerformed

    private void btnCategorySearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategorySearchActionPerformed
        loadSearch(txtCategorySearchField.getText());
    }//GEN-LAST:event_btnCategorySearchActionPerformed

    private void btnCategoryDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryDeleteActionPerformed
        if (tableCategorySearch.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione uma categoria na lista",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Integer id = DataUtil.parseInteger(tableCategorySearch.getModel().getValueAt(tableCategorySearch.getSelectedRow(), 0) + "");
        deleteCategory(id);
    }//GEN-LAST:event_btnCategoryDeleteActionPerformed

    private void tableCategorySearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableCategorySearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            if (tableCategorySearch.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(this, "Selecione uma categoria na lista",
                        "Atenção", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            Integer id = DataUtil.parseInteger(tableCategorySearch.getModel().getValueAt(tableCategorySearch.getSelectedRow(), 0) + "");
            deleteCategory(id);
        }
    }//GEN-LAST:event_tableCategorySearchKeyPressed

    private void tableCategorySearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCategorySearchMousePressed
        if (evt.getButton() != MouseEvent.BUTTON3 || tableCategorySearch.getSelectedRow() < 0) {
            return;
        }

        Integer id = DataUtil.parseInteger(tableCategorySearch.getModel().getValueAt(tableCategorySearch.getSelectedRow(), 0) + "");

        JPopupMenu popup = new JPopupMenu();

        JMenuItem mItemUpdate = new JMenuItem("Alterar/Ver");
        mItemUpdate.addActionListener((e) -> {
            PanelCategory p = new PanelCategory(FormOperationEnum.UPDATE, id);
            FrameMain.loadCard(p, "Category", true);
        });

        JMenuItem mItemDelete = new JMenuItem("Deletar");
        mItemDelete.addActionListener((e) -> {
            deleteCategory(id);
        });

        popup.add(mItemUpdate);
        popup.add(mItemDelete);

        popup.show(tableCategorySearch,
                (int) evt.getX(),
                (int) evt.getY()
        );
    }//GEN-LAST:event_tableCategorySearchMousePressed

    private void btnCategoryCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryCancelActionPerformed
        PanelCategory p = new PanelCategory(FormOperationEnum.CREATE, null);
        FrameMain.loadCard(p, "Category", true);
    }//GEN-LAST:event_btnCategoryCancelActionPerformed

    private void btnCategoryUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryUpdateActionPerformed
        if (tableCategorySearch.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione uma categoria na lista",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Integer id = DataUtil.parseInteger(tableCategorySearch.getModel().getValueAt(tableCategorySearch.getSelectedRow(), 0) + "");

        PanelCategory p = new PanelCategory(FormOperationEnum.UPDATE, id);
        FrameMain.loadCard(p, "Category", true);
    }//GEN-LAST:event_btnCategoryUpdateActionPerformed

    public void deleteCategory(Integer id) {
        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja excluir esta categoria?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.NO_OPTION) {
            return;
        }

        try {
            ServiceCategory.getInstance().delete(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Categoria excluída com sucesso!",
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        loadList();
    }

    private void loadCategory(Integer id) {
        Category c;
        try {
            c = ServiceCategory.getInstance().get(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        categoryId = c.getId();
        txtCategoryName.setText(c.getName());
    }

    public void loadList() {
        DefaultTableModel model = (DefaultTableModel) tableCategorySearch.getModel();
        model.setNumRows(0);
        TableColumn column = tableCategorySearch.getColumnModel().getColumn(0);
        if ("Código".equals(column.getHeaderValue().toString())) {
            tableCategorySearch.removeColumn(column);
        }
        List<Category> list = null;
        try {
            list = ServiceCategory.getInstance().list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (list == null) {
            return;
        }
        for (Category p : list) {
            model.addRow(new Object[]{
                p.getId(),
                p.getName()
            });
        }
    }

    private void loadSearch(String value) {
        DefaultTableModel model = (DefaultTableModel) tableCategorySearch.getModel();
        model.setNumRows(0);
        List<Category> list = null;

        try {
            list = ServiceCategory.getInstance().search(value);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (list == null) {
            JOptionPane.showMessageDialog(this, "Nenhuma categoria foi encontrada",
                    "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (Category p : list) {
            model.addRow(new Object[]{
                p.getId(),
                p.getName()
            });

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategoryCancel;
    private javax.swing.JButton btnCategoryDelete;
    private javax.swing.JButton btnCategoryListRefresh;
    private javax.swing.JButton btnCategorySave;
    private javax.swing.JButton btnCategorySearch;
    private javax.swing.JButton btnCategoryUpdate;
    private javax.swing.JLabel lblCategoryName;
    private javax.swing.JLabel lblCategorySearchField;
    private javax.swing.JLabel lblPanelTitle;
    private javax.swing.JPanel panelCategoryRegister;
    private javax.swing.JPanel panelCategorySearch;
    private javax.swing.JScrollPane scrollCategory;
    private javax.swing.JTabbedPane tabCategory;
    private javax.swing.JPanel tabCategoryList;
    private javax.swing.JPanel tabCategoryRegister;
    private javax.swing.JTable tableCategorySearch;
    private javax.swing.JTextField txtCategoryName;
    private javax.swing.JTextField txtCategorySearchField;
    // End of variables declaration//GEN-END:variables

}
