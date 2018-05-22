package br.com.store.view;

import br.com.store.model.Address;
import br.com.store.model.City;
import br.com.store.model.ContactType;
import br.com.store.model.Customer;
import br.com.store.model.CustomerContact;
import br.com.store.model.DocumentType;
import br.com.store.model.MaritalStatus;
import br.com.store.model.PublicPlaceType;
import br.com.store.model.State;
import br.com.store.model.enums.FormOperationEnum;
import br.com.store.model.enums.GenderEnum;
import br.com.store.service.ServiceCity;
import br.com.store.service.ServiceContactType;
import br.com.store.service.ServiceCustomer;
import br.com.store.service.ServiceDocumentType;
import br.com.store.service.ServiceMaritalStatus;
import br.com.store.service.ServicePublicPlaceType;
import br.com.store.service.ServiceState;
import br.com.store.utils.DataUtil;
import br.com.store.utils.FormUtil;
import br.com.store.view.main.FrameMain;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.DefaultFormatterFactory;

public class PanelCustomerCreateUpdate extends javax.swing.JPanel {

    private boolean preLoad;
    private FormOperationEnum operation = null;
    private Integer customerId = null, addressId = null;

    public PanelCustomerCreateUpdate() {
        preLoad = true;
        initComponents();
        loadDocumentType();
        setMaskDocumentType();
        loadMaritalStatus();
        loadContactType();
        setMaskContactType();
        loadPublicPlaceType();
        loadState();
        loadCity();
        setMaskBirthDate();
        preLoad = false;
    }

    public PanelCustomerCreateUpdate(FormOperationEnum op, Integer id) {
        preLoad = true;
        initComponents();
        loadDocumentType();
        setMaskDocumentType();
        loadMaritalStatus();
        loadContactType();
        setMaskContactType();
        loadPublicPlaceType();
        loadState();
        loadCity();
        setMaskBirthDate();
        prepareFormOperation(op, id);
        preLoad = false;
    }

    private void prepareFormOperation(FormOperationEnum op, Integer id) {
        this.operation = op;
        this.customerId = id;
        if (this.operation == FormOperationEnum.CREATE) {
            lblPanelTitle.setText("Cliente - Novo");
        } else {
            lblPanelTitle.setText("Cliente - Alteração");
            loadCustomer(customerId);
        }
    }

