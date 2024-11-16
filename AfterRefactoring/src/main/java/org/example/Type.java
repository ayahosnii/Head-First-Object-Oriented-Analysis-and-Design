package org.example;

public enum Type {
    ACOUSTIC, ELECTRIC;

    public String toString() {
        return switch (this) {
            case ACOUSTIC -> "Acoustic";
            case ELECTRIC -> "Electric";
            default -> "Unspecified";
        };
    }
}