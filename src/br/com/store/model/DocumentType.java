package br.com.store.model;

public class DocumentType {

    private Integer Id;
    private String name; //Example: CPF, CNPJ, etc...

    public DocumentType(Integer Id, String name) {
        this.Id = Id;
        this.name = name;
    }

    public DocumentType() {
    }

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
