package com.gildedrose.factories;

import com.gildedrose.items.BackstagePassesItem;
import com.gildedrose.items.Item;

public class BackstagePassesFactory extends Factory{

    @Override
    public Item createItem(int sellIn, int quality) {
        return new BackstagePassesItem("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }
}
