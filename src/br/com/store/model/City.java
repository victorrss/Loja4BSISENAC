package br.com.store.model;

public class City {

    private Integer Id;
    private State state;
    private String name; //Example: São Paulo, Dubai, Miami, etc...
    private boolean enabled;

    public City(Integer Id, State state, String name, boolean enabled) {
        this.Id = Id;
        this.state = state;
        this.name = name;
        this.enabled = enabled;
    }

    public City() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

}
