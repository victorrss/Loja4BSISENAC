package br.com.store.view.main;

import br.com.store.model.enums.FormOperationEnum;
import br.com.store.view.PanelBrand;
import br.com.store.view.PanelCategory;
import br.com.store.view.PanelCity;
import br.com.store.view.PanelContactType;
import br.com.store.view.PanelCustomerCreateUpdate;
import br.com.store.view.PanelCustomerReadDelete;
import br.com.store.view.PanelDocumentType;
import br.com.store.view.PanelMaritalStatus;
import br.com.store.view.PanelPaymentTerms;
import br.com.store.view.PanelProductCreateUpdate;
import br.com.store.view.PanelProductReadDelete;
import br.com.store.view.PanelPublicPlaceType;
import br.com.store.view.PanelState;
import br.com.store.view.PanelSubCategory;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class FrameMain extends javax.swing.JFrame {

    private static CardLayout card;

    public FrameMain() {
        initComponents();
        resizeFullScreen();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelMain = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        panelProductAdd = new br.com.store.view.PanelProductCreateUpdate();
        panelCustomerList = new br.com.store.view.PanelCustomerReadDelete();
        panelCustomerAdd = new br.com.store.view.PanelCustomerCreateUpdate();
        panelBrand = new br.com.store.view.PanelBrand();
        panelCategory = new br.com.store.view.PanelCategory();
        panelProductList = new br.com.store.view.PanelProductReadDelete();
        panelSubCategory = new br.com.store.view.PanelSubCategory();
        panelPaymentTerms = new br.com.store.view.PanelPaymentTerms();
        panelMaritalStatus = new br.com.store.view.PanelMaritalStatus();
        panelOption = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();
        btnProduct = new javax.swing.JButton();
        btnSell = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblPanelTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));
        setExtendedState(6);
        setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panelMain.setLayout(new java.awt.CardLayout());

        Home.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 993, Short.MAX_VALUE)
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 642, Short.MAX_VALUE)
        );

        panelMain.add(Home, "Home");
        panelMain.add(panelProductAdd, "ProductAdd");
        panelMain.add(panelCustomerList, "CustomerList");
        panelMain.add(panelCustomerAdd, "CustomerAdd");
        panelMain.add(panelBrand, "Brand");
        panelMain.add(panelCategory, "Category");
        panelMain.add(panelProductList, "ProductList");
        panelProductList.getAccessibleContext().setAccessibleName("");

        panelMain.add(panelSubCategory, "SubCategory");
        panelMain.add(panelPaymentTerms, "PaymentTerms");
        panelMain.add(panelMaritalStatus, "MaritalStatus");

        panelOption.setBackground(new java.awt.Color(255, 255, 255));

        btnHome.setFont(new java.awt.Font("Segoe UI Light", 1, 11)); // NOI18N
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/home.png"))); // NOI18N
        btnHome.setText("Início");
        btnHome.setActionCommand("Inicio");
        btnHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome.setIconTextGap(0);
        btnHome.setMinimumSize(new java.awt.Dimension(73, 73));
        btnHome.setPreferredSize(new java.awt.Dimension(80, 73));
        btnHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        panelOption.add(btnHome);

        btnCustomer.setFont(new java.awt.Font("Segoe UI Light", 1, 11)); // NOI18N
        btnCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/customer.png"))); // NOI18N
        btnCustomer.setText("Cliente");
        btnCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCustomer.setIconTextGap(0);
        btnCustomer.setMinimumSize(new java.awt.Dimension(73, 73));
        btnCustomer.setPreferredSize(new java.awt.Dimension(80, 73));
        btnCustomer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });
        panelOption.add(btnCustomer);

        btnProduct.setFont(new java.awt.Font("Segoe UI Light", 1, 11)); // NOI18N
        btnProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/product.png"))); // NOI18N
        btnProduct.setText("Produto");
        btnProduct.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProduct.setIconTextGap(0);
        btnProduct.setMinimumSize(new java.awt.Dimension(73, 73));
        btnProduct.setPreferredSize(new java.awt.Dimension(80, 73));
        btnProduct.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductActionPerformed(evt);
            }
        });
        panelOption.add(btnProduct);

        btnSell.setFont(new java.awt.Font("Segoe UI Light", 1, 11)); // NOI18N
        btnSell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/sell-48.png"))); // NOI18N
        btnSell.setText("Vendas");
        btnSell.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSell.setIconTextGap(0);
        btnSell.setMinimumSize(new java.awt.Dimension(73, 73));
        btnSell.setPreferredSize(new java.awt.Dimension(80, 73));
        btnSell.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellActionPerformed(evt);
            }
        });
        panelOption.add(btnSell);

        btnExit.setFont(new java.awt.Font("Segoe UI Light", 1, 11)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/exit.png"))); // NOI18N
        btnExit.setText("Sair");
        btnExit.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setIconTextGap(0);
        btnExit.setMinimumSize(new java.awt.Dimension(73, 73));
        btnExit.setPreferredSize(new java.awt.Dimension(80, 73));
        btnExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        panelOption.add(btnExit);

        lblPanelTitle.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblPanelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPanelTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(111, 111, 111))
            .addComponent(panelOption, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1229, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(118, 118, 118)
                    .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 1291, Short.MAX_VALUE)
                    .addGap(118, 118, 118)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(panelOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(671, 671, 671)
                .addComponent(lblPanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(134, 134, 134)
                    .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                    .addGap(48, 48, 48)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        card = (CardLayout) panelMain.getLayout();
        JPopupMenu popup = new JPopupMenu();

        JMenuItem mItemCreateUpdate = new JMenuItem("Novo");
        mItemCreateUpdate.addActionListener((e) -> {
            loadCardCustomerCreate(true);
        });

        JMenuItem mItemReadDelete = new JMenuItem("Listagem");
        mItemReadDelete.addActionListener((e) -> {
            loadCardCustomerList(true);
        });

        JMenuItem mItemContactType = new JMenuItem("Tipo de Contato");
        mItemContactType.addActionListener((e) -> {
            PanelContactType p = new PanelContactType(FormOperationEnum.CREATE, null);
            FrameMain.loadCard(p, "ContactType", true);
        });

        JMenuItem mItemDocumentType = new JMenuItem("Tipo de Documento");
        mItemDocumentType.addActionListener((e) -> {
            PanelDocumentType p = new PanelDocumentType(FormOperationEnum.CREATE, null);
            FrameMain.loadCard(p, "DocumentType", true);
        });

        JMenuItem mItemMaritalStatus = new JMenuItem("Estado Civil");
        mItemMaritalStatus.addActionListener((e) -> {
            PanelMaritalStatus p = new PanelMaritalStatus(FormOperationEnum.CREATE, null);
            FrameMain.loadCard(p, "MaritalStatus", true);
        });

        // Address 
        JMenuItem mItemPublicPlaceType = new JMenuItem("Tipo de Logradouro");
        mItemPublicPlaceType.addActionListener((e) -> {
            PanelPublicPlaceType p = new PanelPublicPlaceType(FormOperationEnum.CREATE, null);
            FrameMain.loadCard(p, "PublicPlaceType", true);
        });
        JMenuItem mItemCity = new JMenuItem("Cidade");
        mItemCity.addActionListener((e) -> {
            PanelCity p = new PanelCity(FormOperationEnum.CREATE, null);
            FrameMain.loadCard(p, "City", true);
        });
        JMenuItem mItemState = new JMenuItem("Unidade de Federação");
        mItemState.addActionListener((e) -> {
            PanelState p = new PanelState(FormOperationEnum.CREATE, null);
            FrameMain.loadCard(p, "State", true);
        });

        JMenu submenuAddress = new JMenu("Cadastros");
        submenuAddress.add(mItemMaritalStatus);
        submenuAddress.add(new JPopupMenu.Separator());
        submenuAddress.add(mItemDocumentType);
        submenuAddress.add(new JPopupMenu.Separator());
        submenuAddress.add(mItemContactType);
        submenuAddress.add(new JPopupMenu.Separator());
        submenuAddress.add(mItemPublicPlaceType);
        submenuAddress.add(mItemCity);
        submenuAddress.add(mItemState);

        popup.add(mItemCreateUpdate);
        popup.add(mItemReadDelete);
        popup.add(new JPopupMenu.Separator());
        popup.add(submenuAddress);
        popup.show(btnCustomer, (int) btnCustomer.getAlignmentX(), (int) btnCustomer.getAlignmentY() + btnCustomer.getHeight());
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        card = (CardLayout) panelMain.getLayout();
        card.show(panelMain, "Home");
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
        card = (CardLayout) panelMain.getLayout();
        JPopupMenu popup = new JPopupMenu();
        // products 
        JMenuItem mItemCreateUpdate = new JMenuItem("Novo");
        mItemCreateUpdate.addActionListener((e) -> {
            loadCardProductCreate(true);
        });

        JMenuItem mItemReadDelete = new JMenuItem("Listagem");
        mItemReadDelete.addActionListener((e) -> {
            loadCardProductList(true);
        });

        // registers
        JMenuItem mItemBrand = new JMenuItem("Marca");
        mItemBrand.addActionListener((e) -> {
            PanelBrand p = new PanelBrand(FormOperationEnum.CREATE, null);
            FrameMain.loadCard(p, "Brand", true);
        });

        JMenuItem mItemCategory = new JMenuItem("Categoria");
        mItemCategory.addActionListener((e) -> {
            PanelCategory p = new PanelCategory(FormOperationEnum.CREATE, null);
            FrameMain.loadCard(p, "Category", true);
        });

        JMenuItem mItemSubCategory = new JMenuItem("Sub Categoria");
        mItemSubCategory.addActionListener((e) -> {
            PanelSubCategory p = new PanelSubCategory(FormOperationEnum.CREATE, null);
            FrameMain.loadCard(p, "SubCategory", true);
        });

        JMenu submenuAddress = new JMenu("Cadastros");
        submenuAddress.add(mItemBrand);
        submenuAddress.add(mItemCategory);
        submenuAddress.add(mItemSubCategory);

        popup.add(mItemCreateUpdate);
        popup.add(mItemReadDelete);
        popup.add(new JPopupMenu.Separator());
        popup.add(submenuAddress);

        popup.show(btnProduct, (int) btnProduct.getAlignmentX(), (int) btnProduct.getAlignmentY() + btnProduct.getHeight());
    }//GEN-LAST:event_btnProductActionPerformed

    private void btnSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellActionPerformed
        card = (CardLayout) panelMain.getLayout();
        JPopupMenu popup = new JPopupMenu();
        // sell 
        JMenuItem mItemCreateUpdate = new JMenuItem("Novo");
        mItemCreateUpdate.addActionListener((e) -> {

        });

        JMenuItem mItemReadDelete = new JMenuItem("Listagem");
        mItemReadDelete.addActionListener((e) -> {

        });

        // registers
        JMenuItem mItemPaymentTerms = new JMenuItem("Condição de Pagamento");
        mItemPaymentTerms.addActionListener((e) -> {
            PanelPaymentTerms p = new PanelPaymentTerms(FormOperationEnum.CREATE, null);
            FrameMain.loadCard(p, "PaymentTerms", true);

        });

        JMenu submenuAddress = new JMenu("Cadastros");
        submenuAddress.add(mItemPaymentTerms);

        popup.add(mItemCreateUpdate);
        popup.add(mItemReadDelete);
        popup.add(new JPopupMenu.Separator());
        popup.add(submenuAddress);

        popup.show(btnSell, (int) btnSell.getAlignmentX(), (int) btnSell.getAlignmentY() + btnSell.getHeight());
    }//GEN-LAST:event_btnSellActionPerformed

    public static void loadCardProductList(boolean show) {
        PanelProductReadDelete p = new PanelProductReadDelete();
        p.loadList();
        panelMain.add("ProductList", p);
        if (show) {
            card.show(panelMain, "ProductList");
        }
    }

    public static void loadCardProductUpdate(Integer id, boolean show) {
        card = (CardLayout) panelMain.getLayout();
        PanelProductCreateUpdate p = new PanelProductCreateUpdate(FormOperationEnum.UPDATE, id);
        panelMain.add("ProductAdd", p);
        if (show) {
            card.show(panelMain, "ProductAdd");
        }
    }

    public static void loadCard(JPanel panel, String cardName, boolean show) {
        card = (CardLayout) panelMain.getLayout();
        //PanelProductCreateUpdate p = new PanelProductCreateUpdate(FormOperationEnum.UPDATE, id);
        panelMain.add(cardName, panel);
        if (show) {
            card.show(panelMain, cardName);
        }
    }

    public static void loadCardProductCreate(boolean show) {
        card = (CardLayout) panelMain.getLayout();
        PanelProductCreateUpdate p = new PanelProductCreateUpdate(FormOperationEnum.CREATE, null);
        panelMain.add("ProductAdd", p);
        if (show) {
            card.show(panelMain, "ProductAdd");
        }
    }

    public static void loadCardCustomerList(boolean show) {
        PanelCustomerReadDelete p = new PanelCustomerReadDelete();
        p.loadList();
        panelMain.add("CustomerList", p);
        if (show) {
            card.show(panelMain, "CustomerList");
        }
    }

    public static void loadCardCustomerUpdate(Integer id, boolean show) {
        card = (CardLayout) panelMain.getLayout();
        PanelCustomerCreateUpdate p = new PanelCustomerCreateUpdate(FormOperationEnum.UPDATE, id);
        panelMain.add("CustomerAdd", p);
        if (show) {
            card.show(panelMain, "CustomerAdd");
        }
    }

    public static void loadCardCustomerCreate(boolean show) {
        card = (CardLayout) panelMain.getLayout();
        PanelCustomerCreateUpdate p = new PanelCustomerCreateUpdate(FormOperationEnum.CREATE, null);
        panelMain.add("CustomerAdd", p);
        if (show) {
            card.show(panelMain, "CustomerAdd");
        }
    }

    public static Dimension resizeFullScreen() {
        return (new Dimension(
                (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(),
                (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Home;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHome;
    public static javax.swing.JButton btnProduct;
    public static javax.swing.JButton btnSell;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPanelTitle;
    private br.com.store.view.PanelBrand panelBrand;
    private br.com.store.view.PanelCategory panelCategory;
    private br.com.store.view.PanelCustomerCreateUpdate panelCustomerAdd;
    private br.com.store.view.PanelCustomerReadDelete panelCustomerList;
    private static javax.swing.JPanel panelMain;
    private br.com.store.view.PanelMaritalStatus panelMaritalStatus;
    private javax.swing.JPanel panelOption;
    private br.com.store.view.PanelPaymentTerms panelPaymentTerms;
    private br.com.store.view.PanelProductCreateUpdate panelProductAdd;
    private br.com.store.view.PanelProductReadDelete panelProductList;
    private br.com.store.view.PanelSubCategory panelSubCategory;
    // End of variables declaration//GEN-END:variables
}
