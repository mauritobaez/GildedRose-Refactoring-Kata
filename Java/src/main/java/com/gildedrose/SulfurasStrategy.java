package com.gildedrose;

public class SulfurasStrategy implements Strategy{
    public SulfurasStrategy() {
    }

    @Override
    public void execute(Item item) {
        item.quality = 80;
    }
}
