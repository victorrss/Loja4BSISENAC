package br.com.store.view;

public class PanelSubCategory extends javax.swing.JPanel {

    public PanelSubCategory() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tabSubCategory = new javax.swing.JTabbedPane();
        tabSubCategoryRegister = new javax.swing.JPanel();
        panelSubCategoryRegister = new javax.swing.JPanel();
        lblSubCategoryName = new javax.swing.JLabel();
        txtSubCategoryName = new javax.swing.JTextField();
        lblSubCategoryId = new javax.swing.JLabel();
        txtSubCategoryId = new javax.swing.JTextField();
        btnSubCategoryFinalize = new javax.swing.JButton();
        tabSubCategoryList = new javax.swing.JPanel();
        panelSubCategorySearch = new javax.swing.JPanel();
        lbSubCategorySearchField = new javax.swing.JLabel();
        txtSubCategorySearchField = new javax.swing.JTextField();
        btnSubCategorySearch = new javax.swing.JButton();
        scrollSubCategory = new javax.swing.JScrollPane();
        tableSubCategorySearch = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Sub Categoria");

        tabSubCategoryRegister.setBackground(new java.awt.Color(255, 255, 255));

        panelSubCategoryRegister.setBackground(new java.awt.Color(255, 255, 255));
        panelSubCategoryRegister.setBorder(javax.swing.BorderFactory.createTitledBorder("Sub Categoria"));

        lblSubCategoryName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSubCategoryName.setText("Nome");

        txtSubCategoryName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubCategoryNameActionPerformed(evt);
            }
        });

        lblSubCategoryId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSubCategoryId.setText("Código");

        txtSubCategoryId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubCategoryIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSubCategoryRegisterLayout = new javax.swing.GroupLayout(panelSubCategoryRegister);
        panelSubCategoryRegister.setLayout(panelSubCategoryRegisterLayout);
        panelSubCategoryRegisterLayout.setHorizontalGroup(
            panelSubCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSubCategoryRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSubCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSubCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSubCategoryId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSubCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSubCategoryName)
                    .addGroup(panelSubCategoryRegisterLayout.createSequentialGroup()
                        .addComponent(txtSubCategoryId, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 606, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelSubCategoryRegisterLayout.setVerticalGroup(
            panelSubCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSubCategoryRegisterLayout.createSequentialGroup()
                .addGroup(panelSubCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSubCategoryId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSubCategoryId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSubCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSubCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSubCategoryName))
                .addContainerGap(187, Short.MAX_VALUE))
        );

        btnSubCategoryFinalize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/save.png"))); // NOI18N

        javax.swing.GroupLayout tabSubCategoryRegisterLayout = new javax.swing.GroupLayout(tabSubCategoryRegister);
        tabSubCategoryRegister.setLayout(tabSubCategoryRegisterLayout);
        tabSubCategoryRegisterLayout.setHorizontalGroup(
            tabSubCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSubCategoryRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabSubCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSubCategoryRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabSubCategoryRegisterLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSubCategoryFinalize, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        tabSubCategoryRegisterLayout.setVerticalGroup(
            tabSubCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSubCategoryRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSubCategoryRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubCategoryFinalize, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabSubCategory.addTab("Nova", tabSubCategoryRegister);

        tabSubCategoryList.setBackground(new java.awt.Color(255, 255, 255));

        panelSubCategorySearch.setBackground(new java.awt.Color(255, 255, 255));
        panelSubCategorySearch.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        lbSubCategorySearchField.setText("Nome");

        btnSubCategorySearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/search.png"))); // NOI18N

        javax.swing.GroupLayout panelSubCategorySearchLayout = new javax.swing.GroupLayout(panelSubCategorySearch);
        panelSubCategorySearch.setLayout(panelSubCategorySearchLayout);
        panelSubCategorySearchLayout.setHorizontalGroup(
            panelSubCategorySearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSubCategorySearchLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lbSubCategorySearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSubCategorySearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubCategorySearch)
                .addGap(2, 2, 2))
        );
        panelSubCategorySearchLayout.setVerticalGroup(
            panelSubCategorySearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSubCategorySearchLayout.createSequentialGroup()
                .addGroup(panelSubCategorySearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSubCategorySearchField)
                    .addComponent(btnSubCategorySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSubCategorySearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableSubCategorySearch.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollSubCategory.setViewportView(tableSubCategorySearch);

        javax.swing.GroupLayout tabSubCategoryListLayout = new javax.swing.GroupLayout(tabSubCategoryList);
        tabSubCategoryList.setLayout(tabSubCategoryListLayout);
        tabSubCategoryListLayout.setHorizontalGroup(
            tabSubCategoryListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSubCategoryListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabSubCategoryListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollSubCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
                    .addComponent(panelSubCategorySearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        tabSubCategoryListLayout.setVerticalGroup(
            tabSubCategoryListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSubCategoryListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSubCategorySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollSubCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabSubCategory.addTab("Listagem", tabSubCategoryList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabSubCategory, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabSubCategory))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSubCategoryNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubCategoryNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubCategoryNameActionPerformed

    private void txtSubCategoryIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubCategoryIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubCategoryIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubCategoryFinalize;
    private javax.swing.JButton btnSubCategorySearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbSubCategorySearchField;
    private javax.swing.JLabel lblSubCategoryId;
    private javax.swing.JLabel lblSubCategoryName;
    private javax.swing.JPanel panelSubCategoryRegister;
    private javax.swing.JPanel panelSubCategorySearch;
    private javax.swing.JScrollPane scrollSubCategory;
    private javax.swing.JTabbedPane tabSubCategory;
    private javax.swing.JPanel tabSubCategoryList;
    private javax.swing.JPanel tabSubCategoryRegister;
    private javax.swing.JTable tableSubCategorySearch;
    private javax.swing.JTextField txtSubCategoryId;
    private javax.swing.JTextField txtSubCategoryName;
    private javax.swing.JTextField txtSubCategorySearchField;
    // End of variables declaration//GEN-END:variables
}
