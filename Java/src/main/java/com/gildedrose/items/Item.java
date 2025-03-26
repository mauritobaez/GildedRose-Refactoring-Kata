package com.gildedrose.items;

public abstract class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void UpdateQuality() {
        int count = this.sellIn <= 0? 2 : 1;
        this.quality = Math.max(0, this.quality - count);
    }

    public void UpdateSellIn() {
        this.sellIn--;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
