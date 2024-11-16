package org.example;

public class Guitar implements Searchable {
    private final String serialNumber;
    private final double price;
    private final Builder builder;
    private final String model;
    private final Type type;
    private final Wood backWood;
    private final Wood topWood;

    public Guitar(String serialNumber, double price, Builder builder,
                  String model, Type type, Wood backWood, Wood topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    @Override
    public boolean matches(SearchCriteria criteria) {
        if (criteria.getBuilder() != null && !criteria.getBuilder().equals(builder)) return false;
        if (criteria.getModel() != null && !criteria.getModel().equalsIgnoreCase(model)) return false;
        if (criteria.getType() != null && !criteria.getType().equals(type)) return false;
        if (criteria.getBackWood() != null && !criteria.getBackWood().equals(backWood)) return false;
        if (criteria.getTopWood() != null && !criteria.getTopWood().equals(topWood)) return false;
        return true;
    }
}
