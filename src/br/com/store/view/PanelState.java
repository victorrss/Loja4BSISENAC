package br.com.store.view;

import br.com.store.model.State;
import br.com.store.model.enums.FormOperationEnum;
import br.com.store.service.ServiceState;
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

public class PanelState extends javax.swing.JPanel {
    
    private Integer stateId;
    private FormOperationEnum operation;
    
    public PanelState() {
        initComponents();
        loadList();
    }
    
    public PanelState(FormOperationEnum op, Integer id) {
        initComponents();
        loadList();
        prepareFormOperation(op, id);
    }
    
    private void prepareFormOperation(FormOperationEnum op, Integer id) {
        this.operation = op;
        this.stateId = id;
        if (this.operation == FormOperationEnum.CREATE) {
            lblPanelTitle.setText("Unidade de Federação - Novo");
        } else {
            lblPanelTitle.setText("Unidade de Federação - Alteração");
            loadState(stateId);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabState = new javax.swing.JTabbedPane();
        btnStateCancel = new javax.swing.JPanel();
        panelStateRegister = new javax.swing.JPanel();
        lblStateName = new javax.swing.JLabel();
        txtStateName = new javax.swing.JTextField();
        lblStateAbbreviation = new javax.swing.JLabel();
        txtStateAbbreviation = new javax.swing.JTextField();
        btnStateSave = new javax.swing.JButton();
        btnStatesCancel = new javax.swing.JButton();
        tabStateList = new javax.swing.JPanel();
        panelStateSearch = new javax.swing.JPanel();
        lblStateSearchField = new javax.swing.JLabel();
        txtStateSearchField = new javax.swing.JTextField();
        btnStateSearch = new javax.swing.JButton();
        scrollState = new javax.swing.JScrollPane();
        tableStateSearch = new javax.swing.JTable();
        btnStateListRefresh = new javax.swing.JButton();
        btnStateDelete = new javax.swing.JButton();
        btnStateUpdate = new javax.swing.JButton();
        lblPanelTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnStateCancel.setBackground(new java.awt.Color(255, 255, 255));

        panelStateRegister.setBackground(new java.awt.Color(255, 255, 255));
        panelStateRegister.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado"));

        lblStateName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStateName.setText("Nome");

        lblStateAbbreviation.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblStateAbbreviation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStateAbbreviation.setText("Abreviação");

        javax.swing.GroupLayout panelStateRegisterLayout = new javax.swing.GroupLayout(panelStateRegister);
        panelStateRegister.setLayout(panelStateRegisterLayout);
        panelStateRegisterLayout.setHorizontalGroup(
            panelStateRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStateRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelStateRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStateRegisterLayout.createSequentialGroup()
                        .addComponent(lblStateName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStateName, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE))
                    .addGroup(panelStateRegisterLayout.createSequentialGroup()
                        .addComponent(lblStateAbbreviation, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStateAbbreviation, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelStateRegisterLayout.setVerticalGroup(
            panelStateRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStateRegisterLayout.createSequentialGroup()
                .addGroup(panelStateRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStateName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStateName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelStateRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStateAbbreviation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStateAbbreviation))
                .addContainerGap(189, Short.MAX_VALUE))
        );

        btnStateSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/save.png"))); // NOI18N
        btnStateSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStateSaveActionPerformed(evt);
            }
        });

        btnStatesCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/cancel-30.png"))); // NOI18N
        btnStatesCancel.setToolTipText("Cancelar");
        btnStatesCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatesCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnStateCancelLayout = new javax.swing.GroupLayout(btnStateCancel);
        btnStateCancel.setLayout(btnStateCancelLayout);
        btnStateCancelLayout.setHorizontalGroup(
            btnStateCancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnStateCancelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnStateCancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelStateRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnStateCancelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnStatesCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStateSave, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        btnStateCancelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnStateSave, btnStatesCancel});

        btnStateCancelLayout.setVerticalGroup(
            btnStateCancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnStateCancelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelStateRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(btnStateCancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStateSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStatesCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        tabState.addTab("Nova", btnStateCancel);

        tabStateList.setBackground(new java.awt.Color(255, 255, 255));

        panelStateSearch.setBackground(new java.awt.Color(255, 255, 255));
        panelStateSearch.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        lblStateSearchField.setText("Nome");

        btnStateSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/search.png"))); // NOI18N
        btnStateSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStateSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelStateSearchLayout = new javax.swing.GroupLayout(panelStateSearch);
        panelStateSearch.setLayout(panelStateSearchLayout);
        panelStateSearchLayout.setHorizontalGroup(
            panelStateSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStateSearchLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblStateSearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtStateSearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStateSearch)
                .addGap(2, 2, 2))
        );
        panelStateSearchLayout.setVerticalGroup(
            panelStateSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStateSearchLayout.createSequentialGroup()
                .addGroup(panelStateSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStateSearchField)
                    .addComponent(btnStateSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStateSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableStateSearch.setModel(new javax.swing.table.DefaultTableModel(
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
        tableStateSearch.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableStateSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableStateSearchMousePressed(evt);
            }
        });
        tableStateSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableStateSearchKeyPressed(evt);
            }
        });
        scrollState.setViewportView(tableStateSearch);

        btnStateListRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/refresh.png"))); // NOI18N
        btnStateListRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStateListRefreshActionPerformed(evt);
            }
        });

        btnStateDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/trash-30.png"))); // NOI18N
        btnStateDelete.setToolTipText("Excluir produto");
        btnStateDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStateDeleteActionPerformed(evt);
            }
        });

        btnStateUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/update-30.png"))); // NOI18N
        btnStateUpdate.setToolTipText("Alterar");
        btnStateUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStateUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabStateListLayout = new javax.swing.GroupLayout(tabStateList);
        tabStateList.setLayout(tabStateListLayout);
        tabStateListLayout.setHorizontalGroup(
            tabStateListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabStateListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabStateListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabStateListLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnStateUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStateDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabStateListLayout.createSequentialGroup()
                        .addComponent(panelStateSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStateListRefresh))
                    .addComponent(scrollState, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabStateListLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnStateDelete, btnStateUpdate});

        tabStateListLayout.setVerticalGroup(
            tabStateListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabStateListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabStateListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelStateSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStateListRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollState, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabStateListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnStateDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStateUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        tabState.addTab("Listagem", tabStateList);

        lblPanelTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblPanelTitle.setText("Estado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabState)
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
                .addComponent(tabState))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnStateSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStateSaveActionPerformed
        String temp = "", temp2 = "";
        if (operation == FormOperationEnum.CREATE) {
            temp = "cadastrar";
            temp2 = "cadastrado";
        } else {
            temp = "alterar";
            temp2 = "alterado";
        }
        
        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja " + temp + " este estado?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.NO_OPTION) {
            return;
        }
        
        State state = new State();
        state.setName(txtStateName.getText());
        state.setAbbreviation(txtStateAbbreviation.getText());
        
        try {
            if (operation == FormOperationEnum.CREATE) {
                ServiceState.getInstance().insert(state);
            } else {
                ServiceState.getInstance().update(state);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        JOptionPane.showMessageDialog(this, "Estado " + temp2 + " com sucesso",
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        txtStateName.setText("");
        loadList();
    }//GEN-LAST:event_btnStateSaveActionPerformed

    private void btnStateListRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStateListRefreshActionPerformed
        loadList();
    }//GEN-LAST:event_btnStateListRefreshActionPerformed

    private void btnStateSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStateSearchActionPerformed
        loadSearch(txtStateSearchField.getText());
    }//GEN-LAST:event_btnStateSearchActionPerformed

    private void btnStateDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStateDeleteActionPerformed
        if (tableStateSearch.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um estado na lista",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        Integer id = DataUtil.parseInteger(tableStateSearch.getModel().getValueAt(tableStateSearch.getSelectedRow(), 0) + "");
        deleteState(id);
    }//GEN-LAST:event_btnStateDeleteActionPerformed

    private void tableStateSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableStateSearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            if (tableStateSearch.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(this, "Selecione um estado na lista",
                        "Atenção", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            
            Integer id = DataUtil.parseInteger(tableStateSearch.getModel().getValueAt(tableStateSearch.getSelectedRow(), 0) + "");
            deleteState(id);
        }
    }//GEN-LAST:event_tableStateSearchKeyPressed

    private void tableStateSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableStateSearchMousePressed
        if (evt.getButton() != MouseEvent.BUTTON3 || tableStateSearch.getSelectedRow() < 0) {
            return;
        }
        
        Integer id = DataUtil.parseInteger(tableStateSearch.getModel().getValueAt(tableStateSearch.getSelectedRow(), 0) + "");
        
        JPopupMenu popup = new JPopupMenu();
        
        JMenuItem mItemUpdate = new JMenuItem("Alterar/Ver");
        mItemUpdate.addActionListener((e) -> {
            PanelState p = new PanelState(FormOperationEnum.UPDATE, id);
            FrameMain.loadCard(p, "State", true);
        });
        popup.add(mItemUpdate);
        
        JMenuItem mItemDelete = new JMenuItem("Deletar");
        mItemDelete.addActionListener((e) -> {
            deleteState(id);
        });
        popup.add(mItemDelete);
        
        popup.show(tableStateSearch,
                (int) evt.getX(),
                (int) evt.getY()
        );
    }//GEN-LAST:event_tableStateSearchMousePressed

    private void btnStatesCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatesCancelActionPerformed
        PanelState p = new PanelState(FormOperationEnum.CREATE, null);
        FrameMain.loadCard(p, "State", true);
    }//GEN-LAST:event_btnStatesCancelActionPerformed

    private void btnStateUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStateUpdateActionPerformed
        if (tableStateSearch.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um estado na lista",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        Integer id = DataUtil.parseInteger(tableStateSearch.getModel().getValueAt(tableStateSearch.getSelectedRow(), 0) + "");
        
        PanelState p = new PanelState(FormOperationEnum.UPDATE, id);
        FrameMain.loadCard(p, "State", true);
    }//GEN-LAST:event_btnStateUpdateActionPerformed
    
    public void deleteState(Integer id) {
        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja excluir este estado?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.NO_OPTION) {
            return;
        }
        
        try {
            ServiceState.getInstance().delete(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        JOptionPane.showMessageDialog(this, "Estado excluído com sucesso!",
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        loadList();
    }
    
    private void loadState(Integer id) {
        State s;
        try {
            s = ServiceState.getInstance().get(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        stateId = s.getId();
        txtStateName.setText(s.getName());
        txtStateAbbreviation.setText(s.getAbbreviation());
    }
    
    public void loadList() {
        DefaultTableModel model = (DefaultTableModel) tableStateSearch.getModel();
        model.setNumRows(0);
        TableColumn column = tableStateSearch.getColumnModel().getColumn(0);
        if ("Código".equals(column.getHeaderValue().toString())) {
            tableStateSearch.removeColumn(column);
        }
        List<State> list = null;
        try {
            list = ServiceState.getInstance().list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (list == null) {
            return;
        }
        for (State p : list) {
            model.addRow(new Object[]{
                p.getId(),
                p.getName()
            });
        }
    }
    
    private void loadSearch(String value) {
        DefaultTableModel model = (DefaultTableModel) tableStateSearch.getModel();
        model.setNumRows(0);
        List<State> list = null;
        
        try {
            list = ServiceState.getInstance().search(value);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (list == null) {
            JOptionPane.showMessageDialog(this, "Nenhum estado foi encontrada",
                    "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (State p : list) {
            model.addRow(new Object[]{
                p.getId(),
                p.getName()
            });
            
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnStateCancel;
    private javax.swing.JButton btnStateDelete;
    private javax.swing.JButton btnStateListRefresh;
    private javax.swing.JButton btnStateSave;
    private javax.swing.JButton btnStateSearch;
    private javax.swing.JButton btnStateUpdate;
    private javax.swing.JButton btnStatesCancel;
    private javax.swing.JLabel lblPanelTitle;
    private javax.swing.JLabel lblStateAbbreviation;
    private javax.swing.JLabel lblStateName;
    private javax.swing.JLabel lblStateSearchField;
    private javax.swing.JPanel panelStateRegister;
    private javax.swing.JPanel panelStateSearch;
    private javax.swing.JScrollPane scrollState;
    private javax.swing.JTabbedPane tabState;
    private javax.swing.JPanel tabStateList;
    private javax.swing.JTable tableStateSearch;
    private javax.swing.JTextField txtStateAbbreviation;
    private javax.swing.JTextField txtStateName;
    private javax.swing.JTextField txtStateSearchField;
    // End of variables declaration//GEN-END:variables
}
