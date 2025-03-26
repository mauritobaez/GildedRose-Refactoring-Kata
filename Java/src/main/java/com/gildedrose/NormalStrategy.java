package com.gildedrose;

public class NormalStrategy implements Strategy {
    public NormalStrategy() {
    }

    @Override
    public void execute(Item item) {
        int count = item.sellIn <= 0? 2 : 1;
        item.quality = Math.max(0, item.quality - count);
        item.sellIn--;
    }
}
