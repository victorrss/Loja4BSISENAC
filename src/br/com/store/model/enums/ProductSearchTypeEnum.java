package br.com.store.model.enums;

public enum ProductSearchTypeEnum {
    NAME("Nome"),
    //ID("Código"),
    BARCODE("Código de Barras");

    private String value;

    private ProductSearchTypeEnum(String value) {
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
