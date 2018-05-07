package br.com.store.model;

public class PublicPlaceType {

    private Integer Id;
    private String name;
    private String abbreviation;

    public PublicPlaceType(Integer Id, String name, String abbreviation) {
        this.Id = Id;
        this.name = name;
        this.abbreviation = abbreviation;
    }

    public PublicPlaceType() {
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

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

}
