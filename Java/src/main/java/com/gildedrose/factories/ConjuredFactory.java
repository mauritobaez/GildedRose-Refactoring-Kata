package com.gildedrose.factories;

import com.gildedrose.items.ConjuredItem;
import com.gildedrose.items.Item;

public class ConjuredFactory extends Factory{

    @Override
    public Item createItem(int sellIn, int quality) {
        return new ConjuredItem("Conjured Mana Cake", sellIn, quality);
    }
}
