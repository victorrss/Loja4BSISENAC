package br.com.store.view;

public class PanelProduct extends javax.swing.JPanel {

    public PanelProduct() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabMainProduct = new javax.swing.JTabbedPane();
        tabProduct = new javax.swing.JTabbedPane();
        tabProductRegister = new javax.swing.JPanel();
        panelProductRegister = new javax.swing.JPanel();
        lblProductName = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        lblProductBrand = new javax.swing.JLabel();
        cbProductBrand = new javax.swing.JComboBox<>();
        lblProductId = new javax.swing.JLabel();
        txtProductId = new javax.swing.JTextField();
        txtProductBarcode = new javax.swing.JTextField();
        lblProductBarcode = new javax.swing.JLabel();
        lblProductImage = new javax.swing.JLabel();
        cbProductCategory = new javax.swing.JComboBox<>();
        lblProductCategory = new javax.swing.JLabel();
        lblProductSubCategory = new javax.swing.JLabel();
        cbProductSubCategory = new javax.swing.JComboBox<>();
        lblProductWarranty = new javax.swing.JLabel();
        txtProductWarranty = new javax.swing.JTextField();
        lblProductWarrantHelp = new javax.swing.JLabel();
        lblProductModel = new javax.swing.JLabel();
        txtProductModel = new javax.swing.JTextField();
        txtProductPrice = new javax.swing.JFormattedTextField();
        lblProductPrice = new javax.swing.JLabel();
        lblProductStock = new javax.swing.JLabel();
        txtProductStock = new javax.swing.JTextField();
        chkProductEnabled = new javax.swing.JCheckBox();
        btnProductRefreshCategory = new javax.swing.JButton();
        btnProductRefreshBrand = new javax.swing.JButton();
        btnProductRefreshSubCategory = new javax.swing.JButton();
        txtProductDescription = new javax.swing.JTextField();
        lblProductDescription = new javax.swing.JLabel();
        btnProductFinalize = new javax.swing.JButton();
        tabProductList = new javax.swing.JPanel();
        panelProductSearch = new javax.swing.JPanel();
        cbProductSearchField = new javax.swing.JComboBox<>();
        lblProductSearchField = new javax.swing.JLabel();
        txtProductSearchField = new javax.swing.JTextField();
        btnProductSearch = new javax.swing.JButton();
        scrollProduct = new javax.swing.JScrollPane();
        tableProductSearch = new javax.swing.JTable();
        tabBrand = new javax.swing.JTabbedPane();
        tabBrandRegister = new javax.swing.JPanel();
        panelBrandRegister = new javax.swing.JPanel();
        lblBrandName = new javax.swing.JLabel();
        txtBrandName = new javax.swing.JTextField();
        lblBrandId = new javax.swing.JLabel();
        txtBrandId = new javax.swing.JTextField();
        chkBrandEnabled = new javax.swing.JCheckBox();
        btnBrandFinalize = new javax.swing.JButton();
        tabBrandList = new javax.swing.JPanel();
        panelBrandSearch = new javax.swing.JPanel();
        lbBrandSearchField = new javax.swing.JLabel();
        txtBrandSearchField = new javax.swing.JTextField();
        btnBrandSearch = new javax.swing.JButton();
        scrollBrand = new javax.swing.JScrollPane();
        tableBrandSearch = new javax.swing.JTable();
        tabCategory = new javax.swing.JTabbedPane();
        tabCategoryRegister = new javax.swing.JPanel();
        panelCategoryRegister = new javax.swing.JPanel();
        lblCategoryName = new javax.swing.JLabel();
        txtCategoryName = new javax.swing.JTextField();
        lblCategoryId = new javax.swing.JLabel();
        txtCategoryId = new javax.swing.JTextField();
        chkBrandEnabled1 = new javax.swing.JCheckBox();
        btnCategoryFinalize = new javax.swing.JButton();
        tabCategoryList = new javax.swing.JPanel();
        panelCategorySearch = new javax.swing.JPanel();
        lbCategorySearchField = new javax.swing.JLabel();
        txtCategorySearchField = new javax.swing.JTextField();
        btnCategorySearch = new javax.swing.JButton();
        scrollCategory = new javax.swing.JScrollPane();
        tableCategorySearch = new javax.swing.JTable();
        tabSubCategory = new javax.swing.JTabbedPane();
        tabSubCategoryRegister = new javax.swing.JPanel();
        panelSubCategoryRegister = new javax.swing.JPanel();
        lblSubCategoryName = new javax.swing.JLabel();
        txtSubCategoryName = new javax.swing.JTextField();
        lblSubCategoryId = new javax.swing.JLabel();
        txtSubCategoryId = new javax.swing.JTextField();
        chkSubCategoryEnabled = new javax.swing.JCheckBox();
        btnSubCategoryFinalize = new javax.swing.JButton();
        tabSubCategoryList = new javax.swing.JPanel();
        panelSubCategorySearch = new javax.swing.JPanel();
        lbSubCategorySearchField = new javax.swing.JLabel();
        txtSubCategorySearchField = new javax.swing.JTextField();
        btnSubCategorySearch = new javax.swing.JButton();
        scrollSubCategory = new javax.swing.JScrollPane();
        tableSubCategorySearch = new javax.swing.JTable();

