package br.com.store.model;

/**
 * @author Eric Palmeira de Souza <palmeiraeric@gmail.com>
 * @date 30/04/2018
 */

class City {
    private Integer Id;
    private State stateId;
    private String name;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public State getStateId() {
        return stateId;
    }

    public void setStateId(State stateId) {
        this.stateId = stateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
