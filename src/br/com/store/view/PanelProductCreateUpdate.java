package br.com.store.view;

import br.com.store.exception.DataSourceException;
import br.com.store.exception.ProductException;
import br.com.store.model.Brand;
import br.com.store.model.Category;
import br.com.store.model.Product;
import br.com.store.model.SubCategory;
import br.com.store.model.enums.FormOperationEnum;
import br.com.store.service.ServiceBrand;
import br.com.store.service.ServiceCategory;
import br.com.store.service.ServiceProduct;
import br.com.store.service.ServiceSubCategory;
import br.com.store.utils.FormUtil;
import br.com.store.utils.ImageUtil;
import br.com.store.utils.DataUtil;
import br.com.store.view.main.FrameMain;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PanelProductCreateUpdate extends javax.swing.JPanel {

    private FormOperationEnum operation = null;
    private Integer productId = null;
    BufferedImage image;

    public PanelProductCreateUpdate() {
        initComponents();
        loadBrand();
        loadCategory();
        loadSubCategory();

    }

    public PanelProductCreateUpdate(FormOperationEnum op, Integer id) {
        initComponents();
        loadBrand();
        loadCategory();
        loadSubCategory();
        prepareFormOperation(op, id);
    }

    private void prepareFormOperation(FormOperationEnum op, Integer id) {
        this.operation = op;
        this.productId = id;
        if (this.operation == FormOperationEnum.CREATE) {
            lblPanelTitle.setText("Produto - Novo");
        } else {
            lblPanelTitle.setText("Produto - Alteração");
            loadProduct(productId);
        }
    }

    void loadProduct(Integer id) {
        Product p;
        try {
            p = ServiceProduct.getInstance().get(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        productId = p.getId();
        txtProductName.setText(p.getName());
        txtProductBarcode.setText(p.getBarcode());
        txtProductDescription.setText(p.getDescription());
        txtProductWarranty.setText(p.getWarranty().toString());
        txtProductModel.setText(p.getModel());
        if (p.getPicture() != null) {

            ImageUtil.setImageLabel(p.getPicture(), lblProductPicture);
            ImageIcon icon = (ImageIcon) lblProductPicture.getIcon();
            image = (BufferedImage) ((Image) icon.getImage());

        }
        txtProductStock.setText(p.getStock().toString());
        txtProductPrice.setText(p.getPrice().toString().replace(".", ","));
        JComboBox cbTemp = null;
        // seleciona no cb
        cbTemp = cbProductCategory;
        cbTemp.setSelectedIndex(0);
        for (int i = 1; i < cbTemp.getItemCount(); i++) {
            Category cbSelectedItem = (Category) cbTemp.getSelectedItem();
            if (cbSelectedItem.getId() == p.getCategory().getId()) {
                cbTemp.setSelectedItem(cbSelectedItem);
                continue;
            }
            cbTemp.setSelectedIndex(i);
        }

        // seleciona no cb
        cbTemp = cbProductSubCategory;
        cbTemp.setSelectedIndex(0);
        for (int i = 1; i < cbTemp.getItemCount(); i++) {
            SubCategory cbSelectedItem = (SubCategory) cbTemp.getSelectedItem();
            if (cbSelectedItem.getId() == p.getSubCategory().getId()) {
                cbTemp.setSelectedItem(cbSelectedItem);
                continue;
            }
            cbTemp.setSelectedIndex(i);
        }

        // seleciona no cb
        cbTemp = cbProductBrand;
        cbTemp.setSelectedIndex(0);
        for (int i = 1; i < cbTemp.getItemCount(); i++) {
            Brand cbSelectedItem = (Brand) cbTemp.getSelectedItem();
            if (cbSelectedItem.getId() == p.getBrand().getId()) {
                cbTemp.setSelectedItem(cbSelectedItem);
                continue;
            }
            cbTemp.setSelectedIndex(i);
        }

        lblProductPicture.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelProduct = new javax.swing.JPanel();
        lblProductName = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        lblProductBrand = new javax.swing.JLabel();
        cbProductBrand = new javax.swing.JComboBox<>();
        txtProductBarcode = new javax.swing.JTextField();
        lblProductBarcode = new javax.swing.JLabel();
        lblProductPicture = new javax.swing.JLabel();
        cbProductCategory = new javax.swing.JComboBox<>();
        lblProductCategory = new javax.swing.JLabel();
        lblProductSubCategory = new javax.swing.JLabel();
        cbProductSubCategory = new javax.swing.JComboBox<>();
        lblProductWarranty = new javax.swing.JLabel();
        lblProductWarrantHelp = new javax.swing.JLabel();
        lblProductModel = new javax.swing.JLabel();
        txtProductModel = new javax.swing.JTextField();
        txtProductPrice = new javax.swing.JFormattedTextField();
        lblProductPrice = new javax.swing.JLabel();
        lblProductStock = new javax.swing.JLabel();
        btnProductRefreshCategory = new javax.swing.JButton();
        btnProductRefreshBrand = new javax.swing.JButton();
        btnProductRefreshSubCategory = new javax.swing.JButton();
        lblProductDescription = new javax.swing.JLabel();
        btnProductPicture = new javax.swing.JButton();
        scrollProductDescription = new javax.swing.JScrollPane();
        txtProductDescription = new javax.swing.JTextArea();
        txtProductStock = new javax.swing.JFormattedTextField();
        txtProductWarranty = new javax.swing.JFormattedTextField();
        btnProductFinalize = new javax.swing.JButton();
        lblPanelTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        panelProduct.setBackground(new java.awt.Color(255, 255, 255));
        panelProduct.setBorder(javax.swing.BorderFactory.createTitledBorder("Produto"));

        lblProductName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblProductName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductName.setText("Nome");

        txtProductName.setColumns(45);
        txtProductName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                maxLenght(evt);
            }
        });

        lblProductBrand.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblProductBrand.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductBrand.setText("Marca");

        cbProductBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtProductBarcode.setColumns(13);
        txtProductBarcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                maxLenght(evt);
            }
        });

        lblProductBarcode.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblProductBarcode.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductBarcode.setText("Cód. de Barras");

        lblProductPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProductPicture.setText("Selecione uma foto");
        lblProductPicture.setBorder(javax.swing.BorderFactory.createTitledBorder("Foto"));
        lblProductPicture.setName("ProductPicture"); // NOI18N

        cbProductCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblProductCategory.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblProductCategory.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductCategory.setText("Categoria");

        lblProductSubCategory.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblProductSubCategory.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductSubCategory.setText("Sub Categoria");

        cbProductSubCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblProductWarranty.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductWarranty.setText("Garantia");

        lblProductWarrantHelp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblProductWarrantHelp.setText("meses");

        lblProductModel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductModel.setText("Modelo");

        txtProductModel.setColumns(45);
        txtProductModel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                maxLenght(evt);
            }
        });

        txtProductPrice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        lblProductPrice.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblProductPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductPrice.setText("Preço");

        lblProductStock.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblProductStock.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductStock.setText("Estoque");

        btnProductRefreshCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/refresh.png"))); // NOI18N
        btnProductRefreshCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductRefreshCategoryActionPerformed(evt);
            }
        });

        btnProductRefreshBrand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/refresh.png"))); // NOI18N
        btnProductRefreshBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductRefreshBrandActionPerformed(evt);
            }
        });

        btnProductRefreshSubCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/refresh.png"))); // NOI18N
        btnProductRefreshSubCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductRefreshSubCategoryActionPerformed(evt);
            }
        });

        lblProductDescription.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductDescription.setText("Descrição");

        btnProductPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/search.png"))); // NOI18N
        btnProductPicture.setText("Procurar");
        btnProductPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductPictureActionPerformed(evt);
            }
        });

        txtProductDescription.setColumns(20);
        txtProductDescription.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        txtProductDescription.setRows(5);
        scrollProductDescription.setViewportView(txtProductDescription);

        txtProductStock.setColumns(9);
        txtProductStock.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtProductStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                maxLenght(evt);
            }
        });

        txtProductWarranty.setColumns(4);
        txtProductWarranty.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtProductWarranty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                maxLenght(evt);
            }
        });

        javax.swing.GroupLayout panelProductLayout = new javax.swing.GroupLayout(panelProduct);
        panelProduct.setLayout(panelProductLayout);
        panelProductLayout.setHorizontalGroup(
            panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProductLayout.createSequentialGroup()
                        .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProductSubCategory)
                            .addComponent(lblProductCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbProductCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbProductSubCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnProductRefreshCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProductRefreshSubCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProductLayout.createSequentialGroup()
                        .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductBarcode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProductLayout.createSequentialGroup()
                                .addComponent(cbProductBrand, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProductRefreshBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtProductName, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                            .addComponent(txtProductBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelProductLayout.createSequentialGroup()
                        .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductModel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProductModel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelProductLayout.createSequentialGroup()
                                .addComponent(txtProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblProductStock)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProductStock, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblProductWarranty)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProductWarranty, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblProductWarrantHelp)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(scrollProductDescription))))
                .addGap(18, 18, 18)
                .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblProductPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProductPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelProductLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblProductBrand, lblProductCategory, lblProductName, lblProductPrice, lblProductSubCategory});

        panelProductLayout.setVerticalGroup(
            panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductLayout.createSequentialGroup()
                .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductBarcode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProductLayout.createSequentialGroup()
                        .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnProductRefreshBrand, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbProductBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblProductBrand)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbProductCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductCategory)
                            .addComponent(btnProductRefreshCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbProductSubCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductSubCategory)
                            .addComponent(btnProductRefreshSubCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProductModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductModel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductPrice)
                            .addComponent(lblProductStock)
                            .addComponent(lblProductWarranty)
                            .addComponent(lblProductWarrantHelp)
                            .addComponent(txtProductStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProductWarranty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProductLayout.createSequentialGroup()
                                .addComponent(lblProductDescription)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(scrollProductDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)))
                    .addGroup(panelProductLayout.createSequentialGroup()
                        .addComponent(lblProductPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(btnProductPicture)))
                .addContainerGap())
        );

        panelProductLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtProductBarcode, txtProductName});

        btnProductFinalize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/save.png"))); // NOI18N
        btnProductFinalize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductFinalizeActionPerformed(evt);
            }
        });

        lblPanelTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblPanelTitle.setText("Produto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnProductFinalize, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPanelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProductFinalize, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductFinalizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductFinalizeActionPerformed
        String temp = "", temp2 = "";
        if (operation == FormOperationEnum.CREATE) {
            temp = "cadastrar";
            temp2 = "cadastrado";
        } else {
            temp = "alterar";
            temp2 = "alterado";
        }

        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja " + temp + " um produto?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.NO_OPTION) {
            return;
        }

        Product product = new Product();
        product.setId(productId);
        product.setName(txtProductName.getText());
        product.setBarcode(txtProductBarcode.getText());
        product.setDescription(txtProductDescription.getText());
        product.setWarranty(DataUtil.parseInteger(txtProductWarranty.getText()));
        product.setModel(txtProductModel.getText());
        if (lblProductPicture.getIcon() == null || image == null) {
            product.setPicture(null);
        } else {
            product.setPicture(ImageUtil.getByteArray(image));
        }
        product.setStock(DataUtil.parseInteger(txtProductStock.getText()));
        product.setPrice(DataUtil.parseFloat(txtProductPrice.getText().replace(",", ".")));
        product.setCategory((Category) cbProductCategory.getSelectedItem());
        product.setSubCategory((SubCategory) cbProductSubCategory.getSelectedItem());
        product.setBrand((Brand) cbProductBrand.getSelectedItem());

        try {
            if (operation == FormOperationEnum.CREATE) {
                ServiceProduct.getInstance().insert(product);
            } else {
                ServiceProduct.getInstance().update(product);
            }
        } catch (DataSourceException | ProductException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Produto " + temp2 + " com sucesso",
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        if (operation == FormOperationEnum.CREATE) {
            FrameMain.loadCardProductCreate(true);
            FrameMain.loadCardProductList(false);
        } else {
            FrameMain.loadCardProductList(true);
        }
    }//GEN-LAST:event_btnProductFinalizeActionPerformed

    private void btnProductRefreshBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductRefreshBrandActionPerformed
        loadBrand();
    }//GEN-LAST:event_btnProductRefreshBrandActionPerformed

    private void btnProductRefreshCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductRefreshCategoryActionPerformed
        loadCategory();
    }//GEN-LAST:event_btnProductRefreshCategoryActionPerformed

    private void btnProductRefreshSubCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductRefreshSubCategoryActionPerformed
        loadSubCategory();
    }//GEN-LAST:event_btnProductRefreshSubCategoryActionPerformed

    private void btnProductPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductPictureActionPerformed
        lblProductPicture.setText("");
        JFileChooser fc = new JFileChooser();
        fc.setFileView(new ImageFileView());
        fc.setAccessory(new ImagePreview(fc));
        fc.setAcceptAllFileFilterUsed(false);
        fc.setFileFilter(new FileNameExtensionFilter("Imagens", ImageIO.getReaderFileSuffixes()));
        int res = fc.showOpenDialog(null);

        if (res == JFileChooser.APPROVE_OPTION) {
            File arquivo = fc.getSelectedFile();
            try {
                image = ImageUtil.transformPathToBuffered(
                        arquivo.getAbsolutePath(),
                        lblProductPicture.getWidth(),
                        lblProductPicture.getHeight()
                );
                lblProductPicture.setIcon(new ImageIcon(image));
            } catch (Exception ex) {
                // System.out.println(ex.printStackTrace().toString());
                JOptionPane.showMessageDialog(this, "Falha ao carregar a imagem",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Voce não selecionou o arquivo.");
        }
    }//GEN-LAST:event_btnProductPictureActionPerformed

    private void maxLenght(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_maxLenght
        FormUtil.maxLenghtTextField((JTextField) evt.getSource(), evt);
    }//GEN-LAST:event_maxLenght

    private void loadBrand() {
        FormUtil.clearComboBox(cbProductBrand);
        List<Brand> list = null;
        try {
            list = ServiceBrand.getInstance().list();
        } catch (DataSourceException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }

        if (list == null) {
            return;
        }

        FormUtil.setModelComboBox(cbProductBrand, list);
    }

    private void loadCategory() {
        FormUtil.clearComboBox(cbProductCategory);
        List<Category> list = null;
        try {
            list = ServiceCategory.getInstance().list();
        } catch (DataSourceException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (list == null) {
            return;
        }

        FormUtil.setModelComboBox(cbProductCategory, list);
    }

    private void loadSubCategory() {
        FormUtil.clearComboBox(cbProductSubCategory);
        List<SubCategory> list = null;
        try {
            list = ServiceSubCategory.getInstance().list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (list == null) {
            return;
        }

        FormUtil.setModelComboBox(cbProductSubCategory, list);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProductFinalize;
    private javax.swing.JButton btnProductPicture;
    private javax.swing.JButton btnProductRefreshBrand;
    private javax.swing.JButton btnProductRefreshCategory;
    private javax.swing.JButton btnProductRefreshSubCategory;
    private javax.swing.JComboBox<String> cbProductBrand;
    private javax.swing.JComboBox<String> cbProductCategory;
    private javax.swing.JComboBox<String> cbProductSubCategory;
    private javax.swing.JLabel lblPanelTitle;
    private javax.swing.JLabel lblProductBarcode;
    private javax.swing.JLabel lblProductBrand;
    private javax.swing.JLabel lblProductCategory;
    private javax.swing.JLabel lblProductDescription;
    private javax.swing.JLabel lblProductModel;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblProductPicture;
    private javax.swing.JLabel lblProductPrice;
    private javax.swing.JLabel lblProductStock;
    private javax.swing.JLabel lblProductSubCategory;
    private javax.swing.JLabel lblProductWarrantHelp;
    private javax.swing.JLabel lblProductWarranty;
    private javax.swing.JPanel panelProduct;
    private javax.swing.JScrollPane scrollProductDescription;
    private javax.swing.JTextField txtProductBarcode;
    private javax.swing.JTextArea txtProductDescription;
    private javax.swing.JTextField txtProductModel;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JFormattedTextField txtProductPrice;
    private javax.swing.JFormattedTextField txtProductStock;
    private javax.swing.JFormattedTextField txtProductWarranty;
    // End of variables declaration//GEN-END:variables
}
