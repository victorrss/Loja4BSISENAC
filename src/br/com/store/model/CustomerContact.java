package br.com.store.model;

/**
 * @author Eric Palmeira de Souza <palmeiraeric@gmail.com>
 * @date 30/04/2018
 */

public class CustomerContact {
    private Integer Id;
    private Costumer customerId;
    private Contact contactId;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Costumer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Costumer customerId) {
        this.customerId = customerId;
    }

    public Contact getContactId() {
        return contactId;
    }

    public void setContactId(Contact contactId) {
        this.contactId = contactId;
    }
    
    
    
}
