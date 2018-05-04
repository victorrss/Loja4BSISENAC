package br.com.store.model;

class DocumentType {
    private Integer Id;
    private String name; //Example: CPF, CNPJ, etc...

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
