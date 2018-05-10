package br.com.store.view;

import br.com.store.exception.DataSourceException;
import br.com.store.exception.ProductException;
import br.com.store.model.Brand;
import br.com.store.model.Category;
import br.com.store.model.Product;
import br.com.store.model.SubCategory;
import br.com.store.service.ServiceBrand;
import br.com.store.service.ServiceCategory;
import br.com.store.service.ServiceProduct;
import br.com.store.service.ServiceSubCategory;
import br.com.store.utils.FormUtils;
import br.com.store.utils.Util;
import java.awt.image.BufferedImage;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class PanelProductAdd extends javax.swing.JPanel {

    public PanelProductAdd() {
        initComponents();
        loadBrand();
        loadCategory();
        loadSubCategory();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelProductRegister = new javax.swing.JPanel();
        lblProductName = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        lblProductBrand = new javax.swing.JLabel();
        cbProductBrand = new javax.swing.JComboBox<>();
        lblProductId = new javax.swing.JLabel();
        txtProductId = new javax.swing.JTextField();
        txtProductBarcode = new javax.swing.JTextField();
        lblProductBarcode = new javax.swing.JLabel();
        lblProductPicture = new javax.swing.JLabel();
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
        btnProductRefreshCategory = new javax.swing.JButton();
        btnProductRefreshBrand = new javax.swing.JButton();
        btnProductRefreshSubCategory = new javax.swing.JButton();
        txtProductDescription = new javax.swing.JTextField();
        lblProductDescription = new javax.swing.JLabel();
        btnProductPicture = new javax.swing.JButton();
        btnProductFinalize = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        panelProductRegister.setBackground(new java.awt.Color(255, 255, 255));
        panelProductRegister.setBorder(javax.swing.BorderFactory.createTitledBorder("Produto"));

        lblProductName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductName.setText("Nome");

        lblProductBrand.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductBrand.setText("Marca");

        cbProductBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblProductId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductId.setText("Código");

        lblProductBarcode.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductBarcode.setText("Código de Barras");

        lblProductPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProductPicture.setText("Foto");
        lblProductPicture.setBorder(javax.swing.BorderFactory.createTitledBorder("Foto"));

        cbProductCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblProductCategory.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductCategory.setText("Categoria");

        lblProductSubCategory.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductSubCategory.setText("Sub Categoria");

        cbProductSubCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblProductWarranty.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductWarranty.setText("Garantia");

        lblProductWarrantHelp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblProductWarrantHelp.setText("meses");

        lblProductModel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductModel.setText("Modelo");

        lblProductPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductPrice.setText("Preço");

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
                        .addGroup(panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblProductId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblProductBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProductName)
                            .addGroup(panelProductRegisterLayout.createSequentialGroup()
                                .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblProductBarcode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProductBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 228, Short.MAX_VALUE))
                            .addGroup(panelProductRegisterLayout.createSequentialGroup()
                                .addComponent(cbProductBrand, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProductRefreshBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelProductRegisterLayout.createSequentialGroup()
                        .addGroup(panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductModel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProductRegisterLayout.createSequentialGroup()
                                .addComponent(txtProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblProductStock)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProductStock, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblProductWarranty)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProductWarranty, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblProductWarrantHelp)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtProductDescription)
                            .addComponent(txtProductModel, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblProductPicture, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(btnProductPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelProductRegisterLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblProductBrand, lblProductCategory, lblProductId, lblProductName, lblProductPrice, lblProductSubCategory});

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
                        .addGroup(panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnProductRefreshBrand, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbProductBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblProductBrand)))
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
                            .addComponent(txtProductModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductModel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtProductWarranty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblProductWarranty)
                                .addComponent(lblProductWarrantHelp))
                            .addGroup(panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblProductPrice)
                                .addComponent(txtProductStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblProductStock)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProductDescription)
                            .addGroup(panelProductRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtProductDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnProductPicture))))
                    .addComponent(lblProductPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnProductFinalize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/save.png"))); // NOI18N
        btnProductFinalize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductFinalizeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Produto - Novo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelProductRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnProductFinalize, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelProductRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProductFinalize, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductFinalizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductFinalizeActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja cadastrar uma novo produto?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.NO_OPTION) {
            return;
        }

        // get image from label icon
        Icon icon = lblProductPicture.getIcon();
        BufferedImage image = new BufferedImage(icon.getIconWidth(),
                icon.getIconHeight(), BufferedImage.TYPE_INT_RGB);

        Product product = new Product();
        product.setName(txtProductName.getText());
        product.setBarcode(txtProductBarcode.getText());
        product.setDescription(txtProductDescription.getText());
        product.setWarranty(Util.parseInteger(txtProductWarranty.getText()));
        product.setModel(txtProductModel.getText());
        product.setPicture(FormUtils.getImgBytes(image));
        product.setStock(Util.parseInteger(txtProductStock.getText()));
        product.setPrice(Util.parseFloat(txtProductPrice.getText()));
        product.setCategory((Category) cbProductCategory.getSelectedItem());
        product.setSubCategory((SubCategory) cbProductSubCategory.getSelectedItem());
        product.setBrand((Brand) cbProductBrand.getSelectedItem());

        try {
            ServiceProduct.getInstance().insert(product);
        } catch (DataSourceException | ProductException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso",
                "Cadastro efetuado", JOptionPane.INFORMATION_MESSAGE);


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

    private void loadBrand() {
        FormUtils.clearComboBox(cbProductBrand);
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

        FormUtils.setModelComboBox(cbProductBrand, list);
    }

    private void loadCategory() {
        FormUtils.clearComboBox(cbProductCategory);
        List<Category> list = null;
        try {
            list = ServiceCategory.getInstance().list();
        } catch (DataSourceException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }

        if (list == null) {
            return;
        }

        FormUtils.setModelComboBox(cbProductCategory, list);
    }

    private void loadSubCategory() {
        FormUtils.clearComboBox(cbProductSubCategory);
        List<SubCategory> list = null;
        try {
            list = ServiceSubCategory.getInstance().list();
        } catch (DataSourceException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }

        if (list == null) {
            return;
        }

        FormUtils.setModelComboBox(cbProductSubCategory, list);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblProductBarcode;
    private javax.swing.JLabel lblProductBrand;
    private javax.swing.JLabel lblProductCategory;
    private javax.swing.JLabel lblProductDescription;
    private javax.swing.JLabel lblProductId;
    private javax.swing.JLabel lblProductModel;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblProductPicture;
    private javax.swing.JLabel lblProductPrice;
    private javax.swing.JLabel lblProductStock;
    private javax.swing.JLabel lblProductSubCategory;
    private javax.swing.JLabel lblProductWarrantHelp;
    private javax.swing.JLabel lblProductWarranty;
    private javax.swing.JPanel panelProductRegister;
    private javax.swing.JTextField txtProductBarcode;
    private javax.swing.JTextField txtProductDescription;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtProductModel;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JFormattedTextField txtProductPrice;
    private javax.swing.JTextField txtProductStock;
    private javax.swing.JTextField txtProductWarranty;
    // End of variables declaration//GEN-END:variables
}
