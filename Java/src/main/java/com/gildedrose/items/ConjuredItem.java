package com.gildedrose.items;

public class ConjuredItem extends Item {
    public ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        super.updateQuality();
        super.updateQuality();
    }

    @Override
    public void updateSellIn() {
        super.updateSellIn();
    }
}
