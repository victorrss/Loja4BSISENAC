package br.com.store.view;

public class PanelCategory extends javax.swing.JPanel {

    public PanelCategory() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabCategory = new javax.swing.JTabbedPane();
        tabCategoryRegister = new javax.swing.JPanel();
        panelCategoryRegister = new javax.swing.JPanel();
        lblCategoryName = new javax.swing.JLabel();
        txtCategoryName = new javax.swing.JTextField();
        lblCategoryId = new javax.swing.JLabel();
        txtCategoryId = new javax.swing.JTextField();
        btnCategoryFinalize = new javax.swing.JButton();
        tabCategoryList = new javax.swing.JPanel();
        panelCategorySearch = new javax.swing.JPanel();
        lblCategorySearchField = new javax.swing.JLabel();
        txtCategorySearchField = new javax.swing.JTextField();
        btnCategorySearch = new javax.swing.JButton();
        scrollCategory = new javax.swing.JScrollPane();
        tableCategorySearch = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tabCategoryRegister.setBackground(new java.awt.Color(255, 255, 255));

        panelCategoryRegister.setBackground(new java.awt.Color(255, 255, 255));
        panelCategoryRegister.setBorder(javax.swing.BorderFactory.createTitledBorder("Categoria"));

        lblCategoryName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCategoryName.setText("Nome");

        txtCategoryName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoryNameActionPerformed(evt);
            }
        });

        lblCategoryId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCategoryId.setText("Código");

        txtCategoryId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoryIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCategoryRegisterLayout = new javax.swing.GroupLayout(panelCategoryRegister);
        panelCategoryRegister.setLayout(panelCategoryRegisterLayout);
        panelCategoryRegisterLayout.setHorizontalGroup(
            panelCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoryRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCategoryId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCategoryName)
                    .addGroup(panelCategoryRegisterLayout.createSequentialGroup()
                        .addComponent(txtCategoryId, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 601, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelCategoryRegisterLayout.setVerticalGroup(
            panelCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoryRegisterLayout.createSequentialGroup()
                .addGroup(panelCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCategoryId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCategoryId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCategoryName))
                .addContainerGap(187, Short.MAX_VALUE))
        );

        btnCategoryFinalize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/save.png"))); // NOI18N

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
                        .addComponent(btnCategoryFinalize, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        tabCategoryRegisterLayout.setVerticalGroup(
            tabCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCategoryRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCategoryRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCategoryFinalize, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabCategory.addTab("Nova", tabCategoryRegister);

        tabCategoryList.setBackground(new java.awt.Color(255, 255, 255));

        panelCategorySearch.setBackground(new java.awt.Color(255, 255, 255));
        panelCategorySearch.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        lblCategorySearchField.setText("Nome");

        btnCategorySearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/search.png"))); // NOI18N

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
                "Id", "Nome", "Disponível"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        scrollCategory.setViewportView(tableCategorySearch);

        javax.swing.GroupLayout tabCategoryListLayout = new javax.swing.GroupLayout(tabCategoryList);
        tabCategoryList.setLayout(tabCategoryListLayout);
        tabCategoryListLayout.setHorizontalGroup(
            tabCategoryListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCategoryListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabCategoryListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
                    .addComponent(panelCategorySearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        tabCategoryListLayout.setVerticalGroup(
            tabCategoryListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCategoryListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCategorySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabCategory.addTab("Listagem", tabCategoryList);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Categoria");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(tabCategory)
                .addGap(3, 3, 3))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabCategory))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCategoryNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoryNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoryNameActionPerformed

    private void txtCategoryIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoryIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoryIdActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategoryFinalize;
    private javax.swing.JButton btnCategorySearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCategoryId;
    private javax.swing.JLabel lblCategoryName;
    private javax.swing.JLabel lblCategorySearchField;
    private javax.swing.JPanel panelCategoryRegister;
    private javax.swing.JPanel panelCategorySearch;
    private javax.swing.JScrollPane scrollCategory;
    private javax.swing.JTabbedPane tabCategory;
    private javax.swing.JPanel tabCategoryList;
    private javax.swing.JPanel tabCategoryRegister;
    private javax.swing.JTable tableCategorySearch;
    private javax.swing.JTextField txtCategoryId;
    private javax.swing.JTextField txtCategoryName;
    private javax.swing.JTextField txtCategorySearchField;
    // End of variables declaration//GEN-END:variables
}
