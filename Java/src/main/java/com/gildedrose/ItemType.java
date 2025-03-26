package com.gildedrose;

public enum ItemType {
    REGULAR,
    AGED_BRIE,
    BACKSTAGE_PASS,
    SULFURAS,
    CONJURED;
    public static ItemType getTypeFromItem(Item item) {
        switch(item.name) {
            case "Aged Brie":
                return AGED_BRIE;
            case "Sulfuras, Hand of Ragnaros":
                return SULFURAS;
            case "Backstage passes to a TAFKAL80ETC concert":
                return BACKSTAGE_PASS;
            case "Conjured Mana Cake":
                return CONJURED;
            default:
                return REGULAR;
        }
    }
}
