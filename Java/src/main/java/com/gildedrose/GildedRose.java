package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    private void decreaseQuality(Item item, int count) {
        item.quality = Math.max(0, item.quality - count);
    }

    private void increaseQuality(Item item, int count) {
        item.quality = Math.min(50, item.quality + count);
    }

    public void updateQuality() {
        for (Item item : items) {
            Context context = new Context();
            ItemType type = ItemType.getTypeFromItem(item);
            switch (type) {
                case REGULAR:
                    context.setStrategy(new NormalStrategy());
                    break;
                case SULFURAS:
                    context.setStrategy(new SulfurasStrategy());
                    break;
                case BACKSTAGE_PASS:
                    context.setStrategy(new BackstagePassesStrategy());
                    break;
                case AGED_BRIE:
                    context.setStrategy(new AgedBrieStrategy());
                    break;
                case CONJURED:
                    context.setStrategy(new Conjured());
                    break;
            }

            context.updateItemQuality(item);

            /*boolean expired = item.sellIn <= 0;
            if (type.equals(ItemType.SULFURAS)) {
                continue;
            }
            item.sellIn--;
            if (type.equals(ItemType.AGED_BRIE)) {
                increaseQuality(item, 1);
                continue;
            }
            if (type.equals(ItemType.BACKSTAGE_PASS)) {
                if (item.sellIn < 0) {
                    item.quality = 0;
                } else if (item.sellIn < 5) {
                    increaseQuality(item, 3);
                } else if (item.sellIn < 10) {
                    increaseQuality(item, 2);
                } else {
                    increaseQuality(item, 1);
                }
                continue;
            }
            decreaseQuality(item, expired? 2: 1);*/
        }
    }
}
