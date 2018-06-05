package br.com.store.view;

import br.com.store.model.enums.FormOperationEnum;

public class PanelSellCreateUpdate extends javax.swing.JPanel {

    public PanelSellCreateUpdate() {
        initComponents();

    }

    public PanelSellCreateUpdate(FormOperationEnum formOperationEnum, Integer id) {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSell = new javax.swing.JPanel();
        lblPanelTitle = new javax.swing.JLabel();
        panelSellAll = new javax.swing.JPanel();
        btnSellSearchCustomer = new javax.swing.JButton();
        txtSellCustomer = new javax.swing.JTextField();
        lblSellCustomer = new javax.swing.JLabel();
        scrollSell = new javax.swing.JScrollPane();
        tableSell = new javax.swing.JTable();
        lblSellSeller = new javax.swing.JLabel();
        cbSellSeller = new javax.swing.JComboBox<>();
        lblSellPaymentTerms = new javax.swing.JLabel();
        cbSellPaymentTerms = new javax.swing.JComboBox<>();
        txtSellDiscount = new javax.swing.JTextField();
        lblSellDiscount = new javax.swing.JLabel();
        txtSellPriceTotal = new javax.swing.JTextField();
        lblSellPriceTotal = new javax.swing.JLabel();
        panelSellProduct = new javax.swing.JPanel();
        txtSellBarcode = new javax.swing.JTextField();
        lblSellBarcode = new javax.swing.JLabel();
        lblSellOr = new javax.swing.JLabel();
        txtSellProductName = new javax.swing.JTextField();
        lblSellProductName = new javax.swing.JLabel();
        panelSellProductFound = new javax.swing.JPanel();
        txtSellProductNameFound = new javax.swing.JTextField();
        txtSellProductQt = new javax.swing.JTextField();
        lblSellProductQt = new javax.swing.JLabel();
        txtSellProductPriceUnit = new javax.swing.JTextField();
        lblSellProductPriceUnit = new javax.swing.JLabel();
        txtSellProductPriceTotal = new javax.swing.JTextField();
        lblSellProductPriceTotal = new javax.swing.JLabel();
        btnSellProductAdd = new javax.swing.JButton();
        btnSellProductDelete = new javax.swing.JButton();
        btnSellProductFinalize = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        panelSell.setBackground(new java.awt.Color(255, 255, 255));

        lblPanelTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblPanelTitle.setText("Vendas - Nova");

        panelSellAll.setBackground(new java.awt.Color(255, 255, 255));

        btnSellSearchCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/search.png"))); // NOI18N

        txtSellCustomer.setEditable(false);

        lblSellCustomer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSellCustomer.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSellCustomer.setText("Cliente");

        tableSell.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Código de Barras", "Produto", "Qtd.", "R$ Unit.", "R$ Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableSell.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tableSell.setRowHeight(25);
        tableSell.setUpdateSelectionOnSort(false);
        scrollSell.setViewportView(tableSell);

        lblSellSeller.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSellSeller.setText("Vendedor");

        cbSellSeller.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblSellPaymentTerms.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSellPaymentTerms.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSellPaymentTerms.setText("Forma de Pagamento");

        cbSellPaymentTerms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtSellDiscount.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txtSellDiscount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSellDiscount.setText("0,00");

        lblSellDiscount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSellDiscount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSellDiscount.setText("Desconto");

        txtSellPriceTotal.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txtSellPriceTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSellPriceTotal.setText("0,00");

        lblSellPriceTotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSellPriceTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSellPriceTotal.setText("Valor Total");

        panelSellProduct.setBackground(new java.awt.Color(255, 255, 255));

        lblSellBarcode.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSellBarcode.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSellBarcode.setText("Código de Barras");

        lblSellOr.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSellOr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSellOr.setText("OU");
        lblSellOr.setToolTipText("");

        lblSellProductName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSellProductName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSellProductName.setText("Nome");

        panelSellProductFound.setBackground(new java.awt.Color(255, 255, 255));
        panelSellProductFound.setBorder(javax.swing.BorderFactory.createTitledBorder("Produto Encontrado"));

        txtSellProductNameFound.setEditable(false);
        txtSellProductNameFound.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtSellProductNameFound.setText("PRODUTO");

        javax.swing.GroupLayout panelSellProductFoundLayout = new javax.swing.GroupLayout(panelSellProductFound);
        panelSellProductFound.setLayout(panelSellProductFoundLayout);
        panelSellProductFoundLayout.setHorizontalGroup(
            panelSellProductFoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSellProductNameFound)
        );
        panelSellProductFoundLayout.setVerticalGroup(
            panelSellProductFoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSellProductNameFound, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        txtSellProductQt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtSellProductQt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSellProductQt.setText("0,00");

        lblSellProductQt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSellProductQt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSellProductQt.setText("Quantidade");

        txtSellProductPriceUnit.setEditable(false);
        txtSellProductPriceUnit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtSellProductPriceUnit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSellProductPriceUnit.setText("0,00");

        lblSellProductPriceUnit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSellProductPriceUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSellProductPriceUnit.setText("R$ Unitário");

        txtSellProductPriceTotal.setEditable(false);
        txtSellProductPriceTotal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtSellProductPriceTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSellProductPriceTotal.setText("0,00");

        lblSellProductPriceTotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSellProductPriceTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSellProductPriceTotal.setText("R$ Total");

        btnSellProductAdd.setText("Adicionar Produto");

        btnSellProductDelete.setText("Excluir");
        btnSellProductDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellProductDeleteActionPerformed(evt);
            }
        });

        btnSellProductFinalize.setText("Finalizar");

        javax.swing.GroupLayout panelSellProductLayout = new javax.swing.GroupLayout(panelSellProduct);
        panelSellProduct.setLayout(panelSellProductLayout);
        panelSellProductLayout.setHorizontalGroup(
            panelSellProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSellProductLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSellProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSellProductLayout.createSequentialGroup()
                        .addGroup(panelSellProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSellBarcode)
                            .addComponent(lblSellProductName))
                        .addGap(118, 118, 118))
                    .addGroup(panelSellProductLayout.createSequentialGroup()
                        .addGroup(panelSellProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelSellProductFound, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSellOr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSellBarcode)
                            .addComponent(txtSellProductName)
                            .addComponent(btnSellProductAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelSellProductLayout.createSequentialGroup()
                                .addComponent(btnSellProductDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(btnSellProductFinalize, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(panelSellProductLayout.createSequentialGroup()
                        .addGroup(panelSellProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSellProductQt)
                            .addComponent(txtSellProductQt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSellProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSellProductPriceUnit)
                            .addComponent(txtSellProductPriceUnit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSellProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSellProductPriceTotal)
                            .addComponent(txtSellProductPriceTotal))
                        .addGap(10, 10, 10))))
        );

        panelSellProductLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSellProductDelete, btnSellProductFinalize});

        panelSellProductLayout.setVerticalGroup(
            panelSellProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSellProductLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblSellBarcode)
                .addGap(0, 0, 0)
                .addComponent(txtSellBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSellOr)
                .addGap(0, 0, 0)
                .addGroup(panelSellProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelSellProductLayout.createSequentialGroup()
                        .addComponent(lblSellProductName)
                        .addGap(0, 0, 0)
                        .addComponent(txtSellProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelSellProductFound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSellProductQt)
                        .addGap(0, 0, 0)
                        .addComponent(txtSellProductQt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSellProductLayout.createSequentialGroup()
                        .addComponent(lblSellProductPriceUnit)
                        .addGap(0, 0, 0)
                        .addGroup(panelSellProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSellProductPriceUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSellProductPriceTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelSellProductLayout.createSequentialGroup()
                        .addComponent(lblSellProductPriceTotal)
                        .addGap(41, 41, 41)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSellProductAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(panelSellProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSellProductDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSellProductFinalize, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        panelSellProductLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnSellProductDelete, btnSellProductFinalize});

        javax.swing.GroupLayout panelSellAllLayout = new javax.swing.GroupLayout(panelSellAll);
        panelSellAll.setLayout(panelSellAllLayout);
        panelSellAllLayout.setHorizontalGroup(
            panelSellAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSellAllLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSellAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSellAllLayout.createSequentialGroup()
                        .addComponent(lblSellCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSellCustomer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSellSearchCustomer))
                    .addGroup(panelSellAllLayout.createSequentialGroup()
                        .addGroup(panelSellAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSellDiscount)
                            .addComponent(txtSellDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSellAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSellPriceTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSellPriceTotal)))
                    .addComponent(scrollSell))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSellAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSellProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelSellAllLayout.createSequentialGroup()
                        .addComponent(lblSellSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSellSeller, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSellPaymentTerms, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSellPaymentTerms, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        panelSellAllLayout.setVerticalGroup(
            panelSellAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSellAllLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(panelSellAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSellSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelSellAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSellCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSellCustomer))
                    .addGroup(panelSellAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSellSeller)
                        .addComponent(cbSellSeller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSellPaymentTerms)
                        .addComponent(cbSellPaymentTerms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(panelSellAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelSellAllLayout.createSequentialGroup()
                        .addComponent(scrollSell, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSellAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSellDiscount)
                            .addComponent(lblSellPriceTotal))
                        .addGap(0, 0, 0)
                        .addGroup(panelSellAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtSellPriceTotal)
                            .addComponent(txtSellDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelSellProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelSellLayout = new javax.swing.GroupLayout(panelSell);
        panelSell.setLayout(panelSellLayout);
        panelSellLayout.setHorizontalGroup(
            panelSellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSellAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelSellLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(118, 118, 118))
        );
        panelSellLayout.setVerticalGroup(
            panelSellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSellLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPanelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSellAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSellProductDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellProductDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSellProductDeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSellProductAdd;
    private javax.swing.JButton btnSellProductDelete;
    private javax.swing.JButton btnSellProductFinalize;
    private javax.swing.JButton btnSellSearchCustomer;
    private javax.swing.JComboBox<String> cbSellPaymentTerms;
    private javax.swing.JComboBox<String> cbSellSeller;
    private javax.swing.JLabel lblPanelTitle;
    private javax.swing.JLabel lblSellBarcode;
    private javax.swing.JLabel lblSellCustomer;
    private javax.swing.JLabel lblSellDiscount;
    private javax.swing.JLabel lblSellOr;
    private javax.swing.JLabel lblSellPaymentTerms;
    private javax.swing.JLabel lblSellPriceTotal;
    private javax.swing.JLabel lblSellProductName;
    private javax.swing.JLabel lblSellProductPriceTotal;
    private javax.swing.JLabel lblSellProductPriceUnit;
    private javax.swing.JLabel lblSellProductQt;
    private javax.swing.JLabel lblSellSeller;
    private javax.swing.JPanel panelSell;
    private javax.swing.JPanel panelSellAll;
    private javax.swing.JPanel panelSellProduct;
    private javax.swing.JPanel panelSellProductFound;
    private javax.swing.JScrollPane scrollSell;
    private javax.swing.JTable tableSell;
    private javax.swing.JTextField txtSellBarcode;
    private javax.swing.JTextField txtSellCustomer;
    private javax.swing.JTextField txtSellDiscount;
    private javax.swing.JTextField txtSellPriceTotal;
    private javax.swing.JTextField txtSellProductName;
    private javax.swing.JTextField txtSellProductNameFound;
    private javax.swing.JTextField txtSellProductPriceTotal;
    private javax.swing.JTextField txtSellProductPriceUnit;
    private javax.swing.JTextField txtSellProductQt;
    // End of variables declaration//GEN-END:variables

}
