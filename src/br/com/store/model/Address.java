package br.com.store.model;

/**
 * @author Eric Palmeira de Souza <palmeiraeric@gmail.com>
 * @date 30/04/2018
 */

public class Address {
    private Integer Id;
    private PublicPlaceType publicplace_type_id;
    private City cityID;
    private String publicPlace;
    private Integer number;
    private String complement;
    private String district;
    private Integer zipcode;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public PublicPlaceType getPublicplace_type_id() {
        return publicplace_type_id;
    }

    public void setPublicplace_type_id(PublicPlaceType publicplace_type_id) {
        this.publicplace_type_id = publicplace_type_id;
    }

    public City getCityID() {
        return cityID;
    }

    public void setCityID(City cityID) {
        this.cityID = cityID;
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

    
}
