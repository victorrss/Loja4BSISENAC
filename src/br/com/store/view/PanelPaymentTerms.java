package br.com.store.view;

import br.com.store.model.PaymentTerms;
import br.com.store.model.enums.FormOperationEnum;
import br.com.store.service.ServicePaymentTerms;
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

public class PanelPaymentTerms extends javax.swing.JPanel {

    private Integer paymentTermsId;
    private FormOperationEnum operation;

    public PanelPaymentTerms() {
        initComponents();
        loadList();
    }

    public PanelPaymentTerms(FormOperationEnum op, Integer id) {
        initComponents();
        loadList();
        prepareFormOperation(op, id);
    }

    private void prepareFormOperation(FormOperationEnum op, Integer id) {
        this.operation = op;
        this.paymentTermsId = id;
        if (this.operation == FormOperationEnum.CREATE) {
            lblPanelTitle.setText("Condição de Pagamento - Novo");
        } else {
            lblPanelTitle.setText("Condição de Pagamento - Alteração");
            loadPaymentTerms(paymentTermsId);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPaymentTerms = new javax.swing.JTabbedPane();
        tabPaymentTermsRegister = new javax.swing.JPanel();
        panelPaymentTermsRegister = new javax.swing.JPanel();
        lblPaymentTermsName = new javax.swing.JLabel();
        txtPaymentTermsName = new javax.swing.JTextField();
        btnPaymentTermsSave = new javax.swing.JButton();
        btnPaymentTermsCancel = new javax.swing.JButton();
        tabPaymentTermsList = new javax.swing.JPanel();
        panelPaymentTermsSearch = new javax.swing.JPanel();
        lblPaymentTermsSearchField = new javax.swing.JLabel();
        txtPaymentTermsSearchField = new javax.swing.JTextField();
        btnPaymentTermsSearch = new javax.swing.JButton();
        scrollPaymentTerms = new javax.swing.JScrollPane();
        tablePaymentTerms = new javax.swing.JTable();
        btnPaymentTermsListRefresh = new javax.swing.JButton();
        btnPaymentTermsDelete = new javax.swing.JButton();
        btnPaymentTermsUpdate = new javax.swing.JButton();
        lblPanelTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tabPaymentTermsRegister.setBackground(new java.awt.Color(255, 255, 255));

        panelPaymentTermsRegister.setBackground(new java.awt.Color(255, 255, 255));
        panelPaymentTermsRegister.setBorder(javax.swing.BorderFactory.createTitledBorder("Condição de Pagamento"));

        lblPaymentTermsName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPaymentTermsName.setText("Nome");

        javax.swing.GroupLayout panelPaymentTermsRegisterLayout = new javax.swing.GroupLayout(panelPaymentTermsRegister);
        panelPaymentTermsRegister.setLayout(panelPaymentTermsRegisterLayout);
        panelPaymentTermsRegisterLayout.setHorizontalGroup(
            panelPaymentTermsRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPaymentTermsRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPaymentTermsName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPaymentTermsName, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPaymentTermsRegisterLayout.setVerticalGroup(
            panelPaymentTermsRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPaymentTermsRegisterLayout.createSequentialGroup()
                .addGroup(panelPaymentTermsRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPaymentTermsName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaymentTermsName))
                .addContainerGap(215, Short.MAX_VALUE))
        );

        btnPaymentTermsSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/save.png"))); // NOI18N
        btnPaymentTermsSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentTermsSaveActionPerformed(evt);
            }
        });

        btnPaymentTermsCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/cancel-30.png"))); // NOI18N
        btnPaymentTermsCancel.setToolTipText("Cancelar");
        btnPaymentTermsCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentTermsCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabPaymentTermsRegisterLayout = new javax.swing.GroupLayout(tabPaymentTermsRegister);
        tabPaymentTermsRegister.setLayout(tabPaymentTermsRegisterLayout);
        tabPaymentTermsRegisterLayout.setHorizontalGroup(
            tabPaymentTermsRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPaymentTermsRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabPaymentTermsRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPaymentTermsRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabPaymentTermsRegisterLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPaymentTermsCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPaymentTermsSave, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        tabPaymentTermsRegisterLayout.setVerticalGroup(
            tabPaymentTermsRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPaymentTermsRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPaymentTermsRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabPaymentTermsRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPaymentTermsSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPaymentTermsCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        tabPaymentTerms.addTab("Nova", tabPaymentTermsRegister);

        tabPaymentTermsList.setBackground(new java.awt.Color(255, 255, 255));

        panelPaymentTermsSearch.setBackground(new java.awt.Color(255, 255, 255));
        panelPaymentTermsSearch.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        lblPaymentTermsSearchField.setText("Nome");

        btnPaymentTermsSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/search.png"))); // NOI18N
        btnPaymentTermsSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentTermsSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPaymentTermsSearchLayout = new javax.swing.GroupLayout(panelPaymentTermsSearch);
        panelPaymentTermsSearch.setLayout(panelPaymentTermsSearchLayout);
        panelPaymentTermsSearchLayout.setHorizontalGroup(
            panelPaymentTermsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPaymentTermsSearchLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblPaymentTermsSearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPaymentTermsSearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPaymentTermsSearch)
                .addGap(2, 2, 2))
        );
        panelPaymentTermsSearchLayout.setVerticalGroup(
            panelPaymentTermsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPaymentTermsSearchLayout.createSequentialGroup()
                .addGroup(panelPaymentTermsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPaymentTermsSearchField)
                    .addComponent(btnPaymentTermsSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPaymentTermsSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablePaymentTerms.setModel(new javax.swing.table.DefaultTableModel(
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
        tablePaymentTerms.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablePaymentTerms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablePaymentTermsMousePressed(evt);
            }
        });
        tablePaymentTerms.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablePaymentTermsKeyPressed(evt);
            }
        });
        scrollPaymentTerms.setViewportView(tablePaymentTerms);

        btnPaymentTermsListRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/refresh.png"))); // NOI18N
        btnPaymentTermsListRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentTermsListRefreshActionPerformed(evt);
            }
        });

        btnPaymentTermsDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/trash-30.png"))); // NOI18N
        btnPaymentTermsDelete.setToolTipText("Excluir produto");
        btnPaymentTermsDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentTermsDeleteActionPerformed(evt);
            }
        });

        btnPaymentTermsUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/update-30.png"))); // NOI18N
        btnPaymentTermsUpdate.setToolTipText("Alterar");
        btnPaymentTermsUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentTermsUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabPaymentTermsListLayout = new javax.swing.GroupLayout(tabPaymentTermsList);
        tabPaymentTermsList.setLayout(tabPaymentTermsListLayout);
        tabPaymentTermsListLayout.setHorizontalGroup(
            tabPaymentTermsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPaymentTermsListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabPaymentTermsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabPaymentTermsListLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPaymentTermsUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPaymentTermsDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabPaymentTermsListLayout.createSequentialGroup()
                        .addComponent(panelPaymentTermsSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPaymentTermsListRefresh))
                    .addComponent(scrollPaymentTerms, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabPaymentTermsListLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnPaymentTermsDelete, btnPaymentTermsUpdate});

        tabPaymentTermsListLayout.setVerticalGroup(
            tabPaymentTermsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPaymentTermsListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabPaymentTermsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelPaymentTermsSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPaymentTermsListRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaymentTerms, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabPaymentTermsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPaymentTermsDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPaymentTermsUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        tabPaymentTerms.addTab("Listagem", tabPaymentTermsList);

        lblPanelTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblPanelTitle.setText("Condição de Pagamento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPaymentTerms)
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
                .addComponent(tabPaymentTerms))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPaymentTermsSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentTermsSaveActionPerformed
        String temp = "", temp2 = "";
        if (operation == FormOperationEnum.CREATE) {
            temp = "cadastrar";
            temp2 = "cadastrada";
        } else {
            temp = "alterar";
            temp2 = "alterada";
        }

        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja " + temp + " esta condição de pagamento?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.NO_OPTION) {
            return;
        }

        PaymentTerms payTerms = new PaymentTerms();
        payTerms.setName(txtPaymentTermsName.getText());

        try {
            if (operation == FormOperationEnum.CREATE) {
                ServicePaymentTerms.getInstance().insert(payTerms);
            } else {
                ServicePaymentTerms.getInstance().update(payTerms);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Condição de pagamento " + temp2 + " com sucesso",
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        txtPaymentTermsName.setText("");
        loadList();
    }//GEN-LAST:event_btnPaymentTermsSaveActionPerformed

    private void btnPaymentTermsListRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentTermsListRefreshActionPerformed
        loadList();
    }//GEN-LAST:event_btnPaymentTermsListRefreshActionPerformed

    private void btnPaymentTermsSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentTermsSearchActionPerformed
        loadSearch(txtPaymentTermsSearchField.getText());
    }//GEN-LAST:event_btnPaymentTermsSearchActionPerformed

    private void btnPaymentTermsDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentTermsDeleteActionPerformed
        if (tablePaymentTerms.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione uma condição de pagamento na lista",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Integer id = DataUtil.parseInteger(tablePaymentTerms.getModel().getValueAt(tablePaymentTerms.getSelectedRow(), 0) + "");
        deletePaymentTerms(id);
    }//GEN-LAST:event_btnPaymentTermsDeleteActionPerformed

    private void tablePaymentTermsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablePaymentTermsKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            if (tablePaymentTerms.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(this, "Selecione uma condição de pagamento na lista",
                        "Atenção", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            Integer id = DataUtil.parseInteger(tablePaymentTerms.getModel().getValueAt(tablePaymentTerms.getSelectedRow(), 0) + "");
            deletePaymentTerms(id);
        }
    }//GEN-LAST:event_tablePaymentTermsKeyPressed

    private void tablePaymentTermsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePaymentTermsMousePressed
        if (evt.getButton() != MouseEvent.BUTTON3 || tablePaymentTerms.getSelectedRow() < 0) {
            return;
        }

        Integer id = DataUtil.parseInteger(tablePaymentTerms.getModel().getValueAt(tablePaymentTerms.getSelectedRow(), 0) + "");

        JPopupMenu popup = new JPopupMenu();

        JMenuItem mItemUpdate = new JMenuItem("Alterar/Ver");
        mItemUpdate.addActionListener((e) -> {
            PanelPaymentTerms p = new PanelPaymentTerms(FormOperationEnum.UPDATE, id);
            FrameMain.loadCard(p, "PaymentTerms", true);
        });
        popup.add(mItemUpdate);

        JMenuItem mItemDelete = new JMenuItem("Deletar");
        mItemDelete.addActionListener((e) -> {
            deletePaymentTerms(id);
        });

        popup.add(mItemDelete);

        popup.show(tablePaymentTerms,
                (int) evt.getX(),
                (int) evt.getY()
        );
    }//GEN-LAST:event_tablePaymentTermsMousePressed

    private void btnPaymentTermsCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentTermsCancelActionPerformed
        PanelPaymentTerms p = new PanelPaymentTerms(FormOperationEnum.CREATE, null);
        FrameMain.loadCard(p, "PaymentTerms", true);
    }//GEN-LAST:event_btnPaymentTermsCancelActionPerformed

    private void btnPaymentTermsUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentTermsUpdateActionPerformed
        if (tablePaymentTerms.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione uma condição de pagamento na lista",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Integer id = DataUtil.parseInteger(tablePaymentTerms.getModel().getValueAt(tablePaymentTerms.getSelectedRow(), 0) + "");

        PanelPaymentTerms p = new PanelPaymentTerms(FormOperationEnum.UPDATE, id);
        FrameMain.loadCard(p, "PaymentTerms", true);
    }//GEN-LAST:event_btnPaymentTermsUpdateActionPerformed

    public void deletePaymentTerms(Integer id) {
        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja excluir esta condição de pagamento?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.NO_OPTION) {
            return;
        }

        try {
            ServicePaymentTerms.getInstance().delete(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Condição de pagamento excluída com sucesso!",
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        loadList();
    }

    private void loadPaymentTerms(Integer id) {
        PaymentTerms p;
        try {
            p = ServicePaymentTerms.getInstance().get(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        paymentTermsId = p.getId();
        txtPaymentTermsName.setText(p.getName());

    }

    public void loadList() {
        DefaultTableModel model = (DefaultTableModel) tablePaymentTerms.getModel();
        model.setNumRows(0);
        TableColumn column = tablePaymentTerms.getColumnModel().getColumn(0);
        if ("Código".equals(column.getHeaderValue().toString())) {
            tablePaymentTerms.removeColumn(column);
        }
        List<PaymentTerms> list = null;
        try {
            list = ServicePaymentTerms.getInstance().list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (list == null) {
            return;
        }
        for (PaymentTerms p : list) {
            model.addRow(new Object[]{
                p.getId(),
                p.getName()
            });
        }
    }

    private void loadSearch(String value) {
        DefaultTableModel model = (DefaultTableModel) tablePaymentTerms.getModel();
        model.setNumRows(0);
        List<PaymentTerms> list = null;

        try {
            list = ServicePaymentTerms.getInstance().search(value);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (list == null) {
            JOptionPane.showMessageDialog(this, "Nenhuma condição de pagamento foi encontrada",
                    "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (PaymentTerms p : list) {
            model.addRow(new Object[]{
                p.getId(),
                p.getName()
            });

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPaymentTermsCancel;
    private javax.swing.JButton btnPaymentTermsDelete;
    private javax.swing.JButton btnPaymentTermsListRefresh;
    private javax.swing.JButton btnPaymentTermsSave;
    private javax.swing.JButton btnPaymentTermsSearch;
    private javax.swing.JButton btnPaymentTermsUpdate;
    private javax.swing.JLabel lblPanelTitle;
    private javax.swing.JLabel lblPaymentTermsName;
    private javax.swing.JLabel lblPaymentTermsSearchField;
    private javax.swing.JPanel panelPaymentTermsRegister;
    private javax.swing.JPanel panelPaymentTermsSearch;
    private javax.swing.JScrollPane scrollPaymentTerms;
    private javax.swing.JTabbedPane tabPaymentTerms;
    private javax.swing.JPanel tabPaymentTermsList;
    private javax.swing.JPanel tabPaymentTermsRegister;
    private javax.swing.JTable tablePaymentTerms;
    private javax.swing.JTextField txtPaymentTermsName;
    private javax.swing.JTextField txtPaymentTermsSearchField;
    // End of variables declaration//GEN-END:variables
}
