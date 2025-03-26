package com.gildedrose;

import com.gildedrose.factories.*;
import com.gildedrose.items.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    public static String REGULAR_NAME = "foo";
    public static String SULFURAS_NAME = "Sulfuras, Hand of Ragnaros";
    public static String BRIE_NAME = "Aged Brie";
    public static String CONJURED_NAME = "Conjured Mana Cake";
    public static String TAFKA_CONCERT_NAME = "Backstage passes to a TAFKAL80ETC concert";
    public static String GALA_CONCERT_NAME = "Backstage passes to a GALA concert";

    @Test
    void fooOld() {
        Factory fact = new RegularFactory(REGULAR_NAME);
        Item[] items = new Item[] { fact.createItem(0, 5) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(REGULAR_NAME, app.items[0].name);
        assertEquals(3, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }

    @Test
    void fooTooOld() {
        Factory fact = new RegularFactory(REGULAR_NAME);
        Item[] items = new Item[] { fact.createItem(-1, 15) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(REGULAR_NAME, app.items[0].name);
        assertEquals(13, app.items[0].quality);
        assertEquals(-2, app.items[0].sellIn);
    }

    @Test
    void testSulfuras() {
        Factory fact = new SulfurasFactory();
        Item[] items = new Item[] {fact.createItem(0, 80) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(SULFURAS_NAME, app.items[0].name);
        assertEquals(80, app.items[0].quality);
        assertEquals(0, app.items[0].sellIn);
    }

    @Test
    void testLegendaryAndNormal() {
        Factory fact = new SulfurasFactory();
        Factory regFact = new RegularFactory(REGULAR_NAME);
        Item[] items = new Item[] {
            fact.createItem( 0, 80),
            regFact.createItem( 15, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(SULFURAS_NAME, app.items[0].name);
        assertEquals(80, app.items[0].quality);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(REGULAR_NAME, app.items[1].name);
        assertEquals(14, app.items[1].quality);
        assertEquals(14, app.items[1].sellIn);
    }


    @Test
    void testBrie() {
        Factory agedBrieFact = new AgedBrieFactory();
        Factory regularFact = new RegularFactory(REGULAR_NAME);
        Item[] items = new Item[] {
            agedBrieFact.createItem(30, 30),
            regularFact.createItem( 15, 15),
            agedBrieFact.createItem( 14, 50)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(BRIE_NAME, app.items[0].name);
        assertEquals(31, app.items[0].quality);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(REGULAR_NAME, app.items[1].name);
        assertEquals(14, app.items[1].quality);
        assertEquals(14, app.items[1].sellIn);
        assertEquals(BRIE_NAME, app.items[2].name);
        assertEquals(50, app.items[2].quality);
        assertEquals(13, app.items[2].sellIn);
    }

    @Test
    void testBackstage() {
        Factory fact = new BackstagePassesFactory(Concert.TAFKAL80ETC);
        Item[] items = new Item[] {
            fact.createItem(30, 30),
            fact.createItem(8, 30),
            fact.createItem(3, 30),
            fact.createItem(0, 30),
            fact.createItem(-1, 30)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(TAFKA_CONCERT_NAME, app.items[0].name);
        assertEquals(31, app.items[0].quality);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(TAFKA_CONCERT_NAME, app.items[1].name);
        assertEquals(32, app.items[1].quality);
        assertEquals(7, app.items[1].sellIn);
        assertEquals(TAFKA_CONCERT_NAME, app.items[2].name);
        assertEquals(33, app.items[2].quality);
        assertEquals(2, app.items[2].sellIn);
        assertEquals(TAFKA_CONCERT_NAME, app.items[3].name);
        assertEquals(33, app.items[3].quality);
        assertEquals(-1, app.items[3].sellIn);
        assertEquals(TAFKA_CONCERT_NAME, app.items[4].name);
        assertEquals(0, app.items[4].quality);
        assertEquals(-2, app.items[4].sellIn);
    }

    @Test
    void testBackstageGala() {
        Factory fact = new BackstagePassesFactory(Concert.GALA);
        Item[] items = new Item[] {
            fact.createItem(30, 30),
            fact.createItem(8, 30),
            fact.createItem(3, 30),
            fact.createItem(0, 30),
            fact.createItem(-1, 30)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(GALA_CONCERT_NAME, app.items[0].name);
        assertEquals(32, app.items[0].quality);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(GALA_CONCERT_NAME, app.items[1].name);
        assertEquals(33, app.items[1].quality);
        assertEquals(7, app.items[1].sellIn);
        assertEquals(GALA_CONCERT_NAME, app.items[2].name);
        assertEquals(34, app.items[2].quality);
        assertEquals(2, app.items[2].sellIn);
        assertEquals(GALA_CONCERT_NAME, app.items[3].name);
        assertEquals(34, app.items[3].quality);
        assertEquals(-1, app.items[3].sellIn);
        assertEquals(GALA_CONCERT_NAME, app.items[4].name);
        assertEquals(0, app.items[4].quality);
        assertEquals(-2, app.items[4].sellIn);
    }

    @Test
    void testConjured() {
        Factory fact = new ConjuredFactory();
        Item[] items = new Item[] {
            fact.createItem( 30, 30),
            fact.createItem(-2, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(CONJURED_NAME, app.items[0].name);
        assertEquals(28, app.items[0].quality);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(CONJURED_NAME, app.items[1].name);
        assertEquals(16, app.items[1].quality);
        assertEquals(-3, app.items[1].sellIn);
    }

}