        tabProductRegister.setBackground(new java.awt.Color(255, 255, 255));

        panelProductRegister.setBackground(new java.awt.Color(255, 255, 255));
        panelProductRegister.setBorder(javax.swing.BorderFactory.createTitledBorder("Produto"));

        lblProductName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductName.setText("Nome");

        txtProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductNameActionPerformed(evt);
            }
        });

        lblProductBrand.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductBrand.setText("Marca");

        cbProductBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblProductId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductId.setText("Código");

        txtProductId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductIdActionPerformed(evt);
            }
        });

        txtProductBarcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductBarcodeActionPerformed(evt);
            }
        });

        lblProductBarcode.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductBarcode.setText("Código de Barras");

        lblProductImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProductImage.setText("Foto");
        lblProductImage.setBorder(javax.swing.BorderFactory.createTitledBorder("Foto"));

        cbProductCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblProductCategory.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductCategory.setText("Categoria");

        lblProductSubCategory.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductSubCategory.setText("Sub Categoria");

        cbProductSubCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblProductWarranty.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductWarranty.setText("Garantia");

        txtProductWarranty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductWarrantyActionPerformed(evt);
            }
        });

        lblProductWarrantHelp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblProductWarrantHelp.setText("meses");

        lblProductModel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductModel.setText("Modelo");

        txtProductModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductModelActionPerformed(evt);
            }
        });

        lblProductPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductPrice.setText("Preço");

        lblProductStock.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductStock.setText("Estoque");

        txtProductStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductStockActionPerformed(evt);
            }
        });

        chkProductEnabled.setBackground(new java.awt.Color(255, 255, 255));
        chkProductEnabled.setText("Disponível");

        btnProductRefreshCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/refresh.png"))); // NOI18N

        btnProductRefreshBrand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/refresh.png"))); // NOI18N

        btnProductRefreshSubCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/refresh.png"))); // NOI18N

        txtProductDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductDescriptionActionPerformed(evt);
            }
        });

        lblProductDescription.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductDescription.setText("Descrição");

        javax.swing.GroupLayout panelProductRegisterLayout = new javax.swing.GroupLayout(panelProductRegister);
        panelProductRegister.setLayout(panelProductRegisterLayout);
        panelProductRegisterLayout.setHorizontalGroup(
            panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProductRegisterLayout.createSequentialGroup()
                        .addGroup(panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProductSubCategory)
                            .addComponent(lblProductCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbProductCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbProductSubCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnProductRefreshCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProductRefreshSubCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProductRegisterLayout.createSequentialGroup()
                        .addGroup(panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProductBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProductName)
                            .addGroup(panelProductRegisterLayout.createSequentialGroup()
                                .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblProductBarcode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProductBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 218, Short.MAX_VALUE))
                            .addGroup(panelProductRegisterLayout.createSequentialGroup()
                                .addComponent(cbProductBrand, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProductRefreshBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelProductRegisterLayout.createSequentialGroup()
                        .addGroup(panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProductWarranty, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProductRegisterLayout.createSequentialGroup()
                                .addComponent(txtProductWarranty, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblProductWarrantHelp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblProductModel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProductModel))
                            .addGroup(panelProductRegisterLayout.createSequentialGroup()
                                .addComponent(txtProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblProductStock)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProductStock, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkProductEnabled)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtProductDescription))))
                .addGap(18, 18, 18)
                .addComponent(lblProductImage, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelProductRegisterLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblProductBrand, lblProductCategory, lblProductId, lblProductName, lblProductPrice, lblProductSubCategory, lblProductWarranty});

        panelProductRegisterLayout.setVerticalGroup(
            panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductRegisterLayout.createSequentialGroup()
                .addGroup(panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductId)
                    .addComponent(txtProductBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductBarcode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProductRegisterLayout.createSequentialGroup()
                        .addGroup(panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProductBrand)
                            .addComponent(btnProductRefreshBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbProductBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbProductCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductCategory)
                            .addComponent(btnProductRefreshCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbProductSubCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductSubCategory)
                            .addComponent(btnProductRefreshSubCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProductWarranty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductWarranty)
                            .addComponent(lblProductWarrantHelp)
                            .addComponent(txtProductModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductModel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductPrice)
                            .addComponent(txtProductStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductStock)
                            .addComponent(chkProductEnabled))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProductDescription)
                            .addComponent(txtProductDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblProductImage, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnProductFinalize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/save.png"))); // NOI18N

        javax.swing.GroupLayout tabProductRegisterLayout = new javax.swing.GroupLayout(tabProductRegister);
        tabProductRegister.setLayout(tabProductRegisterLayout);
        tabProductRegisterLayout.setHorizontalGroup(
            tabProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabProductRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelProductRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tabProductRegisterLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnProductFinalize, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        tabProductRegisterLayout.setVerticalGroup(
            tabProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabProductRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelProductRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProductFinalize, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabProduct.addTab("Novo", tabProductRegister);

        tabProductList.setBackground(new java.awt.Color(255, 255, 255));

        panelProductSearch.setBackground(new java.awt.Color(255, 255, 255));
        panelProductSearch.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        cbProductSearchField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblProductSearchField.setText("Campo");

        btnProductSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/search.png"))); // NOI18N

        javax.swing.GroupLayout panelProductSearchLayout = new javax.swing.GroupLayout(panelProductSearch);
        panelProductSearch.setLayout(panelProductSearchLayout);
        panelProductSearchLayout.setHorizontalGroup(
            panelProductSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductSearchLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblProductSearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbProductSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(txtProductSearchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProductSearch)
                .addGap(2, 2, 2))
        );
        panelProductSearchLayout.setVerticalGroup(
            panelProductSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductSearchLayout.createSequentialGroup()
                .addGroup(panelProductSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbProductSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductSearchField)
                    .addComponent(btnProductSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableProductSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Código de Barras", "Nome", "Modelo", "Preço", "Estoque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollProduct.setViewportView(tableProductSearch);

        javax.swing.GroupLayout tabProductListLayout = new javax.swing.GroupLayout(tabProductList);
        tabProductList.setLayout(tabProductListLayout);
        tabProductListLayout.setHorizontalGroup(
            tabProductListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabProductListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabProductListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelProductSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE))
                .addContainerGap())
        );
        tabProductListLayout.setVerticalGroup(
            tabProductListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabProductListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelProductSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabProduct.addTab("Listagem", tabProductList);

        tabMainProduct.addTab("Produto", tabProduct);

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

        chkBrandEnabled.setBackground(new java.awt.Color(255, 255, 255));
        chkBrandEnabled.setText("Disponível");

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
                    .addGroup(panelBrandRegisterLayout.createSequentialGroup()
                        .addComponent(txtBrandId, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 601, Short.MAX_VALUE))
                    .addGroup(panelBrandRegisterLayout.createSequentialGroup()
                        .addComponent(chkBrandEnabled)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtBrandName))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkBrandEnabled)
                .addContainerGap(194, Short.MAX_VALUE))
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
                    .addComponent(scrollBrand, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
                    .addComponent(panelBrandSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        tabBrandListLayout.setVerticalGroup(
            tabBrandListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBrandListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBrandSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollBrand, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabBrand.addTab("Listagem", tabBrandList);

        tabMainProduct.addTab("Marca", tabBrand);

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

        chkBrandEnabled1.setBackground(new java.awt.Color(255, 255, 255));
        chkBrandEnabled1.setText("Disponível");

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
                        .addGroup(panelCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCategoryId, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkBrandEnabled1))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkBrandEnabled1)
                .addContainerGap(194, Short.MAX_VALUE))
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

        lbCategorySearchField.setText("Nome");

        btnCategorySearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/search.png"))); // NOI18N

        javax.swing.GroupLayout panelCategorySearchLayout = new javax.swing.GroupLayout(panelCategorySearch);
        panelCategorySearch.setLayout(panelCategorySearchLayout);
        panelCategorySearchLayout.setHorizontalGroup(
            panelCategorySearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategorySearchLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lbCategorySearchField)
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
                    .addComponent(lbCategorySearchField)
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
                .addComponent(scrollCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabCategory.addTab("Listagem", tabCategoryList);

        tabMainProduct.addTab("Categoria", tabCategory);

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

        chkSubCategoryEnabled.setBackground(new java.awt.Color(255, 255, 255));
        chkSubCategoryEnabled.setText("Disponível");

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
                        .addGroup(panelSubCategoryRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSubCategoryId, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkSubCategoryEnabled))
                        .addGap(0, 601, Short.MAX_VALUE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkSubCategoryEnabled)
                .addContainerGap(194, Short.MAX_VALUE))
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
                .addComponent(panelSubCategoryRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(scrollSubCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
                    .addComponent(panelSubCategorySearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        tabSubCategoryListLayout.setVerticalGroup(
            tabSubCategoryListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSubCategoryListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSubCategorySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollSubCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabSubCategory.addTab("Listagem", tabSubCategoryList);

        tabMainProduct.addTab("Sub Categoria", tabSubCategory);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabMainProduct)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabMainProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductNameActionPerformed

    private void txtProductIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductIdActionPerformed

    private void txtProductBarcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductBarcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductBarcodeActionPerformed

    private void txtProductWarrantyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductWarrantyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductWarrantyActionPerformed

    private void txtProductModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductModelActionPerformed

    private void txtProductStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductStockActionPerformed

    private void txtBrandNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandNameActionPerformed

    private void txtBrandIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandIdActionPerformed

    private void txtCategoryNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoryNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoryNameActionPerformed

    private void txtCategoryIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoryIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoryIdActionPerformed

    private void txtSubCategoryNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubCategoryNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubCategoryNameActionPerformed

    private void txtSubCategoryIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubCategoryIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubCategoryIdActionPerformed

    private void txtProductDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductDescriptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrandFinalize;
    private javax.swing.JButton btnBrandSearch;
    private javax.swing.JButton btnCategoryFinalize;
    private javax.swing.JButton btnCategorySearch;
    private javax.swing.JButton btnProductFinalize;
    private javax.swing.JButton btnProductRefreshBrand;
    private javax.swing.JButton btnProductRefreshCategory;
    private javax.swing.JButton btnProductRefreshSubCategory;
    private javax.swing.JButton btnProductSearch;
    private javax.swing.JButton btnSubCategoryFinalize;
    private javax.swing.JButton btnSubCategorySearch;
    private javax.swing.JComboBox<String> cbProductBrand;
    private javax.swing.JComboBox<String> cbProductCategory;
    private javax.swing.JComboBox<String> cbProductSearchField;
    private javax.swing.JComboBox<String> cbProductSubCategory;
    private javax.swing.JCheckBox chkBrandEnabled;
    private javax.swing.JCheckBox chkBrandEnabled1;
    private javax.swing.JCheckBox chkProductEnabled;
    private javax.swing.JCheckBox chkSubCategoryEnabled;
    private javax.swing.JLabel lbBrandSearchField;
    private javax.swing.JLabel lbCategorySearchField;
    private javax.swing.JLabel lbSubCategorySearchField;
    private javax.swing.JLabel lblBrandId;
    private javax.swing.JLabel lblBrandName;
    private javax.swing.JLabel lblCategoryId;
    private javax.swing.JLabel lblCategoryName;
    private javax.swing.JLabel lblProductBarcode;
    private javax.swing.JLabel lblProductBrand;
    private javax.swing.JLabel lblProductCategory;
    private javax.swing.JLabel lblProductDescription;
    private javax.swing.JLabel lblProductId;
    private javax.swing.JLabel lblProductImage;
    private javax.swing.JLabel lblProductModel;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblProductPrice;
    private javax.swing.JLabel lblProductSearchField;
    private javax.swing.JLabel lblProductStock;
    private javax.swing.JLabel lblProductSubCategory;
    private javax.swing.JLabel lblProductWarrantHelp;
    private javax.swing.JLabel lblProductWarranty;
    private javax.swing.JLabel lblSubCategoryId;
    private javax.swing.JLabel lblSubCategoryName;
    private javax.swing.JPanel panelBrandRegister;
    private javax.swing.JPanel panelBrandSearch;
    private javax.swing.JPanel panelCategoryRegister;
    private javax.swing.JPanel panelCategorySearch;
    private javax.swing.JPanel panelProductRegister;
    private javax.swing.JPanel panelProductSearch;
    private javax.swing.JPanel panelSubCategoryRegister;
    private javax.swing.JPanel panelSubCategorySearch;
    private javax.swing.JScrollPane scrollBrand;
    private javax.swing.JScrollPane scrollCategory;
    private javax.swing.JScrollPane scrollProduct;
    private javax.swing.JScrollPane scrollSubCategory;
    private javax.swing.JTabbedPane tabBrand;
    private javax.swing.JPanel tabBrandList;
    private javax.swing.JPanel tabBrandRegister;
    private javax.swing.JTabbedPane tabCategory;
    private javax.swing.JPanel tabCategoryList;
    private javax.swing.JPanel tabCategoryRegister;
    private javax.swing.JTabbedPane tabMainProduct;
    private javax.swing.JTabbedPane tabProduct;
    private javax.swing.JPanel tabProductList;
    private javax.swing.JPanel tabProductRegister;
    private javax.swing.JTabbedPane tabSubCategory;
    private javax.swing.JPanel tabSubCategoryList;
    private javax.swing.JPanel tabSubCategoryRegister;
    private javax.swing.JTable tableBrandSearch;
    private javax.swing.JTable tableCategorySearch;
    private javax.swing.JTable tableProductSearch;
    private javax.swing.JTable tableSubCategorySearch;
    private javax.swing.JTextField txtBrandId;
    private javax.swing.JTextField txtBrandName;
    private javax.swing.JTextField txtBrandSearchField;
    private javax.swing.JTextField txtCategoryId;
    private javax.swing.JTextField txtCategoryName;
    private javax.swing.JTextField txtCategorySearchField;
    private javax.swing.JTextField txtProductBarcode;
    private javax.swing.JTextField txtProductDescription;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtProductModel;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JFormattedTextField txtProductPrice;
    private javax.swing.JTextField txtProductSearchField;
    private javax.swing.JTextField txtProductStock;
    private javax.swing.JTextField txtProductWarranty;
    private javax.swing.JTextField txtSubCategoryId;
    private javax.swing.JTextField txtSubCategoryName;
    private javax.swing.JTextField txtSubCategorySearchField;
    // End of variables declaration//GEN-END:variables
}
