package br.com.store.model;

class MaritalStatus {
    private Integer Id;
    private String description; //Example: Married, single, divorced, etc...

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
