package br.com.store.view;

import br.com.store.model.City;
import br.com.store.model.ContactType;
import br.com.store.model.Customer;
import br.com.store.model.DocumentType;
import br.com.store.model.MaritalStatus;
import br.com.store.model.PublicPlaceType;
import br.com.store.model.State;
import br.com.store.model.enums.FormOperationEnum;
import br.com.store.service.ServiceCity;
import br.com.store.service.ServiceContactType;
import br.com.store.service.ServiceCustomer;
import br.com.store.service.ServiceDocumentType;
import br.com.store.service.ServiceMaritalStatus;
import br.com.store.service.ServicePublicPlaceType;
import br.com.store.service.ServiceState;
import br.com.store.utils.DataUtil;
import br.com.store.utils.FormUtil;
import java.awt.Component;
import java.util.List;
import javax.swing.JOptionPane;

public class PanelCustomerCreateUpdate extends javax.swing.JPanel {

    private FormOperationEnum operation = null;
    private Integer customerId = null;

    public PanelCustomerCreateUpdate() {
        initComponents();
        loadDocumentType();
        loadMaritalStatus();
        loadContactType();
        loadPublicPlaceType();
        loadState();
        loadCity();
    }

    public PanelCustomerCreateUpdate(FormOperationEnum op, Integer id) {
        initComponents();
        loadDocumentType();
        loadMaritalStatus();
        loadContactType();
        loadPublicPlaceType();
        loadState();
        loadCity();
        prepareFormOperation(op, id);
    }

    private void prepareFormOperation(FormOperationEnum op, Integer id) {
        this.operation = op;
        this.customerId = id;
        if (this.operation == FormOperationEnum.CREATE) {
            lblPanelTitle.setText("Produto - Novo");
        } else {
            lblPanelTitle.setText("Produto - Alteração");
            loadCustomer(customerId);
        }
    }

