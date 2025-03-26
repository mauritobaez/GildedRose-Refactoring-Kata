package com.gildedrose.factories;

import com.gildedrose.items.Item;
import com.gildedrose.items.RegularItem;

public class RegularFactory extends Factory{


    private String name;

    public RegularFactory(String name) {
        this.name = name;
    }

    public RegularFactory() {
        this.name = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Item createItem(int sellIn, int quality) {
        return new RegularItem(name, sellIn, quality);
    }
}
