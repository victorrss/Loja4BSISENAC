package br.com.store.view;

public class PanelBrand extends javax.swing.JPanel {

    public PanelBrand() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabBrand = new javax.swing.JTabbedPane();
        tabBrandRegister = new javax.swing.JPanel();
        panelBrandRegister = new javax.swing.JPanel();
        lblBrandName = new javax.swing.JLabel();
        txtBrandName = new javax.swing.JTextField();
        lblBrandId = new javax.swing.JLabel();
        txtBrandId = new javax.swing.JTextField();
        btnBrandFinalize = new javax.swing.JButton();
        tabBrandList = new javax.swing.JPanel();
        panelBrandSearch = new javax.swing.JPanel();
        lbBrandSearchField = new javax.swing.JLabel();
        txtBrandSearchField = new javax.swing.JTextField();
        btnBrandSearch = new javax.swing.JButton();
        scrollBrand = new javax.swing.JScrollPane();
        tableBrandSearch = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tabBrandRegister.setBackground(new java.awt.Color(255, 255, 255));

        panelBrandRegister.setBackground(new java.awt.Color(255, 255, 255));
        panelBrandRegister.setBorder(javax.swing.BorderFactory.createTitledBorder("Marca"));

        lblBrandName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBrandName.setText("Nome");

        txtBrandName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandNameActionPerformed(evt);
            }
        });

        lblBrandId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBrandId.setText("Código");

        txtBrandId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBrandRegisterLayout = new javax.swing.GroupLayout(panelBrandRegister);
        panelBrandRegister.setLayout(panelBrandRegisterLayout);
        panelBrandRegisterLayout.setHorizontalGroup(
            panelBrandRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBrandRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBrandRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBrandId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBrandRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBrandName)
                    .addGroup(panelBrandRegisterLayout.createSequentialGroup()
                        .addComponent(txtBrandId, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 606, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelBrandRegisterLayout.setVerticalGroup(
            panelBrandRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBrandRegisterLayout.createSequentialGroup()
                .addGroup(panelBrandRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBrandId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBrandId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBrandRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBrandName))
                .addContainerGap(187, Short.MAX_VALUE))
        );

        btnBrandFinalize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/save.png"))); // NOI18N

        javax.swing.GroupLayout tabBrandRegisterLayout = new javax.swing.GroupLayout(tabBrandRegister);
        tabBrandRegister.setLayout(tabBrandRegisterLayout);
        tabBrandRegisterLayout.setHorizontalGroup(
            tabBrandRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBrandRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabBrandRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBrandRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabBrandRegisterLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBrandFinalize, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        tabBrandRegisterLayout.setVerticalGroup(
            tabBrandRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBrandRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBrandRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBrandFinalize, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabBrand.addTab("Nova", tabBrandRegister);

        tabBrandList.setBackground(new java.awt.Color(255, 255, 255));

        panelBrandSearch.setBackground(new java.awt.Color(255, 255, 255));
        panelBrandSearch.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        lbBrandSearchField.setText("Nome");

        btnBrandSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/search.png"))); // NOI18N

        javax.swing.GroupLayout panelBrandSearchLayout = new javax.swing.GroupLayout(panelBrandSearch);
        panelBrandSearch.setLayout(panelBrandSearchLayout);
        panelBrandSearchLayout.setHorizontalGroup(
            panelBrandSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBrandSearchLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lbBrandSearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBrandSearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBrandSearch)
                .addGap(2, 2, 2))
        );
        panelBrandSearchLayout.setVerticalGroup(
            panelBrandSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBrandSearchLayout.createSequentialGroup()
                .addGroup(panelBrandSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBrandSearchField)
                    .addComponent(btnBrandSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBrandSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableBrandSearch.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollBrand.setViewportView(tableBrandSearch);

        javax.swing.GroupLayout tabBrandListLayout = new javax.swing.GroupLayout(tabBrandList);
        tabBrandList.setLayout(tabBrandListLayout);
        tabBrandListLayout.setHorizontalGroup(
            tabBrandListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBrandListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabBrandListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollBrand, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
                    .addComponent(panelBrandSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        tabBrandListLayout.setVerticalGroup(
            tabBrandListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBrandListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBrandSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollBrand, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabBrand.addTab("Listagem", tabBrandList);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Marca");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabBrand)
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
                .addComponent(tabBrand))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBrandNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandNameActionPerformed

    private void txtBrandIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandIdActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrandFinalize;
    private javax.swing.JButton btnBrandSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbBrandSearchField;
    private javax.swing.JLabel lblBrandId;
    private javax.swing.JLabel lblBrandName;
    private javax.swing.JPanel panelBrandRegister;
    private javax.swing.JPanel panelBrandSearch;
    private javax.swing.JScrollPane scrollBrand;
    private javax.swing.JTabbedPane tabBrand;
    private javax.swing.JPanel tabBrandList;
    private javax.swing.JPanel tabBrandRegister;
    private javax.swing.JTable tableBrandSearch;
    private javax.swing.JTextField txtBrandId;
    private javax.swing.JTextField txtBrandName;
    private javax.swing.JTextField txtBrandSearchField;
    // End of variables declaration//GEN-END:variables
}
