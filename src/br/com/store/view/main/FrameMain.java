package br.com.store.view.main;

import br.com.store.model.enums.FormOperationEnum;
import br.com.store.view.PanelCustomerAdd;
import br.com.store.view.PanelCustomerList;
import br.com.store.view.PanelProductCRU;
import br.com.store.view.PanelProductList;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class FrameMain extends javax.swing.JFrame {

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
        jLabel1 = new javax.swing.JLabel();
        panelProductAdd = new br.com.store.view.PanelProductCRU();
        panelCustomerList = new br.com.store.view.PanelCustomerList();
        panelCustomerAdd = new br.com.store.view.PanelCustomerAdd();
        panelBrand = new br.com.store.view.PanelBrand();
        panelCategory = new br.com.store.view.PanelCategory();
        panelProductList = new br.com.store.view.PanelProductList();
        panelSubCategory = new br.com.store.view.PanelSubCategory();
        panelOption = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();
        btnProduct = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

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

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addContainerGap())
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelOption, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1104, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(118, 118, 118)
                    .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(118, 118, 118)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(panelOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(507, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(134, 134, 134)
                    .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        CardLayout card = (CardLayout) panelMain.getLayout();

        JPopupMenu popup = new JPopupMenu();
        JMenuItem mItemAdd = new JMenuItem("Novo");
        JMenuItem mItemList = new JMenuItem("Listagem");
        mItemAdd.addActionListener((e) -> {
            card.show(panelMain, "CustomerAdd");
            panelMain.add("CustomerAdd", new PanelCustomerAdd());
        });
        mItemList.addActionListener((e) -> {
            card.show(panelMain, "CustomerList");
            panelMain.add("CustomerList", new PanelCustomerList());
        });

        popup.add(mItemAdd);
        popup.add(mItemList);

        popup.show(btnCustomer, (int) btnCustomer.getAlignmentX(), (int) btnCustomer.getAlignmentY() + btnCustomer.getHeight());
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        CardLayout card = (CardLayout) panelMain.getLayout();
        card.show(panelMain, "Home");
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
        CardLayout card = (CardLayout) panelMain.getLayout();
        JPopupMenu popup = new JPopupMenu();
        JMenuItem mItemAdd = new JMenuItem("Novo");
        JMenuItem mItemList = new JMenuItem("Listagem");
        JMenuItem mItemBrand = new JMenuItem("Cadastro de Marca");
        JMenuItem mItemCategory = new JMenuItem("Cadastro de Categoria");
        JMenuItem mItemSubCategory = new JMenuItem("Cadastro de Sub Categoria");
        mItemAdd.addActionListener((e) -> {
            card.show(panelMain, "ProductAdd");
            PanelProductCRU p = new PanelProductCRU();
            p.operation = FormOperationEnum.CREATE;
            panelMain.add("ProductAdd", new PanelProductCRU());
        });
        mItemList.addActionListener((e) -> {
            card.show(panelMain, "ProductList");
            panelMain.add("ProductList", new PanelProductList());
        });
        mItemBrand.addActionListener((e) -> {
            card.show(panelMain, "Brand");
        });
        mItemCategory.addActionListener((e) -> {
            card.show(panelMain, "Category");
        });
        mItemSubCategory.addActionListener((e) -> {
            card.show(panelMain, "SubCategory");
        });
        popup.add(mItemAdd);
        popup.add(mItemList);
        popup.add(new JPopupMenu.Separator());
        popup.add(mItemBrand);
        popup.add(mItemCategory);
        popup.add(mItemSubCategory);

        popup.show(btnProduct, (int) btnProduct.getAlignmentX(), (int) btnProduct.getAlignmentY() + btnProduct.getHeight());
    }//GEN-LAST:event_btnProductActionPerformed

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
    private javax.swing.JButton btnProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private br.com.store.view.PanelBrand panelBrand;
    private br.com.store.view.PanelCategory panelCategory;
    private br.com.store.view.PanelCustomerAdd panelCustomerAdd;
    private br.com.store.view.PanelCustomerList panelCustomerList;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelOption;
    private br.com.store.view.PanelProductCRU panelProductAdd;
    private br.com.store.view.PanelProductList panelProductList;
    private br.com.store.view.PanelSubCategory panelSubCategory;
    // End of variables declaration//GEN-END:variables
    public static Dimension resizeFullScreen() {
        return (new Dimension(
                (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(),
                (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
    }
}
