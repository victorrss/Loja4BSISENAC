package br.com.store.model;

import java.util.Date;

/**
 * @author Eric Palmeira de Souza <palmeiraeric@gmail.com>
 * @date 30/04/2018
 */

public class Costumer {
    private Integer Id;
    private Address addressID;
    private String name;
    private String document;
    private String gender;
    private Date birth_date;
    private String note;
    private MaritalStatus maritalStatusID;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public MaritalStatus getMaritalStatusID() {
        return maritalStatusID;
    }

    public void setMaritalStatusID(MaritalStatus maritalStatusID) {
        this.maritalStatusID = maritalStatusID;
    }

    
    
    
    
}
