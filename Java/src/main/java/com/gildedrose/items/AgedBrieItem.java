package com.gildedrose.items;

public class AgedBrieItem extends Item {
    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void UpdateQuality() {
        this.quality = Math.min(50, this.quality+1);
    }
}
