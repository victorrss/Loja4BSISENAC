package br.com.store.view;

import br.com.store.model.PublicPlaceType;
import br.com.store.model.enums.FormOperationEnum;
import br.com.store.service.ServicePublicPlaceType;
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

public class PanelPublicPlaceType extends javax.swing.JPanel {

    private Integer publicPlaceTypeId;
    private FormOperationEnum operation;

    public PanelPublicPlaceType() {
        initComponents();
        loadList();
    }

    public PanelPublicPlaceType(FormOperationEnum op, Integer id) {
        initComponents();
        loadList();
        prepareFormOperation(op, id);
    }

    private void prepareFormOperation(FormOperationEnum op, Integer id) {
        this.operation = op;
        this.publicPlaceTypeId = id;
        if (this.operation == FormOperationEnum.CREATE) {
            lblPanelTitle.setText("Tipo de Logradouro - Novo");
        } else {
            lblPanelTitle.setText("Tipo de Logradouro - Alteração");
            loadPublicPlaceType(publicPlaceTypeId);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPublicPlaceType = new javax.swing.JTabbedPane();
        tabPublicPlaceTypeRegister = new javax.swing.JPanel();
        panelPublicPlaceTypeRegister = new javax.swing.JPanel();
        lblPublicPlaceTypeName = new javax.swing.JLabel();
        txtPublicPlaceTypeName = new javax.swing.JTextField();
        lblPublicPlaceTypeAbbreviation = new javax.swing.JLabel();
        txtPublicPlaceTypeAbbreviation = new javax.swing.JTextField();
        btnPublicPlaceTypeSave = new javax.swing.JButton();
        btnPublicPlaceTypeCancel = new javax.swing.JButton();
        tabPublicPlaceTypeList = new javax.swing.JPanel();
        panelPublicPlaceTypeSearch = new javax.swing.JPanel();
        lblPublicPlaceTypeSearchField = new javax.swing.JLabel();
        txtPublicPlaceTypeSearchField = new javax.swing.JTextField();
        btnPublicPlaceTypeSearch = new javax.swing.JButton();
        scrollPublicPlaceType = new javax.swing.JScrollPane();
        tablePublicPlaceTypeSearch = new javax.swing.JTable();
        btnPublicPlaceTypeListRefresh = new javax.swing.JButton();
        btnPublicPlaceTypeDelete = new javax.swing.JButton();
        btnPublicPlaceTypeUpdate = new javax.swing.JButton();
        lblPanelTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tabPublicPlaceTypeRegister.setBackground(new java.awt.Color(255, 255, 255));

        panelPublicPlaceTypeRegister.setBackground(new java.awt.Color(255, 255, 255));
        panelPublicPlaceTypeRegister.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Logradouro"));

        lblPublicPlaceTypeName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPublicPlaceTypeName.setText("Nome");

        lblPublicPlaceTypeAbbreviation.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPublicPlaceTypeAbbreviation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPublicPlaceTypeAbbreviation.setText("Abreviação");

        javax.swing.GroupLayout panelPublicPlaceTypeRegisterLayout = new javax.swing.GroupLayout(panelPublicPlaceTypeRegister);
        panelPublicPlaceTypeRegister.setLayout(panelPublicPlaceTypeRegisterLayout);
        panelPublicPlaceTypeRegisterLayout.setHorizontalGroup(
            panelPublicPlaceTypeRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPublicPlaceTypeRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPublicPlaceTypeRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPublicPlaceTypeRegisterLayout.createSequentialGroup()
                        .addComponent(lblPublicPlaceTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPublicPlaceTypeName, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE))
                    .addGroup(panelPublicPlaceTypeRegisterLayout.createSequentialGroup()
                        .addComponent(lblPublicPlaceTypeAbbreviation, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPublicPlaceTypeAbbreviation, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelPublicPlaceTypeRegisterLayout.setVerticalGroup(
            panelPublicPlaceTypeRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPublicPlaceTypeRegisterLayout.createSequentialGroup()
                .addGroup(panelPublicPlaceTypeRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPublicPlaceTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPublicPlaceTypeName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPublicPlaceTypeRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPublicPlaceTypeAbbreviation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPublicPlaceTypeAbbreviation))
                .addContainerGap(185, Short.MAX_VALUE))
        );

        btnPublicPlaceTypeSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/save.png"))); // NOI18N
        btnPublicPlaceTypeSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublicPlaceTypeSaveActionPerformed(evt);
            }
        });

        btnPublicPlaceTypeCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/cancel-30.png"))); // NOI18N
        btnPublicPlaceTypeCancel.setToolTipText("Cancelar");
        btnPublicPlaceTypeCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublicPlaceTypeCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabPublicPlaceTypeRegisterLayout = new javax.swing.GroupLayout(tabPublicPlaceTypeRegister);
        tabPublicPlaceTypeRegister.setLayout(tabPublicPlaceTypeRegisterLayout);
        tabPublicPlaceTypeRegisterLayout.setHorizontalGroup(
            tabPublicPlaceTypeRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPublicPlaceTypeRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabPublicPlaceTypeRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPublicPlaceTypeRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabPublicPlaceTypeRegisterLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPublicPlaceTypeCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPublicPlaceTypeSave, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        tabPublicPlaceTypeRegisterLayout.setVerticalGroup(
            tabPublicPlaceTypeRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPublicPlaceTypeRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPublicPlaceTypeRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabPublicPlaceTypeRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPublicPlaceTypeSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPublicPlaceTypeCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        tabPublicPlaceType.addTab("Nova", tabPublicPlaceTypeRegister);

        tabPublicPlaceTypeList.setBackground(new java.awt.Color(255, 255, 255));

        panelPublicPlaceTypeSearch.setBackground(new java.awt.Color(255, 255, 255));
        panelPublicPlaceTypeSearch.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        lblPublicPlaceTypeSearchField.setText("Nome");

        btnPublicPlaceTypeSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/search.png"))); // NOI18N
        btnPublicPlaceTypeSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublicPlaceTypeSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPublicPlaceTypeSearchLayout = new javax.swing.GroupLayout(panelPublicPlaceTypeSearch);
        panelPublicPlaceTypeSearch.setLayout(panelPublicPlaceTypeSearchLayout);
        panelPublicPlaceTypeSearchLayout.setHorizontalGroup(
            panelPublicPlaceTypeSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPublicPlaceTypeSearchLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblPublicPlaceTypeSearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPublicPlaceTypeSearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPublicPlaceTypeSearch)
                .addGap(2, 2, 2))
        );
        panelPublicPlaceTypeSearchLayout.setVerticalGroup(
            panelPublicPlaceTypeSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPublicPlaceTypeSearchLayout.createSequentialGroup()
                .addGroup(panelPublicPlaceTypeSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPublicPlaceTypeSearchField)
                    .addComponent(btnPublicPlaceTypeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPublicPlaceTypeSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablePublicPlaceTypeSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Abreviação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePublicPlaceTypeSearch.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablePublicPlaceTypeSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablePublicPlaceTypeSearchMousePressed(evt);
            }
        });
        tablePublicPlaceTypeSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablePublicPlaceTypeSearchKeyPressed(evt);
            }
        });
        scrollPublicPlaceType.setViewportView(tablePublicPlaceTypeSearch);

        btnPublicPlaceTypeListRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/refresh.png"))); // NOI18N
        btnPublicPlaceTypeListRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublicPlaceTypeListRefreshActionPerformed(evt);
            }
        });

        btnPublicPlaceTypeDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/trash-30.png"))); // NOI18N
        btnPublicPlaceTypeDelete.setToolTipText("Excluir produto");
        btnPublicPlaceTypeDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublicPlaceTypeDeleteActionPerformed(evt);
            }
        });

        btnPublicPlaceTypeUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/update-30.png"))); // NOI18N
        btnPublicPlaceTypeUpdate.setToolTipText("Alterar");
        btnPublicPlaceTypeUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublicPlaceTypeUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabPublicPlaceTypeListLayout = new javax.swing.GroupLayout(tabPublicPlaceTypeList);
        tabPublicPlaceTypeList.setLayout(tabPublicPlaceTypeListLayout);
        tabPublicPlaceTypeListLayout.setHorizontalGroup(
            tabPublicPlaceTypeListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPublicPlaceTypeListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabPublicPlaceTypeListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabPublicPlaceTypeListLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPublicPlaceTypeUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPublicPlaceTypeDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabPublicPlaceTypeListLayout.createSequentialGroup()
                        .addComponent(panelPublicPlaceTypeSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPublicPlaceTypeListRefresh))
                    .addComponent(scrollPublicPlaceType, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabPublicPlaceTypeListLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnPublicPlaceTypeDelete, btnPublicPlaceTypeUpdate});

        tabPublicPlaceTypeListLayout.setVerticalGroup(
            tabPublicPlaceTypeListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPublicPlaceTypeListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabPublicPlaceTypeListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelPublicPlaceTypeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPublicPlaceTypeListRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPublicPlaceType, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabPublicPlaceTypeListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPublicPlaceTypeDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPublicPlaceTypeUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        tabPublicPlaceType.addTab("Listagem", tabPublicPlaceTypeList);

        lblPanelTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblPanelTitle.setText("Tipo de Logradouro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPublicPlaceType)
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
                .addComponent(tabPublicPlaceType))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPublicPlaceTypeSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicPlaceTypeSaveActionPerformed
        String temp = "", temp2 = "";
        if (operation == FormOperationEnum.CREATE) {
            temp = "cadastrar";
            temp2 = "cadastrado";
        } else {
            temp = "alterar";
            temp2 = "alterado";
        }

        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja " + temp + " este tipo de logradouro?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.NO_OPTION) {
            return;
        }

        PublicPlaceType publicPlaceType = new PublicPlaceType();
        publicPlaceType.setName(txtPublicPlaceTypeName.getText());
        publicPlaceType.setAbbreviation(txtPublicPlaceTypeAbbreviation.getText());
        
        try {
            if (operation == FormOperationEnum.CREATE) {
                ServicePublicPlaceType.getInstance().insert(publicPlaceType);
            } else {
                ServicePublicPlaceType.getInstance().update(publicPlaceType);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Tipo de logradouro " + temp2 + " com sucesso",
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        txtPublicPlaceTypeName.setText("");
        loadList();
    }//GEN-LAST:event_btnPublicPlaceTypeSaveActionPerformed

    private void btnPublicPlaceTypeListRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicPlaceTypeListRefreshActionPerformed
        loadList();
    }//GEN-LAST:event_btnPublicPlaceTypeListRefreshActionPerformed

    private void btnPublicPlaceTypeSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicPlaceTypeSearchActionPerformed
        loadSearch(txtPublicPlaceTypeSearchField.getText());
    }//GEN-LAST:event_btnPublicPlaceTypeSearchActionPerformed

    private void btnPublicPlaceTypeDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicPlaceTypeDeleteActionPerformed
        if (tablePublicPlaceTypeSearch.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um tipo de logradouro na lista",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Integer id = DataUtil.parseInteger(tablePublicPlaceTypeSearch.getModel().getValueAt(tablePublicPlaceTypeSearch.getSelectedRow(), 0) + "");
        deletePublicPlaceType(id);
    }//GEN-LAST:event_btnPublicPlaceTypeDeleteActionPerformed

    private void tablePublicPlaceTypeSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablePublicPlaceTypeSearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            if (tablePublicPlaceTypeSearch.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(this, "Selecione um tipo de logradouro na lista",
                        "Atenção", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            Integer id = DataUtil.parseInteger(tablePublicPlaceTypeSearch.getModel().getValueAt(tablePublicPlaceTypeSearch.getSelectedRow(), 0) + "");
            deletePublicPlaceType(id);
        }
    }//GEN-LAST:event_tablePublicPlaceTypeSearchKeyPressed

    private void tablePublicPlaceTypeSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePublicPlaceTypeSearchMousePressed
        if (evt.getButton() != MouseEvent.BUTTON3 || tablePublicPlaceTypeSearch.getSelectedRow() < 0) {
            return;
        }

        Integer id = DataUtil.parseInteger(tablePublicPlaceTypeSearch.getModel().getValueAt(tablePublicPlaceTypeSearch.getSelectedRow(), 0) + "");

        JPopupMenu popup = new JPopupMenu();

        JMenuItem mItemUpdate = new JMenuItem("Alterar/Ver");
        mItemUpdate.addActionListener((e) -> {
            PanelPublicPlaceType p = new PanelPublicPlaceType(FormOperationEnum.UPDATE, id);
            FrameMain.loadCard(p, "PublicPlaceType", true);
        });
        popup.add(mItemUpdate);

        JMenuItem mItemDelete = new JMenuItem("Deletar");
        mItemDelete.addActionListener((e) -> {
            deletePublicPlaceType(id);
        });

        popup.add(mItemDelete);

        popup.show(tablePublicPlaceTypeSearch,
                (int) evt.getX(),
                (int) evt.getY()
        );
    }//GEN-LAST:event_tablePublicPlaceTypeSearchMousePressed

    private void btnPublicPlaceTypeUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicPlaceTypeUpdateActionPerformed
        if (tablePublicPlaceTypeSearch.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um tipo de logradouro na lista",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Integer id = DataUtil.parseInteger(tablePublicPlaceTypeSearch.getModel().getValueAt(tablePublicPlaceTypeSearch.getSelectedRow(), 0) + "");

        PanelMaritalStatus p = new PanelMaritalStatus(FormOperationEnum.UPDATE, id);
        FrameMain.loadCard(p, "PublicPlaceType", true);
    }//GEN-LAST:event_btnPublicPlaceTypeUpdateActionPerformed

    private void btnPublicPlaceTypeCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicPlaceTypeCancelActionPerformed
        PanelPublicPlaceType p = new PanelPublicPlaceType(FormOperationEnum.CREATE, null);
        FrameMain.loadCard(p, "PublicPlaceType", true);
    }//GEN-LAST:event_btnPublicPlaceTypeCancelActionPerformed

    public void deletePublicPlaceType(Integer id) {
        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja excluir este tipo de logradouro?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.NO_OPTION) {
            return;
        }

        try {
            ServicePublicPlaceType.getInstance().delete(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Tipo de logradouro excluído com sucesso!",
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        loadList();
    }

    private void loadPublicPlaceType(Integer id) {
        PublicPlaceType ct;
        try {
            ct = ServicePublicPlaceType.getInstance().get(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        publicPlaceTypeId = ct.getId();
        txtPublicPlaceTypeName.setText(ct.getName());
        txtPublicPlaceTypeAbbreviation.setText(ct.getAbbreviation());
    }

    public void loadList() {
        DefaultTableModel model = (DefaultTableModel) tablePublicPlaceTypeSearch.getModel();
        model.setNumRows(0);
        TableColumn column = tablePublicPlaceTypeSearch.getColumnModel().getColumn(0);
        if ("Código".equals(column.getHeaderValue().toString())) {
            tablePublicPlaceTypeSearch.removeColumn(column);
        }
        List<PublicPlaceType> list = null;
        try {
            list = ServicePublicPlaceType.getInstance().list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (list == null) {
            return;
        }
        for (PublicPlaceType p : list) {
            model.addRow(new Object[]{
                p.getId(),
                p.getName(),
                p.getAbbreviation()
            });
        }
    }

    private void loadSearch(String value) {
        DefaultTableModel model = (DefaultTableModel) tablePublicPlaceTypeSearch.getModel();
        model.setNumRows(0);
        List<PublicPlaceType> list = null;

        try {
            list = ServicePublicPlaceType.getInstance().search(value);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (list == null) {
            JOptionPane.showMessageDialog(this, "Nenhum tipo de logradouro foi encontrado",
                    "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (PublicPlaceType p : list) {
            model.addRow(new Object[]{
                p.getId(),
                p.getName(),
                p.getAbbreviation()
            });

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPublicPlaceTypeCancel;
    private javax.swing.JButton btnPublicPlaceTypeDelete;
    private javax.swing.JButton btnPublicPlaceTypeListRefresh;
    private javax.swing.JButton btnPublicPlaceTypeSave;
    private javax.swing.JButton btnPublicPlaceTypeSearch;
    private javax.swing.JButton btnPublicPlaceTypeUpdate;
    private javax.swing.JLabel lblPanelTitle;
    private javax.swing.JLabel lblPublicPlaceTypeAbbreviation;
    private javax.swing.JLabel lblPublicPlaceTypeName;
    private javax.swing.JLabel lblPublicPlaceTypeSearchField;
    private javax.swing.JPanel panelPublicPlaceTypeRegister;
    private javax.swing.JPanel panelPublicPlaceTypeSearch;
    private javax.swing.JScrollPane scrollPublicPlaceType;
    private javax.swing.JTabbedPane tabPublicPlaceType;
    private javax.swing.JPanel tabPublicPlaceTypeList;
    private javax.swing.JPanel tabPublicPlaceTypeRegister;
    private javax.swing.JTable tablePublicPlaceTypeSearch;
    private javax.swing.JTextField txtPublicPlaceTypeAbbreviation;
    private javax.swing.JTextField txtPublicPlaceTypeName;
    private javax.swing.JTextField txtPublicPlaceTypeSearchField;
    // End of variables declaration//GEN-END:variables
}
