package com.gildedrose.factories;

import com.gildedrose.items.AgedBrieItem;
import com.gildedrose.items.Item;

public class AgedBrieFactory extends Factory{

    @Override
    public Item createItem(int sellIn, int quality) {
        return new AgedBrieItem("Aged Brie", sellIn, quality);
    }
}
