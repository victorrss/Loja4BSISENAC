package br.com.store.model;

public class State {

    private Integer Id;
    private String name;
    private String abbreviation; //Example: AM, SP, MG, etc...
    private boolean enabled;

    public State(Integer Id, String name, String abbreviation, boolean enabled) {
        this.Id = Id;
        this.name = name;
        this.abbreviation = abbreviation;
        this.enabled = enabled;
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

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

}
