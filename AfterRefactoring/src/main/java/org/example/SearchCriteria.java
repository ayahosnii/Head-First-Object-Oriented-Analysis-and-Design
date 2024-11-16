package org.example;

public class SearchCriteria {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;

    private SearchCriteria(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public SearchCriteria(org.example.Builder builder, String model, Type type, Wood backWood, Wood topWood) {
    }

    // Getters for SearchCriteria fields
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

    // Inner static Builder class to create SearchCriteria objects
    public static class Builder {
        private org.example.Builder builder;
        private String model;
        private Type type;
        private Wood backWood;
        private Wood topWood;

        // Methods to set the fields
        public Builder builder(org.example.Builder builder) {
            this.builder = builder;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder type(Type type) {
            this.type = type;
            return this;
        }

        public Builder backWood(Wood backWood) {
            this.backWood = backWood;
            return this;
        }

        public Builder topWood(Wood topWood) {
            this.topWood = topWood;
            return this;
        }

        // Builds the SearchCriteria object
        public SearchCriteria build() {
            return new SearchCriteria(builder, model, type, backWood, topWood);
        }
    }
}
