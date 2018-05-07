package br.com.store.model;

public class State {

    private Integer Id;
    private String name;
    private String abbreviation; //Example: AM, SP, MG, etc...

    public State(Integer Id, String name, String abbreviation) {
        this.Id = Id;
        this.name = name;
        this.abbreviation = abbreviation;
    }

    public State() {
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
