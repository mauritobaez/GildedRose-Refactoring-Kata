package com.gildedrose;

import com.gildedrose.items.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void fooOld() {
        Item[] items = new Item[] { new RegularItem("foo", 0, 5) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals(3, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }

    @Test
    void fooTooOld() {
        Item[] items = new Item[] { new RegularItem("foo", -1, 15) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals(13, app.items[0].quality);
        assertEquals(-2, app.items[0].sellIn);
    }

    @Test
    void testSulfuras() {
        Item[] items = new Item[] { new SulfurasItem("Sulfuras, Hand of Ragnaros", 0, 80) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(80, app.items[0].quality);
        assertEquals(0, app.items[0].sellIn);
    }

    @Test
    void testLegendaryAndNormal() {
        Item[] items = new Item[] { new SulfurasItem("Sulfuras, Hand of Ragnaros", 0, 80), new RegularItem("foo", 15, 15) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(80, app.items[0].quality);
        assertEquals(0, app.items[0].sellIn);
        assertEquals("foo", app.items[1].name);
        assertEquals(14, app.items[1].quality);
        assertEquals(14, app.items[1].sellIn);
    }


    @Test
    void testBrie() {
        Item[] items = new Item[] { new AgedBrieItem("Aged Brie", 30, 30), new RegularItem("foo", 15, 15), new AgedBrieItem("Aged Brie", 14, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(31, app.items[0].quality);
        assertEquals(29, app.items[0].sellIn);
        assertEquals("foo", app.items[1].name);
        assertEquals(14, app.items[1].quality);
        assertEquals(14, app.items[1].sellIn);
        assertEquals("Aged Brie", app.items[2].name);
        assertEquals(50, app.items[2].quality);
        assertEquals(13, app.items[2].sellIn);
    }

    @Test
    void testBackstage() {
        Item[] items = new Item[] {
            new BackstagePassesItem("Backstage passes to a TAFKAL80ETC concert", 30, 30),
            new BackstagePassesItem("Backstage passes to a TAFKAL80ETC concert", 8, 30),
            new BackstagePassesItem("Backstage passes to a TAFKAL80ETC concert", 3, 30),
            new BackstagePassesItem("Backstage passes to a TAFKAL80ETC concert", 0, 30),
            new BackstagePassesItem("Backstage passes to a TAFKAL80ETC concert", -1, 30),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(31, app.items[0].quality);
        assertEquals(29, app.items[0].sellIn);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[1].name);
        assertEquals(32, app.items[1].quality);
        assertEquals(7, app.items[1].sellIn);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[2].name);
        assertEquals(33, app.items[2].quality);
        assertEquals(2, app.items[2].sellIn);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[3].name);
        assertEquals(33, app.items[3].quality);
        assertEquals(-1, app.items[3].sellIn);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[4].name);
        assertEquals(0, app.items[4].quality);
        assertEquals(-2, app.items[4].sellIn);
    }

    @Test
    void testBackstageGala() {
        Item[] items = new Item[] {
            new BackstagePassesGalaItem("Backstage passes to a GALA concert", 30, 30),
            new BackstagePassesGalaItem("Backstage passes to a GALA concert", 8, 30),
            new BackstagePassesGalaItem("Backstage passes to a GALA concert", 3, 30),
            new BackstagePassesGalaItem("Backstage passes to a GALA concert", 0, 30),
            new BackstagePassesGalaItem("Backstage passes to a GALA concert", -1, 30)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a GALA concert", app.items[0].name);
        assertEquals(32, app.items[0].quality);
        assertEquals(29, app.items[0].sellIn);
        assertEquals("Backstage passes to a GALA concert", app.items[1].name);
        assertEquals(33, app.items[1].quality);
        assertEquals(7, app.items[1].sellIn);
        assertEquals("Backstage passes to a GALA concert", app.items[2].name);
        assertEquals(34, app.items[2].quality);
        assertEquals(2, app.items[2].sellIn);
        assertEquals("Backstage passes to a GALA concert", app.items[3].name);
        assertEquals(34, app.items[3].quality);
        assertEquals(-1, app.items[3].sellIn);
        assertEquals("Backstage passes to a GALA concert", app.items[4].name);
        assertEquals(0, app.items[4].quality);
        assertEquals(-2, app.items[4].sellIn);
    }

    @Test
    void testConjured() {
        Item[] items = new Item[] { new ConjuredItem("Conjured Mana Cake", 30, 30) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Conjured Mana Cake", app.items[0].name);
        assertEquals(28, app.items[0].quality);
        assertEquals(29, app.items[0].sellIn);
    }

}
