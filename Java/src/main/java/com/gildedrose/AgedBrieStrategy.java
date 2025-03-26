package com.gildedrose;

import com.gildedrose.items.Item;

public class AgedBrieStrategy implements Strategy {

    public AgedBrieStrategy() {
    }

    @Override
    public void execute(Item item) {
        item.quality = Math.min(50, item.quality+1);
        item.sellIn--;
    }
}
