package com.gildedrose.factories;

import com.gildedrose.items.Item;
import com.gildedrose.items.SulfurasItem;

public class SulfurasFactory extends Factory{

    @Override
    public Item createItem(int sellIn, int quality) {
        return new SulfurasItem("Sulfuras, Hand of Ragnaros", 0, 80);
    }
}