    private void loadCustomer(Integer id) {
        Customer c;
        try {
            c = ServiceCustomer.getInstance().get(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        customerId = c.getId();
        txtCustomerBasicName.setText(c.getName());

        txtCustomerBasicBirthDate.setText(DataUtil.getDateFormat("dd/MM/yyyy").format(c.getBirthDate()));
        txtCustomerBasicNote.setText(c.getNote());

        JComboBox cbTemp = null;
        cbTemp = cbCustomerBasicGender;
        cbTemp.setSelectedIndex(0);
        if ("M".equals(c.getGender())) {
            cbTemp.setSelectedIndex(0);
        } else {
            cbTemp.setSelectedIndex(1);
        }

// seleciona no cb
        if (c.getMaritalStatus() != null) {
            cbTemp = cbCustomerBasicMaritalStatus;
            cbTemp.setSelectedIndex(0);
            for (int i = 0; i < cbTemp.getItemCount(); i++) {
                MaritalStatus cbSelectedItem = (MaritalStatus) cbTemp.getSelectedItem();
                if (cbSelectedItem.getId() == c.getMaritalStatus().getId()) {
                    cbTemp.setSelectedItem(cbSelectedItem);
                    break;
                }
                cbTemp.setSelectedIndex(i);
            }
        }
        // seleciona no cb

        if (c.getDocumentType()
                != null) {
            cbTemp = cbCustomerBasicDocumentType;
            cbTemp.setSelectedIndex(0);
            for (int i = 0; i < cbTemp.getItemCount(); i++) {
                DocumentType cbSelectedItem = (DocumentType) cbTemp.getSelectedItem();
                if (cbSelectedItem.getId() == c.getDocumentType().getId()) {
                    cbTemp.setSelectedItem(cbSelectedItem);
                    break;
                }
                cbTemp.setSelectedIndex(i);
            }
        }

        txtCustomerBasicDocument.setText(c.getDocument());
        //address
        Address a = c.getAddress();

        txtCustomerAddressComplement.setText(a.getComplement());
        txtCustomerAddressDistrict.setText(a.getDistrict());
        addressId = a.getId();
        txtCustomerAddressNumber.setText((a.getNumber() != 0 ? a.getNumber().toString() : ""));
        txtCustomerAddressPublicPlace.setText(a.getPublicPlace());
        txtCustomerAddressZipCode.setText(String.format("%08d", a.getZipcode()));

        // seleciona no cb
        if (a.getPublicPlaceType() != null) {
            cbTemp = cbCustomerAddressPublicPlaceType;
            cbTemp.setSelectedIndex(0);
            for (int i = 0; i < cbTemp.getItemCount(); i++) {
                PublicPlaceType cbSelectedItem = (PublicPlaceType) cbTemp.getSelectedItem();
                if (cbSelectedItem.getId() == a.getPublicPlaceType().getId()) {
                    cbTemp.setSelectedItem(cbSelectedItem);
                    break;
                }
                cbTemp.setSelectedIndex(i);
            }
        }
        // seleciona no cb

        if (a.getCity() != null && a.getCity().getState() != null) {
            cbTemp = cbCustomerAddressState;
            cbTemp.setSelectedIndex(0);
            for (int i = 0; i < cbTemp.getItemCount(); i++) {
                State cbSelectedItem = (State) cbTemp.getSelectedItem();
                if (cbSelectedItem.getId() == a.getCity().getState().getId()) {
                    cbTemp.setSelectedItem(cbSelectedItem);
                    break;
                }
                cbTemp.setSelectedIndex(i);
            }
        }
        //loadCity();
        // seleciona no cb

        if (a.getCity() != null) {
            cbTemp = cbCustomerAddressCity;
            cbTemp.setSelectedIndex(0);
            for (int i = 0; i < cbTemp.getItemCount(); i++) {
                City cbSelectedItem = (City) cbTemp.getSelectedItem();
                int tmp = a.getCity().getId();
                int tmp2 = cbSelectedItem.getId();
                if (tmp == tmp2) {
                    cbTemp.setSelectedItem(cbSelectedItem);
                    break;
                }
                cbTemp.setSelectedIndex(i);
            }

        }

        // load contacts
        if (c.getContacts()
                != null) {
            DefaultTableModel model = (DefaultTableModel) tableCustomerContact.getModel();
            model.setNumRows(0);
            for (CustomerContact ctt : c.getContacts()) {
                model.addRow(new Object[]{
                    // ctt.getId(),
                    ctt.getContactType(),
                    ctt.getValue()
                });
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCustomer = new javax.swing.JPanel();
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
        scrollCustomerBasicNote = new javax.swing.JScrollPane();
        txtCustomerBasicNote = new javax.swing.JTextArea();
        lblCustomerBasicNote = new javax.swing.JLabel();
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
        btnAddressNext = new javax.swing.JButton();
        btnAddressBack = new javax.swing.JButton();
        tabCustomerContact = new javax.swing.JPanel();
        paneCustomerlContact = new javax.swing.JPanel();
        cbCustomerContactContactType = new javax.swing.JComboBox<>();
        lblCustomerContactContactType = new javax.swing.JLabel();
        scrollCustomerContact = new javax.swing.JScrollPane();
        tableCustomerContact = new javax.swing.JTable();
        btnCustomerContactAdd = new javax.swing.JButton();
        txtCustomerContactValue = new javax.swing.JFormattedTextField();
        btnCustomerContactBack = new javax.swing.JButton();
        btnCustomerContactCustomerSave = new javax.swing.JButton();
        lblPanelTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        panelCustomer.setBackground(new java.awt.Color(255, 255, 255));

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
        cbCustomerBasicDocumentType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCustomerBasicDocumentTypeActionPerformed(evt);
            }
        });

        cbCustomerBasicMaritalStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblCustomerBasicMaritalSatus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCustomerBasicMaritalSatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCustomerBasicMaritalSatus.setText("Estado Civil");

        txtCustomerBasicBirthDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        lblCustomerBasicBirthDate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCustomerBasicBirthDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCustomerBasicBirthDate.setText("Data de nascimento");

        cbCustomerBasicGender.setModel(new javax.swing.DefaultComboBoxModel(br.com.store.model.enums.GenderEnum.values()));

        lblCustomerBasicGender.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCustomerBasicGender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCustomerBasicGender.setText("Sexo");

        txtCustomerBasicNote.setColumns(20);
        txtCustomerBasicNote.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        txtCustomerBasicNote.setRows(5);
        scrollCustomerBasicNote.setViewportView(txtCustomerBasicNote);

        lblCustomerBasicNote.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCustomerBasicNote.setText("Observações");

        javax.swing.GroupLayout lblCustomerNoteLayout = new javax.swing.GroupLayout(lblCustomerNote);
        lblCustomerNote.setLayout(lblCustomerNoteLayout);
        lblCustomerNoteLayout.setHorizontalGroup(
            lblCustomerNoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblCustomerNoteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblCustomerNoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblCustomerNoteLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(lblCustomerBasicName, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCustomerBasicName))
                    .addGroup(lblCustomerNoteLayout.createSequentialGroup()
                        .addGroup(lblCustomerNoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lblCustomerNoteLayout.createSequentialGroup()
                                .addGroup(lblCustomerNoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCustomerBasicBirthDate)
                                    .addComponent(lblCustomerBasicGender, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCustomerBasicMaritalSatus, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblCustomerNoteLayout.createSequentialGroup()
                                .addGroup(lblCustomerNoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCustomerBasicDocument, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCustomerBasicNote, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(lblCustomerNoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lblCustomerNoteLayout.createSequentialGroup()
                                .addComponent(cbCustomerBasicDocumentType, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCustomerBasicDocument))
                            .addComponent(scrollCustomerBasicNote, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
                            .addComponent(cbCustomerBasicMaritalStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbCustomerBasicGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCustomerBasicBirthDate, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        lblCustomerNoteLayout.setVerticalGroup(
            lblCustomerNoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblCustomerNoteLayout.createSequentialGroup()
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblCustomerNoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblCustomerNoteLayout.createSequentialGroup()
                        .addComponent(lblCustomerBasicNote)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scrollCustomerBasicNote, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnCustomerBasicNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/next.png"))); // NOI18N
        btnCustomerBasicNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerBasicNextActionPerformed(evt);
            }
        });

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
        cbCustomerAddressState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCustomerAddressStateActionPerformed(evt);
            }
        });

        lblCustomerAddressCity.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCustomerAddressCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCustomerAddressCity.setText("Cidade");

        cbCustomerAddressCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblCustomerAddressZipCode.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCustomerAddressZipCode.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCustomerAddressZipCode.setText("CEP");

        try {
            txtCustomerAddressZipCode.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

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
                                .addComponent(cbCustomerAddressCity, 0, 602, Short.MAX_VALUE))))
                    .addGroup(panelCustomerAddressLayout.createSequentialGroup()
                        .addComponent(lblCustomerAddressPublicPlaceType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCustomerAddressPublicPlaceType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCustomerAddressPublicPlace)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCustomerAddressPublicPlace)))
                .addContainerGap())
        );
        panelCustomerAddressLayout.setVerticalGroup(
            panelCustomerAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustomerAddressLayout.createSequentialGroup()
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
                .addGap(0, 149, Short.MAX_VALUE))
        );

        btnAddressNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/next.png"))); // NOI18N
        btnAddressNext.setToolTipText("");
        btnAddressNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddressNextActionPerformed(evt);
            }
        });

        btnAddressBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/back.png"))); // NOI18N
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
                .addGroup(tabCustomerAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddressNext, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddressBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        tabPanelCustomer.addTab("Endereço", tabCustomerAddress);

        tabCustomerContact.setBackground(new java.awt.Color(255, 255, 255));

        paneCustomerlContact.setBackground(new java.awt.Color(255, 255, 255));
        paneCustomerlContact.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato"));

        cbCustomerContactContactType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCustomerContactContactType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCustomerContactContactTypeActionPerformed(evt);
            }
        });

        lblCustomerContactContactType.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCustomerContactContactType.setText("Tipo ");

        tableCustomerContact.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableCustomerContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCustomerContactMouseClicked(evt);
            }
        });
        scrollCustomerContact.setViewportView(tableCustomerContact);

        btnCustomerContactAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/ok.png"))); // NOI18N
        btnCustomerContactAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerContactAddActionPerformed(evt);
            }
        });

        txtCustomerContactValue.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        javax.swing.GroupLayout paneCustomerlContactLayout = new javax.swing.GroupLayout(paneCustomerlContact);
        paneCustomerlContact.setLayout(paneCustomerlContactLayout);
        paneCustomerlContactLayout.setHorizontalGroup(
            paneCustomerlContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneCustomerlContactLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneCustomerlContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollCustomerContact, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
                    .addGroup(paneCustomerlContactLayout.createSequentialGroup()
                        .addComponent(lblCustomerContactContactType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCustomerContactContactType, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCustomerContactValue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCustomerContactAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        paneCustomerlContactLayout.setVerticalGroup(
            paneCustomerlContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneCustomerlContactLayout.createSequentialGroup()
                .addGroup(paneCustomerlContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(paneCustomerlContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCustomerContactContactType)
                        .addComponent(cbCustomerContactContactType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCustomerContactValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustomerContactAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollCustomerContact, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnCustomerContactBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/back.png"))); // NOI18N
        btnCustomerContactBack.setPreferredSize(new java.awt.Dimension(71, 23));
        btnCustomerContactBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerContactBackActionPerformed(evt);
            }
        });

        btnCustomerContactCustomerSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/save.png"))); // NOI18N
        btnCustomerContactCustomerSave.setPreferredSize(new java.awt.Dimension(71, 23));
        btnCustomerContactCustomerSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerContactCustomerSaveActionPerformed(evt);
            }
        });

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
                    .addComponent(btnCustomerContactCustomerSave, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(btnCustomerContactBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );

        tabPanelCustomer.addTab("Contato", tabCustomerContact);

        lblPanelTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblPanelTitle.setText("Cliente - Novo");

        javax.swing.GroupLayout panelCustomerLayout = new javax.swing.GroupLayout(panelCustomer);
        panelCustomer.setLayout(panelCustomerLayout);
        panelCustomerLayout.setHorizontalGroup(
            panelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPanelCustomer)
            .addGroup(panelCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCustomerLayout.setVerticalGroup(
            panelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPanelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabPanelCustomer))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnCustomerContactCustomerSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerContactCustomerSaveActionPerformed
        String temp = "", temp2 = "";
        if (operation == FormOperationEnum.CREATE) {
            temp = "cadastrar";
            temp2 = "cadastrado";
        } else {
            temp = "alterar";
            temp2 = "alterado";
        }

        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja " + temp + " um cliente?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.NO_OPTION) {
            return;
        }

        Customer customer = new Customer();
        customer.setId(customerId);
        customer.setName(txtCustomerBasicName.getText());
        customer.setDocument(DataUtil.onlyNumbers((String) txtCustomerBasicDocument.getText()));
        customer.setBirthDate(DataUtil.parseDate("dd/MM/yyyy", txtCustomerBasicBirthDate.getText()));
        customer.setGender(((GenderEnum) cbCustomerBasicGender.getSelectedItem()).equals(GenderEnum.MALE) ? "M" : "F");
        customer.setMaritalStatus((MaritalStatus) cbCustomerBasicMaritalStatus.getSelectedItem());
        customer.setNote(txtCustomerBasicNote.getText());
        customer.setDocumentType((DocumentType) cbCustomerBasicDocumentType.getSelectedItem());
        // address
        Address address = new Address();
        address.setId(customerId);
        address.setComplement(txtCustomerAddressComplement.getText());
        address.setDistrict(txtCustomerAddressDistrict.getText());
        address.setNumber(DataUtil.parseInteger(txtCustomerAddressNumber.getText()));
        address.setPublicPlace(txtCustomerAddressPublicPlace.getText());
        address.setPublicPlaceType((PublicPlaceType) cbCustomerAddressPublicPlaceType.getSelectedItem());
        address.setZipcode(DataUtil.parseInteger(DataUtil.onlyNumbers((String) txtCustomerAddressZipCode.getText())));
        address.setCity((City) cbCustomerAddressCity.getSelectedItem());
        customer.setAddress(address);
        // contacts
        List<CustomerContact> contacts = new ArrayList<>();
        TableModel model = tableCustomerContact.getModel();
        for (int i = 0; i < tableCustomerContact.getRowCount(); i++) {
            CustomerContact ctt = new CustomerContact();
            //ctt.setId(DataUtil.parseInteger(model.getValueAt(i, 0) + ""));
            ctt.setCustomerId(customer.getId());
            ctt.setContactType((ContactType) model.getValueAt(i, 0));
            ctt.setValue((String) model.getValueAt(i, 1));
            contacts.add(ctt);
        }
        customer.setContacts(contacts);

        try {
            if (operation == FormOperationEnum.CREATE) {
                ServiceCustomer.getInstance().insert(customer);
            } else {
                ServiceCustomer.getInstance().update(customer);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Cliente " + temp2 + " com sucesso",
                "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        if (operation == FormOperationEnum.CREATE) {
            FrameMain.loadCardCustomerCreate(true);
            FrameMain.loadCardCustomerList(false);
        } else {
            FrameMain.loadCardCustomerList(true);
        }
    }//GEN-LAST:event_btnCustomerContactCustomerSaveActionPerformed

    private void cbCustomerAddressStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCustomerAddressStateActionPerformed
        if (!preLoad) {
            loadCity();
        }
    }//GEN-LAST:event_cbCustomerAddressStateActionPerformed

    private void btnCustomerBasicNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerBasicNextActionPerformed
        setActiveTab(tabCustomerAddress);
    }//GEN-LAST:event_btnCustomerBasicNextActionPerformed

    private void cbCustomerBasicDocumentTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCustomerBasicDocumentTypeActionPerformed
        setMaskDocumentType();
    }//GEN-LAST:event_cbCustomerBasicDocumentTypeActionPerformed

    private void cbCustomerContactContactTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCustomerContactContactTypeActionPerformed
        setMaskContactType();
    }//GEN-LAST:event_cbCustomerContactContactTypeActionPerformed

    private void btnCustomerContactAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerContactAddActionPerformed

        if (!"E-mail".equals(((ContactType) cbCustomerContactContactType.getSelectedItem()).getDescription())
                && !"Nextel ID".equals(((ContactType) cbCustomerContactContactType.getSelectedItem()).getDescription())) {
            if (DataUtil.empty(DataUtil.onlyNumbers(txtCustomerContactValue.getText()))) {
                JOptionPane.showMessageDialog(this, "Insira o contato corretamente");
                return;
            }

        }
        ContactType docType = (ContactType) cbCustomerContactContactType.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel) tableCustomerContact.getModel();
        String value = (String) txtCustomerContactValue.getText();
        model.addRow(new Object[]{
            //null,
            docType,
            value
        });

        txtCustomerContactValue.setText("");
        cbCustomerContactContactType.setSelectedIndex(0);
        customerId = addressId = null;
    }//GEN-LAST:event_btnCustomerContactAddActionPerformed

    private void tableCustomerContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCustomerContactMouseClicked
        if (evt.getButton() != MouseEvent.BUTTON3) {
            return;
        }
        JPopupMenu popup = new JPopupMenu();
        JMenuItem mItemDelete = new JMenuItem("Deletar");
        //JMenuItem mItemUpdate = new JMenuItem("Alterar");
        mItemDelete.addActionListener((e) -> {
            if (tableCustomerContact.getSelectedRow() != -1) {
                DefaultTableModel dtm = (DefaultTableModel) tableCustomerContact.getModel();
                if (tableCustomerContact.getSelectedRow() >= 0) {
                    dtm.removeRow(tableCustomerContact.getSelectedRow());
                    tableCustomerContact.setModel(dtm);
                } else {
                    JOptionPane.showMessageDialog(null, "Selecione uma linha!");
                };
            }
        });

        popup.add(mItemDelete);

        popup.show(tableCustomerContact, (int) evt.getX(), (int) evt.getY());
    }//GEN-LAST:event_tableCustomerContactMouseClicked

    void setActiveTab(Component c) {
        tabPanelCustomer.setSelectedComponent(c);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddressBack;
    private javax.swing.JButton btnAddressNext;
    private javax.swing.JButton btnCustomerBasicNext;
    private javax.swing.JButton btnCustomerContactAdd;
    private javax.swing.JButton btnCustomerContactBack;
    private javax.swing.JButton btnCustomerContactCustomerSave;
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
    private javax.swing.JLabel lblCustomerBasicNote;
    private javax.swing.JLabel lblCustomerContactContactType;
    private javax.swing.JPanel lblCustomerNote;
    private javax.swing.JLabel lblPanelTitle;
    private javax.swing.JPanel paneCustomerlContact;
    private javax.swing.JPanel panelCustomer;
    private javax.swing.JPanel panelCustomerAddress;
    private javax.swing.JScrollPane scrollCustomerBasicNote;
    private javax.swing.JScrollPane scrollCustomerContact;
    private javax.swing.JPanel tabCustomerAddress;
    private javax.swing.JPanel tabCustomerBasic;
    private javax.swing.JPanel tabCustomerContact;
    private javax.swing.JTabbedPane tabPanelCustomer;
    private javax.swing.JTable tableCustomerContact;
    private javax.swing.JTextField txtCustomerAddressComplement;
    private javax.swing.JTextField txtCustomerAddressDistrict;
    private javax.swing.JTextField txtCustomerAddressNumber;
    private javax.swing.JTextField txtCustomerAddressPublicPlace;
    private javax.swing.JFormattedTextField txtCustomerAddressZipCode;
    private javax.swing.JFormattedTextField txtCustomerBasicBirthDate;
    private javax.swing.JFormattedTextField txtCustomerBasicDocument;
    private javax.swing.JTextField txtCustomerBasicName;
    private javax.swing.JTextArea txtCustomerBasicNote;
    private javax.swing.JFormattedTextField txtCustomerContactValue;
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
        State s = (State) cbCustomerAddressState.getSelectedItem();
        if (s == null) {
            return;
        }
        Integer stateId = s.getId();

        FormUtil.clearComboBox(cbCustomerAddressCity);
        List<City> list = null;
        try {
            list = ServiceCity.getInstance().list(stateId);
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

    private void setMaskDocumentType() {
        javax.swing.text.MaskFormatter maskFmt = new javax.swing.text.MaskFormatter();
        DocumentType dt = (DocumentType) cbCustomerBasicDocumentType.getSelectedItem();
        if (dt != null) {
            try {
                if (dt.getName().equals("CPF")) {
                    maskFmt = new javax.swing.text.MaskFormatter("###.###.###-##");
                } else {
                    maskFmt = new javax.swing.text.MaskFormatter("##.###.###/####-##");
                }
                maskFmt.setPlaceholderCharacter('_');
                txtCustomerBasicDocument.setValue(null);
                txtCustomerBasicDocument.setFormatterFactory(new DefaultFormatterFactory(maskFmt));

            } catch (ParseException ex) {
                Logger.getLogger(PanelCustomerCreateUpdate.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    private void setMaskBirthDate() {
        javax.swing.text.MaskFormatter maskFmt = new javax.swing.text.MaskFormatter();
        try {
            maskFmt = new javax.swing.text.MaskFormatter("##/##/####");
            maskFmt.setPlaceholderCharacter('_');
            txtCustomerBasicBirthDate.setValue(null);
            txtCustomerBasicBirthDate.setFormatterFactory(new DefaultFormatterFactory(maskFmt));

        } catch (ParseException ex) {
            Logger.getLogger(PanelCustomerCreateUpdate.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setMaskContactType() {
        javax.swing.text.MaskFormatter maskFmt = new javax.swing.text.MaskFormatter();
        ContactType ct = (ContactType) cbCustomerContactContactType.getSelectedItem();
        if (ct != null) {
            try {
                String title = ct.getDescription().toUpperCase();

                if (title.contains("FIXO")) {
                    maskFmt = new javax.swing.text.MaskFormatter("(##) ####-####");
                } else if (title.contains("CELULAR")) {
                    maskFmt = new javax.swing.text.MaskFormatter("(##) #####-####");
                } else {
                    txtCustomerContactValue.setText("");
                    txtCustomerContactValue.setValue(null);
                    txtCustomerContactValue.setFormatterFactory(null);
                }

                if (title.contains("FIXO")
                        || title.contains("CELULAR")) {
                    maskFmt.setPlaceholderCharacter('_');
                    txtCustomerContactValue.setValue(null);
                    txtCustomerContactValue.setFormatterFactory(new DefaultFormatterFactory(maskFmt));
                } else {
                    txtCustomerContactValue.setText("");
                    txtCustomerContactValue.setValue(null);
                    txtCustomerContactValue.setFormatterFactory(null);

                }
            } catch (ParseException ex) {
                Logger.getLogger(PanelCustomerCreateUpdate.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
