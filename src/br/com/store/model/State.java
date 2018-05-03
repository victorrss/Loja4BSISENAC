package br.com.store.model;

/**
 * @author Eric Palmeira de Souza <palmeiraeric@gmail.com>
 * @date 30/04/2018
 */

class State {
    private Integer Id;
    private String name;
    private String initials;

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

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }
    
    
}
