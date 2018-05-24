package br.com.store.view;

import br.com.store.model.ContactType;
import br.com.store.model.enums.FormOperationEnum;
import br.com.store.service.ServiceContactType;
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

public class PanelContactType extends javax.swing.JPanel {

    private Integer contactTypeId;
    private FormOperationEnum operation;

    public PanelContactType() {
        initComponents();
        loadList();
    }

    public PanelContactType(FormOperationEnum op, Integer id) {
        initComponents();
        loadList();
        prepareFormOperation(op, id);
    }

    private void prepareFormOperation(FormOperationEnum op, Integer id) {
        this.operation = op;
        this.contactTypeId = id;
        if (this.operation == FormOperationEnum.CREATE) {
            lblPanelTitle.setText("Tipo de Contato - Novo");
        } else {
            lblPanelTitle.setText("Tipo de Contato - Alteração");
            loadContactType(contactTypeId);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabContactType = new javax.swing.JTabbedPane();
        tabContactTypeRegister = new javax.swing.JPanel();
        panelContactTypeRegister = new javax.swing.JPanel();
        lblContactTypeName = new javax.swing.JLabel();
        txtContactTypeName = new javax.swing.JTextField();
        btnContactTypeSave = new javax.swing.JButton();
        btnContactTypeCancel = new javax.swing.JButton();
        tabContactTypeList = new javax.swing.JPanel();
        panelContactTypeSearch = new javax.swing.JPanel();
        lblContactTypeSearchField = new javax.swing.JLabel();
        txtContactTypeSearchField = new javax.swing.JTextField();
        btnContactTypeSearch = new javax.swing.JButton();
        scrollContactType = new javax.swing.JScrollPane();
        tableContactTypeSearch = new javax.swing.JTable();
        btnContactTypeListRefresh = new javax.swing.JButton();
        btnContactTypeDelete = new javax.swing.JButton();
        btnContactTypeUpdate = new javax.swing.JButton();
        lblPanelTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tabContactTypeRegister.setBackground(new java.awt.Color(255, 255, 255));

        panelContactTypeRegister.setBackground(new java.awt.Color(255, 255, 255));
        panelContactTypeRegister.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Contato"));

        lblContactTypeName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContactTypeName.setText("Nome");

        javax.swing.GroupLayout panelContactTypeRegisterLayout = new javax.swing.GroupLayout(panelContactTypeRegister);
        panelContactTypeRegister.setLayout(panelContactTypeRegisterLayout);
        panelContactTypeRegisterLayout.setHorizontalGroup(
            panelContactTypeRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContactTypeRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblContactTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContactTypeName, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelContactTypeRegisterLayout.setVerticalGroup(
            panelContactTypeRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContactTypeRegisterLayout.createSequentialGroup()
                .addGroup(panelContactTypeRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContactTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContactTypeName))
                .addContainerGap(215, Short.MAX_VALUE))
        );

        btnContactTypeSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/save.png"))); // NOI18N
        btnContactTypeSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactTypeSaveActionPerformed(evt);
            }
        });

        btnContactTypeCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/cancel-30.png"))); // NOI18N
        btnContactTypeCancel.setToolTipText("Cancelar");
        btnContactTypeCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactTypeCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabContactTypeRegisterLayout = new javax.swing.GroupLayout(tabContactTypeRegister);
        tabContactTypeRegister.setLayout(tabContactTypeRegisterLayout);
        tabContactTypeRegisterLayout.setHorizontalGroup(
            tabContactTypeRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabContactTypeRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabContactTypeRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelContactTypeRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabContactTypeRegisterLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnContactTypeCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnContactTypeSave, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        tabContactTypeRegisterLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnContactTypeCancel, btnContactTypeSave});

        tabContactTypeRegisterLayout.setVerticalGroup(
            tabContactTypeRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabContactTypeRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContactTypeRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabContactTypeRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnContactTypeSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnContactTypeCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        tabContactType.addTab("Nova", tabContactTypeRegister);

        tabContactTypeList.setBackground(new java.awt.Color(255, 255, 255));

        panelContactTypeSearch.setBackground(new java.awt.Color(255, 255, 255));
        panelContactTypeSearch.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        lblContactTypeSearchField.setText("Nome");

        btnContactTypeSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/search.png"))); // NOI18N
        btnContactTypeSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactTypeSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelContactTypeSearchLayout = new javax.swing.GroupLayout(panelContactTypeSearch);
        panelContactTypeSearch.setLayout(panelContactTypeSearchLayout);
        panelContactTypeSearchLayout.setHorizontalGroup(
            panelContactTypeSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContactTypeSearchLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblContactTypeSearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContactTypeSearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnContactTypeSearch)
                .addGap(2, 2, 2))
        );
        panelContactTypeSearchLayout.setVerticalGroup(
            panelContactTypeSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContactTypeSearchLayout.createSequentialGroup()
                .addGroup(panelContactTypeSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContactTypeSearchField)
                    .addComponent(btnContactTypeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContactTypeSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableContactTypeSearch.setModel(new javax.swing.table.DefaultTableModel(
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
        tableContactTypeSearch.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableContactTypeSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableContactTypeSearchMousePressed(evt);
            }
        });
        tableContactTypeSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableContactTypeSearchKeyPressed(evt);
            }
        });
        scrollContactType.setViewportView(tableContactTypeSearch);

        btnContactTypeListRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/refresh.png"))); // NOI18N
        btnContactTypeListRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactTypeListRefreshActionPerformed(evt);
            }
        });

        btnContactTypeDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/trash-30.png"))); // NOI18N
        btnContactTypeDelete.setToolTipText("Excluir produto");
        btnContactTypeDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactTypeDeleteActionPerformed(evt);
            }
        });

        btnContactTypeUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/update-30.png"))); // NOI18N
        btnContactTypeUpdate.setToolTipText("Alterar");
        btnContactTypeUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactTypeUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabContactTypeListLayout = new javax.swing.GroupLayout(tabContactTypeList);
        tabContactTypeList.setLayout(tabContactTypeListLayout);
        tabContactTypeListLayout.setHorizontalGroup(
            tabContactTypeListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabContactTypeListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabContactTypeListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabContactTypeListLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnContactTypeUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnContactTypeDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabContactTypeListLayout.createSequentialGroup()
                        .addComponent(panelContactTypeSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnContactTypeListRefresh))
                    .addComponent(scrollContactType, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabContactTypeListLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnContactTypeDelete, btnContactTypeUpdate});

        tabContactTypeListLayout.setVerticalGroup(
            tabContactTypeListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabContactTypeListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabContactTypeListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelContactTypeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnContactTypeListRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollContactType, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabContactTypeListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnContactTypeDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnContactTypeUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        tabContactType.addTab("Listagem", tabContactTypeList);

        lblPanelTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblPanelTitle.setText("Tipo de Contato");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabContactType)
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
                .addComponent(tabContactType))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnContactTypeSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactTypeSaveActionPerformed
        String temp = "", temp2 = "";
        if (operation == FormOperationEnum.CREATE) {
            temp = "cadastrar";
            temp2 = "cadastrado";
        } else {
            temp = "alterar";
            temp2 = "alterado";
        }

        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja " + temp + " este tipo de contato?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.NO_OPTION) {
            return;
        }

        ContactType contactType = new ContactType();
        contactType.setDescription(txtContactTypeName.getText());

        try {
            if (operation == FormOperationEnum.CREATE) {
                ServiceContactType.getInstance().insert(contactType);
            } else {
                ServiceContactType.getInstance().update(contactType);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Tipo de Contato " + temp2 + " com sucesso",
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        txtContactTypeName.setText("");
        loadList();
    }//GEN-LAST:event_btnContactTypeSaveActionPerformed

    private void btnContactTypeListRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactTypeListRefreshActionPerformed
        loadList();
    }//GEN-LAST:event_btnContactTypeListRefreshActionPerformed

    private void btnContactTypeSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactTypeSearchActionPerformed
        loadSearch(txtContactTypeSearchField.getText());
    }//GEN-LAST:event_btnContactTypeSearchActionPerformed

    private void btnContactTypeDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactTypeDeleteActionPerformed
        if (tableContactTypeSearch.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um tipo de contato na lista",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Integer id = DataUtil.parseInteger(tableContactTypeSearch.getModel().getValueAt(tableContactTypeSearch.getSelectedRow(), 0) + "");
        deleteContactType(id);
    }//GEN-LAST:event_btnContactTypeDeleteActionPerformed

    private void tableContactTypeSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableContactTypeSearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            if (tableContactTypeSearch.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(this, "Selecione um tipo de Contato na lista",
                        "Atenção", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            Integer id = DataUtil.parseInteger(tableContactTypeSearch.getModel().getValueAt(tableContactTypeSearch.getSelectedRow(), 0) + "");
            deleteContactType(id);
        }
    }//GEN-LAST:event_tableContactTypeSearchKeyPressed

    private void tableContactTypeSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableContactTypeSearchMousePressed
        if (evt.getButton() != MouseEvent.BUTTON3 || tableContactTypeSearch.getSelectedRow() < 0) {
            return;
        }

        Integer id = DataUtil.parseInteger(tableContactTypeSearch.getModel().getValueAt(tableContactTypeSearch.getSelectedRow(), 0) + "");

        JPopupMenu popup = new JPopupMenu();

        JMenuItem mItemUpdate = new JMenuItem("Alterar/Ver");
        mItemUpdate.addActionListener((e) -> {
            PanelContactType p = new PanelContactType(FormOperationEnum.UPDATE, id);
            FrameMain.loadCard(p, "ContactType", true);
        });
        popup.add(mItemUpdate);

        JMenuItem mItemDelete = new JMenuItem("Deletar");
        mItemDelete.addActionListener((e) -> {
            deleteContactType(id);
        });

        popup.add(mItemDelete);

        popup.show(tableContactTypeSearch,
                (int) evt.getX(),
                (int) evt.getY()
        );
    }//GEN-LAST:event_tableContactTypeSearchMousePressed

    private void btnContactTypeUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactTypeUpdateActionPerformed
        if (tableContactTypeSearch.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um tipo de contato na lista",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Integer id = DataUtil.parseInteger(tableContactTypeSearch.getModel().getValueAt(tableContactTypeSearch.getSelectedRow(), 0) + "");

        PanelContactType p = new PanelContactType(FormOperationEnum.UPDATE, id);
        FrameMain.loadCard(p, "ContactType", true);
    }//GEN-LAST:event_btnContactTypeUpdateActionPerformed

    private void btnContactTypeCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactTypeCancelActionPerformed
        PanelContactType p = new PanelContactType(FormOperationEnum.CREATE, null);
        FrameMain.loadCard(p, "ContactType", true);
    }//GEN-LAST:event_btnContactTypeCancelActionPerformed

    public void deleteContactType(Integer id) {
        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja excluir este tipo de contato?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.NO_OPTION) {
            return;
        }

        try {
            ServiceContactType.getInstance().delete(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Tipo de Contato excluído com sucesso!",
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        loadList();
    }

    private void loadContactType(Integer id) {
        ContactType ct;
        try {
            ct = ServiceContactType.getInstance().get(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        contactTypeId = ct.getId();
        txtContactTypeName.setText(ct.getDescription());
    }

    public void loadList() {
        DefaultTableModel model = (DefaultTableModel) tableContactTypeSearch.getModel();
        model.setNumRows(0);
        TableColumn column = tableContactTypeSearch.getColumnModel().getColumn(0);
        if ("Código".equals(column.getHeaderValue().toString())) {
            tableContactTypeSearch.removeColumn(column);
        }
        List<ContactType> list = null;
        try {
            list = ServiceContactType.getInstance().list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (list == null) {
            return;
        }
        for (ContactType p : list) {
            model.addRow(new Object[]{
                p.getId(),
                p.getDescription()
            });
        }
    }

    private void loadSearch(String value) {
        DefaultTableModel model = (DefaultTableModel) tableContactTypeSearch.getModel();
        model.setNumRows(0);
        List<ContactType> list = null;

        try {
            list = ServiceContactType.getInstance().search(value);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (list == null) {
            JOptionPane.showMessageDialog(this, "Nenhum tipo de Contato foi encontrado",
                    "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (ContactType p : list) {
            model.addRow(new Object[]{
                p.getId(),
                p.getDescription()
            });

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContactTypeCancel;
    private javax.swing.JButton btnContactTypeDelete;
    private javax.swing.JButton btnContactTypeListRefresh;
    private javax.swing.JButton btnContactTypeSave;
    private javax.swing.JButton btnContactTypeSearch;
    private javax.swing.JButton btnContactTypeUpdate;
    private javax.swing.JLabel lblContactTypeName;
    private javax.swing.JLabel lblContactTypeSearchField;
    private javax.swing.JLabel lblPanelTitle;
    private javax.swing.JPanel panelContactTypeRegister;
    private javax.swing.JPanel panelContactTypeSearch;
    private javax.swing.JScrollPane scrollContactType;
    private javax.swing.JTabbedPane tabContactType;
    private javax.swing.JPanel tabContactTypeList;
    private javax.swing.JPanel tabContactTypeRegister;
    private javax.swing.JTable tableContactTypeSearch;
    private javax.swing.JTextField txtContactTypeName;
    private javax.swing.JTextField txtContactTypeSearchField;
    // End of variables declaration//GEN-END:variables
}