    void loadCustomer(Integer id) {
        Customer c;
        try {
            c = ServiceCustomer.getInstance().get(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        txtCustomerId.setText(c.getId().toString());
        txtCustomerBasicDocument.setText(c.getDocument());
        txtCustomerBasicBirthDate.setText(DataUtil.getDateFormat("dd/MM/yyyy").format(c.getBirthDate()));
        txtCustomern.setText(c.getDescription());
        txtCustomerWarranty.setText(c.getWarranty().toString());
        txtCustomerModel.setText(c.getModel());
        if (c.getPicture() != null) {
            ImageUtil.setImageLabel(c.getPicture(), lblCustomerPicture);
        }
        txtCustomerStock.setText(c.getStock().toString());
        txtCustomerPrice.setText(c.getPrice().toString().replace(".", ","));
        JComboBox cbTemp = null;
        // seleciona no cb
        cbTemp = cbCustomerCategory;
        cbTemp.setSelectedIndex(0);
        for (int i = 1; i < cbTemp.getItemCount(); i++) {
            Category cbSelectedItem = (Category) cbTemp.getSelectedItem();
            if (cbSelectedItem.getId() == c.getCategory().getId()) {
                cbTemp.setSelectedItem(cbSelectedItem);
                continue;
            }
            cbTemp.setSelectedIndex(i);
        }

        // seleciona no cb
        cbTemp = cbCustomerSubCategory;
        cbTemp.setSelectedIndex(0);
        for (int i = 1; i < cbTemp.getItemCount(); i++) {
            SubCategory cbSelectedItem = (SubCategory) cbTemp.getSelectedItem();
            if (cbSelectedItem.getId() == c.getSubCategory().getId()) {
                cbTemp.setSelectedItem(cbSelectedItem);
                continue;
            }
            cbTemp.setSelectedIndex(i);
        }

        // seleciona no cb
        cbTemp = cbCustomerBrand;
        cbTemp.setSelectedIndex(0);
        for (int i = 1; i < cbTemp.getItemCount(); i++) {
            Brand cbSelectedItem = (Brand) cbTemp.getSelectedItem();
            if (cbSelectedItem.getId() == c.getBrand().getId()) {
                cbTemp.setSelectedItem(cbSelectedItem);
                continue;
            }
            cbTemp.setSelectedIndex(i);
        }

        lblCustomerPicture.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPanelCustomer = new javax.swing.JTabbedPane();
        tabCustomerBasic = new javax.swing.JPanel();
        lblCustomerNote = new javax.swing.JPanel();
        lblCustomerBasicName = new javax.swing.JLabel();
        txtCustomerBasicName = new javax.swing.JTextField();
        lblCustomerBasicDocument = new javax.swing.JLabel();
        cbCustomerBasicDocumentType = new javax.swing.JComboBox<>();
        txtCustomerBasicDocument = new javax.swing.JFormattedTextField();
        cbCustomerBasicMaritalStatus = new javax.swing.JComboBox<>();
        lblCustomerBasicMaritalSatus = new javax.swing.JLabel();
        txtCustomerBasicBirthDate = new javax.swing.JFormattedTextField();
        lblCustomerBasicBirthDate = new javax.swing.JLabel();
        cbCustomerBasicGender = new javax.swing.JComboBox<>();
        lblCustomerBasicGender = new javax.swing.JLabel();
        lblCustomerId = new javax.swing.JLabel();
        txtCustomerId = new javax.swing.JTextField();
        scrollCustomerNote = new javax.swing.JScrollPane();
        txtCustomerNote = new javax.swing.JTextArea();
        lblProductDescription = new javax.swing.JLabel();
        btnCustomerBasicNext = new javax.swing.JButton();
        tabCustomerAddress = new javax.swing.JPanel();
        panelCustomerAddress = new javax.swing.JPanel();
        cbCustomerAddressPublicPlaceType = new javax.swing.JComboBox<>();
        lblCustomerAddressPublicPlaceType = new javax.swing.JLabel();
        lblCustomerAddressPublicPlace = new javax.swing.JLabel();
        txtCustomerAddressPublicPlace = new javax.swing.JTextField();
        lblCustomerAddressNumber = new javax.swing.JLabel();
        txtCustomerAddressNumber = new javax.swing.JTextField();
        lblCustomerAddressDistrict = new javax.swing.JLabel();
        txtCustomerAddressDistrict = new javax.swing.JTextField();
        lblCustomerAddressComplement = new javax.swing.JLabel();
        txtCustomerAddressComplement = new javax.swing.JTextField();
        lblCustomerAddressState = new javax.swing.JLabel();
        cbCustomerAddressState = new javax.swing.JComboBox<>();
        lblCustomerAddressCity = new javax.swing.JLabel();
        cbCustomerAddressCity = new javax.swing.JComboBox<>();
        lblCustomerAddressZipCode = new javax.swing.JLabel();
        txtCustomerAddressZipCode = new javax.swing.JFormattedTextField();
        lblCustomerAddressId = new javax.swing.JLabel();
        txtCustomerAddressId = new javax.swing.JTextField();
        btnAddressNext = new javax.swing.JButton();
        btnAddressBack = new javax.swing.JButton();
        tabCustomerContact = new javax.swing.JPanel();
        paneCustomerlContact = new javax.swing.JPanel();
        cbCustomerContactContactType = new javax.swing.JComboBox<>();
        lblCustomerContactContactType = new javax.swing.JLabel();
        txtCustomerContactValue = new javax.swing.JTextField();
        scrollCustomerContact = new javax.swing.JScrollPane();
        tableCustomerContact = new javax.swing.JTable();
        btnCustomerContactNew = new javax.swing.JButton();
        btnCustomerContactDelete = new javax.swing.JButton();
        btnCustomerContactSave = new javax.swing.JButton();
        btnCustomerContactBack = new javax.swing.JButton();
        btnCustomerContactCustomerSave = new javax.swing.JButton();
        lblPanelTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tabCustomerBasic.setBackground(new java.awt.Color(255, 255, 255));

        lblCustomerNote.setBackground(new java.awt.Color(255, 255, 255));
        lblCustomerNote.setBorder(javax.swing.BorderFactory.createTitledBorder("Básico"));

        lblCustomerBasicName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCustomerBasicName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCustomerBasicName.setText("Nome");

        lblCustomerBasicDocument.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCustomerBasicDocument.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCustomerBasicDocument.setText("Documento");

        cbCustomerBasicDocumentType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbCustomerBasicMaritalStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblCustomerBasicMaritalSatus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCustomerBasicMaritalSatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCustomerBasicMaritalSatus.setText("Estado Civil");

        lblCustomerBasicBirthDate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCustomerBasicBirthDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCustomerBasicBirthDate.setText("Data de nascimento");

        cbCustomerBasicGender.setModel(new javax.swing.DefaultComboBoxModel(br.com.store.model.enums.GenderEnum.values()));

        lblCustomerBasicGender.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCustomerBasicGender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCustomerBasicGender.setText("Sexo");

        lblCustomerId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCustomerId.setText("Codigo");
        lblCustomerId.setEnabled(false);

        txtCustomerId.setEnabled(false);

        txtCustomerNote.setColumns(20);
        txtCustomerNote.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        txtCustomerNote.setRows(5);
        scrollCustomerNote.setViewportView(txtCustomerNote);

        lblProductDescription.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProductDescription.setText("Observações");

        javax.swing.GroupLayout lblCustomerNoteLayout = new javax.swing.GroupLayout(lblCustomerNote);
        lblCustomerNote.setLayout(lblCustomerNoteLayout);
        lblCustomerNoteLayout.setHorizontalGroup(
            lblCustomerNoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblCustomerNoteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblCustomerNoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblCustomerNoteLayout.createSequentialGroup()
                        .addGroup(lblCustomerNoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCustomerBasicName, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCustomerBasicDocument, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCustomerBasicBirthDate)
                            .addComponent(lblCustomerBasicGender, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCustomerBasicMaritalSatus, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblCustomerNoteLayout.createSequentialGroup()
                        .addComponent(lblProductDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(lblCustomerNoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollCustomerNote)
                    .addComponent(cbCustomerBasicMaritalStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbCustomerBasicGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(lblCustomerNoteLayout.createSequentialGroup()
                        .addComponent(cbCustomerBasicDocumentType, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCustomerBasicDocument, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE))
                    .addComponent(txtCustomerBasicName)
                    .addComponent(txtCustomerBasicBirthDate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(lblCustomerNoteLayout.createSequentialGroup()
                        .addComponent(txtCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        lblCustomerNoteLayout.setVerticalGroup(
            lblCustomerNoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblCustomerNoteLayout.createSequentialGroup()
                .addGroup(lblCustomerNoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblCustomerNoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustomerBasicName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerBasicName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblCustomerNoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCustomerBasicDocumentType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustomerBasicDocument, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerBasicDocument))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblCustomerNoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustomerBasicBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerBasicBirthDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblCustomerNoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerBasicGender)
                    .addComponent(cbCustomerBasicGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblCustomerNoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerBasicMaritalSatus)
                    .addComponent(cbCustomerBasicMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lblCustomerNoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblCustomerNoteLayout.createSequentialGroup()
                        .addComponent(lblProductDescription)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scrollCustomerNote, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnCustomerBasicNext.setText("Próximo");

        javax.swing.GroupLayout tabCustomerBasicLayout = new javax.swing.GroupLayout(tabCustomerBasic);
        tabCustomerBasic.setLayout(tabCustomerBasicLayout);
        tabCustomerBasicLayout.setHorizontalGroup(
            tabCustomerBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCustomerBasicLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabCustomerBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCustomerNote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabCustomerBasicLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCustomerBasicNext, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        tabCustomerBasicLayout.setVerticalGroup(
            tabCustomerBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCustomerBasicLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCustomerNote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCustomerBasicNext, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        tabPanelCustomer.addTab("Básico", tabCustomerBasic);

        tabCustomerAddress.setBackground(new java.awt.Color(255, 255, 255));

        panelCustomerAddress.setBackground(new java.awt.Color(255, 255, 255));
        panelCustomerAddress.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        cbCustomerAddressPublicPlaceType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblCustomerAddressPublicPlaceType.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCustomerAddressPublicPlaceType.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCustomerAddressPublicPlaceType.setText("Tipo Logradouro");

        lblCustomerAddressPublicPlace.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCustomerAddressPublicPlace.setText("Logradouro");

        lblCustomerAddressNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCustomerAddressNumber.setText("Número");

        lblCustomerAddressDistrict.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCustomerAddressDistrict.setText("Bairro:");

        lblCustomerAddressComplement.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCustomerAddressComplement.setText("Complemento");

        lblCustomerAddressState.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCustomerAddressState.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCustomerAddressState.setText("UF");

        cbCustomerAddressState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblCustomerAddressCity.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCustomerAddressCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCustomerAddressCity.setText("Cidade");

        cbCustomerAddressCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblCustomerAddressZipCode.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCustomerAddressZipCode.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCustomerAddressZipCode.setText("CEP");

        lblCustomerAddressId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCustomerAddressId.setText("Código");
        lblCustomerAddressId.setEnabled(false);

        txtCustomerAddressId.setEnabled(false);
        txtCustomerAddressId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerAddressIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCustomerAddressLayout = new javax.swing.GroupLayout(panelCustomerAddress);
        panelCustomerAddress.setLayout(panelCustomerAddressLayout);
        panelCustomerAddressLayout.setHorizontalGroup(
            panelCustomerAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustomerAddressLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCustomerAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCustomerAddressLayout.createSequentialGroup()
                        .addGroup(panelCustomerAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCustomerAddressLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblCustomerAddressNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCustomerAddressComplement, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCustomerAddressState, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCustomerAddressZipCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCustomerAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCustomerAddressComplement)
                            .addGroup(panelCustomerAddressLayout.createSequentialGroup()
                                .addComponent(txtCustomerAddressNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCustomerAddressDistrict)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCustomerAddressDistrict))
                            .addComponent(txtCustomerAddressZipCode)
                            .addGroup(panelCustomerAddressLayout.createSequentialGroup()
                                .addComponent(cbCustomerAddressState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCustomerAddressCity, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbCustomerAddressCity, 0, 481, Short.MAX_VALUE))))
                    .addGroup(panelCustomerAddressLayout.createSequentialGroup()
                        .addGroup(panelCustomerAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblCustomerAddressId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCustomerAddressPublicPlaceType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCustomerAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbCustomerAddressPublicPlaceType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCustomerAddressId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCustomerAddressPublicPlace)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCustomerAddressPublicPlace)))
                .addContainerGap())
        );
        panelCustomerAddressLayout.setVerticalGroup(
            panelCustomerAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustomerAddressLayout.createSequentialGroup()
                .addGroup(panelCustomerAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerAddressId)
                    .addComponent(txtCustomerAddressId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCustomerAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCustomerAddressPublicPlaceType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerAddressPublicPlaceType)
                    .addComponent(lblCustomerAddressPublicPlace)
                    .addComponent(txtCustomerAddressPublicPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCustomerAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerAddressNumber)
                    .addComponent(txtCustomerAddressNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustomerAddressDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerAddressDistrict))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCustomerAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerAddressComplement)
                    .addComponent(txtCustomerAddressComplement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCustomerAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCustomerAddressState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerAddressState)
                    .addComponent(lblCustomerAddressCity)
                    .addComponent(cbCustomerAddressCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCustomerAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerAddressZipCode)
                    .addComponent(txtCustomerAddressZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        btnAddressNext.setText("Próximo");
        btnAddressNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddressNextActionPerformed(evt);
            }
        });

        btnAddressBack.setText("Voltar");
        btnAddressBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddressBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabCustomerAddressLayout = new javax.swing.GroupLayout(tabCustomerAddress);
        tabCustomerAddress.setLayout(tabCustomerAddressLayout);
        tabCustomerAddressLayout.setHorizontalGroup(
            tabCustomerAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCustomerAddressLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabCustomerAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCustomerAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabCustomerAddressLayout.createSequentialGroup()
                        .addComponent(btnAddressBack, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddressNext, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        tabCustomerAddressLayout.setVerticalGroup(
            tabCustomerAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCustomerAddressLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCustomerAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabCustomerAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddressNext, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddressBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        tabPanelCustomer.addTab("Endereço", tabCustomerAddress);

        tabCustomerContact.setBackground(new java.awt.Color(255, 255, 255));

        paneCustomerlContact.setBackground(new java.awt.Color(255, 255, 255));
        paneCustomerlContact.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato"));

        cbCustomerContactContactType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblCustomerContactContactType.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCustomerContactContactType.setText("Tipo ");

        tableCustomerContact.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollCustomerContact.setViewportView(tableCustomerContact);

        btnCustomerContactNew.setText("Novo");

        btnCustomerContactDelete.setText("Del");

        btnCustomerContactSave.setText("Salvar");

        javax.swing.GroupLayout paneCustomerlContactLayout = new javax.swing.GroupLayout(paneCustomerlContact);
        paneCustomerlContact.setLayout(paneCustomerlContactLayout);
        paneCustomerlContactLayout.setHorizontalGroup(
            paneCustomerlContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneCustomerlContactLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneCustomerlContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollCustomerContact, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                    .addGroup(paneCustomerlContactLayout.createSequentialGroup()
                        .addComponent(lblCustomerContactContactType)
                        .addGap(1, 1, 1)
                        .addComponent(cbCustomerContactContactType, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCustomerContactValue)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneCustomerlContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCustomerContactDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCustomerContactNew, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(btnCustomerContactSave, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        paneCustomerlContactLayout.setVerticalGroup(
            paneCustomerlContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneCustomerlContactLayout.createSequentialGroup()
                .addGroup(paneCustomerlContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCustomerContactSave)
                    .addGroup(paneCustomerlContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCustomerContactContactType)
                        .addComponent(cbCustomerContactContactType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCustomerContactValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneCustomerlContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneCustomerlContactLayout.createSequentialGroup()
                        .addComponent(btnCustomerContactNew, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addComponent(btnCustomerContactDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollCustomerContact, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        btnCustomerContactBack.setText("Voltar");
        btnCustomerContactBack.setPreferredSize(new java.awt.Dimension(71, 23));
        btnCustomerContactBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerContactBackActionPerformed(evt);
            }
        });

        btnCustomerContactCustomerSave.setText("Salvar");
        btnCustomerContactCustomerSave.setPreferredSize(new java.awt.Dimension(71, 23));

        javax.swing.GroupLayout tabCustomerContactLayout = new javax.swing.GroupLayout(tabCustomerContact);
        tabCustomerContact.setLayout(tabCustomerContactLayout);
        tabCustomerContactLayout.setHorizontalGroup(
            tabCustomerContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCustomerContactLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabCustomerContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneCustomerlContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tabCustomerContactLayout.createSequentialGroup()
                        .addComponent(btnCustomerContactBack, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCustomerContactCustomerSave, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        tabCustomerContactLayout.setVerticalGroup(
            tabCustomerContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCustomerContactLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paneCustomerlContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabCustomerContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCustomerContactCustomerSave, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnCustomerContactBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );

        tabPanelCustomer.addTab("Contato", tabCustomerContact);

        lblPanelTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblPanelTitle.setText("Cliente - Novo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPanelCustomer)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPanelTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPanelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabPanelCustomer))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddressBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddressBackActionPerformed
        setActiveTab(tabCustomerBasic);
    }//GEN-LAST:event_btnAddressBackActionPerformed

    private void btnAddressNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddressNextActionPerformed
        setActiveTab(tabCustomerContact);
    }//GEN-LAST:event_btnAddressNextActionPerformed

    private void btnCustomerContactBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerContactBackActionPerformed
        setActiveTab(tabCustomerAddress);
    }//GEN-LAST:event_btnCustomerContactBackActionPerformed

    private void txtCustomerAddressIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerAddressIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerAddressIdActionPerformed

    void setActiveTab(Component c) {
        tabPanelCustomer.setSelectedComponent(c);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddressBack;
    private javax.swing.JButton btnAddressNext;
    private javax.swing.JButton btnCustomerBasicNext;
    private javax.swing.JButton btnCustomerContactBack;
    private javax.swing.JButton btnCustomerContactCustomerSave;
    private javax.swing.JButton btnCustomerContactDelete;
    private javax.swing.JButton btnCustomerContactNew;
    private javax.swing.JButton btnCustomerContactSave;
    private javax.swing.JComboBox<String> cbCustomerAddressCity;
    private javax.swing.JComboBox<String> cbCustomerAddressPublicPlaceType;
    private javax.swing.JComboBox<String> cbCustomerAddressState;
    private javax.swing.JComboBox<String> cbCustomerBasicDocumentType;
    private javax.swing.JComboBox<String> cbCustomerBasicGender;
    private javax.swing.JComboBox<String> cbCustomerBasicMaritalStatus;
    private javax.swing.JComboBox<String> cbCustomerContactContactType;
    private javax.swing.JLabel lblCustomerAddressCity;
    private javax.swing.JLabel lblCustomerAddressComplement;
    private javax.swing.JLabel lblCustomerAddressDistrict;
    private javax.swing.JLabel lblCustomerAddressId;
    private javax.swing.JLabel lblCustomerAddressNumber;
    private javax.swing.JLabel lblCustomerAddressPublicPlace;
    private javax.swing.JLabel lblCustomerAddressPublicPlaceType;
    private javax.swing.JLabel lblCustomerAddressState;
    private javax.swing.JLabel lblCustomerAddressZipCode;
    private javax.swing.JLabel lblCustomerBasicBirthDate;
    private javax.swing.JLabel lblCustomerBasicDocument;
    private javax.swing.JLabel lblCustomerBasicGender;
    private javax.swing.JLabel lblCustomerBasicMaritalSatus;
    private javax.swing.JLabel lblCustomerBasicName;
    private javax.swing.JLabel lblCustomerContactContactType;
    private javax.swing.JLabel lblCustomerId;
    private javax.swing.JPanel lblCustomerNote;
    private javax.swing.JLabel lblPanelTitle;
    private javax.swing.JLabel lblProductDescription;
    private javax.swing.JPanel paneCustomerlContact;
    private javax.swing.JPanel panelCustomerAddress;
    private javax.swing.JScrollPane scrollCustomerContact;
    private javax.swing.JScrollPane scrollCustomerNote;
    private javax.swing.JPanel tabCustomerAddress;
    private javax.swing.JPanel tabCustomerBasic;
    private javax.swing.JPanel tabCustomerContact;
    private javax.swing.JTabbedPane tabPanelCustomer;
    private javax.swing.JTable tableCustomerContact;
    private javax.swing.JTextField txtCustomerAddressComplement;
    private javax.swing.JTextField txtCustomerAddressDistrict;
    private javax.swing.JTextField txtCustomerAddressId;
    private javax.swing.JTextField txtCustomerAddressNumber;
    private javax.swing.JTextField txtCustomerAddressPublicPlace;
    private javax.swing.JFormattedTextField txtCustomerAddressZipCode;
    private javax.swing.JFormattedTextField txtCustomerBasicBirthDate;
    private javax.swing.JFormattedTextField txtCustomerBasicDocument;
    private javax.swing.JTextField txtCustomerBasicName;
    private javax.swing.JTextField txtCustomerContactValue;
    private javax.swing.JTextField txtCustomerId;
    private javax.swing.JTextArea txtCustomerNote;
    // End of variables declaration//GEN-END:variables

    private void loadDocumentType() {
        FormUtil.clearComboBox(cbCustomerBasicDocumentType);
        List<DocumentType> list = null;
        try {
            list = ServiceDocumentType.getInstance().list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }

        if (list == null) {
            return;
        }

        FormUtil.setModelComboBox(cbCustomerBasicDocumentType, list);
    }

    private void loadMaritalStatus() {
        FormUtil.clearComboBox(cbCustomerBasicMaritalStatus);
        List<MaritalStatus> list = null;
        try {
            list = ServiceMaritalStatus.getInstance().list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }

        if (list == null) {
            return;
        }

        FormUtil.setModelComboBox(cbCustomerBasicMaritalStatus, list);
    }

    private void loadPublicPlaceType() {
        FormUtil.clearComboBox(cbCustomerAddressPublicPlaceType);
        List<PublicPlaceType> list = null;
        try {
            list = ServicePublicPlaceType.getInstance().list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }

        if (list == null) {
            return;
        }

        FormUtil.setModelComboBox(cbCustomerAddressPublicPlaceType, list);
    }

    private void loadCity() {
//        Integer stateId = ((State) cbCustomerAddressState.getSelectedItem()).getId();

        FormUtil.clearComboBox(cbCustomerAddressCity);
        List<City> list = null;
        try {
            list = ServiceCity.getInstance().list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }

        if (list == null) {
            return;
        }

        FormUtil.setModelComboBox(cbCustomerAddressCity, list);
    }

    private void loadContactType() {
        FormUtil.clearComboBox(cbCustomerContactContactType);
        List<ContactType> list = null;
        try {
            list = ServiceContactType.getInstance().list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }

        if (list == null) {
            return;
        }

        FormUtil.setModelComboBox(cbCustomerContactContactType, list);
    }

    private void loadState() {
        FormUtil.clearComboBox(cbCustomerAddressState);
        List<State> list = null;
        try {
            list = ServiceState.getInstance().list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }

        if (list == null) {
            return;
        }

        FormUtil.setModelComboBox(cbCustomerAddressState, list);
    }
}
