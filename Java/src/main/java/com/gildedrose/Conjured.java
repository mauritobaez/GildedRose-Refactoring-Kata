package com.gildedrose;

public class Conjured implements Strategy{

    public Conjured() {
    }

    @Override
    public void execute(Item item) {
        int count = item.sellIn <= 0? 4 : 2;
        item.quality = Math.max(0, item.quality - count);
        item.sellIn--;
    }
}
