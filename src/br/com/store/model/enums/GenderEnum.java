package br.com.store.model.enums;

public enum GenderEnum {
    MALE("Masculino"),
    FEMALE("Feminino");

    private String value;

    private GenderEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
