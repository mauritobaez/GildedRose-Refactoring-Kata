package com.gildedrose.factories;

import com.gildedrose.items.BackstagePassesItem;
import com.gildedrose.items.Item;

public class BackstagePassesFactory extends Factory{

    private String concertName;

    public BackstagePassesFactory(String concertName) {
        this.concertName = concertName;
    }

    public BackstagePassesFactory() {
        this.concertName = "TAFKAL80ETC";
    }

    public void setConcertName(String concertName) {
        this.concertName = concertName;
    }
    
    @Override
    public Item createItem(int sellIn, int quality) {
        return new BackstagePassesItem("Backstage passes to a"  + this.concertName + "concert", sellIn, quality);
    }
}
