package br.com.store.model;

/**
 * @author Eric Palmeira de Souza <palmeiraeric@gmail.com>
 * @date 30/04/2018
 */

class Contact {
    
    private Integer Id;
    private ContactType contactTypeId;
    private String value;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public ContactType getContactTypeId() {
        return contactTypeId;
    }

    public void setContactTypeId(ContactType contactTypeId) {
        this.contactTypeId = contactTypeId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    
    
}
