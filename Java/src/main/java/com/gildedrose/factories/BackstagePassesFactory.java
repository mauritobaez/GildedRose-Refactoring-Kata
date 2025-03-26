package com.gildedrose.factories;

import com.gildedrose.items.BackstagePassesGalaItem;
import com.gildedrose.items.BackstagePassesItem;
import com.gildedrose.items.Item;

public class BackstagePassesFactory extends Factory{

    private Concert concertType;

    public BackstagePassesFactory(Concert concertType) {
        this.concertType = concertType;
    }

    public BackstagePassesFactory() {
        this.concertType = Concert.TAFKAL80ETC;
    }

    public void setConcertType(Concert concertType) {
        this.concertType = concertType;
    }

    @Override
    public Item createItem(int sellIn, int quality) {
        switch (this.concertType) {
            case GALA:
                return new BackstagePassesGalaItem("Backstage passes to a GALA concert", sellIn, quality);
            case TAFKAL80ETC:
                return new BackstagePassesItem("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
            default:
                break;
        }
        throw new IllegalArgumentException("Backstage Passes Type not found :(");

    }
}
