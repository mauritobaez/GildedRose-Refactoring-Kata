package com.gildedrose.factories;

public enum Concert {
    TAFKAL80ETC("TAFKAL80ETC"),
    GALA("Gala");
    private final String name;
    Concert(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
