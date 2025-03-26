package com.gildedrose.factories;

import com.gildedrose.items.Item;

public abstract class Factory {


    abstract public Item createItem(int sellIn, int quality);

}
