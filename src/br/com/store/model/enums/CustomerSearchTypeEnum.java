package br.com.store.model.enums;

public enum CustomerSearchTypeEnum {
    NAME("Nome"),
    ID("Código"),
    DOCUMENT("Documento");

    private String value;

    private CustomerSearchTypeEnum(String value) {
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
