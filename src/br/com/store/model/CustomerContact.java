package br.com.store.model;

public class CustomerContact {
    private Integer Id;
    private Customer customerId;
    private ContactType contactTypeId;
    private String value; /*Example: for contactType = email --> xxxyyyzzz@email.com
                            for contactType = tel --> 123456789, etc...
                            */  

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
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
