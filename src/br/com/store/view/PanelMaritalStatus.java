package br.com.store.view;

import br.com.store.model.MaritalStatus;
import br.com.store.model.enums.FormOperationEnum;
import br.com.store.service.ServiceMaritalStatus;
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

public class PanelMaritalStatus extends javax.swing.JPanel {

    private Integer maritalStatusId;
    private FormOperationEnum operation;

    public PanelMaritalStatus() {
        initComponents();
        loadList();
    }

    public PanelMaritalStatus(FormOperationEnum op, Integer id) {
        initComponents();
        loadList();
        prepareFormOperation(op, id);
    }

    private void prepareFormOperation(FormOperationEnum op, Integer id) {
        this.operation = op;
        this.maritalStatusId = id;
        if (this.operation == FormOperationEnum.CREATE) {
            lblPanelTitle.setText("Estado Civil - Novo");
        } else {
            lblPanelTitle.setText("Estado Civil - Alteração");
            loadMaritalStatus(maritalStatusId);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabMaritalStatus = new javax.swing.JTabbedPane();
        tabMaritalStatusRegister = new javax.swing.JPanel();
        panelMaritalStatusRegister = new javax.swing.JPanel();
        lblMaritalStatusName = new javax.swing.JLabel();
        txtMaritalStatusName = new javax.swing.JTextField();
        btnMaritalStatusSave = new javax.swing.JButton();
        btnMaritalStatusCancel = new javax.swing.JButton();
        tabMaritalStatusList = new javax.swing.JPanel();
        panelMaritalStatusSearch = new javax.swing.JPanel();
        lblMaritalStatusSearchField = new javax.swing.JLabel();
        txtMaritalStatusSearchField = new javax.swing.JTextField();
        btnMaritalStatusSearch = new javax.swing.JButton();
        scrollMaritalStatus = new javax.swing.JScrollPane();
        tableMaritalStatusSearch = new javax.swing.JTable();
        btnMaritalStatusListRefresh = new javax.swing.JButton();
        btnMaritalStatusDelete = new javax.swing.JButton();
        btnMaritalStatusUpdate = new javax.swing.JButton();
        lblPanelTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tabMaritalStatusRegister.setBackground(new java.awt.Color(255, 255, 255));

        panelMaritalStatusRegister.setBackground(new java.awt.Color(255, 255, 255));
        panelMaritalStatusRegister.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado Civil"));

        lblMaritalStatusName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMaritalStatusName.setText("Nome");

        javax.swing.GroupLayout panelMaritalStatusRegisterLayout = new javax.swing.GroupLayout(panelMaritalStatusRegister);
        panelMaritalStatusRegister.setLayout(panelMaritalStatusRegisterLayout);
        panelMaritalStatusRegisterLayout.setHorizontalGroup(
            panelMaritalStatusRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMaritalStatusRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMaritalStatusName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaritalStatusName, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMaritalStatusRegisterLayout.setVerticalGroup(
            panelMaritalStatusRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMaritalStatusRegisterLayout.createSequentialGroup()
                .addGroup(panelMaritalStatusRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaritalStatusName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaritalStatusName))
                .addContainerGap(211, Short.MAX_VALUE))
        );

        btnMaritalStatusSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/save.png"))); // NOI18N
        btnMaritalStatusSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaritalStatusSaveActionPerformed(evt);
            }
        });

        btnMaritalStatusCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/cancel-30.png"))); // NOI18N
        btnMaritalStatusCancel.setToolTipText("Cancelar");
        btnMaritalStatusCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaritalStatusCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabMaritalStatusRegisterLayout = new javax.swing.GroupLayout(tabMaritalStatusRegister);
        tabMaritalStatusRegister.setLayout(tabMaritalStatusRegisterLayout);
        tabMaritalStatusRegisterLayout.setHorizontalGroup(
            tabMaritalStatusRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabMaritalStatusRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabMaritalStatusRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMaritalStatusRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabMaritalStatusRegisterLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnMaritalStatusCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMaritalStatusSave, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        tabMaritalStatusRegisterLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnMaritalStatusCancel, btnMaritalStatusSave});

        tabMaritalStatusRegisterLayout.setVerticalGroup(
            tabMaritalStatusRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabMaritalStatusRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMaritalStatusRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabMaritalStatusRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMaritalStatusSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMaritalStatusCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        tabMaritalStatus.addTab("Nova", tabMaritalStatusRegister);

        tabMaritalStatusList.setBackground(new java.awt.Color(255, 255, 255));

        panelMaritalStatusSearch.setBackground(new java.awt.Color(255, 255, 255));
        panelMaritalStatusSearch.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        lblMaritalStatusSearchField.setText("Nome");

        btnMaritalStatusSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/search.png"))); // NOI18N
        btnMaritalStatusSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaritalStatusSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMaritalStatusSearchLayout = new javax.swing.GroupLayout(panelMaritalStatusSearch);
        panelMaritalStatusSearch.setLayout(panelMaritalStatusSearchLayout);
        panelMaritalStatusSearchLayout.setHorizontalGroup(
            panelMaritalStatusSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMaritalStatusSearchLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblMaritalStatusSearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaritalStatusSearchField, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMaritalStatusSearch)
                .addGap(2, 2, 2))
        );
        panelMaritalStatusSearchLayout.setVerticalGroup(
            panelMaritalStatusSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMaritalStatusSearchLayout.createSequentialGroup()
                .addGroup(panelMaritalStatusSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaritalStatusSearchField)
                    .addComponent(btnMaritalStatusSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaritalStatusSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableMaritalStatusSearch.setModel(new javax.swing.table.DefaultTableModel(
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
        tableMaritalStatusSearch.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableMaritalStatusSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableMaritalStatusSearchMousePressed(evt);
            }
        });
        tableMaritalStatusSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableMaritalStatusSearchKeyPressed(evt);
            }
        });
        scrollMaritalStatus.setViewportView(tableMaritalStatusSearch);

        btnMaritalStatusListRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/refresh.png"))); // NOI18N
        btnMaritalStatusListRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaritalStatusListRefreshActionPerformed(evt);
            }
        });

        btnMaritalStatusDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/trash-30.png"))); // NOI18N
        btnMaritalStatusDelete.setToolTipText("Excluir produto");
        btnMaritalStatusDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaritalStatusDeleteActionPerformed(evt);
            }
        });

        btnMaritalStatusUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/update-30.png"))); // NOI18N
        btnMaritalStatusUpdate.setToolTipText("Alterar");
        btnMaritalStatusUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaritalStatusUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabMaritalStatusListLayout = new javax.swing.GroupLayout(tabMaritalStatusList);
        tabMaritalStatusList.setLayout(tabMaritalStatusListLayout);
        tabMaritalStatusListLayout.setHorizontalGroup(
            tabMaritalStatusListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabMaritalStatusListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabMaritalStatusListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabMaritalStatusListLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnMaritalStatusUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMaritalStatusDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabMaritalStatusListLayout.createSequentialGroup()
                        .addComponent(panelMaritalStatusSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMaritalStatusListRefresh))
                    .addComponent(scrollMaritalStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabMaritalStatusListLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnMaritalStatusDelete, btnMaritalStatusUpdate});

        tabMaritalStatusListLayout.setVerticalGroup(
            tabMaritalStatusListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabMaritalStatusListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabMaritalStatusListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelMaritalStatusSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMaritalStatusListRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollMaritalStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabMaritalStatusListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMaritalStatusDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMaritalStatusUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        tabMaritalStatus.addTab("Listagem", tabMaritalStatusList);

        lblPanelTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblPanelTitle.setText("Estado Civil");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabMaritalStatus)
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
                .addComponent(tabMaritalStatus))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMaritalStatusSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaritalStatusSaveActionPerformed
        String temp = "", temp2 = "";
        if (operation == FormOperationEnum.CREATE) {
            temp = "cadastrar";
            temp2 = "cadastrado";
        } else {
            temp = "alterar";
            temp2 = "alterado";
        }

        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja " + temp + " este estado civil?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.NO_OPTION) {
            return;
        }

        MaritalStatus maritalStatus = new MaritalStatus();
        maritalStatus.setDescription(txtMaritalStatusName.getText());

        try {
            if (operation == FormOperationEnum.CREATE) {
                ServiceMaritalStatus.getInstance().insert(maritalStatus);
            } else {
                ServiceMaritalStatus.getInstance().update(maritalStatus);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Estado civil " + temp2 + " com sucesso",
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        txtMaritalStatusName.setText("");
        loadList();
    }//GEN-LAST:event_btnMaritalStatusSaveActionPerformed

    private void btnMaritalStatusListRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaritalStatusListRefreshActionPerformed
        loadList();
    }//GEN-LAST:event_btnMaritalStatusListRefreshActionPerformed

    private void btnMaritalStatusSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaritalStatusSearchActionPerformed
        loadSearch(txtMaritalStatusSearchField.getText());
    }//GEN-LAST:event_btnMaritalStatusSearchActionPerformed

    private void btnMaritalStatusDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaritalStatusDeleteActionPerformed
        if (tableMaritalStatusSearch.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um estado civil na lista",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Integer id = DataUtil.parseInteger(tableMaritalStatusSearch.getModel().getValueAt(tableMaritalStatusSearch.getSelectedRow(), 0) + "");
        deleteMaritalStatus(id);
    }//GEN-LAST:event_btnMaritalStatusDeleteActionPerformed

    private void tableMaritalStatusSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableMaritalStatusSearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            if (tableMaritalStatusSearch.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(this, "Selecione um estado civil na lista",
                        "Atenção", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            Integer id = DataUtil.parseInteger(tableMaritalStatusSearch.getModel().getValueAt(tableMaritalStatusSearch.getSelectedRow(), 0) + "");
            deleteMaritalStatus(id);
        }
    }//GEN-LAST:event_tableMaritalStatusSearchKeyPressed

    private void tableMaritalStatusSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMaritalStatusSearchMousePressed
        if (evt.getButton() != MouseEvent.BUTTON3 || tableMaritalStatusSearch.getSelectedRow() < 0) {
            return;
        }

        Integer id = DataUtil.parseInteger(tableMaritalStatusSearch.getModel().getValueAt(tableMaritalStatusSearch.getSelectedRow(), 0) + "");

        JPopupMenu popup = new JPopupMenu();

        JMenuItem mItemUpdate = new JMenuItem("Alterar/Ver");
        mItemUpdate.addActionListener((e) -> {
            PanelMaritalStatus p = new PanelMaritalStatus(FormOperationEnum.UPDATE, id);
            FrameMain.loadCard(p, "MaritalStatus", true);
        });
        popup.add(mItemUpdate);

        JMenuItem mItemDelete = new JMenuItem("Deletar");
        mItemDelete.addActionListener((e) -> {
            deleteMaritalStatus(id);
        });

        popup.add(mItemDelete);

        popup.show(tableMaritalStatusSearch,
                (int) evt.getX(),
                (int) evt.getY()
        );
    }//GEN-LAST:event_tableMaritalStatusSearchMousePressed

    private void btnMaritalStatusUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaritalStatusUpdateActionPerformed
        if (tableMaritalStatusSearch.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um estado civil na lista",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Integer id = DataUtil.parseInteger(tableMaritalStatusSearch.getModel().getValueAt(tableMaritalStatusSearch.getSelectedRow(), 0) + "");

        PanelMaritalStatus p = new PanelMaritalStatus(FormOperationEnum.UPDATE, id);
        FrameMain.loadCard(p, "MaritalStatus", true);
    }//GEN-LAST:event_btnMaritalStatusUpdateActionPerformed

    private void btnMaritalStatusCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaritalStatusCancelActionPerformed
        PanelMaritalStatus p = new PanelMaritalStatus(FormOperationEnum.CREATE, null);
        FrameMain.loadCard(p, "MaritalStatus", true);
    }//GEN-LAST:event_btnMaritalStatusCancelActionPerformed

    public void deleteMaritalStatus(Integer id) {
        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja excluir este estado civil?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.NO_OPTION) {
            return;
        }

        try {
            ServiceMaritalStatus.getInstance().delete(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Estado civil excluído com sucesso!",
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        loadList();
    }

    private void loadMaritalStatus(Integer id) {
        MaritalStatus ct;
        try {
            ct = ServiceMaritalStatus.getInstance().get(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        maritalStatusId = ct.getId();
        txtMaritalStatusName.setText(ct.getDescription());
    }

    public void loadList() {
        DefaultTableModel model = (DefaultTableModel) tableMaritalStatusSearch.getModel();
        model.setNumRows(0);
        TableColumn column = tableMaritalStatusSearch.getColumnModel().getColumn(0);
        if ("Código".equals(column.getHeaderValue().toString())) {
            tableMaritalStatusSearch.removeColumn(column);
        }
        List<MaritalStatus> list = null;
        try {
            list = ServiceMaritalStatus.getInstance().list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (list == null) {
            return;
        }
        for (MaritalStatus p : list) {
            model.addRow(new Object[]{
                p.getId(),
                p.getDescription()
            });
        }
    }

    private void loadSearch(String value) {
        DefaultTableModel model = (DefaultTableModel) tableMaritalStatusSearch.getModel();
        model.setNumRows(0);
        List<MaritalStatus> list = null;

        try {
            list = ServiceMaritalStatus.getInstance().search(value);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (list == null) {
            JOptionPane.showMessageDialog(this, "Nenhum estado civil foi encontrado",
                    "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (MaritalStatus p : list) {
            model.addRow(new Object[]{
                p.getId(),
                p.getDescription()
            });

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMaritalStatusCancel;
    private javax.swing.JButton btnMaritalStatusDelete;
    private javax.swing.JButton btnMaritalStatusListRefresh;
    private javax.swing.JButton btnMaritalStatusSave;
    private javax.swing.JButton btnMaritalStatusSearch;
    private javax.swing.JButton btnMaritalStatusUpdate;
    private javax.swing.JLabel lblMaritalStatusName;
    private javax.swing.JLabel lblMaritalStatusSearchField;
    private javax.swing.JLabel lblPanelTitle;
    private javax.swing.JPanel panelMaritalStatusRegister;
    private javax.swing.JPanel panelMaritalStatusSearch;
    private javax.swing.JScrollPane scrollMaritalStatus;
    private javax.swing.JTabbedPane tabMaritalStatus;
    private javax.swing.JPanel tabMaritalStatusList;
    private javax.swing.JPanel tabMaritalStatusRegister;
    private javax.swing.JTable tableMaritalStatusSearch;
    private javax.swing.JTextField txtMaritalStatusName;
    private javax.swing.JTextField txtMaritalStatusSearchField;
    // End of variables declaration//GEN-END:variables

}
