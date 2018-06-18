package br.com.store.view;

import br.com.store.model.DocumentType;
import br.com.store.model.enums.FormOperationEnum;
import br.com.store.service.ServiceDocumentType;
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

public class PanelDocumentType extends javax.swing.JPanel {

    private Integer documentTypeId;
    private FormOperationEnum operation;

    public PanelDocumentType() {
        initComponents();
        loadList();
    }

    public PanelDocumentType(FormOperationEnum op, Integer id) {
        initComponents();
        loadList();
        prepareFormOperation(op, id);
    }

    private void prepareFormOperation(FormOperationEnum op, Integer id) {
        this.operation = op;
        this.documentTypeId = id;
        if (this.operation == FormOperationEnum.CREATE) {
            lblPanelTitle.setText("Tipo de Documento - Novo");
        } else {
            lblPanelTitle.setText("Tipo de Documento - Alteração");
            loadDocumentType(documentTypeId);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabDocumentType = new javax.swing.JTabbedPane();
        tabDocumentTypeRegister = new javax.swing.JPanel();
        panelDocumentTypeRegister = new javax.swing.JPanel();
        lblDocumentTypeName = new javax.swing.JLabel();
        txtDocumentTypeName = new javax.swing.JTextField();
        btnDocumentTypeSave = new javax.swing.JButton();
        btnDocumentTypeCancel = new javax.swing.JButton();
        tabDocumentTypeList = new javax.swing.JPanel();
        panelDocumentTypeSearch = new javax.swing.JPanel();
        lblDocumentTypeSearchField = new javax.swing.JLabel();
        txtDocumentTypeSearchField = new javax.swing.JTextField();
        btnDocumentTypeSearch = new javax.swing.JButton();
        scrollDocumentType = new javax.swing.JScrollPane();
        tableDocumentTypeSearch = new javax.swing.JTable();
        btnDocumentTypeListRefresh = new javax.swing.JButton();
        btnDocumentTypeDelete = new javax.swing.JButton();
        btnDocumentTypeUpdate = new javax.swing.JButton();
        lblPanelTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tabDocumentTypeRegister.setBackground(new java.awt.Color(255, 255, 255));

        panelDocumentTypeRegister.setBackground(new java.awt.Color(255, 255, 255));
        panelDocumentTypeRegister.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Documento"));

        lblDocumentTypeName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDocumentTypeName.setText("Nome");

        javax.swing.GroupLayout panelDocumentTypeRegisterLayout = new javax.swing.GroupLayout(panelDocumentTypeRegister);
        panelDocumentTypeRegister.setLayout(panelDocumentTypeRegisterLayout);
        panelDocumentTypeRegisterLayout.setHorizontalGroup(
            panelDocumentTypeRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDocumentTypeRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDocumentTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDocumentTypeName, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelDocumentTypeRegisterLayout.setVerticalGroup(
            panelDocumentTypeRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDocumentTypeRegisterLayout.createSequentialGroup()
                .addGroup(panelDocumentTypeRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDocumentTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDocumentTypeName))
                .addContainerGap(215, Short.MAX_VALUE))
        );

        btnDocumentTypeSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/save.png"))); // NOI18N
        btnDocumentTypeSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocumentTypeSaveActionPerformed(evt);
            }
        });

        btnDocumentTypeCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/cancel-30.png"))); // NOI18N
        btnDocumentTypeCancel.setToolTipText("Cancelar");
        btnDocumentTypeCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocumentTypeCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabDocumentTypeRegisterLayout = new javax.swing.GroupLayout(tabDocumentTypeRegister);
        tabDocumentTypeRegister.setLayout(tabDocumentTypeRegisterLayout);
        tabDocumentTypeRegisterLayout.setHorizontalGroup(
            tabDocumentTypeRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabDocumentTypeRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabDocumentTypeRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDocumentTypeRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabDocumentTypeRegisterLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 648, Short.MAX_VALUE)
                        .addComponent(btnDocumentTypeCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDocumentTypeSave, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        tabDocumentTypeRegisterLayout.setVerticalGroup(
            tabDocumentTypeRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabDocumentTypeRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDocumentTypeRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabDocumentTypeRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDocumentTypeSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDocumentTypeCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        tabDocumentType.addTab("Nova", tabDocumentTypeRegister);

        tabDocumentTypeList.setBackground(new java.awt.Color(255, 255, 255));

        panelDocumentTypeSearch.setBackground(new java.awt.Color(255, 255, 255));
        panelDocumentTypeSearch.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        lblDocumentTypeSearchField.setText("Nome");

        btnDocumentTypeSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/search.png"))); // NOI18N
        btnDocumentTypeSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocumentTypeSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDocumentTypeSearchLayout = new javax.swing.GroupLayout(panelDocumentTypeSearch);
        panelDocumentTypeSearch.setLayout(panelDocumentTypeSearchLayout);
        panelDocumentTypeSearchLayout.setHorizontalGroup(
            panelDocumentTypeSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDocumentTypeSearchLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblDocumentTypeSearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDocumentTypeSearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDocumentTypeSearch)
                .addGap(2, 2, 2))
        );
        panelDocumentTypeSearchLayout.setVerticalGroup(
            panelDocumentTypeSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDocumentTypeSearchLayout.createSequentialGroup()
                .addGroup(panelDocumentTypeSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDocumentTypeSearchField)
                    .addComponent(btnDocumentTypeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDocumentTypeSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableDocumentTypeSearch.setModel(new javax.swing.table.DefaultTableModel(
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
        tableDocumentTypeSearch.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableDocumentTypeSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableDocumentTypeSearchMousePressed(evt);
            }
        });
        tableDocumentTypeSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableDocumentTypeSearchKeyPressed(evt);
            }
        });
        scrollDocumentType.setViewportView(tableDocumentTypeSearch);

        btnDocumentTypeListRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/refresh.png"))); // NOI18N
        btnDocumentTypeListRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocumentTypeListRefreshActionPerformed(evt);
            }
        });

        btnDocumentTypeDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/trash-30.png"))); // NOI18N
        btnDocumentTypeDelete.setToolTipText("Excluir produto");
        btnDocumentTypeDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocumentTypeDeleteActionPerformed(evt);
            }
        });

        btnDocumentTypeUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/update-30.png"))); // NOI18N
        btnDocumentTypeUpdate.setToolTipText("Alterar");
        btnDocumentTypeUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocumentTypeUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabDocumentTypeListLayout = new javax.swing.GroupLayout(tabDocumentTypeList);
        tabDocumentTypeList.setLayout(tabDocumentTypeListLayout);
        tabDocumentTypeListLayout.setHorizontalGroup(
            tabDocumentTypeListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabDocumentTypeListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabDocumentTypeListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabDocumentTypeListLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDocumentTypeUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDocumentTypeDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabDocumentTypeListLayout.createSequentialGroup()
                        .addComponent(panelDocumentTypeSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDocumentTypeListRefresh))
                    .addComponent(scrollDocumentType, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabDocumentTypeListLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDocumentTypeDelete, btnDocumentTypeUpdate});

        tabDocumentTypeListLayout.setVerticalGroup(
            tabDocumentTypeListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabDocumentTypeListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabDocumentTypeListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelDocumentTypeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDocumentTypeListRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollDocumentType, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabDocumentTypeListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDocumentTypeDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDocumentTypeUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        tabDocumentType.addTab("Listagem", tabDocumentTypeList);

        lblPanelTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblPanelTitle.setText("Tipo de Documento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabDocumentType)
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
                .addComponent(tabDocumentType))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDocumentTypeSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocumentTypeSaveActionPerformed
        String temp = "", temp2 = "";
        if (operation == FormOperationEnum.CREATE) {
            temp = "cadastrar";
            temp2 = "cadastrado";
        } else {
            temp = "alterar";
            temp2 = "alterado";
        }

        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja " + temp + " este tipo de documento?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.NO_OPTION) {
            return;
        }

        DocumentType docType = new DocumentType();
        docType.setName(txtDocumentTypeName.getText());

        try {
            if (operation == FormOperationEnum.CREATE) {
                ServiceDocumentType.getInstance().insert(docType);
            } else {
                ServiceDocumentType.getInstance().update(docType);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Tipo de documento " + temp2 + " com sucesso",
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        txtDocumentTypeName.setText("");
        loadList();
    }//GEN-LAST:event_btnDocumentTypeSaveActionPerformed

    private void btnDocumentTypeListRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocumentTypeListRefreshActionPerformed
        loadList();
    }//GEN-LAST:event_btnDocumentTypeListRefreshActionPerformed

    private void btnDocumentTypeSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocumentTypeSearchActionPerformed
        loadSearch(txtDocumentTypeSearchField.getText());
    }//GEN-LAST:event_btnDocumentTypeSearchActionPerformed

    private void btnDocumentTypeDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocumentTypeDeleteActionPerformed
        if (tableDocumentTypeSearch.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um tipo de documento na lista",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Integer id = DataUtil.parseInteger(tableDocumentTypeSearch.getModel().getValueAt(tableDocumentTypeSearch.getSelectedRow(), 0) + "");
        deleteDocumentType(id);
    }//GEN-LAST:event_btnDocumentTypeDeleteActionPerformed

    private void tableDocumentTypeSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableDocumentTypeSearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            if (tableDocumentTypeSearch.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(this, "Selecione um tipo de documento na lista",
                        "Atenção", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            Integer id = DataUtil.parseInteger(tableDocumentTypeSearch.getModel().getValueAt(tableDocumentTypeSearch.getSelectedRow(), 0) + "");
            deleteDocumentType(id);
        }
    }//GEN-LAST:event_tableDocumentTypeSearchKeyPressed

    private void tableDocumentTypeSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDocumentTypeSearchMousePressed
        if (evt.getButton() != MouseEvent.BUTTON3 || tableDocumentTypeSearch.getSelectedRow() < 0) {
            return;
        }

        Integer id = DataUtil.parseInteger(tableDocumentTypeSearch.getModel().getValueAt(tableDocumentTypeSearch.getSelectedRow(), 0) + "");

        JPopupMenu popup = new JPopupMenu();
        JMenuItem mItemUpdate = new JMenuItem("Alterar/Ver");
        mItemUpdate.addActionListener((e) -> {
            PanelDocumentType p = new PanelDocumentType(FormOperationEnum.UPDATE, id);
            FrameMain.loadCard(p, "DocumentType", true);
        });
        popup.add(mItemUpdate);
        JMenuItem mItemDelete = new JMenuItem("Deletar");
        mItemDelete.addActionListener((e) -> {
            deleteDocumentType(id);
        });

        popup.add(mItemDelete);

        popup.show(tableDocumentTypeSearch,
                (int) evt.getX(),
                (int) evt.getY()
        );
    }//GEN-LAST:event_tableDocumentTypeSearchMousePressed

    private void btnDocumentTypeCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocumentTypeCancelActionPerformed
        PanelDocumentType p = new PanelDocumentType(FormOperationEnum.CREATE, null);
        FrameMain.loadCard(p, "DocumentType", true);
    }//GEN-LAST:event_btnDocumentTypeCancelActionPerformed

    private void btnDocumentTypeUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocumentTypeUpdateActionPerformed
        if (tableDocumentTypeSearch.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um tipo de documento na lista",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Integer id = DataUtil.parseInteger(tableDocumentTypeSearch.getModel().getValueAt(tableDocumentTypeSearch.getSelectedRow(), 0) + "");

        PanelContactType p = new PanelContactType(FormOperationEnum.UPDATE, id);
        FrameMain.loadCard(p, "DocumentType", true);
    }//GEN-LAST:event_btnDocumentTypeUpdateActionPerformed

    public void deleteDocumentType(Integer id) {
        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja excluir este tipo de documento?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.NO_OPTION) {
            return;
        }

        try {
            ServiceDocumentType.getInstance().delete(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Tipo de documento excluído com sucesso!",
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        loadList();
    }

    private void loadDocumentType(Integer id) {
        DocumentType ct;
        try {
            ct = ServiceDocumentType.getInstance().get(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        documentTypeId = ct.getId();
        txtDocumentTypeName.setText(ct.getName());
    }

    public void loadList() {
        DefaultTableModel model = (DefaultTableModel) tableDocumentTypeSearch.getModel();
        model.setNumRows(0);
        TableColumn column = tableDocumentTypeSearch.getColumnModel().getColumn(0);
        if ("Código".equals(column.getHeaderValue().toString())) {
            tableDocumentTypeSearch.removeColumn(column);
        }
        List<DocumentType> list = null;
        try {
            list = ServiceDocumentType.getInstance().list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (list == null) {
            return;
        }
        for (DocumentType p : list) {
            model.addRow(new Object[]{
                p.getId(),
                p.getName()
            });
        }
    }

    private void loadSearch(String value) {
        DefaultTableModel model = (DefaultTableModel) tableDocumentTypeSearch.getModel();
        model.setNumRows(0);
        List<DocumentType> list = null;

        try {
            list = ServiceDocumentType.getInstance().search(value);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (list == null) {
            JOptionPane.showMessageDialog(this, "Nenhum tipo de documento foi encontrado",
                    "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (DocumentType p : list) {
            model.addRow(new Object[]{
                p.getId(),
                p.getName()
            });

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDocumentTypeCancel;
    private javax.swing.JButton btnDocumentTypeDelete;
    private javax.swing.JButton btnDocumentTypeListRefresh;
    private javax.swing.JButton btnDocumentTypeSave;
    private javax.swing.JButton btnDocumentTypeSearch;
    private javax.swing.JButton btnDocumentTypeUpdate;
    private javax.swing.JLabel lblDocumentTypeName;
    private javax.swing.JLabel lblDocumentTypeSearchField;
    private javax.swing.JLabel lblPanelTitle;
    private javax.swing.JPanel panelDocumentTypeRegister;
    private javax.swing.JPanel panelDocumentTypeSearch;
    private javax.swing.JScrollPane scrollDocumentType;
    private javax.swing.JTabbedPane tabDocumentType;
    private javax.swing.JPanel tabDocumentTypeList;
    private javax.swing.JPanel tabDocumentTypeRegister;
    private javax.swing.JTable tableDocumentTypeSearch;
    private javax.swing.JTextField txtDocumentTypeName;
    private javax.swing.JTextField txtDocumentTypeSearchField;
    // End of variables declaration//GEN-END:variables
}
