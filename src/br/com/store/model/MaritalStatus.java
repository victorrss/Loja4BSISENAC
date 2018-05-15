package br.com.store.model;

public class MaritalStatus {

    private Integer Id;
    private String description; //Example: Married, single, divorced, etc...
    private boolean enabled;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return getDescription();
    }

}
