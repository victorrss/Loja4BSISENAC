package br.com.store.model;

public class CustomerContact {

    private Integer Id;
    private Customer customer;
    private ContactType contactType;
    private String value;
    /*Example: for contactType = email --> xxxyyyzzz@email.com
                            for contactType = tel --> 123456789, etc...
     */
    private boolean enabled;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ContactType getContactType() {
        return contactType;
    }

    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

}
