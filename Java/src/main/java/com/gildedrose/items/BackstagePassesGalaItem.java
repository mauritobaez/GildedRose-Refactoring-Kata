package com.gildedrose.items;

public class BackstagePassesGalaItem extends Item{
    public BackstagePassesGalaItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (this.sellIn < 0) {
            this.quality = 0;
        } else if (this.sellIn <= 5) {
            this.quality = Math.min(50, this.quality+4);
        } else if (this.sellIn <= 10) {
            this.quality = Math.min(50, this.quality+3);
        } else {
            this.quality = Math.min(50, this.quality+2);
        }
    }
}
