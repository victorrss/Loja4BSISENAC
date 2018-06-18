package br.com.store.view;

import br.com.store.model.City;
import br.com.store.model.State;
import br.com.store.model.enums.FormOperationEnum;
import br.com.store.service.ServiceCity;
import br.com.store.service.ServiceState;
import br.com.store.utils.DataUtil;
import br.com.store.utils.FormUtil;
import br.com.store.view.main.FrameMain;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class PanelCity extends javax.swing.JPanel {

    private Integer cityId;
    private FormOperationEnum operation;

    public PanelCity() {
        initComponents();

        loadList();
        loadState();
    }

    public PanelCity(FormOperationEnum op, Integer id) {
        initComponents();
        loadList();
        loadState();
        prepareFormOperation(op, id);
    }

    private void prepareFormOperation(FormOperationEnum op, Integer id) {
        this.operation = op;
        this.cityId = id;
        if (this.operation == FormOperationEnum.CREATE) {
            lblPanelTitle.setText("Cidade - Novo");
        } else {
            lblPanelTitle.setText("Cidade - Alteração");
            loadCity(cityId);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabBrand = new javax.swing.JTabbedPane();
        tabCityRegister = new javax.swing.JPanel();
        panelCityRegister = new javax.swing.JPanel();
        lblCityName = new javax.swing.JLabel();
        txtCityName = new javax.swing.JTextField();
        lblCityState = new javax.swing.JLabel();
        cbCityState = new javax.swing.JComboBox<>();
        btnCitySave = new javax.swing.JButton();
        btnCityCancel = new javax.swing.JButton();
        tabCityList = new javax.swing.JPanel();
        panelCitySearch = new javax.swing.JPanel();
        lblCitySearchField = new javax.swing.JLabel();
        txtCitySearchField = new javax.swing.JTextField();
        btnCitySearch = new javax.swing.JButton();
        scrollCity = new javax.swing.JScrollPane();
        tableCity = new javax.swing.JTable();
        btnCityListRefresh = new javax.swing.JButton();
        btnCityDelete = new javax.swing.JButton();
        btnCityUpdate = new javax.swing.JButton();
        lblPanelTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tabCityRegister.setBackground(new java.awt.Color(255, 255, 255));

        panelCityRegister.setBackground(new java.awt.Color(255, 255, 255));
        panelCityRegister.setBorder(javax.swing.BorderFactory.createTitledBorder("Cidade"));

        lblCityName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCityName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCityName.setText("Nome");

        lblCityState.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCityState.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCityState.setText("UF");

        cbCityState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelCityRegisterLayout = new javax.swing.GroupLayout(panelCityRegister);
        panelCityRegister.setLayout(panelCityRegisterLayout);
        panelCityRegisterLayout.setHorizontalGroup(
            panelCityRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCityRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCityRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCityRegisterLayout.createSequentialGroup()
                        .addComponent(lblCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCityName, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE))
                    .addGroup(panelCityRegisterLayout.createSequentialGroup()
                        .addComponent(lblCityState, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCityState, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelCityRegisterLayout.setVerticalGroup(
            panelCityRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCityRegisterLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(panelCityRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCityState)
                    .addComponent(cbCityState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCityRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCityName))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        btnCitySave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/save.png"))); // NOI18N
        btnCitySave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitySaveActionPerformed(evt);
            }
        });

        btnCityCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/cancel-30.png"))); // NOI18N
        btnCityCancel.setToolTipText("Cancelar");
        btnCityCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCityCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabCityRegisterLayout = new javax.swing.GroupLayout(tabCityRegister);
        tabCityRegister.setLayout(tabCityRegisterLayout);
        tabCityRegisterLayout.setHorizontalGroup(
            tabCityRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCityRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabCityRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCityRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabCityRegisterLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCityCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCitySave, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        tabCityRegisterLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCityCancel, btnCitySave});

        tabCityRegisterLayout.setVerticalGroup(
            tabCityRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCityRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCityRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabCityRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCitySave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCityCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        tabBrand.addTab("Nova", tabCityRegister);

        tabCityList.setBackground(new java.awt.Color(255, 255, 255));

        panelCitySearch.setBackground(new java.awt.Color(255, 255, 255));
        panelCitySearch.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        lblCitySearchField.setText("Nome");

        btnCitySearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/search.png"))); // NOI18N
        btnCitySearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitySearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCitySearchLayout = new javax.swing.GroupLayout(panelCitySearch);
        panelCitySearch.setLayout(panelCitySearchLayout);
        panelCitySearchLayout.setHorizontalGroup(
            panelCitySearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCitySearchLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblCitySearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCitySearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCitySearch)
                .addGap(2, 2, 2))
        );
        panelCitySearchLayout.setVerticalGroup(
            panelCitySearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCitySearchLayout.createSequentialGroup()
                .addGroup(panelCitySearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCitySearchField)
                    .addComponent(btnCitySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCitySearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableCity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Estado", "Cidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCity.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableCity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableCityMousePressed(evt);
            }
        });
        tableCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableCityKeyPressed(evt);
            }
        });
        scrollCity.setViewportView(tableCity);

        btnCityListRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/refresh.png"))); // NOI18N
        btnCityListRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCityListRefreshActionPerformed(evt);
            }
        });

        btnCityDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/trash-30.png"))); // NOI18N
        btnCityDelete.setToolTipText("Excluir produto");
        btnCityDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCityDeleteActionPerformed(evt);
            }
        });

        btnCityUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/update-30.png"))); // NOI18N
        btnCityUpdate.setToolTipText("Alterar");
        btnCityUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCityUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabCityListLayout = new javax.swing.GroupLayout(tabCityList);
        tabCityList.setLayout(tabCityListLayout);
        tabCityListLayout.setHorizontalGroup(
            tabCityListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCityListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabCityListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabCityListLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCityUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCityDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabCityListLayout.createSequentialGroup()
                        .addComponent(panelCitySearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCityListRefresh))
                    .addComponent(scrollCity, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabCityListLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCityDelete, btnCityUpdate});

        tabCityListLayout.setVerticalGroup(
            tabCityListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCityListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabCityListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelCitySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCityListRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollCity, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabCityListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCityDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCityUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        tabBrand.addTab("Listagem", tabCityList);

        lblPanelTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblPanelTitle.setText("Cidade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabBrand)
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
                .addComponent(tabBrand))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCitySaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitySaveActionPerformed
        String temp = "", temp2 = "";
        if (operation == FormOperationEnum.CREATE) {
            temp = "cadastrar";
            temp2 = "cadastrada";
        } else {
            temp = "alterar";
            temp2 = "alterada";
        }

        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja " + temp + " esta cidade?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.NO_OPTION) {
            return;
        }

        City city = new City();
        city.setName(txtCityName.getText());
        city.setState((State) cbCityState.getSelectedItem());
        try {
            if (operation == FormOperationEnum.CREATE) {
                ServiceCity.getInstance().insert(city);
            } else {
                ServiceCity.getInstance().update(city);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Cidade " + temp2 + " com sucesso",
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        txtCityName.setText("");
        loadList();
    }//GEN-LAST:event_btnCitySaveActionPerformed

    private void btnCityListRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCityListRefreshActionPerformed
        loadList();
    }//GEN-LAST:event_btnCityListRefreshActionPerformed

    private void btnCitySearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitySearchActionPerformed
        loadSearch(txtCitySearchField.getText());
    }//GEN-LAST:event_btnCitySearchActionPerformed

    private void btnCityDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCityDeleteActionPerformed
        if (tableCity.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione uma cidade na lista",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Integer id = DataUtil.parseInteger(tableCity.getModel().getValueAt(tableCity.getSelectedRow(), 0) + "");
        deleteCity(id);
    }//GEN-LAST:event_btnCityDeleteActionPerformed

    private void tableCityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableCityKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            if (tableCity.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(this, "Selecione uma cidade na lista",
                        "Atenção", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            Integer id = DataUtil.parseInteger(tableCity.getModel().getValueAt(tableCity.getSelectedRow(), 0) + "");
            deleteCity(id);
        }
    }//GEN-LAST:event_tableCityKeyPressed

    private void tableCityMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCityMousePressed
        if (evt.getButton() != MouseEvent.BUTTON3 || tableCity.getSelectedRow() < 0) {
            return;
        }

        Integer id = DataUtil.parseInteger(tableCity.getModel().getValueAt(tableCity.getSelectedRow(), 0) + "");

        JPopupMenu popup = new JPopupMenu();
        JMenuItem mItemUpdate = new JMenuItem("Alterar/Ver");
        mItemUpdate.addActionListener((e) -> {
            PanelCity p = new PanelCity(FormOperationEnum.UPDATE, id);
            FrameMain.loadCard(p, "City", true);
        });
        popup.add(mItemUpdate);
        JMenuItem mItemDelete = new JMenuItem("Deletar");
        mItemDelete.addActionListener((e) -> {
            deleteCity(id);
        });

        popup.add(mItemDelete);

        popup.show(tableCity,
                (int) evt.getX(),
                (int) evt.getY()
        );
    }//GEN-LAST:event_tableCityMousePressed

    private void btnCityCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCityCancelActionPerformed
        PanelCity p = new PanelCity(FormOperationEnum.CREATE, null);
        FrameMain.loadCard(p, "City", true);
    }//GEN-LAST:event_btnCityCancelActionPerformed

    private void btnCityUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCityUpdateActionPerformed
        if (tableCity.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Selecione uma cidade na lista",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Integer id = DataUtil.parseInteger(tableCity.getModel().getValueAt(tableCity.getSelectedRow(), 0) + "");

        PanelCity p = new PanelCity(FormOperationEnum.UPDATE, id);
        FrameMain.loadCard(p, "City", true);
    }//GEN-LAST:event_btnCityUpdateActionPerformed

    private void loadState() {
        FormUtil.clearComboBox(cbCityState);
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

        FormUtil.setModelComboBox(cbCityState, list);
    }

    public void deleteCity(Integer id) {
        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja excluir esta cidade?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.NO_OPTION) {
            return;
        }

        try {
            ServiceCity.getInstance().delete(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Cidade excluída com sucesso!",
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        loadList();
    }

    private void loadCity(Integer id) {
        City ct;
        try {
            ct = ServiceCity.getInstance().get(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        cityId = ct.getId();
        txtCityName.setText(ct.getName());

        JComboBox cbTemp = null;
        // set value on combobox
        if (ct.getState() != null) {
            cbTemp = cbCityState;
            cbTemp.setSelectedIndex(0);
            for (int i = 0; i < cbTemp.getItemCount(); i++) {
                State cbSelectedItem = (State) cbTemp.getSelectedItem();
                if (cbSelectedItem.getId() == ct.getState().getId()) {
                    cbTemp.setSelectedItem(cbSelectedItem);
                    break;
                }
                cbTemp.setSelectedIndex(i);
            }
        }
    }

    public void loadList() {
        DefaultTableModel model = (DefaultTableModel) tableCity.getModel();
        model.setNumRows(0);
        TableColumn column = tableCity.getColumnModel().getColumn(0);
        if ("Código".equals(column.getHeaderValue().toString())) {
            tableCity.removeColumn(column);
        }
        List<City> list = null;
        try {
           // list = ServiceCity.getInstance().list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (list == null) {
            return;
        }
        for (City p : list) {
            model.addRow(new Object[]{
                p.getId(),
                p.getState(),
                p.getName()
            });
        }
    }

    private void loadSearch(String value) {
        DefaultTableModel model = (DefaultTableModel) tableCity.getModel();
        model.setNumRows(0);
        List<City> list = null;

        try {
            list = ServiceCity.getInstance().search(value);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (list == null) {
            JOptionPane.showMessageDialog(this, "Nenhuma cidade foi encontrada",
                    "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (City p : list) {
            model.addRow(new Object[]{
                p.getId(),
                p.getState(),
                p.getName()
            });

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCityCancel;
    private javax.swing.JButton btnCityDelete;
    private javax.swing.JButton btnCityListRefresh;
    private javax.swing.JButton btnCitySave;
    private javax.swing.JButton btnCitySearch;
    private javax.swing.JButton btnCityUpdate;
    private javax.swing.JComboBox<String> cbCityState;
    private javax.swing.JLabel lblCityName;
    private javax.swing.JLabel lblCitySearchField;
    private javax.swing.JLabel lblCityState;
    private javax.swing.JLabel lblPanelTitle;
    private javax.swing.JPanel panelCityRegister;
    private javax.swing.JPanel panelCitySearch;
    private javax.swing.JScrollPane scrollCity;
    private javax.swing.JTabbedPane tabBrand;
    private javax.swing.JPanel tabCityList;
    private javax.swing.JPanel tabCityRegister;
    private javax.swing.JTable tableCity;
    private javax.swing.JTextField txtCityName;
    private javax.swing.JTextField txtCitySearchField;
    // End of variables declaration//GEN-END:variables
}
