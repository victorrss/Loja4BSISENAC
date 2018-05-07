package br.com.store.model;

public class MaritalStatus {

    private Integer Id;
    private String description; //Example: Married, single, divorced, etc...

    public MaritalStatus(Integer Id, String description) {
        this.Id = Id;
        this.description = description;
    }

    public MaritalStatus() {
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
