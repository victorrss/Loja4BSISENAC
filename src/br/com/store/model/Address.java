package br.com.store.model;

public class Address {

    private Integer Id;
    private PublicPlaceType publicPlaceType;
    private City city;
    private String publicPlace; //Example: Avenida Paulista, 1578, etc ...
    private Integer number;
    private String complement; //Example: floor 2, house 3, etc...
    private String district; //Example: Vila Mariana, Bela Vista, Pinheiros, etc...
    private Integer zipcode;
    private boolean enabled;

    public Address(Integer Id, PublicPlaceType publicPlaceType, City city, String publicPlace, Integer number, String complement, String district, Integer zipcode, boolean enabled) {
        this.Id = Id;
        this.publicPlaceType = publicPlaceType;
        this.city = city;
        this.publicPlace = publicPlace;
        this.number = number;
        this.complement = complement;
        this.district = district;
        this.zipcode = zipcode;
        this.enabled = enabled;
    }

    public Address() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public PublicPlaceType getPublicPlaceType() {
        return publicPlaceType;
    }

    public void setPublicPlaceType(PublicPlaceType publicPlaceType) {
        this.publicPlaceType = publicPlaceType;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getPublicPlace() {
        return publicPlace;
    }

    public void setPublicPlace(String publicPlace) {
        this.publicPlace = publicPlace;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

}
