package com.gildedrose;

import com.gildedrose.items.Item;

public class BackstagePassesStrategy implements Strategy{
    public BackstagePassesStrategy() {
    }

    @Override
    public void execute(Item item) {
        item.sellIn--;
        if (item.sellIn < 0) {
            item.quality = 0;
        } else if (item.sellIn < 5) {
            item.quality = Math.min(50, item.quality+3);
        } else if (item.sellIn < 10) {
            item.quality = Math.min(50, item.quality+2);
        } else {
            item.quality = Math.min(50, item.quality+1);
        }
    }
}
