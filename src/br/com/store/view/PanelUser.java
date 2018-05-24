package br.com.store.view;

import br.com.store.model.User;
import br.com.store.model.enums.FormOperationEnum;
import br.com.store.service.ServiceUser;
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

public class PanelUser extends javax.swing.JPanel {

    private Integer userId;
    private FormOperationEnum operation;

    public PanelUser() {
        initComponents();
        loadList();
    }

    public PanelUser(FormOperationEnum op, Integer id) {
        initComponents();
        loadList();
        prepareFormOperation(op, id);
    }

    private void prepareFormOperation(FormOperationEnum op, Integer id) {
        this.operation = op;
        this.userId = id;
        if (this.operation == FormOperationEnum.CREATE) {
            lblPanelTitle.setText("Usuário - Novo");
        } else {
            lblPanelTitle.setText("Usuário - Alteração");
            loadUser(userId);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabUser = new javax.swing.JTabbedPane();
        tabUserRegister = new javax.swing.JPanel();
        panelUserRegister = new javax.swing.JPanel();
        lblUserLogin = new javax.swing.JLabel();
        txtUserLogin = new javax.swing.JTextField();
        lblUserPassword = new javax.swing.JLabel();
        txtUserPassword = new javax.swing.JPasswordField();
        chkUserAdmin = new javax.swing.JCheckBox();
        btnUserSave = new javax.swing.JButton();
        btnUserCancel = new javax.swing.JButton();
        tabUserList = new javax.swing.JPanel();
        panelUserSearch = new javax.swing.JPanel();
        lblUserSearchField = new javax.swing.JLabel();
        txtUserSearchField = new javax.swing.JTextField();
        btnUserSearch = new javax.swing.JButton();
        scrollUser = new javax.swing.JScrollPane();
        tableUserSearch = new javax.swing.JTable();
        btnUserListRefresh = new javax.swing.JButton();
        btnUserDelete = new javax.swing.JButton();
        btnUserUpdate = new javax.swing.JButton();
        lblPanelTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tabUserRegister.setBackground(new java.awt.Color(255, 255, 255));

        panelUserRegister.setBackground(new java.awt.Color(255, 255, 255));
        panelUserRegister.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuário"));

        lblUserLogin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUserLogin.setText("Login");

        lblUserPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUserPassword.setText("Senha");

        txtUserPassword.setText("jPasswordField1");

        chkUserAdmin.setText("Administrador");

        javax.swing.GroupLayout panelUserRegisterLayout = new javax.swing.GroupLayout(panelUserRegister);
        panelUserRegister.setLayout(panelUserRegisterLayout);
        panelUserRegisterLayout.setHorizontalGroup(
            panelUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUserRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUserRegisterLayout.createSequentialGroup()
                        .addComponent(lblUserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE))
                    .addGroup(panelUserRegisterLayout.createSequentialGroup()
                        .addComponent(lblUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelUserRegisterLayout.createSequentialGroup()
                                .addComponent(chkUserAdmin)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtUserPassword))))
                .addContainerGap())
        );
        panelUserRegisterLayout.setVerticalGroup(
            panelUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUserRegisterLayout.createSequentialGroup()
                .addGroup(panelUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserPassword)
                    .addComponent(txtUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkUserAdmin)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        btnUserSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/save.png"))); // NOI18N
        btnUserSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserSaveActionPerformed(evt);
            }
        });

        btnUserCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/cancel-30.png"))); // NOI18N
        btnUserCancel.setToolTipText("Cancelar");
        btnUserCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabUserRegisterLayout = new javax.swing.GroupLayout(tabUserRegister);
        tabUserRegister.setLayout(tabUserRegisterLayout);
        tabUserRegisterLayout.setHorizontalGroup(
            tabUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabUserRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelUserRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabUserRegisterLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnUserCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUserSave, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        tabUserRegisterLayout.setVerticalGroup(
            tabUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabUserRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelUserRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUserSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUserCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        tabUser.addTab("Nova", tabUserRegister);

        tabUserList.setBackground(new java.awt.Color(255, 255, 255));

        panelUserSearch.setBackground(new java.awt.Color(255, 255, 255));
        panelUserSearch.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        lblUserSearchField.setText("Nome");

        btnUserSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/search.png"))); // NOI18N
        btnUserSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelUserSearchLayout = new javax.swing.GroupLayout(panelUserSearch);
        panelUserSearch.setLayout(panelUserSearchLayout);
        panelUserSearchLayout.setHorizontalGroup(
            panelUserSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUserSearchLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblUserSearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserSearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUserSearch)
                .addGap(2, 2, 2))
        );
        panelUserSearchLayout.setVerticalGroup(
            panelUserSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUserSearchLayout.createSequentialGroup()
                .addGroup(panelUserSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserSearchField)
                    .addComponent(btnUserSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableUserSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Login"
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
        tableUserSearch.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableUserSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableUserSearchMousePressed(evt);
            }
        });
        tableUserSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableUserSearchKeyPressed(evt);
            }
        });
        scrollUser.setViewportView(tableUserSearch);

        btnUserListRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/refresh.png"))); // NOI18N
        btnUserListRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserListRefreshActionPerformed(evt);
            }
        });

        btnUserDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/trash-30.png"))); // NOI18N
        btnUserDelete.setToolTipText("Excluir produto");
        btnUserDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserDeleteActionPerformed(evt);
            }
        });

        btnUserUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/update-30.png"))); // NOI18N
        btnUserUpdate.setToolTipText("Alterar");
        btnUserUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabUserListLayout = new javax.swing.GroupLayout(tabUserList);
        tabUserList.setLayout(tabUserListLayout);
        tabUserListLayout.setHorizontalGroup(
            tabUserListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabUserListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabUserListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabUserListLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnUserUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUserDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabUserListLayout.createSequentialGroup()
                        .addComponent(panelUserSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUserListRefresh))
                    .addComponent(scrollUser, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabUserListLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnUserDelete, btnUserUpdate});

        tabUserListLayout.setVerticalGroup(
            tabUserListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabUserListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabUserListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelUserSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUserListRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollUser, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabUserListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUserDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUserUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        tabUser.addTab("Listagem", tabUserList);

        lblPanelTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblPanelTitle.setText("Usuário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabUser)
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
                .addComponent(tabUser))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserSaveActionPerformed
        String temp = "", temp2 = "";
        if (operation == FormOperationEnum.CREATE) {
            temp = "cadastrar";
            temp2 = "cadastrado";
        } else {
            temp = "alterar";
            temp2 = "alterado";
        }

        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja " + temp + " este usuário?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.NO_OPTION) {
            return;
        }

        User user = new User();
        user.setLogin(txtUserLogin.getText());

        try {
            if (operation == FormOperationEnum.CREATE) {
                ServiceUser.getInstance().insert(user);
            } else {
                ServiceUser.getInstance().update(user);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Usuário " + temp2 + " com sucesso",
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        txtUserLogin.setText("");
        loadList();
    }//GEN-LAST:event_btnUserSaveActionPerformed

    private void btnUserListRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserListRefreshActionPerformed
        loadList();
    }//GEN-LAST:event_btnUserListRefreshActionPerformed

    private void btnUserSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserSearchActionPerformed
        loadSearch(txtUserSearchField.getText());
    }//GEN-LAST:event_btnUserSearchActionPerformed

    private void btnUserDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserDeleteActionPerformed
        if (tableUserSearch.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um usuário na lista",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Integer id = DataUtil.parseInteger(tableUserSearch.getModel().getValueAt(tableUserSearch.getSelectedRow(), 0) + "");
        deleteUser(id);
    }//GEN-LAST:event_btnUserDeleteActionPerformed

    private void tableUserSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableUserSearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            if (tableUserSearch.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(this, "Selecione um usuário na lista",
                        "Atenção", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            Integer id = DataUtil.parseInteger(tableUserSearch.getModel().getValueAt(tableUserSearch.getSelectedRow(), 0) + "");
            deleteUser(id);
        }
    }//GEN-LAST:event_tableUserSearchKeyPressed

    private void tableUserSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUserSearchMousePressed
        if (evt.getButton() != MouseEvent.BUTTON3 || tableUserSearch.getSelectedRow() < 0) {
            return;
        }

        Integer id = DataUtil.parseInteger(tableUserSearch.getModel().getValueAt(tableUserSearch.getSelectedRow(), 0) + "");

        JPopupMenu popup = new JPopupMenu();

        JMenuItem mItemUpdate = new JMenuItem("Alterar/Ver");
        mItemUpdate.addActionListener((e) -> {
            PanelUser p = new PanelUser(FormOperationEnum.UPDATE, id);
            FrameMain.loadCard(p, "User", true);
        });
        popup.add(mItemUpdate);

        JMenuItem mItemDelete = new JMenuItem("Deletar");
        mItemDelete.addActionListener((e) -> {
            deleteUser(id);
        });
        popup.add(mItemDelete);

        popup.show(tableUserSearch,
                (int) evt.getX(),
                (int) evt.getY()
        );
    }//GEN-LAST:event_tableUserSearchMousePressed

    private void btnUserCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserCancelActionPerformed
        PanelUser p = new PanelUser(FormOperationEnum.CREATE, null);
        FrameMain.loadCard(p, "User", true);
    }//GEN-LAST:event_btnUserCancelActionPerformed

    private void btnUserUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserUpdateActionPerformed
        if (tableUserSearch.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione um usuário na lista",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Integer id = DataUtil.parseInteger(tableUserSearch.getModel().getValueAt(tableUserSearch.getSelectedRow(), 0) + "");

        PanelUser p = new PanelUser(FormOperationEnum.UPDATE, id);
        FrameMain.loadCard(p, "User", true);
    }//GEN-LAST:event_btnUserUpdateActionPerformed

    public void deleteUser(Integer id) {
        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja excluir este usuário?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.NO_OPTION) {
            return;
        }

        try {
            ServiceUser.getInstance().delete(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Usuário excluído com sucesso!",
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        loadList();
    }

    private void loadUser(Integer id) {
        User u;
        try {
            u = ServiceUser.getInstance().get(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        userId = u.getId();
        txtUserLogin.setText(u.getLogin());
        txtUserPassword.setText(u.getPassword());
        chkUserAdmin.setSelected(u.isAdmin());
    }

    public void loadList() {
        DefaultTableModel model = (DefaultTableModel) tableUserSearch.getModel();
        model.setNumRows(0);
        TableColumn column = tableUserSearch.getColumnModel().getColumn(0);
        if ("Código".equals(column.getHeaderValue().toString())) {
            tableUserSearch.removeColumn(column);
        }
        List<User> list = null;
        try {
            list = ServiceUser.getInstance().list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (list == null) {
            return;
        }
        for (User p : list) {
            model.addRow(new Object[]{
                p.getId(),
                p.getLogin()
            });
        }
    }

    private void loadSearch(String value) {
        DefaultTableModel model = (DefaultTableModel) tableUserSearch.getModel();
        model.setNumRows(0);
        List<User> list = null;

        try {
            list = ServiceUser.getInstance().search(value);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (list == null) {
            JOptionPane.showMessageDialog(this, "Nenhum usuário foi encontrado",
                    "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (User p : list) {
            model.addRow(new Object[]{
                p.getId(),
                p.getLogin()
            });
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUserCancel;
    private javax.swing.JButton btnUserDelete;
    private javax.swing.JButton btnUserListRefresh;
    private javax.swing.JButton btnUserSave;
    private javax.swing.JButton btnUserSearch;
    private javax.swing.JButton btnUserUpdate;
    private javax.swing.JCheckBox chkUserAdmin;
    private javax.swing.JLabel lblPanelTitle;
    private javax.swing.JLabel lblUserLogin;
    private javax.swing.JLabel lblUserPassword;
    private javax.swing.JLabel lblUserSearchField;
    private javax.swing.JPanel panelUserRegister;
    private javax.swing.JPanel panelUserSearch;
    private javax.swing.JScrollPane scrollUser;
    private javax.swing.JTabbedPane tabUser;
    private javax.swing.JPanel tabUserList;
    private javax.swing.JPanel tabUserRegister;
    private javax.swing.JTable tableUserSearch;
    private javax.swing.JTextField txtUserLogin;
    private javax.swing.JPasswordField txtUserPassword;
    private javax.swing.JTextField txtUserSearchField;
    // End of variables declaration//GEN-END:variables
}
