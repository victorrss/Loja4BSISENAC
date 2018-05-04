package br.com.store.model;

import java.util.Date;

public class Customer {
    private Integer Id;
    private Address addressID;  
    private MaritalStatus maritalStatusID; 
    private String name; 
    private DocumentType documentTypeID; 
    private String document; 
    private String gender; // M or F.
    private Date birth_date; //Date example: ##/##/####
    private String note; //Example: Legal and frequent customer, annoying customer, etc...

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Address getAddressID() {
        return addressID;
    }

    public void setAddressID(Address addressID) {
        this.addressID = addressID;
    }

    public MaritalStatus getMaritalStatusID() {
        return maritalStatusID;
    }

    public void setMaritalStatusID(MaritalStatus maritalStatusID) {
        this.maritalStatusID = maritalStatusID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DocumentType getDocumentTypeID() {
        return documentTypeID;
    }

    public void setDocumentTypeID(DocumentType documentTypeID) {
        this.documentTypeID = documentTypeID;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    
    
}
