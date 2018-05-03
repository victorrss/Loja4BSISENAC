/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.store.view;

/**
 *
 * @author FAMILIA
 */
public class PanelCustomerRegister extends javax.swing.JPanel {

    /**
     * Creates new form PanelAddClient
     */
    public PanelCustomerRegister() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPanelCustomer = new javax.swing.JTabbedPane();
        tabBasic = new javax.swing.JPanel();
        panelBasic = new javax.swing.JPanel();
        lblBasicName = new javax.swing.JLabel();
        txtBasicName = new javax.swing.JTextField();
        lblBasicDocument = new javax.swing.JLabel();
        cbBasicDocumentType = new javax.swing.JComboBox<>();
        txtBasicDocument = new javax.swing.JFormattedTextField();
        cbBasicMaritalStatus = new javax.swing.JComboBox<>();
        lblBasicMaritalSatus = new javax.swing.JLabel();
        txtBasicBirthDate = new javax.swing.JFormattedTextField();
        lblBasicBirthDate = new javax.swing.JLabel();
        cbBasicGender = new javax.swing.JComboBox<>();
        lblBasicGender = new javax.swing.JLabel();
        btnBasicNext = new javax.swing.JButton();
        tabAddress = new javax.swing.JPanel();
        panelAddress = new javax.swing.JPanel();
        cbAddressPublicPlaceType = new javax.swing.JComboBox<>();
        lblAddressPublicPlaceType = new javax.swing.JLabel();
        lblAddressPublicPlace = new javax.swing.JLabel();
        txtAddressPublicPlace = new javax.swing.JTextField();
        lblAddressNumber = new javax.swing.JLabel();
        txtAddressNumber = new javax.swing.JTextField();
        lblAddressDistrict = new javax.swing.JLabel();
        txtAddressDistrict = new javax.swing.JTextField();
        lblAddressComplement = new javax.swing.JLabel();
        txtAddressComplement = new javax.swing.JTextField();
        lblAddressState = new javax.swing.JLabel();
        cbAddressState = new javax.swing.JComboBox<>();
        lblAddressCity = new javax.swing.JLabel();
        cbAddressCity = new javax.swing.JComboBox<>();
        lblAddressZipCode = new javax.swing.JLabel();
        txtAddressZipCode = new javax.swing.JFormattedTextField();
        btnAddressNext = new javax.swing.JButton();
        btnAddressBack = new javax.swing.JButton();
        tabContact = new javax.swing.JPanel();
        panelContact = new javax.swing.JPanel();
        cbContactContactType = new javax.swing.JComboBox<>();
        lblContactContactType = new javax.swing.JLabel();
        txtContactValue = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableContact = new javax.swing.JTable();
        btnContactNew = new javax.swing.JButton();
        btnContactDelete = new javax.swing.JButton();
        btnContactSave = new javax.swing.JButton();
        btnContactBack = new javax.swing.JButton();
        btnContactCustomerSave = new javax.swing.JButton();

        panelBasic.setBorder(javax.swing.BorderFactory.createTitledBorder("Básico"));

        lblBasicName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBasicName.setText("Nome:");

