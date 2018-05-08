package br.com.store.model;

public class ContactType {

    private Integer Id;
    private String description; //Example: email, tel, faz, etc...

    public ContactType(Integer Id, String description) {
        this.Id = Id;
        this.description = description;
    }

    public ContactType() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
