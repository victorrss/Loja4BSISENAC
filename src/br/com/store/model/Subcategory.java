package br.com.store.model;

public class Subcategory { //Example: 8th generation intel, GTX 10 series, etc....
    private Integer subCategoryId;
    private String name;

    public Integer getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(Integer subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