        txtBasicName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBasicNameActionPerformed(evt);
            }
        });

        lblBasicDocument.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBasicDocument.setText("Documento:");

        cbBasicDocumentType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbBasicMaritalStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblBasicMaritalSatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBasicMaritalSatus.setText("Estado Civil:");

        lblBasicBirthDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBasicBirthDate.setText("Data de nascimento:");

        cbBasicGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblBasicGender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBasicGender.setText("Sexo:");

        javax.swing.GroupLayout panelBasicLayout = new javax.swing.GroupLayout(panelBasic);
        panelBasic.setLayout(panelBasicLayout);
        panelBasicLayout.setHorizontalGroup(
            panelBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBasicLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblBasicGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBasicMaritalSatus, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                        .addComponent(lblBasicBirthDate)
                        .addComponent(lblBasicName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblBasicDocument, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbBasicMaritalStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbBasicGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBasicLayout.createSequentialGroup()
                        .addComponent(cbBasicDocumentType, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBasicDocument, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE))
                    .addComponent(txtBasicName)
                    .addComponent(txtBasicBirthDate, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        panelBasicLayout.setVerticalGroup(
            panelBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBasicLayout.createSequentialGroup()
                .addGroup(panelBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBasicName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBasicName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBasicLayout.createSequentialGroup()
                        .addGroup(panelBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbBasicDocumentType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBasicDocument, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBasicDocument))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBasicBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblBasicBirthDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBasicGender)
                    .addComponent(cbBasicGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBasicMaritalSatus)
                    .addComponent(cbBasicMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBasicNext.setText("Próximo");

        javax.swing.GroupLayout tabBasicLayout = new javax.swing.GroupLayout(tabBasic);
        tabBasic.setLayout(tabBasicLayout);
        tabBasicLayout.setHorizontalGroup(
            tabBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBasicLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBasic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabBasicLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBasicNext, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        tabBasicLayout.setVerticalGroup(
            tabBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBasicLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBasic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBasicNext, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        tabPanelCustomer.addTab("Básico", tabBasic);

        panelAddress.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        cbAddressPublicPlaceType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblAddressPublicPlaceType.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddressPublicPlaceType.setText("Tipo Logradouro:");

        lblAddressPublicPlace.setText("Logradouro:");

        lblAddressNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddressNumber.setText("Número:");

        lblAddressDistrict.setText("Bairro:");

        txtAddressDistrict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressDistrictActionPerformed(evt);
            }
        });

        lblAddressComplement.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddressComplement.setText("Complemento:");

        lblAddressState.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddressState.setText("UF:");

        cbAddressState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblAddressCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddressCity.setText("Cidade:");

        cbAddressCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblAddressZipCode.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddressZipCode.setText("CEP:");

        javax.swing.GroupLayout panelAddressLayout = new javax.swing.GroupLayout(panelAddress);
        panelAddress.setLayout(panelAddressLayout);
        panelAddressLayout.setHorizontalGroup(
            panelAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddressLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddressLayout.createSequentialGroup()
                        .addComponent(lblAddressPublicPlaceType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbAddressPublicPlaceType, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAddressPublicPlace)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddressPublicPlace, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE))
                    .addGroup(panelAddressLayout.createSequentialGroup()
                        .addGroup(panelAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblAddressNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAddressZipCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAddressState, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAddressComplement, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAddressComplement)
                            .addGroup(panelAddressLayout.createSequentialGroup()
                                .addComponent(txtAddressNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAddressDistrict)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAddressDistrict))
                            .addComponent(txtAddressZipCode)
                            .addGroup(panelAddressLayout.createSequentialGroup()
                                .addComponent(cbAddressState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAddressCity, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbAddressCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        panelAddressLayout.setVerticalGroup(
            panelAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddressLayout.createSequentialGroup()
                .addGroup(panelAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAddressPublicPlaceType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddressPublicPlaceType)
                    .addComponent(lblAddressPublicPlace)
                    .addComponent(txtAddressPublicPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddressNumber)
                    .addComponent(txtAddressNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddressDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddressDistrict))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddressComplement)
                    .addComponent(txtAddressComplement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAddressState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddressState)
                    .addComponent(lblAddressCity)
                    .addComponent(cbAddressCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddressZipCode)
                    .addComponent(txtAddressZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAddressNext.setText("Próximo");

        btnAddressBack.setText("Voltar");

        javax.swing.GroupLayout tabAddressLayout = new javax.swing.GroupLayout(tabAddress);
        tabAddress.setLayout(tabAddressLayout);
        tabAddressLayout.setHorizontalGroup(
            tabAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabAddressLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabAddressLayout.createSequentialGroup()
                        .addComponent(btnAddressBack, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddressNext, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        tabAddressLayout.setVerticalGroup(
            tabAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabAddressLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddressNext, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddressBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        tabPanelCustomer.addTab("Endereço", tabAddress);

        panelContact.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato"));

        cbContactContactType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblContactContactType.setText("Tipo Contato:");

        tableContact.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Id", "Tipo", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableContact);

        btnContactNew.setText("Novo");

        btnContactDelete.setText("Del");

        btnContactSave.setText("Salvar");
        btnContactSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelContactLayout = new javax.swing.GroupLayout(panelContact);
        panelContact.setLayout(panelContactLayout);
        panelContactLayout.setHorizontalGroup(
            panelContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContactLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContactLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(txtContactValue))
                    .addGroup(panelContactLayout.createSequentialGroup()
                        .addComponent(lblContactContactType)
                        .addGap(1, 1, 1)
                        .addComponent(cbContactContactType, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 891, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnContactDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnContactNew, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(btnContactSave, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        panelContactLayout.setVerticalGroup(
            panelContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContactLayout.createSequentialGroup()
                .addGroup(panelContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnContactSave)
                    .addGroup(panelContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblContactContactType)
                        .addComponent(cbContactContactType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtContactValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContactLayout.createSequentialGroup()
                        .addComponent(btnContactNew, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(btnContactDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        btnContactBack.setText("Voltar");
        btnContactBack.setPreferredSize(new java.awt.Dimension(71, 23));

        btnContactCustomerSave.setText("Salvar");
        btnContactCustomerSave.setPreferredSize(new java.awt.Dimension(71, 23));

        javax.swing.GroupLayout tabContactLayout = new javax.swing.GroupLayout(tabContact);
        tabContact.setLayout(tabContactLayout);
        tabContactLayout.setHorizontalGroup(
            tabContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabContactLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tabContactLayout.createSequentialGroup()
                        .addComponent(btnContactBack, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnContactCustomerSave, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        tabContactLayout.setVerticalGroup(
            tabContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabContactLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnContactCustomerSave, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnContactBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );

        tabPanelCustomer.addTab("Contato", tabContact);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPanelCustomer)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPanelCustomer)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddressDistrictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressDistrictActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressDistrictActionPerformed

    private void btnContactSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnContactSaveActionPerformed

    private void txtBasicNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBasicNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBasicNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddressBack;
    private javax.swing.JButton btnAddressNext;
    private javax.swing.JButton btnBasicNext;
    private javax.swing.JButton btnContactBack;
    private javax.swing.JButton btnContactCustomerSave;
    private javax.swing.JButton btnContactDelete;
    private javax.swing.JButton btnContactNew;
    private javax.swing.JButton btnContactSave;
    private javax.swing.JComboBox<String> cbAddressCity;
    private javax.swing.JComboBox<String> cbAddressPublicPlaceType;
    private javax.swing.JComboBox<String> cbAddressState;
    private javax.swing.JComboBox<String> cbBasicDocumentType;
    private javax.swing.JComboBox<String> cbBasicGender;
    private javax.swing.JComboBox<String> cbBasicMaritalStatus;
    private javax.swing.JComboBox<String> cbContactContactType;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddressCity;
    private javax.swing.JLabel lblAddressComplement;
    private javax.swing.JLabel lblAddressDistrict;
    private javax.swing.JLabel lblAddressNumber;
    private javax.swing.JLabel lblAddressPublicPlace;
    private javax.swing.JLabel lblAddressPublicPlaceType;
    private javax.swing.JLabel lblAddressState;
    private javax.swing.JLabel lblAddressZipCode;
    private javax.swing.JLabel lblBasicBirthDate;
    private javax.swing.JLabel lblBasicDocument;
    private javax.swing.JLabel lblBasicGender;
    private javax.swing.JLabel lblBasicMaritalSatus;
    private javax.swing.JLabel lblBasicName;
    private javax.swing.JLabel lblContactContactType;
    private javax.swing.JPanel panelAddress;
    private javax.swing.JPanel panelBasic;
    private javax.swing.JPanel panelContact;
    private javax.swing.JPanel tabAddress;
    private javax.swing.JPanel tabBasic;
    private javax.swing.JPanel tabContact;
    private javax.swing.JTabbedPane tabPanelCustomer;
    private javax.swing.JTable tableContact;
    private javax.swing.JTextField txtAddressComplement;
    private javax.swing.JTextField txtAddressDistrict;
    private javax.swing.JTextField txtAddressNumber;
    private javax.swing.JTextField txtAddressPublicPlace;
    private javax.swing.JFormattedTextField txtAddressZipCode;
    private javax.swing.JFormattedTextField txtBasicBirthDate;
    private javax.swing.JFormattedTextField txtBasicDocument;
    private javax.swing.JTextField txtBasicName;
    private javax.swing.JTextField txtContactValue;
    // End of variables declaration//GEN-END:variables
}
