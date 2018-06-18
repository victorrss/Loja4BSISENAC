package br.com.store.view;

import br.com.store.model.Customer;
import br.com.store.model.PaymentTerms;
import br.com.store.model.Product;
import br.com.store.model.Sale;
import br.com.store.model.SaleProduct;
import br.com.store.model.Seller;
import br.com.store.model.enums.FormOperationEnum;
import br.com.store.model.enums.ProductSearchTypeEnum;
import br.com.store.service.ServicePaymentTerms;
import br.com.store.service.ServiceSale;
import br.com.store.service.ServiceSeller;
import br.com.store.utils.DataUtil;
import br.com.store.utils.FormUtil;
import br.com.store.view.main.FrameMain;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class PanelSellCreateUpdate extends javax.swing.JPanel {

    private static Customer customerSelected;
    private static Product productSelected;
    private static ArrayList<SaleProduct> saleProducts = new ArrayList<>();
    FrameSellSelectCustomer frmSelectCustomer = null;
    FrameSellSelectProduct frmSelectProduct = null;

    public PanelSellCreateUpdate() {
        initComponents();
    }

    public PanelSellCreateUpdate(FormOperationEnum formOperationEnum, Integer id) {
        initComponents();
        loadSeller();
        loadPaymentTerms();
        customerSelected = null;
        productSelected = null;
        saleProducts = new ArrayList<>();

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
        lblSellProductQt = new javax.swing.JLabel();
        txtSellProductPriceUnit = new javax.swing.JTextField();
        lblSellProductPriceUnit = new javax.swing.JLabel();
        txtSellProductPriceTotal = new javax.swing.JTextField();
        lblSellProductPriceTotal = new javax.swing.JLabel();
        btnSellProductAdd = new javax.swing.JButton();
        btnSellProductDelete = new javax.swing.JButton();
        btnSellProductFinalize = new javax.swing.JButton();
        txtSellProductQt = new javax.swing.JFormattedTextField();
        txtSellDiscount = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        panelSell.setBackground(new java.awt.Color(255, 255, 255));

        lblPanelTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblPanelTitle.setText("Vendas - Nova");

        panelSellAll.setBackground(new java.awt.Color(255, 255, 255));

        btnSellSearchCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/search.png"))); // NOI18N
        btnSellSearchCustomer.setToolTipText("Selecione um cliente");
        btnSellSearchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellSearchCustomerActionPerformed(evt);
            }
        });

        txtSellCustomer.setEditable(false);
        txtSellCustomer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblSellCustomer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSellCustomer.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSellCustomer.setText("Cliente");

        tableSell.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código de Barras", "Produto", "Qtd.", "R$ Unit.", "R$ Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
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

        lblSellSeller.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSellSeller.setText("Vendedor");

        cbSellSeller.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbSellSeller.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblSellPaymentTerms.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSellPaymentTerms.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSellPaymentTerms.setText("Forma de Pagamento");

        cbSellPaymentTerms.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbSellPaymentTerms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblSellDiscount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSellDiscount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSellDiscount.setText("Desconto");

        txtSellPriceTotal.setEditable(false);
        txtSellPriceTotal.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txtSellPriceTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSellPriceTotal.setText("0,00");

        lblSellPriceTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSellPriceTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSellPriceTotal.setText("Valor Total");

        panelSellProduct.setBackground(new java.awt.Color(255, 255, 255));

        txtSellBarcode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSellBarcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSellBarcodeKeyReleased(evt);
            }
        });

        lblSellBarcode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSellBarcode.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSellBarcode.setText("Código de Barras");

        lblSellOr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSellOr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSellOr.setText("OU");
        lblSellOr.setToolTipText("");

        txtSellProductName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSellProductName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSellProductNameKeyPressed(evt);
            }
        });

        lblSellProductName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSellProductName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSellProductName.setText("Nome");

        panelSellProductFound.setBackground(new java.awt.Color(255, 255, 255));
        panelSellProductFound.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produto Selecionado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        panelSellProductFound.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtSellProductNameFound.setEditable(false);
        txtSellProductNameFound.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

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

        lblSellProductQt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSellProductQt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSellProductQt.setText("Quantidade");

        txtSellProductPriceUnit.setEditable(false);
        txtSellProductPriceUnit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtSellProductPriceUnit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSellProductPriceUnit.setText("0,00");

        lblSellProductPriceUnit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSellProductPriceUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSellProductPriceUnit.setText("R$ Unitário");

        txtSellProductPriceTotal.setEditable(false);
        txtSellProductPriceTotal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtSellProductPriceTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSellProductPriceTotal.setText("0,00");

        lblSellProductPriceTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSellProductPriceTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSellProductPriceTotal.setText("R$ Total");

        btnSellProductAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSellProductAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/ok-40.png"))); // NOI18N
        btnSellProductAdd.setText("ADICIONAR PRODUTO");
        btnSellProductAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellProductAddActionPerformed(evt);
            }
        });

        btnSellProductDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSellProductDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/cancel.png"))); // NOI18N
        btnSellProductDelete.setText("EXCLUIR");
        btnSellProductDelete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSellProductDelete.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnSellProductDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellProductDeleteActionPerformed(evt);
            }
        });

        btnSellProductFinalize.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSellProductFinalize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/sell.png"))); // NOI18N
        btnSellProductFinalize.setText("FINALIZAR");
        btnSellProductFinalize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellProductFinalizeActionPerformed(evt);
            }
        });

        txtSellProductQt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtSellProductQt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSellProductQt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtSellProductQt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSellProductQtFocusLost(evt);
            }
        });
        txtSellProductQt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSellProductQtKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelSellProductLayout = new javax.swing.GroupLayout(panelSellProduct);
        panelSellProduct.setLayout(panelSellProductLayout);
        panelSellProductLayout.setHorizontalGroup(
            panelSellProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSellProductLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelSellProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSellProductLayout.createSequentialGroup()
                        .addComponent(lblSellProductName)
                        .addContainerGap())
                    .addComponent(panelSellProductFound, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSellOr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSellBarcode)
                    .addComponent(txtSellProductName)
                    .addGroup(panelSellProductLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSellProductDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSellProductFinalize, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addGroup(panelSellProductLayout.createSequentialGroup()
                                .addComponent(lblSellProductPriceTotal)
                                .addContainerGap())
                            .addComponent(txtSellProductPriceTotal)))
                    .addGroup(panelSellProductLayout.createSequentialGroup()
                        .addComponent(lblSellBarcode)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnSellProductAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addComponent(lblSellProductName)
                .addGap(0, 0, 0)
                .addComponent(txtSellProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSellProductFound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelSellProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSellProductQt)
                    .addComponent(lblSellProductPriceUnit)
                    .addComponent(lblSellProductPriceTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSellProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSellProductPriceTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSellProductPriceUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSellProductQt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSellProductAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSellProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSellProductFinalize, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSellProductDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelSellProductLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnSellProductDelete, btnSellProductFinalize});

        txtSellDiscount.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtSellDiscount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSellDiscount.setText("0,0");
        txtSellDiscount.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N

        javax.swing.GroupLayout panelSellAllLayout = new javax.swing.GroupLayout(panelSellAll);
        panelSellAll.setLayout(panelSellAllLayout);
        panelSellAllLayout.setHorizontalGroup(
            panelSellAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSellAllLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelSellAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelSellAllLayout.createSequentialGroup()
                        .addComponent(lblSellCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSellCustomer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSellSearchCustomer))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelSellAllLayout.createSequentialGroup()
                        .addGroup(panelSellAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSellAllLayout.createSequentialGroup()
                                .addComponent(lblSellDiscount)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtSellDiscount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSellAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSellPriceTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSellPriceTotal)))
                    .addComponent(scrollSell, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSellAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSellProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSellAllLayout.createSequentialGroup()
                        .addComponent(lblSellSeller)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSellSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSellPaymentTerms, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSellPaymentTerms, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        panelSellAllLayout.setVerticalGroup(
            panelSellAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSellAllLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(panelSellAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelSellAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSellCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSellCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSellSearchCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelSellAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbSellPaymentTerms)
                        .addComponent(lblSellPaymentTerms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbSellSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSellSeller)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSellAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSellAllLayout.createSequentialGroup()
                        .addComponent(scrollSell, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSellAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSellDiscount)
                            .addGroup(panelSellAllLayout.createSequentialGroup()
                                .addComponent(lblSellPriceTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelSellAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSellPriceTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSellDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(8, 8, 8))
                    .addComponent(panelSellProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelSellAllLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbSellPaymentTerms, cbSellSeller});

        javax.swing.GroupLayout panelSellLayout = new javax.swing.GroupLayout(panelSell);
        panelSell.setLayout(panelSellLayout);
        panelSellLayout.setHorizontalGroup(
            panelSellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSellLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSellAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelSellLayout.setVerticalGroup(
            panelSellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSellLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPanelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSellAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSell, javax.swing.GroupLayout.PREFERRED_SIZE, 513, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteSaleProduct(String barcode) {
        for (SaleProduct sp : saleProducts) {
            if (sp.getProduct().getBarcode() == barcode.trim()) {
                saleProducts.remove(sp);
                break;
            }
        }

        TableModel model = tableSell.getModel();
        for (int i = 0; i < tableSell.getRowCount(); i++) {
            String tableBarcode = (String) model.getValueAt(i, 0);
            if (tableBarcode == barcode) {
                ((DefaultTableModel) tableSell.getModel()).removeRow(i);
                break;
            }
        }
    }

    private void loadSeller() {
        FormUtil.clearComboBox(cbSellSeller);
        List<Seller> list = null;
        try {
            list = ServiceSeller.getInstance().list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (list == null) {
            return;
        }

        FormUtil.setModelComboBox(cbSellSeller, list);
    }

    private void loadPaymentTerms() {
        FormUtil.clearComboBox(cbSellPaymentTerms);
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

        FormUtil.setModelComboBox(cbSellPaymentTerms, list);
    }

    private void btnSellProductDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellProductDeleteActionPerformed

        DefaultTableModel dtm = (DefaultTableModel) tableSell.getModel();
        if (tableSell.getSelectedRow() >= 0) {
            // confirm delete
            int dialogResult = JOptionPane.showConfirmDialog(this,
                    "Tem certeza que deseja excluir o produto?",
                    "Confirmação",
                    JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.NO_OPTION) {
                return;
            }

            deleteSaleProduct((String) dtm.getValueAt(tableSell.getSelectedRow(), 0));
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto!");
        }

        txtSellPriceTotal.setText(sumPriceTotal().toString().replace(".", ","));

    }//GEN-LAST:event_btnSellProductDeleteActionPerformed

    private void btnSellSearchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellSearchCustomerActionPerformed
        frmSelectCustomer = new FrameSellSelectCustomer();
        frmSelectCustomer.setVisible(true);
        frmSelectCustomer.setAlwaysOnTop(true);
    }//GEN-LAST:event_btnSellSearchCustomerActionPerformed

    private void txtSellBarcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSellBarcodeKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            frmSelectProduct = new FrameSellSelectProduct(ProductSearchTypeEnum.BARCODE, txtSellBarcode.getText());
            frmSelectProduct.setVisible(true);
            frmSelectProduct.setAlwaysOnTop(true);
            txtSellBarcode.setText("");
        }
    }//GEN-LAST:event_txtSellBarcodeKeyReleased

    private void txtSellProductNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSellProductNameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            frmSelectProduct = new FrameSellSelectProduct(ProductSearchTypeEnum.NAME, txtSellProductName.getText());
            frmSelectProduct.setVisible(true);
            frmSelectProduct.setAlwaysOnTop(true);
            txtSellProductName.setText("");
        }
    }//GEN-LAST:event_txtSellProductNameKeyPressed

    private boolean containsSaleProduct(Product p) {
        for (SaleProduct sp : saleProducts) {
            if (sp.getProduct().getId() == p.getId()) {
                return true;

            }
        }
        return false;
    }

    private Float sumPriceTotal() {
        Float sum = 0.0f;
        for (SaleProduct sp : saleProducts) {
            sum += sp.getPrice() * sp.getQuantity();
        }
        return sum;
    }
    private void btnSellProductAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellProductAddActionPerformed
        if (productSelected == null) {
            JOptionPane.showMessageDialog(null, "Selecione um produto!");
            return;
        }

        if (DataUtil.parseInteger(txtSellProductQt.getText()) == null) {
            JOptionPane.showMessageDialog(null, "Informe a quantidade correta");
            return;
        }

        if (DataUtil.parseInteger(txtSellProductQt.getText()) == 0) {
            JOptionPane.showMessageDialog(null, "Informe a quantidade correta");
            return;
        }

        if (productSelected.getStock() < DataUtil.parseInteger(txtSellProductQt.getText())) {
            JOptionPane.showMessageDialog(null, "Não há estoque para a quantidade solicitada!");
            return;
        }

        if (containsSaleProduct(productSelected)) {
            JOptionPane.showMessageDialog(null, "Este produto já foi adicionado!");
            return;
        }

        Integer qtt = DataUtil.parseInteger(txtSellProductQt.getText());
        Float unit = DataUtil.parseFloat(txtSellProductPriceUnit.getText().replace(",", "."));
        Float total = DataUtil.parseFloat(txtSellProductPriceTotal.getText().replace(",", "."));
        DefaultTableModel model = (DefaultTableModel) tableSell.getModel();

        model.addRow(new Object[]{
            productSelected.getBarcode(),
            productSelected.getName(),
            qtt,
            unit.toString().replace(".", ","),
            total.toString().replace(".", ",")
        });

        SaleProduct sp = new SaleProduct();
        sp.setId(0);
        sp.setSequence(0);
        sp.setSale(new Sale());
        sp.setPrice(productSelected.getPrice());
        sp.setProduct(productSelected);
        sp.setQuantity(qtt);
        saleProducts.add(sp);

        txtSellPriceTotal.setText(sumPriceTotal().toString().replace(".", ","));

        //clear
        txtSellProductQt.setText("1");
        txtSellProductPriceUnit.setText("0,00");
        txtSellProductPriceTotal.setText("0,00");
        txtSellBarcode.setText("");
        txtSellProductName.setText("");
        txtSellProductNameFound.setText("");
        productSelected = null;

    }//GEN-LAST:event_btnSellProductAddActionPerformed

    private void txtSellProductQtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSellProductQtFocusLost
        Integer qtt = DataUtil.parseInteger(txtSellProductQt.getText());
        Float unit = DataUtil.parseFloat(txtSellProductPriceUnit.getText().replace(",", "."));
        if (qtt != null && unit != null) {
            if (qtt > 0 && unit > 0) {
                txtSellProductPriceTotal.setText(((unit * qtt) + "").replace(".", ","));
            }
        }
    }//GEN-LAST:event_txtSellProductQtFocusLost

    private void txtSellProductQtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSellProductQtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSellProductAdd.requestFocus();
        }
    }//GEN-LAST:event_txtSellProductQtKeyPressed

    private void btnSellProductFinalizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellProductFinalizeActionPerformed
        // confirm finalize
        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja finalizar a venda?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.NO_OPTION) {
            return;
        }

        Float discount = DataUtil.parseFloat(txtSellDiscount.getText().replace(",", "."));
        Float total = DataUtil.parseFloat(txtSellPriceTotal.getText().replace(",", "."));

        if (discount != null && total != null) {
            if (discount > total) {
                JOptionPane.showMessageDialog(null, "Desconto maior do que o valor total da compra!");
                return;
            }
        }

        Sale sale = new Sale();
        sale.setCustomer(customerSelected);
        sale.setDiscount(discount);
        sale.setPaid(true);
        sale.setPaymentTerms((PaymentTerms) cbSellPaymentTerms.getSelectedItem());
        sale.setProducts(saleProducts);
        sale.setSeller((Seller) cbSellSeller.getSelectedItem());

        try {
            ServiceSale.getInstance().insert(sale);
            JOptionPane.showMessageDialog(this, "Venda registrada com sucesso",
                    "Confirmação", JOptionPane.INFORMATION_MESSAGE);
            FrameMain.loadCard(new PanelSellCreateUpdate(FormOperationEnum.CREATE, null), "SellCreateUpdate", true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Falha ao registrar a venda!", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnSellProductFinalizeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnSellProductAdd;
    public static javax.swing.JButton btnSellProductDelete;
    public static javax.swing.JButton btnSellProductFinalize;
    public static javax.swing.JButton btnSellSearchCustomer;
    public static javax.swing.JComboBox<String> cbSellPaymentTerms;
    public static javax.swing.JComboBox<String> cbSellSeller;
    public static javax.swing.JLabel lblPanelTitle;
    public static javax.swing.JLabel lblSellBarcode;
    public static javax.swing.JLabel lblSellCustomer;
    public static javax.swing.JLabel lblSellDiscount;
    public static javax.swing.JLabel lblSellOr;
    public static javax.swing.JLabel lblSellPaymentTerms;
    public static javax.swing.JLabel lblSellPriceTotal;
    public static javax.swing.JLabel lblSellProductName;
    public static javax.swing.JLabel lblSellProductPriceTotal;
    public static javax.swing.JLabel lblSellProductPriceUnit;
    public static javax.swing.JLabel lblSellProductQt;
    public static javax.swing.JLabel lblSellSeller;
    public static javax.swing.JPanel panelSell;
    public static javax.swing.JPanel panelSellAll;
    public static javax.swing.JPanel panelSellProduct;
    public static javax.swing.JPanel panelSellProductFound;
    public static javax.swing.JScrollPane scrollSell;
    public static javax.swing.JTable tableSell;
    public static javax.swing.JTextField txtSellBarcode;
    public static javax.swing.JTextField txtSellCustomer;
    public static javax.swing.JFormattedTextField txtSellDiscount;
    public static javax.swing.JTextField txtSellPriceTotal;
    public static javax.swing.JTextField txtSellProductName;
    public static javax.swing.JTextField txtSellProductNameFound;
    public static javax.swing.JTextField txtSellProductPriceTotal;
    public static javax.swing.JTextField txtSellProductPriceUnit;
    public static javax.swing.JFormattedTextField txtSellProductQt;
    // End of variables declaration//GEN-END:variables

    public static void setCustomerSelected(Customer customer) {
        PanelSellCreateUpdate.customerSelected = customer;
        PanelSellCreateUpdate.txtSellCustomer.setText(customer.getName());
    }

    public static void setProductSelected(Product product) {
        PanelSellCreateUpdate.productSelected = product;
        PanelSellCreateUpdate.txtSellProductNameFound.setText(product.getName());
        PanelSellCreateUpdate.txtSellProductPriceUnit.setText(product.getPrice().toString().replace(".", ","));
        PanelSellCreateUpdate.txtSellProductPriceTotal.setText(product.getPrice().toString().replace(".", ","));
        PanelSellCreateUpdate.txtSellProductName.setText("");
        PanelSellCreateUpdate.txtSellBarcode.setText("");

    }

}
